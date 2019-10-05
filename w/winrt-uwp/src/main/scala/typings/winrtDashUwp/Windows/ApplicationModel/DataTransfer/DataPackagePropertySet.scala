package typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typings.winrtDashUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtDashUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a set of properties to use with a DataPackage object. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
@js.native
abstract class DataPackagePropertySet () extends js.Object {
  /** Gets or sets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  var applicationListingUri: Uri = js.native
  /** Gets or sets the name of the app that created the DataPackage object. */
  var applicationName: String = js.native
  /** Gets or sets the application link to the content from the source app. */
  var contentSourceApplicationLink: Uri = js.native
  /** Provides a web link to shared content that's currently displayed in the app. */
  var contentSourceWebLink: Uri = js.native
  /** Gets or sets text that describes the contents of the DataPackage . */
  var description: String = js.native
  /** Gets or sets the enterprise identity (see Enterprise data protection). */
  var enterpriseId: String = js.native
  /** Specifies a vector object that contains the types of files stored in the DataPackage object. */
  var fileTypes: IVector[String] = js.native
  /** Gets or sets a background color for the sharing app's Square30x30Logo . */
  var logoBackgroundColor: Color = js.native
  /** Gets or sets the package family name of the source app. */
  var packageFamilyName: String = js.native
  /** Gets the number of items that are contained in the property set. */
  var size: Double = js.native
  /** Gets or sets the source app's logo. */
  var square30x30Logo: IRandomAccessStreamReference = js.native
  /** Gets or sets a thumbnail image for the DataPackage . */
  var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets or sets the text that displays as a title for the contents of the DataPackage object. */
  var title: String = js.native
  /** Removes all items from the property set. */
  def clear(): Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, _] = js.native
  /**
    * Indicates whether the DataPackagePropertySet object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Adds a property to the DataPackagePropertySet object.
    * @param key The key to insert.
    * @param value The value to insert.
    * @return True if the method replaced a value that already existed for the key; false if this is a new key.
    */
  def insert(key: String, value: js.Any): Boolean = js.native
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  def lookup(key: String): js.Any = js.native
  /**
    * Removes an item from the property set.
    * @param key The key.
    */
  def remove(key: String): Unit = js.native
}

