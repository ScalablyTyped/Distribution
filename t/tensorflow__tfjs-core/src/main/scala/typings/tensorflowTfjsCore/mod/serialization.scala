package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serialization {
  
  @JSImport("@tensorflow/tfjs-core", "serialization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core", "serialization.Serializable")
  @js.native
  abstract class Serializable ()
    extends typings.tensorflowTfjsCore.baseMod.serialization.Serializable
  /* static members */
  object Serializable {
    
    @JSImport("@tensorflow/tfjs-core", "serialization.Serializable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an instance of T from a ConfigDict.
      *
      * This works for most descendants of serializable.  A few need to
      * provide special handling.
      * @param cls A Constructor for the class to instantiate.
      * @param config The Configuration for the object.
      */
    /** @nocollapse */
    inline def fromConfig[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@tensorflow/tfjs-core", "serialization.SerializationMap")
  @js.native
  /* private */ class SerializationMap ()
    extends typings.tensorflowTfjsCore.baseMod.serialization.SerializationMap
  /* static members */
  object SerializationMap {
    
    @JSImport("@tensorflow/tfjs-core", "serialization.SerializationMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the singleton instance of the map.
      */
    inline def getMap(): typings.tensorflowTfjsCore.serializationMod.SerializationMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getMap")().asInstanceOf[typings.tensorflowTfjsCore.serializationMod.SerializationMap]
    
    @JSImport("@tensorflow/tfjs-core", "serialization.SerializationMap.instance")
    @js.native
    def instance: js.Any = js.native
    inline def instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    /**
      * Registers the class as serializable.
      */
    inline def register[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def registerClass[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */](cls: SerializableConstructor[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
