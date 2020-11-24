package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedExports
  extends Node
     with NamedExportBindings
     with NamedImportsOrExports {
  
  val elements: NodeArray[ExportSpecifier] = js.native
  
  @JSName("kind")
  val kind_NamedExports: typings.typescript.mod.SyntaxKind.NamedExports = js.native
  
  @JSName("parent")
  val parent_NamedExports: ExportDeclaration = js.native
}
