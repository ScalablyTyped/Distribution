package typings.winjs.mod.UI

import typings.winjs.WinJS.UI.IListDataAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base class for a custom IListDataSource.
  **/
@JSImport("winjs", "UI.VirtualizedDataSource")
@js.native
class VirtualizedDataSource[T] protected ()
  extends typings.winjs.WinJS.UI.VirtualizedDataSource[T] {
  //#region Constructors
  /**
    * Initializes the VirtualizedDataSource base class of a custom data source.
    * @constructor
    * @param listDataAdapter The object that supplies data to the VirtualizedDataSource.
    * @param options An object that can contain properties that specify additional options for the VirtualizedDataSource. It supports these properties: cacheSize.
    **/
  def this(listDataAdapter: IListDataAdapter[T]) = this()
  def this(listDataAdapter: IListDataAdapter[T], options: js.Any) = this()
}
/* static members */
@JSImport("winjs", "UI.VirtualizedDataSource")
@js.native
object VirtualizedDataSource extends js.Object {
  
  //#endregion Methods
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}
