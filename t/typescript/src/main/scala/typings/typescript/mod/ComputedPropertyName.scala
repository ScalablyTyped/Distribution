package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedPropertyName
  extends Node
     with DeclarationName
     with PropertyName {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_ComputedPropertyName: typings.typescript.mod.SyntaxKind.ComputedPropertyName = js.native
  @JSName("parent")
  var parent_ComputedPropertyName: Declaration = js.native
}

