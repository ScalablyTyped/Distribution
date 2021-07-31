package typings.winrtUwp.Windows.UI.StartScreen

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.Windows.UI.Popups.Placement
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.visualelementsrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates, enumerates, and provides information about a secondary tile. */
@js.native
trait SecondaryTile extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visualelementsrequested(
    `type`: visualelementsrequested,
    listener: TypedEventHandler[SecondaryTile, VisualElementsRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets an app-defined set of information that is passed from the secondary tile to the app on activation. This property is required when you create a tile. */
  var arguments: String = js.native
  
  /** Gets or sets the tile's background color. */
  var backgroundColor: Color = js.native
  
  /** Gets or sets a name that is associated with and displayed on the tile. This name is displayed on the tile in Start, in the tile's tooltip, next to the small tile representation in the Apps list, and in some Control Panel applications. This property is required when you create a tile. It is the equivalent of the display name declared in the manifest for the app's main tile. */
  var displayName: String = js.native
  
  /** Gets or sets whether the tile should use dark or light text. */
  var foregroundText: ForegroundText = js.native
  
  /** Gets or sets the location of a badge logo image to represent the secondary tile on the lock screen. By supplying this image, you declare that the secondary tile is eligible to display a badge on the lock screen. If you also want the secondary tile to be eligible for the lock screen's detailed tile slot, you must also set the LockScreenDisplayBadgeAndTileText property to True. */
  var lockScreenBadgeLogo: Uri = js.native
  
  /** Gets or sets whether the secondary tile is eligible to display both a badge and a detailed tile on the lock screen. If you set this property to True, you must also provide a badge image through the LockScreenBadgeLogo property. If you do not want to use the detailed tile capability, provide a badge image through the LockScreenBadgeLogo property and set LockScreenDisplayBadgeAndTileText to False. */
  var lockScreenDisplayBadgeAndTileText: Boolean = js.native
  
  /** Gets or sets the logo image used in a medium tile. This property is required when you create either a square or a wide tile. */
  var logo: Uri = js.native
  
  /** Fired when a call is made to RequestCreateAsync . */
  def onvisualelementsrequested(ev: VisualElementsRequestedEventArgs & WinRTEvent[SecondaryTile]): Unit = js.native
  /** Fired when a call is made to RequestCreateAsync . */
  @JSName("onvisualelementsrequested")
  var onvisualelementsrequested_Original: TypedEventHandler[SecondaryTile, VisualElementsRequestedEventArgs] = js.native
  
  /** Gets or sets a phonetic version of the secondary tile name. Used with character-based languages for UI sorting purposes. */
  var phoneticName: String = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visualelementsrequested(
    `type`: visualelementsrequested,
    listener: TypedEventHandler[SecondaryTile, VisualElementsRequestedEventArgs]
  ): Unit = js.native
  
  /**
    * Displays the Pin to Start flyout, through which the user can confirm that they want to create the secondary tile, which in turn creates the tile. Overloads of this method let you specify the on-screen location of the flyout.
    * @return An object used to launch the asynchronous create operation as well as to retrieve information about it.
    */
  def requestCreateAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Displays the Pin to Start flyout above a specified location, through which the user can confirm that they want to create the secondary tile, which in turn creates the tile.
    * @param invocationPoint The point used as the lower-right corner of the Pin to Start flyout.
    * @return An object that provides information concerning the asynchronous create operation.
    */
  def requestCreateAsync(invocationPoint: Point): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Displays the Pin to Start flyout above a specified area. This flyout is used by the user to confirm that they want to create the secondary tile, which in turn creates the tile.
    * @param selection The area that the flyout is displayed directly above.
    * @return An object that provides information concerning the asynchronous create operation.
    */
  def requestCreateForSelectionAsync(selection: Rect): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Displays the Pin to Start flyout at the specified side of a specified area. This flyout is used by the user to confirm that they want to create the secondary tile, which in turn creates the tile.
    * @param selection The area to one side of which the flyout will be displayed.
    * @param preferredPlacement The side of the rectangle where the flyout should appear.
    * @return An object that provides information concerning the asynchronous create operation.
    */
  def requestCreateForSelectionAsync(selection: Rect, preferredPlacement: Placement): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Displays the Unpin from Start flyout. This flyout lets the user confirm removal of the secondary tile.
    * @return An object that provides information concerning the asynchronous delete operation.
    */
  def requestDeleteAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Displays the Unpin from Start flyout at a specified point. This flyout lets the user confirm removal of the secondary tile.
    * @param invocationPoint The point used as the lower-right corner of the Pin to Start flyout.
    * @return An object that provides information concerning the asynchronous delete operation.
    */
  def requestDeleteAsync(invocationPoint: Point): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Displays the Unpin from Start flyout above a specified area. This flyout lets the user confirm removal of the secondary tile.
    * @param selection The area that the secondary tile is displayed directly above.
    * @return An object that provides information concerning the asynchronous delete operation.
    */
  def requestDeleteForSelectionAsync(selection: Rect): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Displays the Unpin from Start flyout at the specified side of a specified area. This flyout lets the user confirm removal of the secondary tile.
    * @param selection The area to the side of which the flyout will be displayed.
    * @param preferredPlacement One of the enumeration values that specifies the side of the rectangle where the flyout should be shown.
    * @return An object that provides information concerning the asynchronous delete operation.
    */
  def requestDeleteForSelectionAsync(selection: Rect, preferredPlacement: Placement): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets or sets a value that determines whether the secondary tile will be reacquired through the cloud when the parent app is installed by the user, using their Microsoft account, on another computer. Note that as of Windows 8.1, roaming is the default behavior. This is the opposite of the default Windows 8 behavior, where roaming was opt-in. */
  var roamingEnabled: Boolean = js.native
  
  /** Gets or sets a short name to display directly on the tile. */
  var shortName: String = js.native
  
  /** Gets or sets the small logo image, used in search results, the All Programs list, and other locations in the UI. */
  var smallLogo: Uri = js.native
  
  /** Gets or sets a unique string to identify the tile within the package. This property is required when you create or delete a tile. */
  var tileId: String = js.native
  
  /** Gets or sets options available to a secondary tile. */
  var tileOptions: TileOptions = js.native
  
  /**
    * Updates a secondary tile after that tile is pinned to the Start screen.
    * @return An object used to launch the asynchronous create operation as well as to retrieve information about it.
    */
  def updateAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets an object through which you can get or set a secondary tile's background color, foreground text, tile images, and app name display options. As of Windows 8.1, the properties of this object replace these SecondaryTile properties: */
  var visualElements: SecondaryTileVisualElements = js.native
  
  /** Gets or sets the logo image used in a wide secondary tile. This property is required when you create a wide secondary tile and gives the user the option of a wide tile when they resize the tile. */
  var wideLogo: Uri = js.native
}
