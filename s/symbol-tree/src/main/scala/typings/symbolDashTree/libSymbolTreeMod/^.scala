package typings.symbolDashTree.libSymbolTreeMod

import typings.symbolDashTree.TypeofTreePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("symbol-tree/lib/SymbolTree", JSImport.Namespace)
@js.native
/**
	 * @param [description='SymbolTree data'] Description used for the Symbol
	 *
	 *        **Default:** `'SymbolTree data'`
	 */
class ^[T /* <: js.Object */] () extends SymbolTree[T] {
  def this(description: String) = this()
}

@JSImport("symbol-tree/lib/SymbolTree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TreePosition: TypeofTreePosition = js.native
}

