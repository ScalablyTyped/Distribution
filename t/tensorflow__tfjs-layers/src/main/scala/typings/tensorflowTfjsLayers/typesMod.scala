package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Array
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait BaseSerialization[N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */] extends PyJsonDict {
    
    var class_name: N = js.native
    
    var config: T = js.native
  }
  object BaseSerialization {
    
    @scala.inline
    def apply[N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */](class_name: N, config: T): BaseSerialization[N, T] = {
      val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSerialization[N, T]]
    }
    
    @scala.inline
    implicit class BaseSerializationMutableBuilder[Self <: BaseSerialization[_, _], N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */] (val x: Self with (BaseSerialization[N, T])) extends AnyVal {
      
      @scala.inline
      def setClass_name(value: N): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: T): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  type PyJson[Keys /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ x in Keys ]:? @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue}
    */ typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PyJson with TopLevel[js.Any]
  
  @js.native
  trait PyJsonArray
    extends Array[PyJsonValue]
       with _PyJsonValue
  
  @js.native
  trait PyJsonDict
    extends /* key */ StringDictionary[PyJsonValue]
       with _PyJsonValue
  object PyJsonDict {
    
    @scala.inline
    def apply(): PyJsonDict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PyJsonDict]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typings.tensorflowTfjsLayers.typesMod.PyJsonArray
    - typings.tensorflowTfjsLayers.typesMod.PyJsonDict
  */
  type PyJsonValue = _PyJsonValue | Boolean | Double | String | Null
  
  trait _PyJsonValue extends StObject
}
