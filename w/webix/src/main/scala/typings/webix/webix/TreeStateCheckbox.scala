package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeStateCheckbox extends StObject {
  
  def checkAll(): Unit = js.native
  def checkAll(id: String): Unit = js.native
  def checkAll(id: Double): Unit = js.native
  
  def checkItem(id: String): Unit = js.native
  
  def getChecked(): js.Array[_] = js.native
  
  def isChecked(id: String): Boolean = js.native
  def isChecked(id: Double): Boolean = js.native
  
  def uncheckAll(): Unit = js.native
  def uncheckAll(id: String): Unit = js.native
  def uncheckAll(id: Double): Unit = js.native
  
  def uncheckItem(id: String): Unit = js.native
}
