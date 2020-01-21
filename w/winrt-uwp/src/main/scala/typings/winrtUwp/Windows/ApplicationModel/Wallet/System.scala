package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.TopLevel
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.itemschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
@JSGlobal("Windows.ApplicationModel.Wallet.System")
@js.native
object System extends js.Object {
  @js.native
  sealed trait WalletItemAppAssociation extends js.Object
  
  /** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
  @js.native
  abstract class WalletItemSystemStore () extends js.Object {
    /** Occurs when items in the WalletItemSystemStore have changed. */
    @JSName("onitemschanged")
    var onitemschanged_Original: TypedEventHandler[WalletItemSystemStore, _] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_itemschanged(`type`: itemschanged, listener: TypedEventHandler[WalletItemSystemStore, _]): Unit = js.native
    /**
      * Asynchronously removes a specific wallet item with the given ID from the wallet system data store.
      * @param item The ID of the wallet item to remove from the system data store.
      * @return An asynchronous action. If you use Asynchronous programming, the result type is void.
      */
    def deleteAsync(item: WalletItem): IPromiseWithIAsyncAction = js.native
    /**
      * Gets a WalletItemAppAssociation value indicating if an app is installed for the specified WalletItem .
      * @param item The item for which to retrieve the status.
      * @return The WalletItemAppAssociation value indicating if an app is installed for the specified WalletItem specified by the item parameter.
      */
    def getAppStatusForItem(item: WalletItem): WalletItemAppAssociation = js.native
    /**
      * Returns the collection of all system wallet items owned by this app.
      * @return An asynchronous operation that, on successful completion, returns the collection of wallet items accessible by this app. If you use Asynchronous programming, the result type is a read-only list/vector of WalletItem items. (You can use APIs of IVectorView<WalletItem> for C++ or JavaScript, APIs of IReadOnlyList<WalletItem> for .NET.)
      */
    def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Imports data from a ".mswallet" XML file into the system wallet store.
      * @param stream The ".mswallet" file to import.
      * @return An asynchronous operation that, on successful completion, returns the wallet item that was imported into the wallet. If you use Asynchronous programming, the result type on successful completion is a single WalletItem .
      */
    def importItemAsync(stream: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[WalletItem] = js.native
    /**
      * Launches the app that is associated with the given wallet item.
      * @param item The wallet item to launch an app for.
      * @return An async action indicating that the operation has completed.
      */
    def launchAppForItemAsync(item: WalletItem): IPromiseWithIAsyncOperation[Boolean] = js.native
    /** Occurs when items in the WalletItemSystemStore have changed. */
    def onitemschanged(ev: js.Any with WinRTEvent[WalletItemSystemStore]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_itemschanged(`type`: itemschanged, listener: TypedEventHandler[WalletItemSystemStore, _]): Unit = js.native
  }
  
  /** Provides a static method to get an instance of the system wallet store for this app. */
  @js.native
  abstract class WalletManagerSystem () extends js.Object
  
  /** Defines values used by the GetAppStatusForItem method indicating if an app is installed for the specified WalletItem . */
  @js.native
  object WalletItemAppAssociation extends js.Object {
    /** The app for the wallet item is installed on this device. */
    @js.native
    sealed trait appInstalled extends WalletItemAppAssociation
    
    /** An app exists for the wallet item, but it is not installed on the device. */
    @js.native
    sealed trait appNotInstalled extends WalletItemAppAssociation
    
    /** There is no app associated with the wallet item. */
    @js.native
    sealed trait none extends WalletItemAppAssociation
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WalletItemAppAssociation with Double] = js.native
    /* 1 */ @js.native
    object appInstalled extends TopLevel[appInstalled with Double]
    
    /* 2 */ @js.native
    object appNotInstalled extends TopLevel[appNotInstalled with Double]
    
    /* 0 */ @js.native
    object none extends TopLevel[none with Double]
    
  }
  
  /* static members */
  @js.native
  object WalletManagerSystem extends js.Object {
    /**
      * Requests an instance of the system wallet store for the app.
      * @return An asynchronous operation that, on successful completion, returns an instance of the default wallet store. If you use Asynchronous programming, the result type is a single WalletItemSystemStore object.
      */
    def requestStoreAsync(): IPromiseWithIAsyncOperation[WalletItemSystemStore] = js.native
  }
  
}

