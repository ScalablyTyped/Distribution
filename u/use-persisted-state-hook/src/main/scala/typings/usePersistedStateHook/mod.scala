package typings.usePersistedStateHook

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](key: String, state: T): js.Tuple2[T, Dispatch[SetStateAction[T]]] = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
  
  @JSImport("use-persisted-state-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
