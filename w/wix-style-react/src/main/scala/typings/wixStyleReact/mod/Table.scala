package typings.wixStyleReact.mod

import typings.react.mod.FunctionComponent
import typings.react.mod.SFC
import typings.wixStyleReact.anon.DataHookString
import typings.wixStyleReact.anon.TitleBarVisible
import typings.wixStyleReact.anon.`1`
import typings.wixStyleReact.emptyStateMod.EmptyStateProps
import typings.wixStyleReact.tableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Table")
@js.native
class Table[RowData] () extends default[RowData]
/* static members */
object Table {
  
  @JSImport("wix-style-react", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Table.BulkSelectionCheckbox")
  @js.native
  def BulkSelectionCheckbox: SFC[DataHookString] = js.native
  @scala.inline
  def BulkSelectionCheckbox_=(x: SFC[DataHookString]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BulkSelectionCheckbox")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.Content")
  @js.native
  def Content: SFC[TitleBarVisible] = js.native
  @scala.inline
  def Content_=(x: SFC[TitleBarVisible]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.EmptyState")
  @js.native
  def EmptyState: SFC[EmptyStateProps] = js.native
  @scala.inline
  def EmptyState_=(x: SFC[EmptyStateProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyState")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.SubToolbar")
  @js.native
  def SubToolbar: FunctionComponent[`1`] = js.native
  @scala.inline
  def SubToolbar_=(x: FunctionComponent[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubToolbar")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.Titlebar")
  @js.native
  def Titlebar: SFC[`1`] = js.native
  @scala.inline
  def Titlebar_=(x: SFC[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Titlebar")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.ToolbarContainer")
  @js.native
  def ToolbarContainer: SFC[js.Object] = js.native
  @scala.inline
  def ToolbarContainer_=(x: SFC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToolbarContainer")(x.asInstanceOf[js.Any])
}
