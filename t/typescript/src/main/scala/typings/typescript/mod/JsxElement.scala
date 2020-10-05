package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxElement
  extends PrimaryExpression
     with JsxChild {
  var children: NodeArray[JsxChild] = js.native
  var closingElement: JsxClosingElement = js.native
  @JSName("kind")
  var kind_JsxElement: typings.typescript.mod.SyntaxKind.JsxElement = js.native
  var openingElement: JsxOpeningElement = js.native
}

