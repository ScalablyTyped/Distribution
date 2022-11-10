package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditAbility extends StObject {
  
  def edit(id: obj): Unit = js.native
  
  def editCancel(): Unit = js.native
  
  def editNext(): Unit = js.native
  
  def editStop(): Unit = js.native
  
  def focusEditor(id: obj): Unit = js.native
  
  def getEditState(): obj = js.native
  
  def getEditor(): obj = js.native
  def getEditor(id: String): obj = js.native
  
  def getEditorValue(): String = js.native
  
  def validateEditor(): Boolean = js.native
  def validateEditor(id: String): Boolean = js.native
  def validateEditor(id: Double): Boolean = js.native
}
