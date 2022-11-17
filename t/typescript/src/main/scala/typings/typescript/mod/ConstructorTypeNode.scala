package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorTypeNode
  extends StObject
     with FunctionOrConstructorTypeNodeBase {
  
  @JSName("kind")
  val kind_ConstructorTypeNode: ConstructorType = js.native
  
  @JSName("modifiers")
  val modifiers_ConstructorTypeNode: js.UndefOr[NodeArray[Modifier]] = js.native
}
