package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportTypeNode
  extends StObject
     with NodeWithTypeArguments {
  
  val argument: TypeNode = js.native
  
  val assertions: js.UndefOr[ImportTypeAssertionContainer] = js.native
  
  val isTypeOf: Boolean = js.native
  
  @JSName("kind")
  val kind_ImportTypeNode: ImportType = js.native
  
  val qualifier: js.UndefOr[EntityName] = js.native
}
