package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxSelfClosingElement
  extends StObject
     with PrimaryExpression
     with HasTypeArguments
     with JsxAttributeValue
     with JsxChild
     with JsxOpeningLikeElement {
  
  val attributes: JsxAttributes = js.native
  
  @JSName("kind")
  val kind_JsxSelfClosingElement: typings.typescript.mod.SyntaxKind.JsxSelfClosingElement = js.native
  
  val tagName: JsxTagNameExpression = js.native
  
  val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
