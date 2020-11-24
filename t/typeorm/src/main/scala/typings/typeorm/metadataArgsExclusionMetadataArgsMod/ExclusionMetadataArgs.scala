package typings.typeorm.metadataArgsExclusionMetadataArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusionMetadataArgs extends js.Object {
  
  /**
    * Exclusion expression.
    */
  var expression: String = js.native
  
  /**
    * Exclusion constraint name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Class to which index is applied.
    */
  var target: js.Function | String = js.native
}
object ExclusionMetadataArgs {
  
  @scala.inline
  def apply(expression: String, target: js.Function | String): ExclusionMetadataArgs = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusionMetadataArgs]
  }
  
  @scala.inline
  implicit class ExclusionMetadataArgsOps[Self <: ExclusionMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
