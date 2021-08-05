package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "RBTree")
@js.native
class RBTree[T] protected ()
  extends typings.webcola.rbtreeMod.RBTree[T] {
  def this(comparator: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}
/* static members */
object RBTree {
  
  @JSImport("webcola", "RBTree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def double_rotate(root: js.Any, dir: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("double_rotate")(root.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def is_red(node: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("is_red")(node.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def single_rotate(root: js.Any, dir: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("single_rotate")(root.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
