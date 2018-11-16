package typings
package valiantLib.valiantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Endpoint[T] extends js.Object {
  var finite: scala.Boolean
  var inclusive: scala.Boolean
  var value: T
}

