package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.AstWalkerFactory")
@js.native
class AstWalkerFactory () extends js.Object {
  def simpleWalk(ast: AST, pre: js.Function2[/* ast */ AST, /* state */ js.Any, Unit]): Unit = js.native
  def simpleWalk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* state */ js.Any, Unit],
    post: js.Function2[/* ast */ AST, /* state */ js.Any, Unit]
  ): Unit = js.native
  def simpleWalk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* state */ js.Any, Unit],
    post: js.Function2[/* ast */ AST, /* state */ js.Any, Unit],
    state: js.Any
  ): Unit = js.native
  def walk(ast: AST, pre: js.Function2[/* ast */ AST, /* walker */ IAstWalker, Unit]): Unit = js.native
  def walk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* walker */ IAstWalker, Unit],
    post: js.Function2[/* ast */ AST, /* walker */ IAstWalker, Unit]
  ): Unit = js.native
  def walk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* walker */ IAstWalker, Unit],
    post: js.Function2[/* ast */ AST, /* walker */ IAstWalker, Unit],
    state: js.Any
  ): Unit = js.native
}

