package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "RBTree")
@js.native
class RBTree[T] protected ()
  extends typings.webcola.rbtreeMod.RBTree[T] {
  def this(comparator: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}
/* static members */
object RBTree {
  
  @JSImport("webcola", "RBTree.double_rotate")
  @js.native
  def double_rotate(root: js.Any, dir: js.Any): js.Any = js.native
  
  @JSImport("webcola", "RBTree.is_red")
  @js.native
  def is_red(node: js.Any): js.Any = js.native
  
  @JSImport("webcola", "RBTree.single_rotate")
  @js.native
  def single_rotate(root: js.Any, dir: js.Any): js.Any = js.native
}
