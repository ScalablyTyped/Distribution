package typings
package throttleDashDebounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object throttleDashDebounceMod {
  type debounce[T] = throttle[T]
  type throttle[T] = T with Cancel
}
