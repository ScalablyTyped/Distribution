package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBindingPattern
  extends BindingPattern
     with Node
     with ArrayBindingOrAssignmentPattern {
  var elements: NodeArray[ArrayBindingElement] = js.native
  @JSName("kind")
  var kind_ArrayBindingPattern: typings.typescript.mod.SyntaxKind.ArrayBindingPattern = js.native
  @JSName("parent")
  var parent_ArrayBindingPattern: VariableDeclaration | ParameterDeclaration | BindingElement = js.native
}

