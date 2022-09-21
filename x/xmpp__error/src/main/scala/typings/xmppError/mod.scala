package typings.xmppError

import typings.std.Error
import typings.xmppXml.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@xmpp/error", JSImport.Namespace)
  @js.native
  open class ^[TName /* <: String */] protected ()
    extends StObject
       with XMPPError[TName] {
    def this(condition: String) = this()
    def this(condition: String, text: String) = this()
    def this(condition: String, text: String, application: Element) = this()
    def this(condition: String, text: Unit, application: Element) = this()
    
    /* CompleteClass */
    override val condition: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_XMPPError: TName = js.native
  }
  @JSImport("@xmpp/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromElement(element: Element): XMPPError[typings.xmppError.xmppErrorStrings.XMPPError] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[XMPPError[typings.xmppError.xmppErrorStrings.XMPPError]]
  
  trait XMPPError[TName /* <: String */]
    extends StObject
       with Error {
    
    val application: js.UndefOr[Element] = js.undefined
    
    val condition: String
    
    var element: js.UndefOr[Element] = js.undefined
    
    @JSName("name")
    val name_XMPPError: TName
    
    val text: js.UndefOr[String] = js.undefined
  }
  object XMPPError {
    
    inline def apply[TName /* <: String */](condition: String, message: String, name: TName): XMPPError[TName] = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMPPError[TName]]
    }
    
    extension [Self <: XMPPError[?], TName /* <: String */](x: Self & XMPPError[TName]) {
      
      inline def setApplication(value: Element): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
