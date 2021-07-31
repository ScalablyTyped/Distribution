package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatch extends StObject {
  
  def apply(`type`: String): js.Promise[js.Any] = js.native
  def apply(`type`: String, payload: js.Any): js.Promise[js.Any] = js.native
  def apply(`type`: String, payload: js.Any, options: DispatchOptions): js.Promise[js.Any] = js.native
  def apply(`type`: String, payload: Unit, options: DispatchOptions): js.Promise[js.Any] = js.native
  def apply[P /* <: Payload */](payloadWithType: P): js.Promise[js.Any] = js.native
  def apply[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[js.Any] = js.native
}
