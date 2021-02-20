package typings.webgme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Gme {
  
  type Connection = js.Any
  
  type ProjectResult = js.Array[typings.webgme.Gme.Project] | org.scalablytyped.runtime.StringDictionary[typings.webgme.Gme.Project]
  
  /**
    * The eventHandler is invoked whenever there are 
    * changes to the nodes matching any of the patterns.
    *  There are three cases when it is triggered:
    *   - updateTerritory was invoked by us.
    *   - Another client made changes to nodes within the territory.
    *   - We made changes to any of the nodes (via the setters).
    * 
    *  * ('load')
    * The node is loaded and we have access to it.
    * It was either just created or this is the initial updateTerritory we invoked.
    *  * ('update') 
    * There were changes to the node (some might not apply to your application).
    * The node is still loaded and we have access to it.
    *  * ('unload')
    * The node was removed from the model (we can no longer access it).
    * We still get the path/id via events[i].eid
    *  * (else)
    * "Technical events" not used.
    */
  type TerritoryEventHandler = js.Function1[/* event */ js.Array[typings.webgme.Gme.Event], scala.Unit]
  
  type TerritoryId = typings.webgme.Core.GUID
}
