package typings.tstl

import typings.tstl.internalTreeColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/tree/XTreeNode", JSImport.Namespace)
@js.native
object internalTreeXTreeNodeMod extends js.Object {
  @js.native
  class XTreeNode[T] protected () extends js.Object {
    def this(value: T, color: Color) = this()
    var color: Color = js.native
    var left: XTreeNode[T] | Null = js.native
    var parent: XTreeNode[T] | Null = js.native
    var right: XTreeNode[T] | Null = js.native
    var value: T = js.native
    def grand(): XTreeNode[T] | Null = js.native
    def sibling(): XTreeNode[T] | Null = js.native
    def uncle(): XTreeNode[T] | Null = js.native
  }
  
}

