package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxOpeningElement
  extends Expression
     with HasTypeArguments
     with JsxOpeningLikeElement {
  
  val attributes: JsxAttributes = js.native
  
  @JSName("kind")
  val kind_JsxOpeningElement: typings.typescript.mod.SyntaxKind.JsxOpeningElement = js.native
  
  @JSName("parent")
  val parent_JsxOpeningElement: JsxElement = js.native
  
  val tagName: JsxTagNameExpression = js.native
  
  val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
