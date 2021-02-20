package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectBindingPattern
  extends BindingPattern
     with Node
     with ObjectBindingOrAssignmentPattern {
  
  val elements: NodeArray[BindingElement] = js.native
  
  @JSName("kind")
  val kind_ObjectBindingPattern: typings.typescript.mod.SyntaxKind.ObjectBindingPattern = js.native
  
  @JSName("parent")
  val parent_ObjectBindingPattern: VariableDeclaration | ParameterDeclaration | BindingElement = js.native
}
