package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulkRegistration {
  
  @JSImport("vscode-languageserver", "BulkRegistration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new bulk registration.
    * @return an empty bulk registration.
    */
  inline def create(): typings.vscodeLanguageserver.libCommonServerMod.BulkRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.vscodeLanguageserver.libCommonServerMod.BulkRegistration]
}
