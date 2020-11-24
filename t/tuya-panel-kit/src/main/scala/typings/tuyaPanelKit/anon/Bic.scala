package typings.tuyaPanelKit.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bic extends js.Object {
  
  var bic: js.Array[Code] = js.native
  
  var fun: js.UndefOr[Record[String, _]] = js.native
}
object Bic {
  
  @scala.inline
  def apply(bic: js.Array[Code]): Bic = {
    val __obj = js.Dynamic.literal(bic = bic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bic]
  }
  
  @scala.inline
  implicit class BicOps[Self <: Bic] (val x: Self) extends AnyVal {
    
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
    def setBicVarargs(value: Code*): Self = this.set("bic", js.Array(value :_*))
    
    @scala.inline
    def setBic(value: js.Array[Code]): Self = this.set("bic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFun(value: Record[String, _]): Self = this.set("fun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFun: Self = this.set("fun", js.undefined)
  }
}
