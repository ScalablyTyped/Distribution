package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var config: js.Any
  def disable(): scala.Unit
  def enable(): scala.Unit
  def limit(mode: scala.Boolean): scala.Unit
  def scrollTo(node: stdLib.HTMLElement, x: scala.Double, y: scala.Double, speed: java.lang.String): scala.Unit
}

