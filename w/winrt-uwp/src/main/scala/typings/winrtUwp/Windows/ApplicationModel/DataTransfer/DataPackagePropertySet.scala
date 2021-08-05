package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a set of properties to use with a DataPackage object. */
trait DataPackagePropertySet extends StObject {
  
  /** Gets or sets the Uniform Resource Identifier (URI) of the app's location in the Windows Store. */
  var applicationListingUri: Uri
  
  /** Gets or sets the name of the app that created the DataPackage object. */
  var applicationName: String
  
  /** Removes all items from the property set. */
  def clear(): Unit
  
  /** Gets or sets the application link to the content from the source app. */
  var contentSourceApplicationLink: Uri
  
  /** Provides a web link to shared content that's currently displayed in the app. */
  var contentSourceWebLink: Uri
  
  /** Gets or sets text that describes the contents of the DataPackage . */
  var description: String
  
  /** Gets or sets the enterprise identity (see Enterprise data protection). */
  var enterpriseId: String
  
  /** Specifies a vector object that contains the types of files stored in the DataPackage object. */
  var fileTypes: IVector[String]
  
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The first item in the DataPackage object.
    */
  def first(): IIterator[IKeyValuePair[js.Any, js.Any]]
  
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, js.Any]
  
  /**
    * Indicates whether the DataPackagePropertySet object contains a specific property.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise false.
    */
  def hasKey(key: String): Boolean
  
  /**
    * Adds a property to the DataPackagePropertySet object.
    * @param key The key to insert.
    * @param value The value to insert.
    * @return True if the method replaced a value that already existed for the key; false if this is a new key.
    */
  def insert(key: String, value: js.Any): Boolean
  
  /** Gets or sets a background color for the sharing app's Square30x30Logo . */
  var logoBackgroundColor: Color
  
  /**
    * Retrieves the value of a specific property.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, an error code.
    */
  def lookup(key: String): js.Any
  
  /** Gets or sets the package family name of the source app. */
  var packageFamilyName: String
  
  /**
    * Removes an item from the property set.
    * @param key The key.
    */
  def remove(key: String): Unit
  
  /** Gets the number of items that are contained in the property set. */
  var size: Double
  
  /** Gets or sets the source app's logo. */
  var square30x30Logo: IRandomAccessStreamReference
  
  /** Gets or sets a thumbnail image for the DataPackage . */
  var thumbnail: IRandomAccessStreamReference
  
  /** Gets or sets the text that displays as a title for the contents of the DataPackage object. */
  var title: String
}
object DataPackagePropertySet {
  
  inline def apply(
    applicationListingUri: Uri,
    applicationName: String,
    clear: () => Unit,
    contentSourceApplicationLink: Uri,
    contentSourceWebLink: Uri,
    description: String,
    enterpriseId: String,
    fileTypes: IVector[String],
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    getView: () => IMapView[String, js.Any],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    logoBackgroundColor: Color,
    lookup: String => js.Any,
    packageFamilyName: String,
    remove: String => Unit,
    size: Double,
    square30x30Logo: IRandomAccessStreamReference,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): DataPackagePropertySet = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contentSourceApplicationLink = contentSourceApplicationLink.asInstanceOf[js.Any], contentSourceWebLink = contentSourceWebLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), logoBackgroundColor = logoBackgroundColor.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), packageFamilyName = packageFamilyName.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any], square30x30Logo = square30x30Logo.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPackagePropertySet]
  }
  
  extension [Self <: DataPackagePropertySet](x: Self) {
    
    inline def setApplicationListingUri(value: Uri): Self = StObject.set(x, "applicationListingUri", value.asInstanceOf[js.Any])
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setContentSourceApplicationLink(value: Uri): Self = StObject.set(x, "contentSourceApplicationLink", value.asInstanceOf[js.Any])
    
    inline def setContentSourceWebLink(value: Uri): Self = StObject.set(x, "contentSourceWebLink", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setFileTypes(value: IVector[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: () => IIterator[IKeyValuePair[js.Any, js.Any]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    inline def setGetView(value: () => IMapView[String, js.Any]): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
    
    inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (String, js.Any) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setLogoBackgroundColor(value: Color): Self = StObject.set(x, "logoBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLookup(value: String => js.Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    inline def setPackageFamilyName(value: String): Self = StObject.set(x, "packageFamilyName", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSquare30x30Logo(value: IRandomAccessStreamReference): Self = StObject.set(x, "square30x30Logo", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
