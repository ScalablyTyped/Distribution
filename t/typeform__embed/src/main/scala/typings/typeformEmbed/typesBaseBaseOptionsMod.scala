package typings.typeformEmbed

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseBaseOptionsMod {
  
  trait BaseOptions extends StObject {
    
    /**
      * Display embedded typeform as conversation
      *
      * @type {boolean}
      */
    var chat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of hidden fields
      *
      * @type {Record<string,string>}
      */
    var hidden: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Reopen the modal window with form in the same state as it wos when closed.
      * For widget this applies only on mobile (without displayOnMobile option).
      */
    var keepSession: js.UndefOr[Boolean] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setChat(value: Boolean): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
      
      inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
      
      inline def setHidden(value: Record[String, String]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setKeepSession(value: Boolean): Self = StObject.set(x, "keepSession", value.asInstanceOf[js.Any])
      
      inline def setKeepSessionUndefined: Self = StObject.set(x, "keepSession", js.undefined)
    }
  }
}
