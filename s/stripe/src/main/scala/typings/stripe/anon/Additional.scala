package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Additional extends js.Object {
  
  var additional: js.Array[String] = js.native
  
  var minimum: js.Array[String] = js.native
}
object Additional {
  
  @scala.inline
  def apply(additional: js.Array[String], minimum: js.Array[String]): Additional = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additional]
  }
  
  @scala.inline
  implicit class AdditionalOps[Self <: Additional] (val x: Self) extends AnyVal {
    
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
    def setAdditionalVarargs(value: String*): Self = this.set("additional", js.Array(value :_*))
    
    @scala.inline
    def setAdditional(value: js.Array[String]): Self = this.set("additional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVarargs(value: String*): Self = this.set("minimum", js.Array(value :_*))
    
    @scala.inline
    def setMinimum(value: js.Array[String]): Self = this.set("minimum", value.asInstanceOf[js.Any])
  }
}
