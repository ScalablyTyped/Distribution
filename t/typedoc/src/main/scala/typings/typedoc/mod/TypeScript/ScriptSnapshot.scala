package typings.typedoc.mod.TypeScript

import typings.typescript.mod.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScriptSnapshot {
  
  @JSImport("typedoc", "TypeScript.ScriptSnapshot")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromString(text: String): IScriptSnapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[IScriptSnapshot]
}
