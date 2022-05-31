package typings.winstonMail

import typings.winstonMail.mod.MailTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object winstonMail {
    
    @JSGlobal("winstonMail.Mail")
    @js.native
    class Mail protected ()
      extends typings.winstonMail.mod.Mail {
      def this(options: MailTransportOptions) = this()
    }
    
    /* augmented module */
    object mod {
      
      trait Transports extends StObject {
        
        var Mail: typings.winstonMail.mod.Mail
      }
      object Transports {
        
        inline def apply(Mail: typings.winstonMail.mod.Mail): Transports = {
          val __obj = js.Dynamic.literal(Mail = Mail.asInstanceOf[js.Any])
          __obj.asInstanceOf[Transports]
        }
        
        extension [Self <: Transports](x: Self) {
          
          inline def setMail(value: typings.winstonMail.mod.Mail): Self = StObject.set(x, "Mail", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
