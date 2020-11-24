package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The search bar token for the <Titanium.UI.SearchBar.insertTokenAtIndex> method.
  */
@js.native
trait SearchBarToken extends js.Object {
  
  /**
    * The identifier of the search bar token.
    */
  var identifier: String = js.native
  
  /**
    * The image of the search bar token.
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * The text of the search bar token (displayed in the search bar).
    */
  var text: String = js.native
}
object SearchBarToken {
  
  @scala.inline
  def apply(identifier: String, text: String): SearchBarToken = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarToken]
  }
  
  @scala.inline
  implicit class SearchBarTokenOps[Self <: SearchBarToken] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
