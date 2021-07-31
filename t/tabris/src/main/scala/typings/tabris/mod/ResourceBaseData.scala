package typings.tabris.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceBaseData[ResourceType]
  extends StObject
     with NeverResources
     with /* resourceName */ StringDictionary[js.UndefOr[ResourceType]]
object ResourceBaseData {
  
  @scala.inline
  def apply[ResourceType](): ResourceBaseData[ResourceType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceBaseData[ResourceType]]
  }
}
