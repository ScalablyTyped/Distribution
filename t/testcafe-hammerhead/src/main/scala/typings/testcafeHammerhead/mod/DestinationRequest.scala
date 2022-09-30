package typings.testcafeHammerhead.mod

import typings.testcafeHammerhead.testcafeHammerheadStrings.error
import typings.testcafeHammerhead.testcafeHammerheadStrings.fatalError
import typings.testcafeHammerhead.testcafeHammerheadStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "DestinationRequest")
@js.native
open class DestinationRequest protected () extends StObject {
  /** Creates a DestinationRequest instance **/
  def this(opts: RequestOptions) = this()
  def this(opts: RequestOptions, cache: Boolean) = this()
  
  /** Error event **/
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  /** Fatal error event **/
  @JSName("on")
  def on_fatalError(event: fatalError, listener: js.Function1[/* err */ String, Unit]): this.type = js.native
  /** Response event **/
  @JSName("on")
  def on_response(event: response, listener: js.Function1[/* res */ StrictIncomingMessage, Unit]): this.type = js.native
}
