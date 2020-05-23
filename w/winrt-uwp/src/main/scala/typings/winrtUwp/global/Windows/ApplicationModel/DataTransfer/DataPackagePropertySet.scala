package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a set of properties to use with a DataPackage object. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
@js.native
abstract class DataPackagePropertySet ()
  extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet {
  /** Gets or sets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  /* CompleteClass */
  override var applicationListingUri: Uri = js.native
  /** Gets or sets the name of the app that created the DataPackage object. */
  /* CompleteClass */
  override var applicationName: String = js.native
  /** Gets or sets the application link to the content from the source app. */
  /* CompleteClass */
  override var contentSourceApplicationLink: Uri = js.native
  /** Provides a web link to shared content that's currently displayed in the app. */
  /* CompleteClass */
  override var contentSourceWebLink: Uri = js.native
  /** Gets or sets text that describes the contents of the DataPackage . */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets or sets the enterprise identity (see Enterprise data protection). */
  /* CompleteClass */
  override var enterpriseId: String = js.native
  /** Specifies a vector object that contains the types of files stored in the DataPackage object. */
  /* CompleteClass */
  override var fileTypes: IVector[String] = js.native
  /** Gets or sets a background color for the sharing app's Square30x30Logo . */
  /* CompleteClass */
  override var logoBackgroundColor: Color = js.native
  /** Gets or sets the package family name of the source app. */
  /* CompleteClass */
  override var packageFamilyName: String = js.native
  /** Gets the number of items that are contained in the property set. */
  /* CompleteClass */
  override var size: Double = js.native
  /** Gets or sets the source app's logo. */
  /* CompleteClass */
  override var square30x30Logo: IRandomAccessStreamReference = js.native
  /** Gets or sets a thumbnail image for the DataPackage . */
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets or sets the text that displays as a title for the contents of the DataPackage object. */
  /* CompleteClass */
  override var title: String = js.native
  /** Removes all items from the property set. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  /* CompleteClass */
  override def getView(): IMapView[String, _] = js.native
  /**
    * Indicates whether the DataPackagePropertySet object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /**
    * Adds a property to the DataPackagePropertySet object.
    * @param key The key to insert.
    * @param value The value to insert.
    * @return True if the method replaced a value that already existed for the key; false if this is a new key.
    */
  /* CompleteClass */
  override def insert(key: String, value: js.Any): Boolean = js.native
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  /**
    * Removes an item from the property set.
    * @param key The key.
    */
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

