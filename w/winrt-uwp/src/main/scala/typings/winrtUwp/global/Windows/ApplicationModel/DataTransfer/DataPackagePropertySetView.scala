package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

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
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView")
@js.native
abstract class DataPackagePropertySetView ()
  extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView {
  /** Gets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  /* CompleteClass */
  override var applicationListingUri: Uri = js.native
  /** Gets the name of the app that created the DataPackage object. */
  /* CompleteClass */
  override var applicationName: String = js.native
  /** Gets the application link to the content from the source app. */
  /* CompleteClass */
  override var contentSourceApplicationLink: Uri = js.native
  /** Gets a web link to shared content that's currently displayed in the app. */
  /* CompleteClass */
  override var contentSourceWebLink: Uri = js.native
  /** Gets the text that describes the contents of the DataPackage . */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets or sets the enterprise Id. */
  /* CompleteClass */
  override var enterpriseId: String = js.native
  /** Gets a vector object that contains the types of files stored in the DataPackage object. */
  /* CompleteClass */
  override var fileTypes: IVectorView[String] = js.native
  /** Gets a background color for the sharing app's Square30x30Logo . */
  /* CompleteClass */
  override var logoBackgroundColor: Color = js.native
  /** Gets the package family name of the source app. */
  /* CompleteClass */
  override var packageFamilyName: String = js.native
  /** Gets the number of items that are contained in the property set. */
  /* CompleteClass */
  override var size: Double = js.native
  /** Gets the source app's logo. */
  /* CompleteClass */
  override var square30x30Logo: IRandomAccessStreamReference = js.native
  /** Gets the thumbnail image for the DataPackageView . */
  /* CompleteClass */
  override var thumbnail: RandomAccessStreamReference = js.native
  /** Gets the text that displays as a title for the contents of the DataPackagePropertySetView object. */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Indicates whether the DataPackagePropertySetView object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  /**
    * Divides the object into two views
    */
  /* CompleteClass */
  override def split(): Second = js.native
}

