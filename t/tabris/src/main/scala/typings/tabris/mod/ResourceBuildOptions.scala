package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tabris.anon.Type[ResourceType]
  - typings.tabris.anon.Validator[ResourceType]
*/
trait ResourceBuildOptions[ResourceType] extends StObject
object ResourceBuildOptions {
  
  inline def Type[ResourceType](validator: js.Any => /* is ResourceType */ Boolean): typings.tabris.anon.Type[ResourceType] = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.asInstanceOf[typings.tabris.anon.Type[ResourceType]]
  }
  
  inline def Validator[ResourceType](`type`: Constructor[ResourceType]): typings.tabris.anon.Validator[ResourceType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tabris.anon.Validator[ResourceType]]
  }
}
