package typings.tuyaPanelKit.mod

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "TYSectionList")
@js.native
class TYSectionList protected ()
  extends Component[TYSectionListProps, js.Object, js.Any] {
  def this(props: TYSectionListProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TYSectionListProps, context: js.Any) = this()
}
/* static members */
object TYSectionList {
  
  @JSImport("tuya-panel-kit", "TYSectionList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "TYSectionList.CheckboxItem")
  @js.native
  def CheckboxItem: ElementType[TYSectionCheckboxProps] = js.native
  @scala.inline
  def CheckboxItem_=(x: ElementType[TYSectionCheckboxProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.InputItem")
  @js.native
  def InputItem: ElementType[TYSectionInputProps] = js.native
  @scala.inline
  def InputItem_=(x: ElementType[TYSectionInputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.Item")
  @js.native
  def Item: ElementType[TYListItemProps] = js.native
  @scala.inline
  def Item_=(x: ElementType[TYListItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.SliderItem")
  @js.native
  def SliderItem: ElementType[TYSectionSliderProps] = js.native
  @scala.inline
  def SliderItem_=(x: ElementType[TYSectionSliderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.SwitchItem")
  @js.native
  def SwitchItem: ElementType[TYSectionSwitchProps] = js.native
  @scala.inline
  def SwitchItem_=(x: ElementType[TYSectionSwitchProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchItem")(x.asInstanceOf[js.Any])
}
