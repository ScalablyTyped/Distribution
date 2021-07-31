package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commit extends StObject {
  
  def apply(`type`: String): Unit = js.native
  def apply(`type`: String, payload: js.Any): Unit = js.native
  def apply(`type`: String, payload: js.Any, options: CommitOptions): Unit = js.native
  def apply(`type`: String, payload: Unit, options: CommitOptions): Unit = js.native
  def apply[P /* <: Payload */](payloadWithType: P): Unit = js.native
  def apply[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
}
