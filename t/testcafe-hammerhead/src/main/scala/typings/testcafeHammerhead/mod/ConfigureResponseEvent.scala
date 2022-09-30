package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "ConfigureResponseEvent")
@js.native
open class ConfigureResponseEvent () extends StObject {
  
  /** The unique identifier of the event **/
  var id: String = js.native
  
  /** The options to configure ResponseEvent **/
  var opts: ConfigureResponseEventOptions = js.native
  
  /** Remove header from result response **/
  def removeHeader(name: String): js.Promise[Unit] = js.native
  
  /** RequestFilterRule associated with event **/
  var requestFilterRule: RequestFilterRule = js.native
  
  /** Set header of the result response **/
  def setHeader(name: String, value: String): js.Promise[Unit] = js.native
}
/* static members */
object ConfigureResponseEvent {
  
  @JSImport("testcafe-hammerhead", "ConfigureResponseEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates a new ConfigureResponseEvent using the passed data **/
  inline def from(data: Any): ConfigureResponseEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[ConfigureResponseEvent]
}
