package typings.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Constraint")
@js.native
class Constraint protected ()
  extends typings.webcola.vpscMod.Constraint {
  def this(left: typings.webcola.vpscMod.Variable, right: typings.webcola.vpscMod.Variable, gap: Double) = this()
  def this(
    left: typings.webcola.vpscMod.Variable,
    right: typings.webcola.vpscMod.Variable,
    gap: Double,
    equality: Boolean
  ) = this()
}
