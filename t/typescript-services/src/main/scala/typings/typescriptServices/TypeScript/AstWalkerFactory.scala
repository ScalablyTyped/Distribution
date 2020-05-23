package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AstWalkerFactory extends js.Object {
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

