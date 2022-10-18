package typings.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRbtreeMod {
  
  @JSImport("webcola/dist/src/rbtree", "Iterator")
  @js.native
  open class Iterator protected () extends StObject {
    def this(tree: Any) = this()
    
    var _ancestors: Any = js.native
    
    var _cursor: Any = js.native
    
    def _maxNode(start: Any): Unit = js.native
    
    def _minNode(start: Any): Unit = js.native
    
    var _tree: Any = js.native
    
    def data(): Any = js.native
    
    def next(): Any = js.native
    
    def prev(): Any = js.native
  }
  
  @JSImport("webcola/dist/src/rbtree", "RBTree")
  @js.native
  open class RBTree[T] protected () extends TreeBase {
    def this(comparator: js.Function2[/* a */ T, /* b */ T, Double]) = this()
    
    def insert(data: Any): Boolean = js.native
    
    def remove(data: Any): Boolean = js.native
  }
  /* static members */
  object RBTree {
    
    @JSImport("webcola/dist/src/rbtree", "RBTree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def double_rotate(root: Any, dir: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("double_rotate")(root.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def is_red(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("is_red")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def single_rotate(root: Any, dir: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("single_rotate")(root.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("webcola/dist/src/rbtree", "TreeBase")
  @js.native
  open class TreeBase () extends StObject {
    
    def _bound(data: Any, cmp: Any): Iterator = js.native
    
    var _comparator: Any = js.native
    
    var _root: Any = js.native
    
    def clear(): Unit = js.native
    
    def each(cb: Any): Unit = js.native
    
    def find(data: Any): Any = js.native
    
    def findIter(data: Any): Any = js.native
    
    def iterator(): Iterator = js.native
    
    def lowerBound(data: Any): Iterator = js.native
    
    def max(): Any = js.native
    
    def min(): Any = js.native
    
    def reach(cb: Any): Unit = js.native
    
    var size: Any = js.native
    
    def upperBound(data: Any): Iterator = js.native
  }
}
