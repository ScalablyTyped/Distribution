package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestMethod extends StObject {
  
  def apply(args: js.Any): Promise[js.Any] = js.native
  def apply(args: js.Any, callback: RequestCallback): Promise[js.Any] = js.native
  def apply(callback: RequestCallback): Promise[js.Any] = js.native
}
