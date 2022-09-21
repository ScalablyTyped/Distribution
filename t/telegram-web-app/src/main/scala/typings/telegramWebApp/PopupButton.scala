package typings.telegramWebApp

import typings.telegramWebApp.telegramWebAppStrings.cancel
import typings.telegramWebApp.telegramWebAppStrings.close
import typings.telegramWebApp.telegramWebAppStrings.default
import typings.telegramWebApp.telegramWebAppStrings.destructive
import typings.telegramWebApp.telegramWebAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object describes the native popup button.
  */
/* Rewritten from type alias, can be one of: 
  - typings.telegramWebApp.anon.typedefaultdestructivetex
  - typings.telegramWebApp.anon.typeokclosecanceltextstri
*/
trait PopupButton extends StObject
object PopupButton {
  
  inline def typedefaultdestructivetex(
    text: String & js.UndefOr[String],
    `type`: (default | destructive) & (js.UndefOr[default | ok | close | cancel | destructive])
  ): typings.telegramWebApp.anon.typedefaultdestructivetex = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.telegramWebApp.anon.typedefaultdestructivetex]
  }
  
  inline def typeokclosecanceltextstri(`type`: (ok | close | cancel) & (js.UndefOr[default | ok | close | cancel | destructive])): typings.telegramWebApp.anon.typeokclosecanceltextstri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.telegramWebApp.anon.typeokclosecanceltextstri]
  }
}
