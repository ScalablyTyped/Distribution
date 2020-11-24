package typings.tensorflowTfjsCore.baseMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "serialization")
@js.native
object serialization extends js.Object {
  
  def registerClass[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
  
  @js.native
  abstract class Serializable ()
    extends typings.tensorflowTfjsCore.serializationMod.Serializable
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
    def fromConfig[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
  @js.native
  class SerializationMap protected ()
    extends typings.tensorflowTfjsCore.serializationMod.SerializationMap
  /* static members */
  @js.native
  object SerializationMap extends js.Object {
    
    /**
      * Returns the singleton instance of the map.
      */
    def getMap(): typings.tensorflowTfjsCore.serializationMod.SerializationMap = js.native
    
    var instance: js.Any = js.native
    
    /**
      * Registers the class as serializable.
      */
    def register[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
  }
}
