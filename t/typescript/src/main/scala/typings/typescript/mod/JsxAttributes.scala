package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxAttributes
  extends StObject
     with PrimaryExpression
     with Declaration {
  
  @JSName("kind")
  val kind_JsxAttributes: typings.typescript.mod.SyntaxKind.JsxAttributes = js.native
  
  @JSName("parent")
  val parent_JsxAttributes: JsxOpeningLikeElement = js.native
  
  val properties: NodeArray[JsxAttributeLike] = js.native
}
