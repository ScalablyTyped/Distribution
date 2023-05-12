package typings.usePersistedStateHook

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def usePersistedStateHook[T](key: String, state: T): js.Tuple2[T, Dispatch[SetStateAction[T]]] = (js.Dynamic.global.applyDynamic("usePersistedStateHook")(key.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
}
