package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtomDataLoader extends StObject {
  
  def load(url: String): js.Promise[js.Any] = js.native
  def load(url: String, `type`: String): js.Promise[js.Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[js.Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[js.Any] = js.native
  
  def parse(data: js.Any, `type`: String): Unit = js.native
}
