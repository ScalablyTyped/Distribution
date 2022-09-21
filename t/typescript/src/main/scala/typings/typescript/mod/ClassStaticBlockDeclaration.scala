package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassStaticBlockDeclaration
  extends StObject
     with ClassElement
     with JSDocContainer
     with HasJSDoc {
  
  val body: Block = js.native
  
  @JSName("kind")
  val kind_ClassStaticBlockDeclaration: typings.typescript.mod.SyntaxKind.ClassStaticBlockDeclaration = js.native
  
  @JSName("parent")
  val parent_ClassStaticBlockDeclaration: ClassDeclaration | ClassExpression = js.native
}
