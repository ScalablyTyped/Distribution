package typings.titanium

import typings.titanium.Titanium.Media.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to the [openMusicLibrary](Titanium.Media.openMusicLibrary)
  * `success` callback function.
  */
@js.native
trait MusicLibraryResponseType extends js.Object {
  
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
  implicit class MusicLibraryResponseTypeOps[Self <: MusicLibraryResponseType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setRepresentative(value: Item): Self = this.set("representative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepresentative: Self = this.set("representative", js.undefined)
    
    @scala.inline
    def setTypes(value: Double): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
