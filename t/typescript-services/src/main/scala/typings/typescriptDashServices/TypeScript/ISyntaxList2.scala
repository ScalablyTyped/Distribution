package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ISyntaxList2")
@js.native
class ISyntaxList2 protected () extends AST {
  def this(_fileName: String, members: js.Array[AST]) = this()
  var _fileName: js.Any = js.native
  var members: js.Any = js.native
  def any(func: js.Function1[/* v */ AST, Boolean]): Boolean = js.native
  def childAt(index: Double): AST = js.native
  def childCount(): Double = js.native
  def firstOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST = js.native
  def lastOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST = js.native
  def structuralEquals(ast: ISyntaxList2, includingPosition: Boolean): Boolean = js.native
}

