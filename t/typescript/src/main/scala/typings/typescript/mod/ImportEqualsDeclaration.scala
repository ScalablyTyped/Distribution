package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of:
  * - import x = require("mod");
  * - import x = M.x;
  */
@js.native
trait ImportEqualsDeclaration
  extends StObject
     with DeclarationStatement
     with HasJSDoc
     with HasModifiers
     with TypeOnlyCompatibleAliasDeclaration {
  
  val isTypeOnly: Boolean = js.native
  
  @JSName("kind")
  val kind_ImportEqualsDeclaration: typings.typescript.mod.SyntaxKind.ImportEqualsDeclaration = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  val moduleReference: ModuleReference = js.native
  
  @JSName("name")
  val name_ImportEqualsDeclaration: Identifier = js.native
  
  @JSName("parent")
  val parent_ImportEqualsDeclaration: SourceFile | ModuleBlock = js.native
}
