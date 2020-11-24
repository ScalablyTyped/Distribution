package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditAbility extends js.Object {
  
  def edit(id: js.Any): Unit = js.native
  
  def editCancel(): Unit = js.native
  
  def editNext(): Unit = js.native
  
  def editStop(): Unit = js.native
  
  def focusEditor(id: js.Any): Unit = js.native
  
  def getEditState(): js.Any = js.native
  
  def getEditor(): js.Any = js.native
  def getEditor(id: String): js.Any = js.native
  
  def getEditorValue(): String = js.native
  
  def validateEditor(): Boolean = js.native
  def validateEditor(id: String): Boolean = js.native
  def validateEditor(id: Double): Boolean = js.native
}
