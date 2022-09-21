package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditAbility extends StObject {
  
  def edit(id: Any): Unit = js.native
  
  def editCancel(): Unit = js.native
  
  def editNext(): Unit = js.native
  
  def editStop(): Unit = js.native
  
  def focusEditor(id: Any): Unit = js.native
  
  def getEditState(): Any = js.native
  
  def getEditor(): Any = js.native
  def getEditor(id: String): Any = js.native
  
  def getEditorValue(): String = js.native
  
  def validateEditor(): Boolean = js.native
  def validateEditor(id: String): Boolean = js.native
  def validateEditor(id: Double): Boolean = js.native
}
object EditAbility {
  
  inline def apply: EditAbility = ^.asInstanceOf[js.Dynamic].selectDynamic("EditAbility").asInstanceOf[EditAbility]
}
