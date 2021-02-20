package typings.titanium

import typings.titanium.Titanium.Media.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to the [openMusicLibrary](Titanium.Media.openMusicLibrary)
  * `success` callback function.
  */
@js.native
trait MusicLibraryResponseType extends StObject {
  
  /**
    * A list of all the items chosen by the user.
    */
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  /**
    * A single representative of the selected items.
    */
  var representative: js.UndefOr[Item] = js.native
  
  /**
    * Media types in this collection, represented as the bitwise OR of the media type
    * values for all media types represented in `items`.
    */
  var types: js.UndefOr[Double] = js.native
}
object MusicLibraryResponseType {
  
  @scala.inline
  def apply(): MusicLibraryResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MusicLibraryResponseType]
  }
  
  @scala.inline
  implicit class MusicLibraryResponseTypeMutableBuilder[Self <: MusicLibraryResponseType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setRepresentative(value: Item): Self = StObject.set(x, "representative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresentativeUndefined: Self = StObject.set(x, "representative", js.undefined)
    
    @scala.inline
    def setTypes(value: Double): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
