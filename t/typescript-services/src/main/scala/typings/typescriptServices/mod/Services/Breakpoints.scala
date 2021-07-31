package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breakpoints {
  
  @JSImport("typescript-services", "Services.Breakpoints")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBreakpointLocation(syntaxTree: SyntaxTree, askedPos: Double): typings.typescriptServices.TypeScript.Services.SpanInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getBreakpointLocation")(syntaxTree.asInstanceOf[js.Any], askedPos.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.SpanInfo]
}
