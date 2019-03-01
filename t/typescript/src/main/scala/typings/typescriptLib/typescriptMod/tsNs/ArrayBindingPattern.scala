package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayBindingPattern
  extends BindingPattern
     with Node
     with ArrayBindingOrAssignmentPattern {
  var elements: NodeArray[ArrayBindingElement] = js.native
  @JSName("parent")
  var parent_ArrayBindingPattern: VariableDeclaration | ParameterDeclaration | BindingElement = js.native
}

