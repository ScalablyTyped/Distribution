package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait storage extends StObject {
  
  var cookie: typings.webix.webix.cookie = js.native
  
  var local: typings.webix.webix.local = js.native
  
  def prefix(scope: String, storage: cookie): WebixStorage = js.native
  def prefix(scope: String, storage: local): WebixStorage = js.native
  def prefix(scope: String, storage: session): WebixStorage = js.native
  
  var session: typings.webix.webix.session = js.native
}
