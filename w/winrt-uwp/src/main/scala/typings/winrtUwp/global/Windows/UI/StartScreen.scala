package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.Windows.UI.StartScreen.ForegroundText
import typings.winrtUwp.Windows.UI.StartScreen.JumpListItemKind
import typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind
import typings.winrtUwp.Windows.UI.StartScreen.TileOptions
import typings.winrtUwp.Windows.UI.StartScreen.TileSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides ways for apps to integrate with the Start screen, such as the creation of secondary tiles and the customization of jump lists. */
object StartScreen {
  
  /** Specifies the color of the tile's foreground text. */
  @JSGlobal("Windows.UI.StartScreen.ForegroundText")
  @js.native
  object ForegroundText extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.ForegroundText & Double] = js.native
    
    /* 0 */ val dark: typings.winrtUwp.Windows.UI.StartScreen.ForegroundText.dark & Double = js.native
    
    /* 1 */ val light: typings.winrtUwp.Windows.UI.StartScreen.ForegroundText.light & Double = js.native
  }
  
  /** Provides functionality for selecting the type of system-managed jump list that is used by an app, adding custom task entry points to an app's jump list, and adding custom groups to an app's jump list. A jump list consists of an optional system-provided list of items, as well as optional app-provided items. Not all device families support jump lists. */
  /* note: abstract class */ @JSGlobal("Windows.UI.StartScreen.JumpList")
  @js.native
  open class JumpList ()
    extends StObject
       with typings.winrtUwp.Windows.UI.StartScreen.JumpList {
    
    /** Gets the list of JumpListItem 's for the jump list. Items is of type IVector(JumpListItem) . */
    /* CompleteClass */
    var items: IVector[typings.winrtUwp.Windows.UI.StartScreen.JumpListItem] = js.native
    
    /**
      * Asynchronously saves changes to the jump list and its items.
      * @return Returns an IAsyncAction object that is used to control the asynchronous operation. If the system does not support jump lists, the SaveAsync method has no effect and future calls to LoadCurrentAsync will produce an empty jump list. An app can check for this case using the IsSupported method.
      */
    /* CompleteClass */
    override def saveAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets or sets the current type of the system managed jump list group. */
    /* CompleteClass */
    var systemGroupKind: JumpListSystemGroupKind = js.native
  }
  object JumpList {
    
    @JSGlobal("Windows.UI.StartScreen.JumpList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a value that indicates whether the system supports jump lists.
      * @return A boolean value that is True if jump lists are supported. Otherwise, False.
      */
    /* static member */
    inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
    
    /**
      * Asynchronously retrieves the current jump list and its items.
      * @return When this method completes successfully, it returns the current JumpList . If the system does not support jump lists, this method returns an empty jump list and the SaveAsync method has no effect. Apps can check for this case using the isSupported method.
      */
    /* static member */
    inline def loadCurrentAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.UI.StartScreen.JumpList] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCurrentAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.UI.StartScreen.JumpList]]
  }
  
  /** Provides functionality for creating and defining jump list items for an app's jump list. */
  /* note: abstract class */ @JSGlobal("Windows.UI.StartScreen.JumpListItem")
  @js.native
  open class JumpListItem ()
    extends StObject
       with typings.winrtUwp.Windows.UI.StartScreen.JumpListItem {
    
    /** Gets the command line arguments for the jump list item. */
    /* CompleteClass */
    var arguments: String = js.native
    
    /** Gets or sets the jump list item task description. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets or sets the jump list item display name. The display name can also be specified as a parameter using the CreateWithArguments method when the jump list item is created. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets or sets the jump list item custom group name. If no name is specified, the item will be added to the Tasks group by default. */
    /* CompleteClass */
    var groupName: String = js.native
    
    /** Gets the JumpListItemKind of a jump list item. */
    /* CompleteClass */
    var kind: JumpListItemKind = js.native
    
    /** Gets or sets the jump list item's logo. */
    /* CompleteClass */
    var logo: Uri = js.native
    
    /** Gets a boolean indicating whether the jump list item was removed from the app's jump list by the user. */
    /* CompleteClass */
    var removedByUser: Boolean = js.native
  }
  object JumpListItem {
    
    @JSGlobal("Windows.UI.StartScreen.JumpListItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a jump list item that is an inert separator for a custom group within the app's jump list.
      * @return A jump list item that can be added to an app's jump list through the items property.
      */
    /* static member */
    inline def createSeparator(): typings.winrtUwp.Windows.UI.StartScreen.JumpListItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createSeparator")().asInstanceOf[typings.winrtUwp.Windows.UI.StartScreen.JumpListItem]
    
    /**
      * Creates a new jump list item for an app's jump list.
      * @param arguments String that specifies any command line arguments that should be passed onto the app when the jump list item is selected by a user.
      * @param displayName String that specifies a display name for the jump list item. If localization is desired, this string must be a ms-resource: scheme specified URI.
      * @return A jump list item with the specified parameters that can be added to an app's jump list through the items property.
      */
    /* static member */
    inline def createWithArguments(args: String, displayName: String): typings.winrtUwp.Windows.UI.StartScreen.JumpListItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithArguments")(args.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.UI.StartScreen.JumpListItem]
  }
  
  /** Specifies the kind of jump list item. */
  @JSGlobal("Windows.UI.StartScreen.JumpListItemKind")
  @js.native
  object JumpListItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.JumpListItemKind & Double] = js.native
    
    /* 0 */ val arguments: typings.winrtUwp.Windows.UI.StartScreen.JumpListItemKind.arguments & Double = js.native
    
    /* 1 */ val separator: typings.winrtUwp.Windows.UI.StartScreen.JumpListItemKind.separator & Double = js.native
  }
  
  /** Indicates the kind of system group used by an app's jump list. */
  @JSGlobal("Windows.UI.StartScreen.JumpListSystemGroupKind")
  @js.native
  object JumpListSystemGroupKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind & Double] = js.native
    
    /* 1 */ val frequent: typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.frequent & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.none & Double = js.native
    
    /* 2 */ val recent: typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.recent & Double = js.native
  }
  
  /** Creates, enumerates, and provides information about a secondary tile. */
  @JSGlobal("Windows.UI.StartScreen.SecondaryTile")
  @js.native
  /** Creates a SecondaryTile object. The caller must then set any mandatory properties through the object before attempting to pin, update, or delete the tile. */
  open class SecondaryTile ()
    extends StObject
       with typings.winrtUwp.Windows.UI.StartScreen.SecondaryTile {
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
  }
  object SecondaryTile {
    
    @JSGlobal("Windows.UI.StartScreen.SecondaryTile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks whether a specific secondary tile exists for the calling app.
      * @param tileId The unique ID string that was assigned to the tile when it was created.
      * @return True if the tile exists in the calling application; otherwise, false.
      */
    /* static member */
    inline def exists(tileId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(tileId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Retrieves a list of secondary tiles created for the calling app.
      * @return An enumeration object that allows you to examine the set of tiles.
      */
    /* static member */
    inline def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    /**
      * Retrieves a list of secondary tiles created for another app in the same package as the calling app.
      * @param applicationId The Package Relative Application ID (PRAID) of the app.
      * @return An enumeration object that allows you to examine the set of tiles.
      */
    /* static member */
    inline def findAllAsync(applicationId: String): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(applicationId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /**
      * Retrieves a list of secondary tiles created for all of the apps in the package of the calling app.
      * @return An enumeration object that allows you to examine the set of tiles.
      */
    /* static member */
    inline def findAllForPackageAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllForPackageAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  }
  
  /** Contains properties through which you can get or set a secondary tile's background color, foreground text, tile images, and app name display options. The properties in this class replace these SecondaryTile properties: */
  /* note: abstract class */ @JSGlobal("Windows.UI.StartScreen.SecondaryTileVisualElements")
  @js.native
  open class SecondaryTileVisualElements ()
    extends StObject
       with typings.winrtUwp.Windows.UI.StartScreen.SecondaryTileVisualElements {
    
    /** Gets or sets the secondary tile's background color. */
    /* CompleteClass */
    var backgroundColor: Color = js.native
    
    /** Specifies whether the tile should use dark or light text. */
    /* CompleteClass */
    var foregroundText: ForegroundText = js.native
    
    /** Specifies whether the display name should be shown on the medium secondary tile. */
    /* CompleteClass */
    var showNameOnSquare150x150Logo: Boolean = js.native
    
    /** Specifies whether the display name should be shown on the large secondary tile. */
    /* CompleteClass */
    var showNameOnSquare310x310Logo: Boolean = js.native
    
    /** Specifies whether the display name should be shown on the wide secondary tile. */
    /* CompleteClass */
    var showNameOnWide310x150Logo: Boolean = js.native
    
    /** Gets or sets the medium secondary tile image. */
    /* CompleteClass */
    var square150x150Logo: Uri = js.native
    
    /** Gets or sets the square30x30 secondary tile image. */
    /* CompleteClass */
    var square30x30Logo: Uri = js.native
    
    /** Gets or sets the large secondary tile image. */
    /* CompleteClass */
    var square310x310Logo: Uri = js.native
    
    /** Gets or sets the square44x44 secondary tile image. */
    /* CompleteClass */
    var square44x44Logo: Uri = js.native
    
    /** Gets or sets the small secondary tile image. */
    /* CompleteClass */
    var square70x70Logo: Uri = js.native
    
    /** Gets or sets the small secondary tile image. */
    /* CompleteClass */
    var square71x71Logo: Uri = js.native
    
    /** Gets or sets the wide secondary tile image. */
    /* CompleteClass */
    var wide310x150Logo: Uri = js.native
  }
  
  /** Specifies options available to a secondary tile. */
  @JSGlobal("Windows.UI.StartScreen.TileOptions")
  @js.native
  object TileOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.TileOptions & Double] = js.native
    
    /* 3 */ val copyOnDeployment: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.copyOnDeployment & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.none & Double = js.native
    
    /* 1 */ val showNameOnLogo: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.showNameOnLogo & Double = js.native
    
    /* 2 */ val showNameOnWideLogo: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.showNameOnWideLogo & Double = js.native
  }
  
  /** Specifies the size of tile to pin. Used by some secondary tile constructors. */
  @JSGlobal("Windows.UI.StartScreen.TileSize")
  @js.native
  object TileSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.TileSize & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.StartScreen.TileSize.default & Double = js.native
    
    /* 3 */ val square150x150: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square150x150 & Double = js.native
    
    /* 1 */ val square30x30: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square30x30 & Double = js.native
    
    /* 5 */ val square310x310: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square310x310 & Double = js.native
    
    /* 7 */ val square44x44: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square44x44 & Double = js.native
    
    /* 2 */ val square70x70: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square70x70 & Double = js.native
    
    /* 6 */ val square71x71: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square71x71 & Double = js.native
    
    /* 4 */ val wide310x150: typings.winrtUwp.Windows.UI.StartScreen.TileSize.wide310x150 & Double = js.native
  }
  
  /** Provides a method to delay the display of the Pin to Start flyout, as well as methods through which you can set the visual elements of the secondary tile to be presented in that flyout as well as alternate versions of the tile that can also be presented as options. */
  /* note: abstract class */ @JSGlobal("Windows.UI.StartScreen.VisualElementsRequest")
  @js.native
  open class VisualElementsRequest ()
    extends StObject
       with typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequest {
    
    /** Gets a set of objects that provide alternate logo images, background and foreground colors, and display name. These alternates are shown to the user in the Pin to Start flyout. */
    /* CompleteClass */
    var alternateVisualElements: IVectorView[typings.winrtUwp.Windows.UI.StartScreen.SecondaryTileVisualElements] = js.native
    
    /** Gets the approximate time at which the deferral will time-out. */
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /**
      * Retrieves a deferral object, which allows the app time to provide information and assets used in the Pin to Start flyout.
      * @return The deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequestDeferral = js.native
    
    /** Gets a copy of the parent secondary tile's SecondaryTileVisualElements object. The visual elements properties can be set or read through this object. When deferral is complete (or the handler returns without a deferral), the properties in this object are verified and then reflected in the Pin to Start flyout. */
    /* CompleteClass */
    var visualElements: typings.winrtUwp.Windows.UI.StartScreen.SecondaryTileVisualElements = js.native
  }
  
  /** A deferral object used during the creation of the Pin to Start flyout. By using this object, the app can delay the display of the flyout while it gathers the information and assets that will be shown in that flyout. */
  /* note: abstract class */ @JSGlobal("Windows.UI.StartScreen.VisualElementsRequestDeferral")
  @js.native
  open class VisualElementsRequestDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequestDeferral {
    
    /** Tells Windows that the app is ready to display the Pin to Start flyout. The app calls this method when it has finished setting the properties that specify what to show in that flyout. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Passed to the SecondaryTile.VisualElementsRequested event handler to provide the visual elements details. */
  /* note: abstract class */ @JSGlobal("Windows.UI.StartScreen.VisualElementsRequestedEventArgs")
  @js.native
  open class VisualElementsRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequestedEventArgs {
    
    /** Gets the VisualElementsRequest object for the event. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequest = js.native
  }
}
