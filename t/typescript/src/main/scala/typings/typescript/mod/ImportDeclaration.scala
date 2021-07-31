package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclaration
  extends StObject
     with Statement
     with JSDocContainer
     with HasJSDoc {
  
  val importClause: js.UndefOr[ImportClause] = js.native
  
  @JSName("kind")
  val kind_ImportDeclaration: typings.typescript.mod.SyntaxKind.ImportDeclaration = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  val moduleSpecifier: Expression = js.native
  
  @JSName("parent")
  val parent_ImportDeclaration: SourceFile | ModuleBlock = js.native
}
