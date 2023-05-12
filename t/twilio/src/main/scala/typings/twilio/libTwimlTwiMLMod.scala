package typings.twilio

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTwimlTwiMLMod {
  
  @JSImport("twilio/lib/twiml/TwiML", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TwiML {
    
    /**
      * Because child elements have properties named after their class names, we need
      * to translate that when we want to access that at the parent prototype level.
      * So this will translate something like Say to 'say' and VoiceResponse to
      * 'response'.
      */
    /* CompleteClass */
    override def _getXml(): Any = js.native
    
    /* CompleteClass */
    var _propertyName: String = js.native
    
    /**
      * Add an arbitrary tag as a child.
      *
      * @param {string} content
      */
    /* CompleteClass */
    override def addChild(tagName: String, attributes: js.Object): GenericNode = js.native
    
    /**
      * Add text under the TwiML node
      *
      * @param {string} content
      */
    /* CompleteClass */
    override def addText(content: String): Unit = js.native
    
    /* CompleteClass */
    var response: Any = js.native
  }
  
  /**
    * Generic node
    */
  trait GenericNode
    extends StObject
       with TwiML {
    
    var node: Any
  }
  object GenericNode {
    
    inline def apply(
      _getXml: () => Any,
      _propertyName: String,
      addChild: (String, js.Object) => GenericNode,
      addText: String => Unit,
      node: Any,
      response: Any
    ): GenericNode = {
      val __obj = js.Dynamic.literal(_getXml = js.Any.fromFunction0(_getXml), _propertyName = _propertyName.asInstanceOf[js.Any], addChild = js.Any.fromFunction2(addChild), addText = js.Any.fromFunction1(addText), node = node.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericNode] (val x: Self) extends AnyVal {
      
      inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwiML
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Because child elements have properties named after their class names, we need
      * to translate that when we want to access that at the parent prototype level.
      * So this will translate something like Say to 'say' and VoiceResponse to
      * 'response'.
      */
    def _getXml(): Any
    
    var _propertyName: String
    
    /**
      * Add an arbitrary tag as a child.
      *
      * @param {string} content
      */
    def addChild(tagName: String, attributes: js.Object): GenericNode
    
    /**
      * Add text under the TwiML node
      *
      * @param {string} content
      */
    def addText(content: String): Unit
    
    var response: Any
  }
  object TwiML {
    
    inline def apply(
      _getXml: () => Any,
      _propertyName: String,
      addChild: (String, js.Object) => GenericNode,
      addText: String => Unit,
      response: Any
    ): TwiML = {
      val __obj = js.Dynamic.literal(_getXml = js.Any.fromFunction0(_getXml), _propertyName = _propertyName.asInstanceOf[js.Any], addChild = js.Any.fromFunction2(addChild), addText = js.Any.fromFunction1(addText), response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwiML]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwiML] (val x: Self) extends AnyVal {
      
      inline def setAddChild(value: (String, js.Object) => GenericNode): Self = StObject.set(x, "addChild", js.Any.fromFunction2(value))
      
      inline def setAddText(value: String => Unit): Self = StObject.set(x, "addText", js.Any.fromFunction1(value))
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def set_getXml(value: () => Any): Self = StObject.set(x, "_getXml", js.Any.fromFunction0(value))
      
      inline def set_propertyName(value: String): Self = StObject.set(x, "_propertyName", value.asInstanceOf[js.Any])
    }
  }
}
