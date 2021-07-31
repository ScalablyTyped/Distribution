package typings.typeFest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicMod {
  
  type Class[T, Arguments /* <: js.Array[js.Any] */] = Instantiable1[/* arguments_ */ Arguments, T]
  
  @js.native
  trait JsonArray
    extends StObject
       with Array[JsonValue]
       with _JsonValue
  
  trait JsonObject
    extends StObject
       with /* key */ StringDictionary[JsonValue]
       with _JsonValue
  object JsonObject {
    
    @scala.inline
    def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typings.typeFest.basicMod.JsonObject
    - typings.typeFest.basicMod.JsonArray
  */
  type JsonValue = _JsonValue | String | Double | Boolean | Null
  
  @js.native
  trait ObservableLike extends StObject {
    
    def subscribe(observer: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  }
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
  
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | BigInt64Array | BigUint64Array
  
  trait _JsonValue extends StObject
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      @scala.inline
      def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit class SymbolConstructorMutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
