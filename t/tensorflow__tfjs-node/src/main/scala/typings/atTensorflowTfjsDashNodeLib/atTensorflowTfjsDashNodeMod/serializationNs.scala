package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "serialization")
@js.native
object serializationNs extends js.Object {
  @js.native
  abstract class Serializable ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.serializationNs.Serializable
  
  @js.native
  class SerializationMap protected ()
    extends atTensorflowTfjsLib.atTensorflowTfjsMod.serializationNs.SerializationMap
  
  def registerClass[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T]): scala.Unit = js.native
  /* static members */
  @js.native
  object Serializable extends js.Object {
    /**
      * Creates an instance of T from a ConfigDict.
      *
      * This works for most descendants of serializable.  A few need to
      * provide special handling.
      * @param cls A Constructor for the class to instantiate.
      * @param config The Configuration for the object.
      */
    /** @nocollapse */
    def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
      cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
      config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
    ): T = js.native
  }
  
  /* static members */
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
  
}

