package typings
package atUirouterAngularjsLib.atUirouterAngularjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "Glob")
@js.native
class Glob protected ()
  extends atUirouterCoreLib.atUirouterCoreMod.Glob {
  def this(text: java.lang.String) = this()
}

@JSImport("@uirouter/angularjs", "Glob")
@js.native
object Glob extends js.Object {
  /** Returns a glob from the string, or null if the string isn't Glob-like */
  def fromString(text: java.lang.String): atUirouterCoreLib.libCommonGlobMod.Glob = js.native
  /** Returns true if the string has glob-like characters in it */
  def is(text: java.lang.String): scala.Boolean = js.native
}

