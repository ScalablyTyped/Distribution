package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The search bar token for the <Titanium.UI.SearchBar.insertTokenAtIndex> method.
  */
@js.native
trait SearchBarToken extends StObject {
  
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
  implicit class SearchBarTokenMutableBuilder[Self <: SearchBarToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
