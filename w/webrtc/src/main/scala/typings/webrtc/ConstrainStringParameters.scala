package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainStringParameters extends js.Object {
  
  var exact: js.UndefOr[String | js.Array[String]] = js.native
  
  var ideal: js.UndefOr[String | js.Array[String]] = js.native
}
object ConstrainStringParameters {
  
  @scala.inline
  def apply(): ConstrainStringParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainStringParameters]
  }
  
  @scala.inline
  implicit class ConstrainStringParametersOps[Self <: ConstrainStringParameters] (val x: Self) extends AnyVal {
    
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
    def setExactVarargs(value: String*): Self = this.set("exact", js.Array(value :_*))
    
    @scala.inline
    def setExact(value: String | js.Array[String]): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setIdealVarargs(value: String*): Self = this.set("ideal", js.Array(value :_*))
    
    @scala.inline
    def setIdeal(value: String | js.Array[String]): Self = this.set("ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
  }
}
