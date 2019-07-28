package typings.terser.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolDef extends js.Object {
  var eliminated: Double
  var export: Boolean
  var global: Boolean
  var id: Double
  var init: AST_SymbolRef
  var mangled_name: Null | String
  var name: String
  var orig: js.Array[AST_SymbolRef]
  var references: js.Array[AST_SymbolRef]
  var replaced: Double
  var scope: AST_Scope
  var undeclared: Boolean
}

object SymbolDef {
  @scala.inline
  def apply(
    eliminated: Double,
    export: Boolean,
    global: Boolean,
    id: Double,
    init: AST_SymbolRef,
    name: String,
    orig: js.Array[AST_SymbolRef],
    references: js.Array[AST_SymbolRef],
    replaced: Double,
    scope: AST_Scope,
    undeclared: Boolean,
    mangled_name: String = null
  ): SymbolDef = {
    val __obj = js.Dynamic.literal(eliminated = eliminated, export = export, global = global, id = id, init = init, name = name, orig = orig, references = references, replaced = replaced, scope = scope, undeclared = undeclared)
    if (mangled_name != null) __obj.updateDynamic("mangled_name")(mangled_name)
    __obj.asInstanceOf[SymbolDef]
  }
}

