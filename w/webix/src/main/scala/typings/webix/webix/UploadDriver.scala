package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadDriver extends StObject {
  
  @JSName("$drop")
  def $drop(args: Any*): Any = js.native
  @JSName("$drop")
  var $drop_Original: WebixCallback = js.native
  
  @JSName("$render")
  var $render: Any = js.native
  
  def fileDialog(): Unit = js.native
  def fileDialog(content: obj): Unit = js.native
  
  var html5: obj = js.native
  
  def send(id: String): Unit = js.native
  def send(id: Double): Unit = js.native
  def send(id: WebixCallback): Unit = js.native
  
  def stopUpload(id: String): Unit = js.native
  def stopUpload(id: Double): Unit = js.native
}
