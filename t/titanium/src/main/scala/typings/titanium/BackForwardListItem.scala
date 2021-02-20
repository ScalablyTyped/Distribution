package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The object represents a webpage in the back-forward of a web view.
  */
@js.native
trait BackForwardListItem extends StObject {
  
  /**
    * The URL of the initial request that created this item.
    */
  var initialUrl: js.UndefOr[String] = js.native
  
  /**
    * The title of the webpage represented by this item.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The URL of the webpage represented by this item.
    */
  var url: js.UndefOr[String] = js.native
}
object BackForwardListItem {
  
  @scala.inline
  def apply(): BackForwardListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackForwardListItem]
  }
  
  @scala.inline
  implicit class BackForwardListItemMutableBuilder[Self <: BackForwardListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialUrl(value: String): Self = StObject.set(x, "initialUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUrlUndefined: Self = StObject.set(x, "initialUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
