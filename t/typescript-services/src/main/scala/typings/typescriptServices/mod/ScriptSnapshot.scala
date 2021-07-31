package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScriptSnapshot {
  
  @JSImport("typescript-services", "ScriptSnapshot")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromString(text: String): IScriptSnapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[IScriptSnapshot]
}
