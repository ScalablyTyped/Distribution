package typings.typeorm.metadataArgsNamingStrategyMetadataArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamingStrategyMetadataArgs extends js.Object {
  
  /**
    * Strategy name.
    */
  val name: String = js.native
  
  /**
    * Class to which this column is applied.
    */
  val target: js.Function = js.native
}
object NamingStrategyMetadataArgs {
  
  @scala.inline
  def apply(name: String, target: js.Function): NamingStrategyMetadataArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingStrategyMetadataArgs]
  }
  
  @scala.inline
  implicit class NamingStrategyMetadataArgsOps[Self <: NamingStrategyMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
