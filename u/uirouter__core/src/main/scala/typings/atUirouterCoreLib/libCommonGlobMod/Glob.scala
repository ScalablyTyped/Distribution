package typings
package atUirouterCoreLib.libCommonGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/glob", "Glob")
@js.native
class Glob protected () extends js.Object {
  def this(text: java.lang.String) = this()
  var glob: js.Array[java.lang.String] = js.native
  var regexp: stdLib.RegExp = js.native
  var text: java.lang.String = js.native
  def matches(name: java.lang.String): scala.Boolean = js.native
}

@JSImport("@uirouter/core/lib/common/glob", "Glob")
@js.native
object Glob extends js.Object {
  /** Returns a glob from the string, or null if the string isn't Glob-like */
  def fromString(text: java.lang.String): atUirouterCoreLib.libCommonGlobMod.Glob = js.native
  /** Returns true if the string has glob-like characters in it */
  def is(text: java.lang.String): scala.Boolean = js.native
}

