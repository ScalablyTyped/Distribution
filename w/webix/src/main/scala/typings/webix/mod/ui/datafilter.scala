package typings.webix.mod.ui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.datafilter")
@js.native
object datafilter extends js.Object {
  @js.native
  class columnGroup () extends textFilter
  
  @js.native
  class dateFilter () extends textFilter
  
  @js.native
  class dateRangeFilter () extends textFilter
  
  @js.native
  class datepickerFilter () extends textFilter
  
  @js.native
  class masterCheckbox () extends textFilter
  
  @js.native
  class multiComboFilter () extends textFilter
  
  @js.native
  class multiSelectFilter () extends textFilter
  
  @js.native
  class numberFilter () extends textFilter
  
  @js.native
  class selectFilter () extends textFilter
  
  @js.native
  class serverFilter () extends textFilter
  
  @js.native
  class serverMultiSelectFilter () extends textFilter
  
  @js.native
  class serverSelectFilter () extends textFilter
  
  @js.native
  class summColumn () extends textFilter
  
  @js.native
  class textFilter () extends WebixFilter {
    def getInputNode(node: HTMLElement): HTMLElement = js.native
  }
  
}

