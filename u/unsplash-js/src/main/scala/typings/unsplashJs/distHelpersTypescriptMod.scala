package typings.unsplashJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersTypescriptMod {
  
  @JSImport("unsplash-js/dist/helpers/typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIsNonEmptyArray[T](a: js.Array[T]): /* is unsplash-js.unsplash-js/dist/helpers/typescript.NonEmptyArray<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIsNonEmptyArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is unsplash-js.unsplash-js/dist/helpers/typescript.NonEmptyArray<T> */ Boolean]
  
  @JSImport("unsplash-js/dist/helpers/typescript", "checkIsString")
  @js.native
  val checkIsString: Refinement[Any, String] = js.native
  
  inline def getRefinement[A, B /* <: A */](getB: js.Function1[/* a */ A, Nullable[B]]): Refinement[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefinement")(getB.asInstanceOf[js.Any]).asInstanceOf[Refinement[A, B]]
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](x: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(x.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typings.unsplashJs.distHelpersTypescriptMod.JsonArray
    - typings.unsplashJs.distHelpersTypescriptMod.JsonMap
  */
  type AnyJson = _AnyJson | Boolean | Double | String | Null
  
  @js.native
  trait JsonArray
    extends StObject
       with Array[AnyJson]
       with _AnyJson
  
  trait JsonMap
    extends StObject
       with /* key */ StringDictionary[AnyJson]
       with _AnyJson
  object JsonMap {
    
    inline def apply(): JsonMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonMap]
    }
  }
  
  type NonEmptyArray[T] = Array[T]
  
  type Nullable[T] = T | Null
  
  type OmitStrict[T, K /* <: /* keyof T */ String */] = Omit[T, K]
  
  type Refinement[A, B /* <: A */] = js.Function1[/* a */ A, /* is B */ Boolean]
  
  trait _AnyJson extends StObject
}
