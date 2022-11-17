package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxText
  extends StObject
     with LiteralLikeNode {
  
  val containsOnlyTriviaWhiteSpaces: Boolean = js.native
  
  @JSName("kind")
  val kind_JsxText: typings.typescript.mod.SyntaxKind.JsxText = js.native
  
  @JSName("parent")
  val parent_JsxText: JsxElement | JsxFragment = js.native
}
