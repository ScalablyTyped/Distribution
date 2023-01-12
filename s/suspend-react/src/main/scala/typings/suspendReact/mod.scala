package typings.suspendReact

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("suspend-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear[Keys /* <: Tuple[Any] */](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  inline def clear[Keys /* <: Tuple[Any] */](keys: Keys): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(keys.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def peek[Keys /* <: Tuple[Any] */](keys: Keys): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")(keys.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def preload[Keys /* <: Tuple[Any] */, Fn /* <: js.Function1[/* keys */ Keys, js.Promise[Any]] */](fn: Fn, keys: Keys): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preload")(fn.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def preload[Keys /* <: Tuple[Any] */, Fn /* <: js.Function1[/* keys */ Keys, js.Promise[Any]] */](fn: Fn, keys: Keys, config: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preload")(fn.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def suspend[Keys /* <: Tuple[Any] */, Fn /* <: js.Function1[/* keys */ Keys, js.Promise[Any]] */](fn: Fn, keys: Keys): Await[ReturnType[Fn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("suspend")(fn.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Await[ReturnType[Fn]]]
  inline def suspend[Keys /* <: Tuple[Any] */, Fn /* <: js.Function1[/* keys */ Keys, js.Promise[Any]] */](fn: Fn, keys: Keys, config: Config): Await[ReturnType[Fn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("suspend")(fn.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Await[ReturnType[Fn]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Promise<infer V> ? V : never
    }}}
    */
  @js.native
  trait Await[T] extends StObject
  
  trait Config extends StObject {
    
    var equal: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Boolean]] = js.undefined
    
    var lifespan: js.UndefOr[Double] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setEqual(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      inline def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
      
      inline def setLifespan(value: Double): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
      
      inline def setLifespanUndefined: Self = StObject.set(x, "lifespan", js.undefined)
    }
  }
  
  type Tuple[T] = js.Array[T]
}
