package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackTypesMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header extends StObject {
  
  /**
    * Layout of the header
    */
  var header: Layout = js.native
  
  /**
    * Layout of the back button label.
    */
  var leftLabel: js.UndefOr[Layout] = js.native
  
  /**
    * Layout of the whole screen.
    */
  var screen: Layout = js.native
  
  /**
    * Layout of the title element.
    */
  var title: js.UndefOr[Layout] = js.native
}
object Header {
  
  @scala.inline
  def apply(header: Layout, screen: Layout): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: Layout): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftLabel(value: Layout): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
    
    @scala.inline
    def setScreen(value: Layout): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Layout): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
