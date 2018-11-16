package typings
package windowsDashScriptDashHostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides access to the named command-line arguments
 *
 * Note that enumerating over this object returns the **names** of the arguments, not the values
 */
@js.native
trait WshNamed extends js.Object {
  var Length: scala.Double = js.native
  def apply(name: java.lang.String): java.lang.String = js.native
  def Count(): scala.Double = js.native
  def Exists(Key: java.lang.String): scala.Boolean = js.native
  def Item(name: java.lang.String): java.lang.String = js.native
}

