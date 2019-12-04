package typings.tstl

import typings.tstl.baseTreeUnderscoreXTreeNodeMod._XTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_XTree", JSImport.Namespace)
@js.native
object baseTreeUnderscoreXTreeMod extends js.Object {
  @js.native
  abstract class _XTree[T] protected () extends js.Object {
    protected def this(comp: js.Function2[/* x */ T, /* y */ T, Boolean]) = this()
    var _Erase_case1: js.Any = js.native
    var _Erase_case2: js.Any = js.native
    var _Erase_case3: js.Any = js.native
    var _Erase_case4: js.Any = js.native
    var _Erase_case5: js.Any = js.native
    var _Erase_case6: js.Any = js.native
    var _Fetch_color: js.Any = js.native
    var _Insert_case1: js.Any = js.native
    var _Insert_case2: js.Any = js.native
    var _Insert_case3: js.Any = js.native
    var _Insert_case4: js.Any = js.native
    var _Insert_case5: js.Any = js.native
    var comp_ : js.Any = js.native
    var equal_ : js.Any = js.native
    var root_ : _XTreeNode[T] | Null = js.native
    /* protected */ def _Fetch_maximum(node: _XTreeNode[T]): _XTreeNode[T] = js.native
    /* protected */ def _Replace_node(oldNode: _XTreeNode[T]): Unit = js.native
    /* protected */ def _Replace_node(oldNode: _XTreeNode[T], newNode: _XTreeNode[T]): Unit = js.native
    /* protected */ def _Rotate_left(node: _XTreeNode[T]): Unit = js.native
    /* protected */ def _Rotate_right(node: _XTreeNode[T]): Unit = js.native
    def clear(): Unit = js.native
    def erase(`val`: T): Unit = js.native
    def get(`val`: T): _XTreeNode[T] | Null = js.native
    def insert(`val`: T): Unit = js.native
    def nearest(`val`: T): _XTreeNode[T] | Null = js.native
    def root(): _XTreeNode[T] | Null = js.native
  }
  
}

