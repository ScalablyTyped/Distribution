package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScriptSnapshot {
  
  @JSImport("typescript", "ScriptSnapshot")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(text: java.lang.String): IScriptSnapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[IScriptSnapshot]
}
