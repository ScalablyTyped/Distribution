package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertClause
  extends StObject
     with Node {
  
  val elements: NodeArray[AssertEntry] = js.native
  
  @JSName("kind")
  val kind_AssertClause: typings.typescript.mod.SyntaxKind.AssertClause = js.native
  
  val multiLine: js.UndefOr[Boolean] = js.native
  
  @JSName("parent")
  val parent_AssertClause: ImportDeclaration | ExportDeclaration = js.native
}
