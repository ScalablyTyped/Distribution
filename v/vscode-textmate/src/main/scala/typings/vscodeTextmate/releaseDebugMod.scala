package typings.vscodeTextmate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseDebugMod {
  
  object DebugFlags {
    
    @JSImport("vscode-textmate/release/debug", "DebugFlags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/debug", "DebugFlags.InDebugMode")
    @js.native
    def InDebugMode: Boolean = js.native
    inline def InDebugMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InDebugMode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vscode-textmate/release/debug", "UseOnigurumaFindOptions")
  @js.native
  val UseOnigurumaFindOptions: /* false */ Boolean = js.native
}
