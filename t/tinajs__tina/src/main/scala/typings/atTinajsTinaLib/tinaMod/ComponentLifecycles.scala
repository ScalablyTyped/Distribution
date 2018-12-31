package typings
package atTinajsTinaLib.tinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentLifecycles extends js.Object {
  def attached(): scala.Unit
  def created(): scala.Unit
  def detached(): scala.Unit
  def moved(): scala.Unit
  def ready(): scala.Unit
}

