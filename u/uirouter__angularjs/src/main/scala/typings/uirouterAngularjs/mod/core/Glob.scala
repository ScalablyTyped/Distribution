package typings.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.Glob")
@js.native
class Glob protected ()
  extends typings.uirouterCore.mod.Glob {
  def this(text: String) = this()
}
/* static members */
object Glob {
  
  /** Returns a glob from the string, or null if the string isn't Glob-like */
  @JSImport("@uirouter/angularjs", "core.Glob.fromString")
  @js.native
  def fromString(text: String): typings.uirouterCore.globMod.Glob = js.native
  
  /** Returns true if the string has glob-like characters in it */
  @JSImport("@uirouter/angularjs", "core.Glob.is")
  @js.native
  def is(text: String): Boolean = js.native
}
