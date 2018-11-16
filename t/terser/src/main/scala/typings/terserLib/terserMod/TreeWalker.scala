package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "TreeWalker")
@js.native
class TreeWalker protected () extends js.Object {
  def this(visitor: visitor) = this()
  var stack: js.Array[AST_Scope] = js.native
  def parent(): AST_Scope = js.native
}

