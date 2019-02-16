package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolDef extends js.Object {
  var eliminated: scala.Double
  var export: scala.Boolean
  var global: scala.Boolean
  var id: scala.Double
  var init: AST_SymbolRef
  var mangled_name: scala.Null | java.lang.String
  var name: java.lang.String
  var orig: js.Array[AST_SymbolRef]
  var references: js.Array[AST_SymbolRef]
  var replaced: scala.Double
  var scope: AST_Scope
  var undeclared: scala.Boolean
}

