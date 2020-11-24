package typings.tensorflowTfjsCore.serializationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/serialization", "SerializationMap")
@js.native
class SerializationMap protected () extends js.Object {
  
  var classNameMap: StringDictionary[js.Tuple2[SerializableConstructor[Serializable], FromConfigMethod[Serializable]]] = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-core/dist/serialization", "SerializationMap")
@js.native
object SerializationMap extends js.Object {
  
  /**
    * Returns the singleton instance of the map.
    */
  def getMap(): SerializationMap = js.native
  
  var instance: js.Any = js.native
  
  /**
    * Registers the class as serializable.
    */
  def register[T /* <: Serializable */](cls: SerializableConstructor[T]): Unit = js.native
}
