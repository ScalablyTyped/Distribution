package typings.winstonMail.mod

import typings.std.Transport
import typings.winstonMail.anon.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify winston.TransportInstance * / any */ @JSImport("winston-mail", "Mail")
@js.native
class Mail protected () extends Transport {
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
