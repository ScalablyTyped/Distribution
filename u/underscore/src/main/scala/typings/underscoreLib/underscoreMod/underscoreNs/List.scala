package typings
package underscoreLib.underscoreMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common interface between Arrays and jQuery objects

trait List[T]
  extends Collection[T]
     with /* index */ ScalablyTyped.runtime.NumberDictionary[T] {
  var length: scala.Double
}

