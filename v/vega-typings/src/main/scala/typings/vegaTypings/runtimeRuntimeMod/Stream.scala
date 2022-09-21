package typings.vegaTypings.runtimeRuntimeMod

import typings.vegaTypings.streamMod.EventType
import typings.vegaTypings.streamMod.WindowEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.anon.sourcetimertypenumberidID
  - typings.vegaTypings.anon.sourceviewtypeEventTypeid
  - typings.vegaTypings.anon.sourcewindowtypeWindowEve
  - typings.vegaTypings.anon.streamIDidIDbetweenIDIDun
  - typings.vegaTypings.anon.mergeArrayIDidIDbetweenID
*/
trait Stream extends StObject
object Stream {
  
  inline def mergeArrayIDidIDbetweenID(id: ID, merge: js.Array[ID]): typings.vegaTypings.anon.mergeArrayIDidIDbetweenID = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.mergeArrayIDidIDbetweenID]
  }
  
  inline def sourcetimertypenumberidID(id: ID, `type`: Double): typings.vegaTypings.anon.sourcetimertypenumberidID = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = "timer")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.sourcetimertypenumberidID]
  }
  
  inline def sourceviewtypeEventTypeid(id: ID, `type`: EventType): typings.vegaTypings.anon.sourceviewtypeEventTypeid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = "view")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.sourceviewtypeEventTypeid]
  }
  
  inline def sourcewindowtypeWindowEve(id: ID, `type`: WindowEventType): typings.vegaTypings.anon.sourcewindowtypeWindowEve = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = "window")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.sourcewindowtypeWindowEve]
  }
  
  inline def streamIDidIDbetweenIDIDun(id: ID, stream: ID): typings.vegaTypings.anon.streamIDidIDbetweenIDIDun = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.streamIDidIDbetweenIDIDun]
  }
}
