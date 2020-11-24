package typings.typeorm.metadataArgsGeneratedMetadataArgsMod

import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratedMetadataArgs extends js.Object {
  
  /**
    * Class's property name to which decorator is applied.
    */
  val propertyName: String = js.native
  
  /**
    * Generation strategy.
    */
  val strategy: uuid | increment | rowid = js.native
  
  /**
    * Class to which decorator is applied.
    */
  val target: js.Function | String = js.native
}
object GeneratedMetadataArgs {
  
  @scala.inline
  def apply(propertyName: String, strategy: uuid | increment | rowid, target: js.Function | String): GeneratedMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedMetadataArgs]
  }
  
  @scala.inline
  implicit class GeneratedMetadataArgsOps[Self <: GeneratedMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: uuid | increment | rowid): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
