package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a set of asynchronous actions and operations that manage the wallet items in the wallet database. These can be used to read the existing items, or to add and remove items. */
@js.native
trait WalletItemStore extends js.Object {
  /**
    * Adds a new wallet item to the wallet.
    * @param id The identifier of the wallet item. This value must be unique. This sets the initial WalletItem.Id value (the identifier is for the WalletItemStore store, and isn't part of the initialization of a WalletItem object.
    * @param item The wallet item to add to the wallet.
    * @return An asynchronous action. If you use Asynchronous programming, the return type is void.
    */
  def addAsync(id: String, item: WalletItem): IPromiseWithIAsyncAction = js.native
  /**
    * Clears all app-owned wallet items from the wallet data store.
    * @return An asynchronous action. If you use Asynchronous programming, the result type is void.
    */
  def clearAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Removes a specific wallet item with the given ID from the wallet data store.
    * @param id The ID of the wallet item to remove from the data store.
    * @return An asynchronous action. If you use Asynchronous programming, the result type is void.
    */
  def deleteAsync(id: String): IPromiseWithIAsyncAction = js.native
  /**
    * Returns the collection of all wallet items owned by this app.
    * @return An asynchronous operation that, on successful completion, returns the collection of wallet items accessible by this app. If you use Asynchronous programming, the result type is a read-only list/vector of WalletItem items. (You can use APIs of IVectorView<WalletItem> for C++ or JavaScript, APIs of IReadOnlyList<WalletItem> for .NET.)
    */
  def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[WalletItem]] = js.native
  /**
    * Returns the collection of wallet items of the given type that are owned by this app.
    * @param kind The type of wallet item to retrieve.
    * @return An asynchronous operation that, on successful completion, returns the collection of wallet items of the specified type that are accessible by this app. If you use Asynchronous programming, the result type is a read-only list/vector of WalletItem items. (You can use APIs of IVectorView<WalletItem> for C++ or JavaScript, APIs of IReadOnlyList<WalletItem> for .NET.)
    */
  def getItemsAsync(kind: WalletItemKind): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets an individual wallet item with the given ID from the wallet database. The item requested must be owned by this app.
    * @param id The ID of the wallet item.
    * @return An asynchronous operation that, on successful completion, returns the wallet item with the specified ID that is owned by this app. If you use Asynchronous programming, the result type is a single WalletItem (or null, see Remarks).
    */
  def getWalletItemAsync(id: String): IPromiseWithIAsyncOperation[WalletItem] = js.native
  /**
    * Imports data from a ".mswallet" XML file into the wallet store.
    * @param stream The ".mswallet" file to import.
    * @return An asynchronous operation that, on successful completion, returns the wallet item that was imported into the wallet. If you use Asynchronous programming, the result type on successful completion is a single WalletItem .
    */
  def importItemAsync(stream: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[WalletItem] = js.native
  /**
    * Displays the Wallet UI.
    * @return An asynchronous action. If you use Asynchronous programming, the result type is void.
    */
  def showAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Displays the item with the given ID in the Wallet UI.
    * @param id The ID of the item to display.
    * @return An asynchronous action. If you use Asynchronous programming, the result type is void.
    */
  def showAsync(id: String): IPromiseWithIAsyncAction = js.native
  /**
    * Updates a wallet item in the shared store, based on the changed values in the WalletItem object provided.
    * @param item The updated data for the wallet item.
    * @return An asynchronous action. If you use Asynchronous programming, the result type is void.
    */
  def updateAsync(item: WalletItem): IPromiseWithIAsyncAction = js.native
}

