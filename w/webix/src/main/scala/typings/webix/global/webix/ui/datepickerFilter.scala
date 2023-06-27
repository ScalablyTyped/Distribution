package typings.webix.global.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("webix.ui.datepickerFilter")
@js.native
open class datepickerFilter ()
  extends typings.webix.mod.ui.datepickerFilter
     with typings.webix.webix.ui.textFilter {
  
  /* InferMemberOverrides */
  override def getInputNode(node: HTMLElement): HTMLElement = js.native
  
  /* InferMemberOverrides */
  override def getValue(node: HTMLElement): Any = js.native
  
  /* InferMemberOverrides */
  override def refresh(master: baseview, node: HTMLElement, value: Any): Unit = js.native
  
  /* InferMemberOverrides */
  override def render(master: baseview, config: StringDictionary[Any]): String = js.native
  
  /* InferMemberOverrides */
  override def setValue(node: HTMLElement, value: Any): Any = js.native
}
