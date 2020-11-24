package typings.uirouterCore.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/common", "Glob")
@js.native
class Glob protected ()
  extends typings.uirouterCore.globMod.Glob {
  def this(text: String) = this()
}
/* static members */
@JSImport("@uirouter/core/lib/common", "Glob")
@js.native
object Glob extends js.Object {
  
  /** Returns a glob from the string, or null if the string isn't Glob-like */
  def fromString(text: String): typings.uirouterCore.globMod.Glob = js.native
  
  /** Returns true if the string has glob-like characters in it */
  def is(text: String): Boolean = js.native
}
