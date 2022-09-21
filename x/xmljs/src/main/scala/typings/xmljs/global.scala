package typings.xmljs

import typings.xmljs.mod.Node
import typings.xmljs.mod.ParserParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object XmlParser {
    
    /*~ Write your module's methods and properties in this class */
    @JSGlobal("XmlParser")
    @js.native
    open class ^ protected ()
      extends typings.xmljs.mod.^ {
      def this(oPar: ParserParameters) = this()
    }
    
    @JSGlobal("XmlParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns whenever a node is a XmlNode or not
      * @param n
      */
    /* static member */
    inline def isXmlNode(n: Node): /* is xmljs.xmljs.XmlNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXmlNode")(n.asInstanceOf[js.Any]).asInstanceOf[/* is xmljs.xmljs.XmlNode */ Boolean]
  }
}
