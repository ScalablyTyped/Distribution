package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/serialization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/serialization", "Serializable")
  @js.native
  abstract class Serializable () extends StObject {
    
    /**
      * Return the class name for this class to use in serialization contexts.
      *
      * Generally speaking this will be the same thing that constructor.name
      * would have returned.  However, the class name needs to be robust
      * against minification for serialization/deserialization to work properly.
      *
      * There's also places such as initializers.VarianceScaling, where
      * implementation details between different languages led to different
      * class hierarchies and a non-leaf node is used for serialization purposes.
      */
    def getClassName(): String = js.native
    
    /**
      * Return all the non-weight state needed to serialize this object.
      */
    def getConfig(): ConfigDict = js.native
  }
  /* static members */
  object Serializable {
    
    @JSImport("@tensorflow/tfjs-core/dist/serialization", "Serializable")
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
    @scala.inline
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/serialization", "SerializationMap")
  @js.native
  class SerializationMap protected () extends StObject {
    
    var classNameMap: StringDictionary[js.Tuple2[SerializableConstructor[Serializable], FromConfigMethod[Serializable]]] = js.native
  }
  /* static members */
  object SerializationMap {
    
    @JSImport("@tensorflow/tfjs-core/dist/serialization", "SerializationMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the singleton instance of the map.
      */
    @scala.inline
    def getMap(): SerializationMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getMap")().asInstanceOf[SerializationMap]
    
    @JSImport("@tensorflow/tfjs-core/dist/serialization", "SerializationMap.instance")
    @js.native
    def instance: js.Any = js.native
    @scala.inline
    def instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    /**
      * Registers the class as serializable.
      */
    @scala.inline
    def register[T /* <: Serializable */](cls: SerializableConstructor[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @scala.inline
  def registerClass[T /* <: Serializable */](cls: SerializableConstructor[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(cls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ConfigDict
    extends StObject
       with /* key */ StringDictionary[ConfigDictValue]
       with _ConfigDictValue
  object ConfigDict {
    
    @scala.inline
    def apply(): ConfigDict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigDict]
    }
  }
  
  @js.native
  trait ConfigDictArray
    extends StObject
       with Array[ConfigDictValue]
       with _ConfigDictValue
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typings.tensorflowTfjsCore.serializationMod.ConfigDictArray
    - typings.tensorflowTfjsCore.serializationMod.ConfigDict
  */
  type ConfigDictValue = _ConfigDictValue | Boolean | Double | String | Null
  
  type FromConfigMethod[T /* <: Serializable */] = js.Function2[/* cls */ SerializableConstructor[T], /* config */ ConfigDict, T]
  
  @js.native
  trait SerializableConstructor[T /* <: Serializable */]
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, T] {
    
    var className: String = js.native
    
    def fromConfig(cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSName("fromConfig")
    var fromConfig_Original: FromConfigMethod[T] = js.native
  }
  
  trait _ConfigDictValue extends StObject
}
