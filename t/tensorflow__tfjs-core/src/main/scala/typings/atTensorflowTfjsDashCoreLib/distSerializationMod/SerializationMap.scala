package typings
package atTensorflowTfjsDashCoreLib.distSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/serialization", "SerializationMap")
@js.native
class SerializationMap protected () extends js.Object {
  var classNameMap: org.scalablytyped.runtime.StringDictionary[js.Tuple2[SerializableConstructor[Serializable], FromConfigMethod[Serializable]]] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/serialization", "SerializationMap")
@js.native
object SerializationMap extends js.Object {
  var instance: js.Any = js.native
  /**
    * Returns the singleton instance of the map.
    */
  def getMap(): atTensorflowTfjsDashCoreLib.distSerializationMod.SerializationMap = js.native
  /**
    * Registers the class as serializable.
    */
  def register[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T]): scala.Unit = js.native
}

