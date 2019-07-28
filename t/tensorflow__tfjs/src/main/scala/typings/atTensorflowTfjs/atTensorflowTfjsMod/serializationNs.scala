package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "serialization")
@js.native
object serializationNs extends js.Object {
  @js.native
  abstract class Serializable ()
    extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.Serializable
  
  @js.native
  class SerializationMap protected ()
    extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.SerializationMap
  
  def registerClass[T /* <: typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
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
    def fromConfig[T /* <: typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
  /* static members */
  @js.native
  object SerializationMap extends js.Object {
    var instance: js.Any = js.native
    /**
      * Returns the singleton instance of the map.
      */
    def getMap(): typings.atTensorflowTfjsDashCore.distSerializationMod.SerializationMap = js.native
    /**
      * Registers the class as serializable.
      */
    def register[T /* <: typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
  }
  
}

