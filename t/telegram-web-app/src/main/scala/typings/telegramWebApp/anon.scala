package typings.telegramWebApp

import typings.telegramWebApp.telegramWebAppStrings.cancel
import typings.telegramWebApp.telegramWebAppStrings.close
import typings.telegramWebApp.telegramWebAppStrings.default
import typings.telegramWebApp.telegramWebAppStrings.destructive
import typings.telegramWebApp.telegramWebAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buttonid extends StObject {
    
    var button_id: String | Null
  }
  object Buttonid {
    
    inline def apply(): Buttonid = {
      val __obj = js.Dynamic.literal(button_id = null)
      __obj.asInstanceOf[Buttonid]
    }
    
    extension [Self <: Buttonid](x: Self) {
      
      inline def setButton_id(value: String): Self = StObject.set(x, "button_id", value.asInstanceOf[js.Any])
      
      inline def setButton_idNull: Self = StObject.set(x, "button_id", null)
    }
  }
  
  trait IsStateStable extends StObject {
    
    var isStateStable: Boolean
  }
  object IsStateStable {
    
    inline def apply(isStateStable: Boolean): IsStateStable = {
      val __obj = js.Dynamic.literal(isStateStable = isStateStable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsStateStable]
    }
    
    extension [Self <: IsStateStable](x: Self) {
      
      inline def setIsStateStable(value: Boolean): Self = StObject.set(x, "isStateStable", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :'default' | 'destructive',   text :string} & {  id :string | undefined,   type :'default' | 'ok' | 'close' | 'cancel' | 'destructive' | undefined,   text :string | undefined} */
  trait typedefaultdestructivetex
    extends StObject
       with PopupButton {
    
    /**
      * Identifier of the button, 0-64 characters. Set to empty string by default.
      * If the button is pressed, its id is returned in the callback and the popupClosed event.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The text to be displayed on the button, 0-64 characters.
      * Required if type is default or destructive. Irrelevant for other types.
      */
    var text: String & js.UndefOr[String]
    
    /**
      * Type of the button. Set to default by default.
      * Can be one of these values:
      * - `default`, a button with the default style,
      * - `ok`, a button with the localized text “OK”,
      * - `close`, a button with the localized text “Close”,
      * - `cancel`, a button with the localized text “Cancel”,
      * - `destructive`, a button with a style that indicates a destructive action (e.g. “Remove”, “Delete”, etc.).
      */
    var `type`: (default | destructive) & (js.UndefOr[default | ok | close | cancel | destructive])
  }
  object typedefaultdestructivetex {
    
    inline def apply(
      text: String & js.UndefOr[String],
      `type`: (default | destructive) & (js.UndefOr[default | ok | close | cancel | destructive])
    ): typedefaultdestructivetex = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typedefaultdestructivetex]
    }
    
    extension [Self <: typedefaultdestructivetex](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String & js.UndefOr[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: (default | destructive) & (js.UndefOr[default | ok | close | cancel | destructive])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :'ok' | 'close' | 'cancel',   text :string | undefined} & {  id :string | undefined,   type :'default' | 'ok' | 'close' | 'cancel' | 'destructive' | undefined,   text :string | undefined} */
  trait typeokclosecanceltextstri
    extends StObject
       with PopupButton {
    
    /**
      * Identifier of the button, 0-64 characters. Set to empty string by default.
      * If the button is pressed, its id is returned in the callback and the popupClosed event.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The text to be displayed on the button, 0-64 characters.
      * Required if type is default or destructive. Irrelevant for other types.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Type of the button. Set to default by default.
      * Can be one of these values:
      * - `default`, a button with the default style,
      * - `ok`, a button with the localized text “OK”,
      * - `close`, a button with the localized text “Close”,
      * - `cancel`, a button with the localized text “Cancel”,
      * - `destructive`, a button with a style that indicates a destructive action (e.g. “Remove”, “Delete”, etc.).
      */
    var `type`: (ok | close | cancel) & (js.UndefOr[default | ok | close | cancel | destructive])
  }
  object typeokclosecanceltextstri {
    
    inline def apply(`type`: (ok | close | cancel) & (js.UndefOr[default | ok | close | cancel | destructive])): typeokclosecanceltextstri = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typeokclosecanceltextstri]
    }
    
    extension [Self <: typeokclosecanceltextstri](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: (ok | close | cancel) & (js.UndefOr[default | ok | close | cancel | destructive])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
