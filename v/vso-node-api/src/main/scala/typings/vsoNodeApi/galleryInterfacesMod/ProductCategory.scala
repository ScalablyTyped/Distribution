package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCategory extends js.Object {
  var children: js.Array[ProductCategory]
  /**
    * Indicator whether this is a leaf or there are children under this category
    */
  var hasChildren: Boolean
  /**
    * Individual Guid of the Category
    */
  var id: String
  /**
    * Category Title in the requested language
    */
  var title: String
}

object ProductCategory {
  @scala.inline
  def apply(children: js.Array[ProductCategory], hasChildren: Boolean, id: String, title: String): ProductCategory = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProductCategory]
  }
}

