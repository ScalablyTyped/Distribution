package typings
package wuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wuMod {
  type Consumer[T] = js.Function1[/* t */ T, scala.Unit]
  type Filter[T] = js.Function1[/* t */ T, scala.Boolean]
}
