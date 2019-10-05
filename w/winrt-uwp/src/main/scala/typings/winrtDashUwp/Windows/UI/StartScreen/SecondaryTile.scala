package typings.winrtDashUwp.Windows.UI.StartScreen

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.Point
import typings.winrtDashUwp.Windows.Foundation.Rect
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.UI.Color
import typings.winrtDashUwp.Windows.UI.Popups.Placement
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.visualelementsrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates, enumerates, and provides information about a secondary tile. */
@JSGlobal("Windows.UI.StartScreen.SecondaryTile")
@js.native
/** Creates a SecondaryTile object. The caller must then set any mandatory properties through the object before attempting to pin, update, or delete the tile. */
class SecondaryTile () extends js.Object {
  /**
    * Creates a SecondaryTile object with a specific ID. This form of the constructor should be used to create a secondary tile object to perform a tile update or deletion.
    * @param tileId A string that will uniquely identify the tile within your app. Choose a unique ID that is descriptive and meaningful to your app. If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten.
    */
  def this(tileId: String) = this()
  /**
    * Creates a SecondaryTile object that includes all of the mandatory properties required to create a medium tile.
    * @param tileId A string that will uniquely identify the tile within your app's package. Choose a unique ID that is descriptive and meaningful to your app. It is limited to 64 characters and must begin with a number or letter and be composed of the characters a-z, A-Z, 0-9, period (.), or underscore (_). If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten. Can be set or retrieved through the TileId property.
    * @param displayName A name to be displayed on the tile, in the tile's tooltip, and when showing small tiles, such as on the Apps or search results screens. This string is equivalent to the display name given in the manifest for the main tile. It is restricted to 256 characters, but in practice should be kept short to avoid truncation. This value can be set or retrieved through the DisplayName property.
    * @param arguments An app-defined string meaningful to the calling application. This argument string is passed back to the app when the app is activated from the secondary tile. It will be truncated after 2048 characters. Can be set or retrieved through the Arguments property.
    * @param square150x150Logo A reference to a medium logo image stored at a URI. Can be set or retrieved through the SecondaryTileVisualElements.Square150x150Logo property. This value can be expressed using one of these schemes:
    * @param desiredSize The size of tile to pin. This value must be Default (which provides Windows 8 behavior), Square150x150, or Wide310x150. Any other TileSize value causes an exception to be thrown during runtime.
    */
  def this(tileId: String, displayName: String, args: String, square150x150Logo: Uri, desiredSize: TileSize) = this()
  /**
    * Creates a SecondaryTile object as a medium tile.
    * @param tileId A string that will uniquely identify the tile within your app's package. Choose a unique ID that is descriptive and meaningful to your app. It is limited to 64 characters and must begin with a number or letter and be composed of the characters a-z, A-Z, 0-9, period (.), or underscore (_). If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten. Can be set or retrieved through the TileId property.
    * @param shortName A short name to display directly on the tile if the app chooses to do so. Anything over 40 characters will be truncated. The user has the option to change this value as part of the pinning process. Can be set or retrieved through the ShortName property.
    * @param displayName A name to be displayed on the tile, in the tile's tooltip, and when showing small tiles, such as on the Apps or search results screens. This string is equivalent to the display name given in the manifest for the main tile. It is restricted to 256 characters, but in practice should be kept short to avoid truncation. This value can be set or retrieved through the DisplayName property.
    * @param arguments An app-defined string meaningful to the calling application. This argument string is passed back to the app when the app is activated from the secondary tile. It will be truncated after 2048 characters. Can be set or retrieved through the Arguments property.
    * @param tileOptions A value that specifies various options such as whether the name will be displayed on the secondary tile. Can be set or retrieved through the TileOptions property.
    * @param logoReference A reference to a square logo image stored at a URI. Can be set or retrieved through the Logo property. This value can be expressed using one of these schemes:
    */
  def this(
    tileId: String,
    shortName: String,
    displayName: String,
    args: String,
    tileOptions: TileOptions,
    logoReference: Uri
  ) = this()
  /**
    * Creates a SecondaryTile object as a wide tile.
    * @param tileId A string that will uniquely identify the tile within your app's package. Choose a unique ID that is descriptive and meaningful to your app. It is limited to 64 characters and must begin with a number or letter and be composed of the characters a-z, A-Z, 0-9, period (.), or underscore (_). If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten. Can be set or retrieved through the TileId property.
    * @param shortName A short name to display directly on the tile if the app chooses to do so. Anything over 40 characters will be truncated. The user has the option to change this value as part of the pinning process. Can be set or retrieved through the ShortName property.
    * @param displayName A name to be displayed on the tile, in the tile's tooltip, and when showing small tiles, such as on the Apps or search results screens. This string is equivalent to the display name given in the manifest for the main tile. It is restricted to 256 characters, but in practice should be kept short to avoid truncation. This value can be set or retrieved through the DisplayName property.
    * @param arguments An app-defined string meaningful to the calling application. This argument string is passed back to the app when the app is activated from the secondary tile. It will be truncated after 2048 characters. Can be set or retrieved through the Arguments property.
    * @param tileOptions A value that specifies various options such as whether the name will be displayed on the secondary tile. Can be set or retrieved through the TileOptions property.
    * @param logoReference A reference to a medium logo image stored at a URI. Can be set or retrieved through the Square150x150Logo property. This value can be expressed using one of these schemes:
    * @param wideLogoReference A reference to a wide logo image stored at a URI. Can be set or retrieved through the WideLogo property. This value can be expressed using one of these schemes:
    */
  def this(
    tileId: String,
    shortName: String,
    displayName: String,
    args: String,
    tileOptions: TileOptions,
    logoReference: Uri,
    wideLogoReference: Uri
  ) = this()
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
  @JSName("onvisualelementsrequested")
  var onvisualelementsrequested_Original: TypedEventHandler[SecondaryTile, VisualElementsRequestedEventArgs] = js.native
  /** Gets or sets a phonetic version of the secondary tile name. Used with character-based languages for UI sorting purposes. */
  var phoneticName: String = js.native
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
  /** Gets an object through which you can get or set a secondary tile's background color, foreground text, tile images, and app name display options. As of Windows 8.1, the properties of this object replace these SecondaryTile properties: */
  var visualElements: SecondaryTileVisualElements = js.native
  /** Gets or sets the logo image used in a wide secondary tile. This property is required when you create a wide secondary tile and gives the user the option of a wide tile when they resize the tile. */
  var wideLogo: Uri = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visualelementsrequested(
    `type`: visualelementsrequested,
    listener: TypedEventHandler[SecondaryTile, VisualElementsRequestedEventArgs]
  ): Unit = js.native
  /** Fired when a call is made to RequestCreateAsync . */
  def onvisualelementsrequested(ev: VisualElementsRequestedEventArgs with WinRTEvent[SecondaryTile]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
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
  /**
    * Updates a secondary tile after that tile is pinned to the Start screen.
    * @return An object used to launch the asynchronous create operation as well as to retrieve information about it.
    */
  def updateAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}

/* static members */
@JSGlobal("Windows.UI.StartScreen.SecondaryTile")
@js.native
object SecondaryTile extends js.Object {
  /**
    * Checks whether a specific secondary tile exists for the calling app.
    * @param tileId The unique ID string that was assigned to the tile when it was created.
    * @return True if the tile exists in the calling application; otherwise, false.
    */
  def exists(tileId: String): Boolean = js.native
  /**
    * Retrieves a list of secondary tiles created for the calling app.
    * @return An enumeration object that allows you to examine the set of tiles.
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a list of secondary tiles created for another app in the same package as the calling app.
    * @param applicationId The Package Relative Application ID (PRAID) of the app.
    * @return An enumeration object that allows you to examine the set of tiles.
    */
  def findAllAsync(applicationId: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a list of secondary tiles created for all of the apps in the package of the calling app.
    * @return An enumeration object that allows you to examine the set of tiles.
    */
  def findAllForPackageAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

