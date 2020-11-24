package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "TYFlatList")
@js.native
class TYFlatList[ItemT /* <: TYFlatListData */] ()
  extends Component[TYFlatListProps[ItemT], js.Object, js.Any]
/* static members */
@JSImport("tuya-panel-kit", "TYFlatList")
@js.native
object TYFlatList extends js.Object {
  
  var CheckboxItem: ElementType[TYFlatListCheckbox[TYFlatListData]] = js.native
  
  var InputItem: ElementType[TYSectionInputProps] = js.native
  
  var Item: ElementType[TYListItemProps] = js.native
  
  var SliderItem: ElementType[TYSectionSliderProps] = js.native
  
  var SwitchItem: ElementType[TYSectionListProps] = js.native
}
