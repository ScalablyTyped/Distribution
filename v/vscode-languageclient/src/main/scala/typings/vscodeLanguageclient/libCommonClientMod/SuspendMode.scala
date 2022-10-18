package typings.vscodeLanguageclient.libCommonClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SuspendMode extends StObject
@JSImport("vscode-languageclient/lib/common/client", "SuspendMode")
@js.native
object SuspendMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SuspendMode & String] = js.native
  
  /**
    * Don't allow suspend mode.
    */
  @js.native
  sealed trait off
    extends StObject
       with SuspendMode
  /* "off" */ val off: typings.vscodeLanguageclient.libCommonClientMod.SuspendMode.off & String = js.native
  
  /**
    * Support suspend mode even if not all
    * registered providers have a corresponding
    * activation listener.
    */
  @js.native
  sealed trait on
    extends StObject
       with SuspendMode
  /* "on" */ val on: typings.vscodeLanguageclient.libCommonClientMod.SuspendMode.on & String = js.native
}
