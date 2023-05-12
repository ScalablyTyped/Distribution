package typings.telegramWebApp

import typings.telegramWebApp.telegramWebAppStrings.cancel
import typings.telegramWebApp.telegramWebAppStrings.cancelled
import typings.telegramWebApp.telegramWebAppStrings.close
import typings.telegramWebApp.telegramWebAppStrings.default
import typings.telegramWebApp.telegramWebAppStrings.destructive
import typings.telegramWebApp.telegramWebAppStrings.failed
import typings.telegramWebApp.telegramWebAppStrings.ok
import typings.telegramWebApp.telegramWebAppStrings.paid
import typings.telegramWebApp.telegramWebAppStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var data: String | Null
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(data = null)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
    }
  }
  
  trait Buttonid extends StObject {
    
    var button_id: String | Null
  }
  object Buttonid {
    
    inline def apply(): Buttonid = {
      val __obj = js.Dynamic.literal(button_id = null)
      __obj.asInstanceOf[Buttonid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Buttonid] (val x: Self) extends AnyVal {
      
      inline def setButton_id(value: String): Self = StObject.set(x, "button_id", value.asInstanceOf[js.Any])
      
      inline def setButton_idNull: Self = StObject.set(x, "button_id", null)
    }
  }
  
  trait Data extends StObject {
    
    var data: String
  }
  object Data {
    
    inline def apply(data: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsStateStable] (val x: Self) extends AnyVal {
      
      inline def setIsStateStable(value: Boolean): Self = StObject.set(x, "isStateStable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status extends StObject {
    
    var status: paid | cancelled | failed | pending
    
    var url: String
  }
  object Status {
    
    inline def apply(status: paid | cancelled | failed | pending, url: String): Status = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: paid | cancelled | failed | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tryinstantview extends StObject {
    
    var try_instant_view: js.UndefOr[Boolean] = js.undefined
  }
  object Tryinstantview {
    
    inline def apply(): Tryinstantview = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tryinstantview]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tryinstantview] (val x: Self) extends AnyVal {
      
      inline def setTry_instant_view(value: Boolean): Self = StObject.set(x, "try_instant_view", value.asInstanceOf[js.Any])
      
      inline def setTry_instant_viewUndefined: Self = StObject.set(x, "try_instant_view", js.undefined)
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
    var text: String
    
    /**
      * Type of the button. Set to default by default.
      * Can be one of these values:
      * - `default`, a button with the default style,
      * - `ok`, a button with the localized text “OK”,
      * - `close`, a button with the localized text “Close”,
      * - `cancel`, a button with the localized text “Cancel”,
      * - `destructive`, a button with a style that indicates a destructive action (e.g. “Remove”, “Delete”, etc.).
      */
    var `type`: default | destructive
  }
  object typedefaultdestructivetex {
    
    inline def apply(text: String, `type`: default | destructive): typedefaultdestructivetex = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typedefaultdestructivetex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typedefaultdestructivetex] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: default | destructive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    var `type`: ok | close | cancel
  }
  object typeokclosecanceltextstri {
    
    inline def apply(`type`: ok | close | cancel): typeokclosecanceltextstri = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typeokclosecanceltextstri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typeokclosecanceltextstri] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: ok | close | cancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
