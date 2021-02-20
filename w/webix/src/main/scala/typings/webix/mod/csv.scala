package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csv extends StObject {
  
  var delimiter: js.Any = js.native
  
  var escape: Boolean = js.native
  
  def parse(text: String): js.Array[_] = js.native
  def parse(text: String, delimiter: js.Any): js.Array[_] = js.native
  
  def stringify(data: js.Array[_]): String = js.native
  def stringify(data: js.Array[_], delimiter: js.Any): String = js.native
}
