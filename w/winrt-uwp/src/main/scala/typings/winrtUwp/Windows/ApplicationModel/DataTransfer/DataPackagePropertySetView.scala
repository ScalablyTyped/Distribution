package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.anon.Second
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets the set of properties of a DataPackageView object. */
trait DataPackagePropertySetView extends js.Object {
  /** Gets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  var applicationListingUri: Uri
  /** Gets the name of the app that created the DataPackage object. */
  var applicationName: String
  /** Gets the application link to the content from the source app. */
  var contentSourceApplicationLink: Uri
  /** Gets a web link to shared content that's currently displayed in the app. */
  var contentSourceWebLink: Uri
  /** Gets the text that describes the contents of the DataPackage . */
  var description: String
  /** Gets or sets the enterprise Id. */
  var enterpriseId: String
  /** Gets a vector object that contains the types of files stored in the DataPackage object. */
  var fileTypes: IVectorView[String]
  /** Gets a background color for the sharing app's Square30x30Logo . */
  var logoBackgroundColor: Color
  /** Gets the package family name of the source app. */
  var packageFamilyName: String
  /** Gets the number of items that are contained in the property set. */
  var size: Double
  /** Gets the source app's logo. */
  var square30x30Logo: IRandomAccessStreamReference
  /** Gets the thumbnail image for the DataPackageView . */
  var thumbnail: RandomAccessStreamReference
  /** Gets the text that displays as a title for the contents of the DataPackagePropertySetView object. */
  var title: String
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  def first(): IIterator[IKeyValuePair[_, _]]
  /**
    * Indicates whether the DataPackagePropertySetView object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  def hasKey(key: String): Boolean
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  def lookup(key: String): js.Any
  /**
    * Divides the object into two views
    */
  def split(): Second
}

object DataPackagePropertySetView {
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    contentSourceApplicationLink: Uri,
    contentSourceWebLink: Uri,
    description: String,
    enterpriseId: String,
    fileTypes: IVectorView[String],
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    logoBackgroundColor: Color,
    lookup: String => js.Any,
    packageFamilyName: String,
    size: Double,
    split: () => Second,
    square30x30Logo: IRandomAccessStreamReference,
    thumbnail: RandomAccessStreamReference,
    title: String
  ): DataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], contentSourceApplicationLink = contentSourceApplicationLink.asInstanceOf[js.Any], contentSourceWebLink = contentSourceWebLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), logoBackgroundColor = logoBackgroundColor.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), packageFamilyName = packageFamilyName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split), square30x30Logo = square30x30Logo.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPackagePropertySetView]
  }
}

