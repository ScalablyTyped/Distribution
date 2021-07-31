package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxFragment
  extends StObject
     with PrimaryExpression
     with JsxChild {
  
  val children: NodeArray[JsxChild] = js.native
  
  val closingFragment: JsxClosingFragment = js.native
  
  @JSName("kind")
  val kind_JsxFragment: typings.typescript.mod.SyntaxKind.JsxFragment = js.native
  
  val openingFragment: JsxOpeningFragment = js.native
}
