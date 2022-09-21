package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csv extends StObject {
  
  var delimiter: Any = js.native
  
  var escape: Boolean = js.native
  
  def parse(text: String): js.Array[Any] = js.native
  def parse(text: String, delimiter: Any): js.Array[Any] = js.native
  
  def stringify(data: js.Array[Any]): String = js.native
  def stringify(data: js.Array[Any], delimiter: Any): String = js.native
}
