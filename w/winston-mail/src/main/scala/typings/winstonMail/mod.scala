package typings.winstonMail

import typings.std.Transport
import typings.winstonMail.anon.Ca
import typings.winstonMail.anon.Ciphers
import typings.winstonMail.anon.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify winston.TransportInstance * / any */ @JSImport("winston-mail", "Mail")
  @js.native
  class Mail protected ()
    extends StObject
       with Transport {
    def this(options: MailTransportOptions) = this()
    
    def filter(obj: Level): Boolean = js.native
    
    var from: String = js.native
    
    var html: Boolean = js.native
    
    var level: String = js.native
    
    def log(level: js.Any, msg: js.Any, meta: js.Any, callback: js.Any): js.Any = js.native
    
    var name: String = js.native
    
    var silent: Boolean = js.native
    
    var subject: String = js.native
    
    var to: String = js.native
    
    var unique: Boolean = js.native
  }
  
  trait MailTransportOptions extends StObject {
    
    var authentication: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* obj */ Level, Boolean]] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* obj */ Level, String]] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var handleExceptions: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var ssl: js.UndefOr[Boolean | Ca] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tls: js.UndefOr[Boolean | Ciphers] = js.undefined
    
    var to: String
    
    var unique: js.UndefOr[Boolean] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object MailTransportOptions {
    
    inline def apply(to: String): MailTransportOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailTransportOptions]
    }
    
    extension [Self <: MailTransportOptions](x: Self) {
      
      inline def setAuthentication(value: js.Array[String]): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      inline def setAuthenticationVarargs(value: String*): Self = StObject.set(x, "authentication", js.Array(value :_*))
      
      inline def setFilter(value: /* obj */ Level => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFormatter(value: /* obj */ Level => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHandleExceptions(value: Boolean): Self = StObject.set(x, "handleExceptions", value.asInstanceOf[js.Any])
      
      inline def setHandleExceptionsUndefined: Self = StObject.set(x, "handleExceptions", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSsl(value: Boolean | Ca): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTls(value: Boolean | Ciphers): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  /* augmented module */
  object winstonAugmentingMod {
    
    trait Transports extends StObject {
      
      var Mail: typings.winstonMail.mod.Mail
    }
    object Transports {
      
      inline def apply(Mail: Mail): Transports = {
        val __obj = js.Dynamic.literal(Mail = Mail.asInstanceOf[js.Any])
        __obj.asInstanceOf[Transports]
      }
      
      extension [Self <: Transports](x: Self) {
        
        inline def setMail(value: Mail): Self = StObject.set(x, "Mail", value.asInstanceOf[js.Any])
      }
    }
  }
}
