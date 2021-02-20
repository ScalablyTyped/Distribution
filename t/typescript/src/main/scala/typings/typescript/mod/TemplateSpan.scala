package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSpan extends Node {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_TemplateSpan: typings.typescript.mod.SyntaxKind.TemplateSpan = js.native
  
  val literal: TemplateMiddle | TemplateTail = js.native
  
  @JSName("parent")
  val parent_TemplateSpan: TemplateExpression = js.native
}
