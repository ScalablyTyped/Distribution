package typings.tstl

import typings.tstl.baseTreeUnderscoreColorMod._Color
import typings.tstl.baseTreeUnderscoreXTreeNodeMod._XTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/tree/_XTreeNode", JSImport.Namespace)
@js.native
object baseTreeUnderscoreXTreeNodeMod extends js.Object {
  @js.native
  class _XTreeNode[T] protected () extends js.Object {
    def this(value: T, color: _Color) = this()
    var color: _Color = js.native
    val grand: _XTreeNode[T] | Null = js.native
    var left: _XTreeNode[T] | Null = js.native
    var parent: _XTreeNode[T] | Null = js.native
    var right: _XTreeNode[T] | Null = js.native
    val sibling: _XTreeNode[T] | Null = js.native
    val uncle: _XTreeNode[T] | Null = js.native
    var value: T = js.native
  }
  
}

