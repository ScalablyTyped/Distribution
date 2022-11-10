package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait storage extends StObject {
  
  var cookie: typings.webix.webix.cookie = js.native
  
  var local: typings.webix.webix.local = js.native
  
  def prefix(scope: String, storage: typings.webix.webix.cookie): WebixStorage = js.native
  def prefix(scope: String, storage: typings.webix.webix.local): WebixStorage = js.native
  def prefix(scope: String, storage: typings.webix.webix.session): WebixStorage = js.native
  
  var session: typings.webix.webix.session = js.native
}
object storage {
  
  inline def apply: typings.webix.webix.storage = ^.asInstanceOf[js.Dynamic].selectDynamic("storage").asInstanceOf[typings.webix.webix.storage]
}
