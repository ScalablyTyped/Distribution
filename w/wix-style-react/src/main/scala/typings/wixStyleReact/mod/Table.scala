package typings.wixStyleReact.mod

import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.wixStyleReact.anon.DataHookString
import typings.wixStyleReact.anon.DataHookTitleBarDisplay
import typings.wixStyleReact.anon.`4`
import typings.wixStyleReact.distTypesEmptyStateMod.EmptyStateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Table")
@js.native
open class Table[RowData] ()
  extends typings.wixStyleReact.distTypesTableMod.default[RowData]
/* static members */
object Table {
  
  @JSImport("wix-style-react", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Table.BulkSelectionCheckbox")
  @js.native
  def BulkSelectionCheckbox: FC[DataHookString] = js.native
  inline def BulkSelectionCheckbox_=(x: FC[DataHookString]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BulkSelectionCheckbox")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.Content")
  @js.native
  def Content: FC[DataHookTitleBarDisplay] = js.native
  inline def Content_=(x: FC[DataHookTitleBarDisplay]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.EmptyState")
  @js.native
  def EmptyState: FC[EmptyStateProps] = js.native
  inline def EmptyState_=(x: FC[EmptyStateProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyState")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.SubToolbar")
  @js.native
  def SubToolbar: FunctionComponent[`4`] = js.native
  inline def SubToolbar_=(x: FunctionComponent[`4`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubToolbar")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.Titlebar")
  @js.native
  def Titlebar: FC[`4`] = js.native
  inline def Titlebar_=(x: FC[`4`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Titlebar")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Table.ToolbarContainer")
  @js.native
  def ToolbarContainer: FC[js.Object] = js.native
  inline def ToolbarContainer_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToolbarContainer")(x.asInstanceOf[js.Any])
}
