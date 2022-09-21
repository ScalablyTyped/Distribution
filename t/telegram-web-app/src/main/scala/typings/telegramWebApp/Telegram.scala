package typings.telegramWebApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Telegram extends StObject {
  
  var WebApp: typings.telegramWebApp.WebApp
}
object Telegram {
  
  inline def apply(WebApp: WebApp): Telegram = {
    val __obj = js.Dynamic.literal(WebApp = WebApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Telegram]
  }
  
  extension [Self <: Telegram](x: Self) {
    
    inline def setWebApp(value: WebApp): Self = StObject.set(x, "WebApp", value.asInstanceOf[js.Any])
  }
}
