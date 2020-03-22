package typings.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object splitPropsMod {
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Omit[T /* <: typings.uiBox.splitPropsMod.Dictionary[_] */, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
}
