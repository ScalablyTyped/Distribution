package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract type to represent a metadata item inside the `metadata` event (iOS only).
  */
@js.native
trait TiMetadataItemType extends StObject {
  
  /**
    * A dictionary of the additional attributes.
    */
  var extraAttributes: js.UndefOr[js.Any] = js.native
  
  /**
    * The key of the metadata item, e.g. "title".
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The key-path of the metadata item.
    */
  var keySpace: js.UndefOr[String] = js.native
  
  /**
    * The value of the metadata item. Can be represented as various types.
    */
  var value: js.UndefOr[String | Double | Boolean] = js.native
}
object TiMetadataItemType {
  
  @scala.inline
  def apply(): TiMetadataItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiMetadataItemType]
  }
  
  @scala.inline
  implicit class TiMetadataItemTypeMutableBuilder[Self <: TiMetadataItemType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraAttributes(value: js.Any): Self = StObject.set(x, "extraAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraAttributesUndefined: Self = StObject.set(x, "extraAttributes", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySpace(value: String): Self = StObject.set(x, "keySpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySpaceUndefined: Self = StObject.set(x, "keySpace", js.undefined)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
