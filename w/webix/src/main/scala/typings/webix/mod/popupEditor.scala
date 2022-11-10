package typings.webix.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait popupEditor
  extends StObject
     with WebixEditor {
  
  def createPopup(): obj | String | Double = js.native
  
  def destroy(): Unit = js.native
  
  def getPopup(): obj = js.native
  
  def linkInput(node: HTMLElement): Unit = js.native
  
  def popupInit(): Unit = js.native
  def popupInit(popup: obj): Unit = js.native
  
  var popupType: String = js.native
}
