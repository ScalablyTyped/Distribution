package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PositionedElement")
@js.native
class PositionedElement protected ()
  extends typings.typescriptServices.TypeScript.PositionedElement {
  def this(
    parent: typings.typescriptServices.TypeScript.PositionedElement,
    element: ISyntaxElement,
    fullStart: Double
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.PositionedElement")
@js.native
object PositionedElement extends js.Object {
  
  def create(
    parent: typings.typescriptServices.TypeScript.PositionedElement,
    element: ISyntaxElement,
    fullStart: Double
  ): typings.typescriptServices.TypeScript.PositionedElement = js.native
}
