package typings
package wuLib.wuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wuNs {
  type Consumer[T] = js.Function1[/* t */ T, scala.Unit]
  type Filter[T] = js.Function1[/* t */ T, scala.Boolean]
}
