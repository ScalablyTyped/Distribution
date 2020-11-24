package typings.throttleDebounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type debounce[T] = typings.throttleDebounce.mod.throttle[T]
  
  type throttle[T] = T with typings.throttleDebounce.mod.Cancel
}
