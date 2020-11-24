package typings.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YesOrNoOptions extends js.Object {
  
  var echoNo: js.UndefOr[String] = js.native
  
  var echoYes: js.UndefOr[String] = js.native
  
  var no: String | js.Array[String] = js.native
  
  var yes: String | js.Array[String] = js.native
}
object YesOrNoOptions {
  
  @scala.inline
  def apply(no: String | js.Array[String], yes: String | js.Array[String]): YesOrNoOptions = {
    val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], yes = yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[YesOrNoOptions]
  }
  
  @scala.inline
  implicit class YesOrNoOptionsOps[Self <: YesOrNoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNoVarargs(value: String*): Self = this.set("no", js.Array(value :_*))
    
    @scala.inline
    def setNo(value: String | js.Array[String]): Self = this.set("no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYesVarargs(value: String*): Self = this.set("yes", js.Array(value :_*))
    
    @scala.inline
    def setYes(value: String | js.Array[String]): Self = this.set("yes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoNo(value: String): Self = this.set("echoNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEchoNo: Self = this.set("echoNo", js.undefined)
    
    @scala.inline
    def setEchoYes(value: String): Self = this.set("echoYes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEchoYes: Self = this.set("echoYes", js.undefined)
  }
}
