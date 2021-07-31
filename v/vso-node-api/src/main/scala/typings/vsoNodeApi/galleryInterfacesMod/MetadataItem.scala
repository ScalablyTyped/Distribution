package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataItem extends StObject {
  
  /**
    * The count of the metadata item
    */
  var count: Double
  
  /**
    * The name of the metadata item
    */
  var name: String
}
object MetadataItem {
  
  @scala.inline
  def apply(count: Double, name: String): MetadataItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataItem]
  }
  
  @scala.inline
  implicit class MetadataItemMutableBuilder[Self <: MetadataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
