package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "TYFlatList")
@js.native
open class TYFlatList[ItemT /* <: TYFlatListData */] protected ()
  extends Component[TYFlatListProps[ItemT], js.Object, Any] {
  def this(props: TYFlatListProps[ItemT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TYFlatListProps[ItemT], context: Any) = this()
}
/* static members */
object TYFlatList {
  
  @JSImport("tuya-panel-kit", "TYFlatList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "TYFlatList.CheckboxItem")
  @js.native
  def CheckboxItem: ElementType[TYFlatListCheckbox[TYFlatListData]] = js.native
  inline def CheckboxItem_=(x: ElementType[TYFlatListCheckbox[TYFlatListData]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.InputItem")
  @js.native
  def InputItem: ElementType[TYSectionInputProps] = js.native
  inline def InputItem_=(x: ElementType[TYSectionInputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.Item")
  @js.native
  def Item: ElementType[TYListItemProps] = js.native
  inline def Item_=(x: ElementType[TYListItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.SliderItem")
  @js.native
  def SliderItem: ElementType[TYSectionSliderProps] = js.native
  inline def SliderItem_=(x: ElementType[TYSectionSliderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.SwitchItem")
  @js.native
  def SwitchItem: ElementType[TYSectionListProps] = js.native
  inline def SwitchItem_=(x: ElementType[TYSectionListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchItem")(x.asInstanceOf[js.Any])
}
