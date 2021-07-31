package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineMap1 {
  
  @JSImport("typescript-services", "LineMap1")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): typings.typescriptServices.TypeScript.LineMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScriptSnapshot")(scriptSnapshot.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.LineMap]
  
  @scala.inline
  def fromSimpleText(text: ISimpleText): typings.typescriptServices.TypeScript.LineMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSimpleText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.LineMap]
  
  @scala.inline
  def fromString(text: String): typings.typescriptServices.TypeScript.LineMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.LineMap]
}
