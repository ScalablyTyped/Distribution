package typings.vscodeTextmate

import typings.vscodeTextmate.releaseOnigLibMod.IOnigLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseTestsOnigLibsMod {
  
  @JSImport("vscode-textmate/release/tests/onigLibs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOniguruma(): js.Promise[IOnigLib] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOniguruma")().asInstanceOf[js.Promise[IOnigLib]]
}
