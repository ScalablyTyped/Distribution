package typings.tensorflowTfjsConverter.compiledApiMod.OpDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OpDeprecation. */
@js.native
trait IOpDeprecation extends js.Object {
  
  /** OpDeprecation explanation */
  var explanation: js.UndefOr[String | Null] = js.native
  
  /** OpDeprecation version */
  var version: js.UndefOr[Double | Null] = js.native
}
object IOpDeprecation {
  
  @scala.inline
  def apply(): IOpDeprecation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpDeprecation]
  }
  
  @scala.inline
  implicit class IOpDeprecationOps[Self <: IOpDeprecation] (val x: Self) extends AnyVal {
    
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
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanation: Self = this.set("explanation", js.undefined)
    
    @scala.inline
    def setExplanationNull: Self = this.set("explanation", null)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
