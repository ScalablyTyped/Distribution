package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values extends js.Object {
  
  def clear(): Unit = js.native
  
  def focus(item: String): Unit = js.native
  
  def getCleanValues(): js.Any = js.native
  
  def getDirtyValues(): js.Any = js.native
  
  def getValues(): js.Any = js.native
  def getValues(details: js.Any): js.Any = js.native
  
  def isDirty(): Boolean = js.native
  
  def markInvalid(name: String): Unit = js.native
  def markInvalid(name: String, state: String): Unit = js.native
  def markInvalid(name: String, state: Boolean): Unit = js.native
  
  def setDirty(): Unit = js.native
  def setDirty(mark: Boolean): Unit = js.native
  
  def setValues(values: js.Any): Unit = js.native
  def setValues(values: js.Any, update: Boolean): Unit = js.native
}
@JSImport("webix", "Values")
@js.native
object Values extends TopLevel[Values]
