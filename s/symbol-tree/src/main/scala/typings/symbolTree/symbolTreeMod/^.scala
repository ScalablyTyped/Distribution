package typings.symbolTree.symbolTreeMod

import typings.symbolTree.anon.TypeofTreePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
