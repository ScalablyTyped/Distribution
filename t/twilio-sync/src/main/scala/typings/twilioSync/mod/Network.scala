package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network extends StObject {
  
  def delete(uri: String): Any = js.native
  
  def get(uri: String): Any = js.native
  
  def post(uri: String, body: js.Object): Any = js.native
  def post(uri: String, body: js.Object, revision: String): Any = js.native
  def post(uri: String, body: js.Object, revision: String, retryWhenThrottled: Boolean): Any = js.native
  def post(uri: String, body: js.Object, revision: Unit, retryWhenThrottled: Boolean): Any = js.native
  
  def put(uri: String, body: js.Object, revision: String): Any = js.native
}
