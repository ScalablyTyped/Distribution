package typings.winstonLogglyBulk.mod

import typings.winstonTransport.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("winston-loggly-bulk", "Loggly")
@js.native
class Loggly () extends ^ {
  def this(options: LogglyOptions) = this()
  
  def extend(destination: js.Any, source: js.Any): js.Any = js.native
  
  def extractContext(obj: js.Any): js.Any = js.native
  
  def formatQuery(query: js.Any): js.Any = js.native
  
  def formatResults(results: js.Any, _options: js.Any): js.Any = js.native
  
  @JSName("log")
  def log_MLoggly(meta: js.Any, callback: js.Any): js.Any = js.native
  
  def loglify(obj: js.Any): js.Any = js.native
  
  def query(options: js.Any, callback: js.Any): js.Any = js.native
  
  def sanitizeLogs(logs: js.Any): js.Any = js.native
  
  def stream(maybeOptions: js.Any): js.Any = js.native
}
