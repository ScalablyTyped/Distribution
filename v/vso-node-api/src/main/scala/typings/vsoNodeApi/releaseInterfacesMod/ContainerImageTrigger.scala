package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerImageTrigger extends ReleaseTriggerBase {
  
  var alias: String = js.native
}
object ContainerImageTrigger {
  
  @scala.inline
  def apply(alias: String, triggerType: ReleaseTriggerType): ContainerImageTrigger = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImageTrigger]
  }
  
  @scala.inline
  implicit class ContainerImageTriggerMutableBuilder[Self <: ContainerImageTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
  }
}
