package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstWalkerFactory extends StObject {
  
  def simpleWalk(ast: AST, pre: js.Function2[/* ast */ AST, /* state */ Any, Unit]): Unit = js.native
  def simpleWalk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* state */ Any, Unit],
    post: js.Function2[/* ast */ AST, /* state */ Any, Unit]
  ): Unit = js.native
  def simpleWalk(
    ast: AST,
    pre: js.Function2[/* ast */ AST, /* state */ Any, Unit],
    post: js.Function2[/* ast */ AST, /* state */ Any, Unit],
    state: Any
  ): Unit = js.native
  def simpleWalk(ast: AST, pre: js.Function2[/* ast */ AST, /* state */ Any, Unit], post: Unit, state: Any): Unit = js.native
  
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
    state: Any
  ): Unit = js.native
  def walk(ast: AST, pre: js.Function2[/* ast */ AST, /* walker */ IAstWalker, Unit], post: Unit, state: Any): Unit = js.native
}
