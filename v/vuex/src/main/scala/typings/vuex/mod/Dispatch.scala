package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatch extends StObject {
  
  def apply(`type`: String): js.Promise[Any] = js.native
  def apply(`type`: String, payload: Any): js.Promise[Any] = js.native
  def apply(`type`: String, payload: Any, options: DispatchOptions): js.Promise[Any] = js.native
  def apply(`type`: String, payload: Unit, options: DispatchOptions): js.Promise[Any] = js.native
  def apply[P /* <: Payload */](payloadWithType: P): js.Promise[Any] = js.native
  def apply[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[Any] = js.native
}
