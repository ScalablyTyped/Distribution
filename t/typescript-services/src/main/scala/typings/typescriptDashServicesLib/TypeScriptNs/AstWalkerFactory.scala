package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.AstWalkerFactory")
@js.native
class AstWalkerFactory () extends js.Object {
  def simpleWalk(ast: AST, pre: js.Function2[/* ast */ AST, /* state */ js.Any, scala.Unit]): scala.Unit = js.native
  def simpleWalk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* state */ js.Any, scala.Unit],
    post: js.Function2[/* ast */ AST, /* state */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def simpleWalk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* state */ js.Any, scala.Unit],
    post: js.Function2[/* ast */ AST, /* state */ js.Any, scala.Unit],
    state: js.Any
  ): scala.Unit = js.native
  def walk(ast: AST, pre: js.Function2[/* ast */ AST, /* walker */ IAstWalker, scala.Unit]): scala.Unit = js.native
  def walk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* walker */ IAstWalker, scala.Unit],
    post: js.Function2[/* ast */ AST, /* walker */ IAstWalker, scala.Unit]
  ): scala.Unit = js.native
  def walk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* walker */ IAstWalker, scala.Unit],
    post: js.Function2[/* ast */ AST, /* walker */ IAstWalker, scala.Unit],
    state: js.Any
  ): scala.Unit = js.native
}

