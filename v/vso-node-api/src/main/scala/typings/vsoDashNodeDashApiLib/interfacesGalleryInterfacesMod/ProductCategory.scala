package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCategory extends js.Object {
  var children: js.Array[ProductCategory]
  /**
    * Indicator whether this is a leaf or there are children under this category
    */
  var hasChildren: scala.Boolean
  /**
    * Individual Guid of the Category
    */
  var id: java.lang.String
  /**
    * Category Title in the requested language
    */
  var title: java.lang.String
}

