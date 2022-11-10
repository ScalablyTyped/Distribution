package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values extends StObject {
  
  def clear(): Unit = js.native
  
  def focus(item: String): Unit = js.native
  
  def getCleanValues(): obj = js.native
  
  def getDirtyValues(): obj = js.native
  
  def getValues(): obj = js.native
  def getValues(details: WebixCallback): obj = js.native
  def getValues(details: obj): obj = js.native
  
  def isDirty(): Boolean = js.native
  
  def markInvalid(name: String): Unit = js.native
  def markInvalid(name: String, state: String): Unit = js.native
  def markInvalid(name: String, state: Boolean): Unit = js.native
  
  def setDirty(): Unit = js.native
  def setDirty(mark: Boolean): Unit = js.native
  
  def setValues(values: obj): Unit = js.native
  def setValues(values: obj, update: Boolean): Unit = js.native
  def setValues(values: obj, update: Boolean, config: Any): Unit = js.native
  def setValues(values: obj, update: Unit, config: Any): Unit = js.native
}
object Values {
  
  inline def apply: Values = ^.asInstanceOf[js.Dynamic].selectDynamic("Values").asInstanceOf[Values]
}
