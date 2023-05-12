package typings.wordpressRichText

import typings.std.DOMRect
import typings.std.Document
import typings.std.Element
import typings.wordpressRichText.anon.EditableContentElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentUseAnchorMod {
  
  @JSImport("@wordpress/rich-text/component/use-anchor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnchor(param: EditableContentElement): js.UndefOr[Element | VirtualAnchorElement | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnchor")(param.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element | VirtualAnchorElement | Null]]
  
  trait VirtualAnchorElement extends StObject {
    
    def getBoundingClientRect(): DOMRect
    
    var ownerDocument: Document
  }
  object VirtualAnchorElement {
    
    inline def apply(getBoundingClientRect: () => DOMRect, ownerDocument: Document): VirtualAnchorElement = {
      val __obj = js.Dynamic.literal(getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), ownerDocument = ownerDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualAnchorElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualAnchorElement] (val x: Self) extends AnyVal {
      
      inline def setGetBoundingClientRect(value: () => DOMRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
      
      inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    }
  }
}
