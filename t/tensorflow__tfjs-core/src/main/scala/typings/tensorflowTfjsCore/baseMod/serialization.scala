package typings.tensorflowTfjsCore.baseMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serialization {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.Serializable")
  @js.native
  abstract class Serializable ()
    extends typings.tensorflowTfjsCore.serializationMod.Serializable
  /* static members */
  object Serializable {
    
    /**
      * Creates an instance of T from a ConfigDict.
      *
      * This works for most descendants of serializable.  A few need to
      * provide special handling.
      * @param cls A Constructor for the class to instantiate.
      * @param config The Configuration for the object.
      */
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.Serializable.fromConfig")
    @js.native
    def fromConfig[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.SerializationMap")
  @js.native
  class SerializationMap protected ()
    extends typings.tensorflowTfjsCore.serializationMod.SerializationMap
  /* static members */
  object SerializationMap {
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.SerializationMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the singleton instance of the map.
      */
    @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.SerializationMap.getMap")
    @js.native
    def getMap(): typings.tensorflowTfjsCore.serializationMod.SerializationMap = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.SerializationMap.instance")
    @js.native
    def instance: js.Any = js.native
    @scala.inline
    def instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    /**
      * Registers the class as serializable.
      */
    @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.SerializationMap.register")
    @js.native
    def register[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "serialization.registerClass")
  @js.native
  def registerClass[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = js.native
}
