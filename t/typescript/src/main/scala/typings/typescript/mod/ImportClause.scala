package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportClause
  extends NamedDeclaration
     with TypeOnlyCompatibleAliasDeclaration {
  
  val isTypeOnly: Boolean = js.native
  
  @JSName("kind")
  val kind_ImportClause: typings.typescript.mod.SyntaxKind.ImportClause = js.native
  
  @JSName("name")
  val name_ImportClause: js.UndefOr[Identifier] = js.native
  
  val namedBindings: js.UndefOr[NamedImportBindings] = js.native
  
  @JSName("parent")
  val parent_ImportClause: ImportDeclaration = js.native
}
