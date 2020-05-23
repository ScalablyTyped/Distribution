package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolDef extends js.Object {
  var eliminated: Double
  var export: Boolean
  var global: Boolean
  var id: Double
  var init: ASTSymbolRef
  var mangled_name: Null | String
  var name: String
  var orig: js.Array[ASTSymbolRef]
  var references: js.Array[ASTSymbolRef]
  var replaced: Double
  var scope: ASTScope
  var undeclared: Boolean
}

object SymbolDef {
  @scala.inline
  def apply(
    eliminated: Double,
    export: Boolean,
    global: Boolean,
    id: Double,
    init: ASTSymbolRef,
    name: String,
    orig: js.Array[ASTSymbolRef],
    references: js.Array[ASTSymbolRef],
    replaced: Double,
    scope: ASTScope,
    undeclared: Boolean,
    mangled_name: String = null
  ): SymbolDef = {
    val __obj = js.Dynamic.literal(eliminated = eliminated.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], replaced = replaced.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], undeclared = undeclared.asInstanceOf[js.Any], mangled_name = mangled_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolDef]
  }
}

