package typings.winrtDashUwp.Windows.Storage.FileProperties

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the basic properties, like the size of the item or the date the item was last modified, of the item (like a file or folder). */
@JSGlobal("Windows.Storage.FileProperties.BasicProperties")
@js.native
abstract class BasicProperties () extends js.Object {
  /** Gets the timestamp of the last time the file was modified. */
  var dateModified: Date = js.native
  /** Gets the most relevant date for the item. */
  var itemDate: Date = js.native
  /** Gets the size of the file. */
  var size: Double = js.native
  /**
    * Retrieves the specified properties associated with the item.
    * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
    * @return When this method completes successfully, it returns a collection (type IMap ) that contains the specified properties and values as key-value pairs.
    */
  def retrievePropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[IMap[_, _]] = js.native
  /**
    * Saves all properties associated with the item.
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Saves the specified properties and values associated with the item.
    * @param propertiesToSave A collection that contains the names and values of the properties to save as key-value pairs (type IKeyValuePair ).
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(propertiesToSave: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
}

