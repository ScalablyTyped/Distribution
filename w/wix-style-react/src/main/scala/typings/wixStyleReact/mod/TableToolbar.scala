package typings.wixStyleReact.mod

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.SFC
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialTableToolbarProps
import typings.wixStyleReact.anon.WeakValidationMapTableToo
import typings.wixStyleReact.tableToolbarMod.ItemGroupProps
import typings.wixStyleReact.tableToolbarMod.ItemProps
import typings.wixStyleReact.tableToolbarMod.LabelProps
import typings.wixStyleReact.tableToolbarMod.SelectedCountProps
import typings.wixStyleReact.tableToolbarMod.TableToolbarProps
import typings.wixStyleReact.tableToolbarMod.TitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.SFC<wix-style-react.wix-style-react/dist/es/src/TableToolbar.TableToolbarProps> & {  ItemGroup :react.react.SFC<wix-style-react.wix-style-react/dist/es/src/TableToolbar.ItemGroupProps>,   Item :react.react.SFC<wix-style-react.wix-style-react/dist/es/src/TableToolbar.ItemProps>,   Title :react.react.SFC<wix-style-react.wix-style-react/dist/es/src/TableToolbar.TitleProps>,   Label :react.react.SFC<wix-style-react.wix-style-react/dist/es/src/TableToolbar.LabelProps>,   Divider :react.react.SFC<wix-style-react.wix-style-react/dist/es/src/TableToolbar.DividerProps>,   SelectedCount :react.react.SFC<wix-style-react.wix-style-react/dist/es/src/TableToolbar.SelectedCountProps>} */
object TableToolbar {
  
  @scala.inline
  def apply(props: PropsWithChildren[TableToolbarProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  @scala.inline
  def apply(props: PropsWithChildren[TableToolbarProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("wix-style-react", "TableToolbar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "TableToolbar.Divider")
  @js.native
  def Divider: SFC[typings.wixStyleReact.tableToolbarMod.DividerProps] = js.native
  @scala.inline
  def Divider_=(x: SFC[typings.wixStyleReact.tableToolbarMod.DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.Item")
  @js.native
  def Item: SFC[ItemProps] = js.native
  
  @JSImport("wix-style-react", "TableToolbar.ItemGroup")
  @js.native
  def ItemGroup: SFC[ItemGroupProps] = js.native
  @scala.inline
  def ItemGroup_=(x: SFC[ItemGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemGroup")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Item_=(x: SFC[ItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.Label")
  @js.native
  def Label: SFC[LabelProps] = js.native
  @scala.inline
  def Label_=(x: SFC[LabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.SelectedCount")
  @js.native
  def SelectedCount: SFC[SelectedCountProps] = js.native
  @scala.inline
  def SelectedCount_=(x: SFC[SelectedCountProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectedCount")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.Title")
  @js.native
  def Title: SFC[TitleProps] = js.native
  @scala.inline
  def Title_=(x: SFC[TitleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTableToolbarProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialTableToolbarProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTableToo] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapTableToo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
