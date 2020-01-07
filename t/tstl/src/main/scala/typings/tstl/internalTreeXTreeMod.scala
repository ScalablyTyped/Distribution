package typings.tstl

import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalTreeXTreeNodeMod.XTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/XTree", JSImport.Namespace)
@js.native
object internalTreeXTreeMod extends js.Object {
  @js.native
  abstract class XTree[T] protected () extends js.Object {
    protected def this(comp: Comparator[T, T]) = this()
    var _Erase_case1: js.Any = js.native
    var _Erase_case2: js.Any = js.native
    var _Erase_case3: js.Any = js.native
    var _Erase_case4: js.Any = js.native
    var _Erase_case5: js.Any = js.native
    var _Erase_case6: js.Any = js.native
    var _Fetch_color: js.Any = js.native
    var _Fetch_maximum: js.Any = js.native
    var _Insert_case1: js.Any = js.native
    var _Insert_case2: js.Any = js.native
    var _Insert_case3: js.Any = js.native
    var _Insert_case4: js.Any = js.native
    var _Insert_case5: js.Any = js.native
    var _Replace_node: js.Any = js.native
    var _Rotate_left: js.Any = js.native
    var _Rotate_right: js.Any = js.native
    var comp_ : js.Any = js.native
    var equal_ : js.Any = js.native
    var root_ : XTreeNode[T] | Null = js.native
    def clear(): Unit = js.native
    def erase(`val`: T): Unit = js.native
    def get(`val`: T): XTreeNode[T] | Null = js.native
    def insert(`val`: T): Unit = js.native
    def nearest(`val`: T): XTreeNode[T] | Null = js.native
    def root(): XTreeNode[T] | Null = js.native
  }
  
}

