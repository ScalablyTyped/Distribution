package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatTypesMod {
  
  trait BaseSerialization[N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */]
    extends StObject
       with PyJsonDict {
    
    var class_name: N
    
    var config: T
  }
  object BaseSerialization {
    
    inline def apply[N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */](class_name: N, config: T): BaseSerialization[N, T] = {
      val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSerialization[N, T]]
    }
    
    extension [Self <: BaseSerialization[?, ?], N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */](x: Self & (BaseSerialization[N, T])) {
      
      inline def setClass_name(value: N): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: T): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ x in Keys ]:? @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue}
    }}}
    */
  @js.native
  trait PyJson[Keys /* <: String */] extends StObject
  
  type PyJsonArray = js.Array[PyJsonValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PyJsonDict = {[key: string] : @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue}
  }}}
  to avoid circular code involving: 
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/node_config.NodeArgs
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/node_config.NodeConfig
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/node_config.TensorKeyWithArgsArray
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonArray
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonDict
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue
  */
  trait PyJsonDict
    extends StObject
       with /* key */ StringDictionary[PyJsonValue]
  object PyJsonDict {
    
    inline def apply(): PyJsonDict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PyJsonDict]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PyJsonValue = boolean | number | string | null | @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonArray | @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonDict
  }}}
  to avoid circular code involving: 
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonArray
  - @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue
  */
  type PyJsonValue = Boolean | Double | String | Null | Any | PyJsonDict
}
