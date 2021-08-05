package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SimpleText {
  
  @JSImport("typescript-services", "SimpleText")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): ISimpleText = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScriptSnapshot")(scriptSnapshot.asInstanceOf[js.Any]).asInstanceOf[ISimpleText]
  
  inline def fromString(value: String): ISimpleText = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleText]
}
