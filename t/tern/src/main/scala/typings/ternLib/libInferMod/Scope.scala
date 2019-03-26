package typings
package ternLib.libInferMod

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
  def defVar(name: java.lang.String, originNode: estreeLib.estreeMod.Node): AVal = js.native
}

@JSImport("tern/lib/infer", "Scope")
@js.native
class ScopeCls () extends Scope {
  def this(parent: Scope, originNode: estreeLib.estreeMod.Node) = this()
}

