package typings.wordpressDom

import typings.std.AddEventListenerOptions
import typings.std.DOMRect
import typings.std.Document
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Node
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomCaretRangeFromPointMod {
  
  @JSImport("@wordpress/dom/build-types/dom/caret-range-from-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(doc: DocumentMaybeWithCaretPositionFromPoint, x: Double, y: Double): Range | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(doc.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Range | Null]
  
  trait CaretPosition extends StObject {
    
    def getClientRect(): DOMRect | Null
    
    val offset: Double
    
    val offsetNode: Node
  }
  object CaretPosition {
    
    inline def apply(getClientRect: () => DOMRect | Null, offset: Double, offsetNode: Node): CaretPosition = {
      val __obj = js.Dynamic.literal(getClientRect = js.Any.fromFunction0(getClientRect), offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaretPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaretPosition] (val x: Self) extends AnyVal {
      
      inline def setGetClientRect(value: () => DOMRect | Null): Self = StObject.set(x, "getClientRect", js.Any.fromFunction0(value))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetNode(value: Node): Self = StObject.set(x, "offsetNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DocumentMaybeWithCaretPositionFromPoint
    extends StObject
       with Document {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var caretPositionFromPoint: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, CaretPosition | Null]] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
