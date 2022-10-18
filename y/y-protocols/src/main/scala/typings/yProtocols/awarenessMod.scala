package typings.yProtocols

import org.scalablytyped.runtime.StringDictionary
import typings.lib0.observableMod.Observable
import typings.std.Map
import typings.yProtocols.yProtocolsInts.`30000`
import typings.yjs.mod.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awarenessMod {
  
  @JSImport("y-protocols/awareness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("y-protocols/awareness", "Awareness")
  @js.native
  open class Awareness protected () extends Observable[String] {
    /**
      * @param {Y.Doc} doc
      */
    def this(doc: Doc) = this()
    
    var _checkInterval: Any = js.native
    
    /**
      * @type {number}
      */
    var clientID: Double = js.native
    
    var doc: Doc = js.native
    
    /**
      * @return {Object<string,any>|null}
      */
    def getLocalState(): StringDictionary[Any] | Null = js.native
    
    /**
      * @return {Map<number,Object<string,any>>}
      */
    def getStates(): Map[Double, StringDictionary[Any]] = js.native
    
    /**
      * @type {Map<number, MetaClientState>}
      */
    var meta: Map[Double, MetaClientState] = js.native
    
    /**
      * @param {Object<string,any>|null} state
      */
    def setLocalState(): Unit = js.native
    def setLocalState(state: StringDictionary[Any]): Unit = js.native
    
    /**
      * @param {string} field
      * @param {any} value
      */
    def setLocalStateField(field: String, value: Any): Unit = js.native
    
    /**
      * Maps from client id to client state
      * @type {Map<number, Object<string, any>>}
      */
    var states: Map[Double, StringDictionary[Any]] = js.native
  }
  
  inline def applyAwarenessUpdate(awareness: Awareness, update: js.typedarray.Uint8Array, origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAwarenessUpdate")(awareness.asInstanceOf[js.Any], update.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encodeAwarenessUpdate(awareness: Awareness, clients: js.Array[Double]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAwarenessUpdate")(awareness.asInstanceOf[js.Any], clients.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeAwarenessUpdate(awareness: Awareness, clients: js.Array[Double], states: Map[Double, StringDictionary[Any]]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAwarenessUpdate")(awareness.asInstanceOf[js.Any], clients.asInstanceOf[js.Any], states.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def modifyAwarenessUpdate(update: js.typedarray.Uint8Array, modify: js.Function1[/* arg0 */ Any, Any]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyAwarenessUpdate")(update.asInstanceOf[js.Any], modify.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("y-protocols/awareness", "outdatedTimeout")
  @js.native
  val outdatedTimeout: `30000` = js.native
  
  inline def removeAwarenessStates(awareness: Awareness, clients: js.Array[Double], origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAwarenessStates")(awareness.asInstanceOf[js.Any], clients.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MetaClientState extends StObject {
    
    var clock: Double
    
    /**
      * unix timestamp
      */
    var lastUpdated: Double
  }
  object MetaClientState {
    
    inline def apply(clock: Double, lastUpdated: Double): MetaClientState = {
      val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaClientState]
    }
    
    extension [Self <: MetaClientState](x: Self) {
      
      inline def setClock(value: Double): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
      
      inline def setLastUpdated(value: Double): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    }
  }
}
