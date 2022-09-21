package typings.uapiJson

import typings.uapiJson.anon.CloseSession
import typings.uapiJson.settingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalMod {
  
  @JSImport("uapi-json/lib/Terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTerminalService(Settings: Settings): CloseSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminalService")(Settings.asInstanceOf[js.Any]).asInstanceOf[CloseSession]
}
