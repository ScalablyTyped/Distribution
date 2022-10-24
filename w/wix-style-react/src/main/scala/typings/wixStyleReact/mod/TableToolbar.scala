package typings.wixStyleReact.mod

import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialTableToolbarProps
import typings.wixStyleReact.anon.WeakValidationMapTableToo
import typings.wixStyleReact.distTypesTableToolbarMod.DividerProps
import typings.wixStyleReact.distTypesTableToolbarMod.ItemGroupProps
import typings.wixStyleReact.distTypesTableToolbarMod.ItemProps
import typings.wixStyleReact.distTypesTableToolbarMod.LabelProps
import typings.wixStyleReact.distTypesTableToolbarMod.SelectedCountProps
import typings.wixStyleReact.distTypesTableToolbarMod.TableToolbarProps
import typings.wixStyleReact.distTypesTableToolbarMod.TitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FC<wix-style-react.wix-style-react/dist/types/TableToolbar.TableToolbarProps> & {  ItemGroup :react.react.FC<wix-style-react.wix-style-react/dist/types/TableToolbar.ItemGroupProps>,   Item :react.react.FC<wix-style-react.wix-style-react/dist/types/TableToolbar.ItemProps>,   Title :react.react.FC<wix-style-react.wix-style-react/dist/types/TableToolbar.TitleProps>,   Label :react.react.FC<wix-style-react.wix-style-react/dist/types/TableToolbar.LabelProps>,   Divider :react.react.FC<wix-style-react.wix-style-react/dist/types/TableToolbar.DividerProps>,   SelectedCount :react.react.FC<wix-style-react.wix-style-react/dist/types/TableToolbar.SelectedCountProps>} */
object TableToolbar {
  
  inline def apply(props: TableToolbarProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: TableToolbarProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("wix-style-react", "TableToolbar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "TableToolbar.Divider")
  @js.native
  def Divider: FC[DividerProps] = js.native
  inline def Divider_=(x: FC[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.Item")
  @js.native
  def Item: FC[ItemProps] = js.native
  
  @JSImport("wix-style-react", "TableToolbar.ItemGroup")
  @js.native
  def ItemGroup: FC[ItemGroupProps] = js.native
  inline def ItemGroup_=(x: FC[ItemGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemGroup")(x.asInstanceOf[js.Any])
  
  inline def Item_=(x: FC[ItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.Label")
  @js.native
  def Label: FC[LabelProps] = js.native
  inline def Label_=(x: FC[LabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.SelectedCount")
  @js.native
  def SelectedCount: FC[SelectedCountProps] = js.native
  inline def SelectedCount_=(x: FC[SelectedCountProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectedCount")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.Title")
  @js.native
  def Title: FC[TitleProps] = js.native
  inline def Title_=(x: FC[TitleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTableToolbarProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialTableToolbarProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "TableToolbar.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTableToo] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapTableToo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
