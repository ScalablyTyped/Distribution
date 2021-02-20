package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ReactRef[T] = RefCallback[T] | RefObject[T] | Null
  
  type RefCallback[T] = js.Function1[/* newValue */ T | Null, Unit]
  
  type RefObject[T] = MutableRefObject[T | Null]
}
