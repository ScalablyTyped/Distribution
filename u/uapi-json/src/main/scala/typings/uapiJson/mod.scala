package typings.uapiJson

import typings.uapiJson.anon.AddSegments
import typings.uapiJson.anon.Book
import typings.uapiJson.anon.CloseSession
import typings.uapiJson.anon.CurrencyConvert
import typings.uapiJson.settingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uapi-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAirService(settings: Settings): AddSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("createAirService")(settings.asInstanceOf[js.Any]).asInstanceOf[AddSegments]
  
  inline def createHotelService(settings: Settings): Book = ^.asInstanceOf[js.Dynamic].applyDynamic("createHotelService")(settings.asInstanceOf[js.Any]).asInstanceOf[Book]
  
  inline def createTerminalService(Settings: Settings): CloseSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminalService")(Settings.asInstanceOf[js.Any]).asInstanceOf[CloseSession]
  
  inline def createUtilsService(settings: Settings): CurrencyConvert = ^.asInstanceOf[js.Dynamic].applyDynamic("createUtilsService")(settings.asInstanceOf[js.Any]).asInstanceOf[CurrencyConvert]
  
  object errorCodes {
    
    @JSImport("uapi-json", "errorCodes.GdsFailure")
    @js.native
    val GdsFailure: Double = js.native
    
    @JSImport("uapi-json", "errorCodes.NotFound")
    @js.native
    val NotFound: Double = js.native
    
    @JSImport("uapi-json", "errorCodes.UapiFailure")
    @js.native
    val UapiFailure: Double = js.native
    
    @JSImport("uapi-json", "errorCodes.Unauthenticated")
    @js.native
    val Unauthenticated: Double = js.native
    
    @JSImport("uapi-json", "errorCodes.Unauthorized")
    @js.native
    val Unauthorized: Double = js.native
    
    @JSImport("uapi-json", "errorCodes.Validation")
    @js.native
    val Validation: Double = js.native
  }
}
