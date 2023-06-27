package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxNamespacedName
  extends StObject
     with Node
     with JsxAttributeName
     with JsxTagNameExpression
     with PropertyNameLiteral {
  
  @JSName("kind")
  val kind_JsxNamespacedName: typings.typescript.mod.SyntaxKind.JsxNamespacedName = js.native
  
  val name: Identifier = js.native
  
  val namespace: Identifier = js.native
}
