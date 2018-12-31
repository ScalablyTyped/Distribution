package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets the set of properties of a DataPackageView object. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView")
@js.native
abstract class DataPackagePropertySetView () extends js.Object {
  /** Gets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  var applicationListingUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the name of the app that created the DataPackage object. */
  var applicationName: java.lang.String = js.native
  /** Gets the application link to the content from the source app. */
  var contentSourceApplicationLink: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets a web link to shared content that's currently displayed in the app. */
  var contentSourceWebLink: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the text that describes the contents of the DataPackage . */
  var description: java.lang.String = js.native
  /** Gets or sets the enterprise Id. */
  var enterpriseId: java.lang.String = js.native
  /** Gets a vector object that contains the types of files stored in the DataPackage object. */
  var fileTypes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets a background color for the sharing app's Square30x30Logo . */
  var logoBackgroundColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets the package family name of the source app. */
  var packageFamilyName: java.lang.String = js.native
  /** Gets the number of items that are contained in the property set. */
  var size: scala.Double = js.native
  /** Gets the source app's logo. */
  var square30x30Logo: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets the thumbnail image for the DataPackageView . */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
  /** Gets the text that displays as a title for the contents of the DataPackagePropertySetView object. */
  var title: java.lang.String = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
    * Indicates whether the DataPackagePropertySetView object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  def lookup(key: java.lang.String): js.Any = js.native
  /**
    * Divides the object into two views
    */
  def split(): winrtDashUwpLib.Anon_SecondFirstIMapViewString = js.native
}

