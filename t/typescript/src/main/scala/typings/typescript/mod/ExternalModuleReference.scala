package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalModuleReference
  extends Node
     with ModuleReference {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_ExternalModuleReference: typings.typescript.mod.SyntaxKind.ExternalModuleReference = js.native
  
  @JSName("parent")
  val parent_ExternalModuleReference: ImportEqualsDeclaration = js.native
}
