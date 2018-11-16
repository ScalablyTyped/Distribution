package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ISyntaxList2")
@js.native
class ISyntaxList2 protected () extends AST {
  def this(_fileName: java.lang.String, members: js.Array[AST]) = this()
  var _fileName: js.Any = js.native
  var members: js.Any = js.native
  def any(func: js.Function1[/* v */ AST, scala.Boolean]): scala.Boolean = js.native
  def childAt(index: scala.Double): AST = js.native
  def childCount(): scala.Double = js.native
  def firstOrDefault(func: js.Function2[/* v */ AST, /* index */ scala.Double, scala.Boolean]): AST = js.native
  def lastOrDefault(func: js.Function2[/* v */ AST, /* index */ scala.Double, scala.Boolean]): AST = js.native
  def structuralEquals(ast: ISyntaxList2, includingPosition: scala.Boolean): scala.Boolean = js.native
}

