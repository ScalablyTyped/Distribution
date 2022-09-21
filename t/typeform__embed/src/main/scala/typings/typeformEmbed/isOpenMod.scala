package typings.typeformEmbed

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.Node
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isOpenMod {
  
  @JSImport("@typeform/embed/types/utils/is-open", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInPage(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInPage")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOpen(element: HTMLElement): /* is @typeform/embed.@typeform/embed/types/utils/is-open.HTMLElementWithParentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @typeform/embed.@typeform/embed/types/utils/is-open.HTMLElementWithParentNode */ Boolean]
  
  inline def isVisible(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait HTMLElementWithParentNode
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    @JSName("parentNode")
    var parentNode_HTMLElementWithParentNode: Node & ParentNode = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
