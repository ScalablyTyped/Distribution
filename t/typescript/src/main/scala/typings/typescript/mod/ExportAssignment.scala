package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is either an `export =` or an `export default` declaration.
  * Unless `isExportEquals` is set, this node was parsed as an `export default`.
  */
@js.native
trait ExportAssignment
  extends StObject
     with DeclarationStatement
     with HasJSDoc
     with HasModifiers {
  
  val expression: Expression = js.native
  
  val isExportEquals: js.UndefOr[Boolean] = js.native
  
  @JSName("kind")
  val kind_ExportAssignment: typings.typescript.mod.SyntaxKind.ExportAssignment = js.native
  
  val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
  
  @JSName("parent")
  val parent_ExportAssignment: SourceFile = js.native
}
