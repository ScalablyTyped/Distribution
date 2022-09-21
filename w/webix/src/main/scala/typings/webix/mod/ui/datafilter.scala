package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datafilter {
  
  @JSImport("webix", "ui.datafilter.columnGroup")
  @js.native
  open class columnGroup () extends textFilter
  
  @JSImport("webix", "ui.datafilter.dateFilter")
  @js.native
  open class dateFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.dateRangeFilter")
  @js.native
  open class dateRangeFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.datepickerFilter")
  @js.native
  open class datepickerFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.masterCheckbox")
  @js.native
  open class masterCheckbox () extends textFilter
  
  @JSImport("webix", "ui.datafilter.multiComboFilter")
  @js.native
  open class multiComboFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.multiSelectFilter")
  @js.native
  open class multiSelectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.numberFilter")
  @js.native
  open class numberFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.selectFilter")
  @js.native
  open class selectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.serverFilter")
  @js.native
  open class serverFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.serverMultiSelectFilter")
  @js.native
  open class serverMultiSelectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.serverSelectFilter")
  @js.native
  open class serverSelectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.summColumn")
  @js.native
  open class summColumn () extends textFilter
  
  @JSImport("webix", "ui.datafilter.textFilter")
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
}
