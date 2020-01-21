package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends Obj {
  /**
    * Ensures that this scope or some scope above it has a property by the given name
    * (defining it in the top scope if it is missing), and, if the property doesn’t
    * already have an `originNode`, assigns the given node to it.
    */
  def defVar(name: String, originNode: Node): AVal = js.native
}

@JSImport("tern/lib/infer", "Scope")
@js.native
object Scope extends TopLevel[ScopeConstructor]

