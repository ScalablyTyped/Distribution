package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.textFilter")
@js.native
open class textFilter ()
  extends StObject
     with WebixFilter {
  
  def getInputNode(node: HTMLElement): HTMLElement = js.native
  
  /* CompleteClass */
  override def getValue(node: HTMLElement): Any = js.native
  
  /* CompleteClass */
  override def refresh(master: typings.webix.webix.ui.baseview, node: HTMLElement, value: Any): Unit = js.native
  
  /* CompleteClass */
  override def render(master: typings.webix.webix.ui.baseview, config: StringDictionary[Any]): String = js.native
  
  /* CompleteClass */
  override def setValue(node: HTMLElement, value: Any): Any = js.native
}
