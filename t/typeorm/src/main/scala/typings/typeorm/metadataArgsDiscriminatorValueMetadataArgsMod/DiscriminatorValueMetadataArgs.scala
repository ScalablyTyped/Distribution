package typings.typeorm.metadataArgsDiscriminatorValueMetadataArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscriminatorValueMetadataArgs extends js.Object {
  
  /**
    * Class to which discriminator name is applied.
    */
  val target: js.Function | String = js.native
  
  /**
    * Discriminator value.
    */
  val value: js.Any = js.native
}
object DiscriminatorValueMetadataArgs {
  
  @scala.inline
  def apply(target: js.Function | String, value: js.Any): DiscriminatorValueMetadataArgs = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscriminatorValueMetadataArgs]
  }
  
  @scala.inline
  implicit class DiscriminatorValueMetadataArgsOps[Self <: DiscriminatorValueMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
