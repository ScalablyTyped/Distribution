package typings.winrtUwp.Windows.Data.Xml

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for the XSLT processor. */
object Xsl {
  
  /** Provides the methods needed by the Xslt processor. */
  trait XsltProcessor extends StObject {
    
    /**
      * Processes a node and its children and returns the resulting XmlDocument .
      * @param inputNode The node to process.
      * @return The resulting transformation.
      */
    def transformToDocument(inputNode: IXmlNode): XmlDocument
    
    /**
      * Processes a node and its children and returns the resulting string transformation.
      * @param inputNode The node to process.
      * @return The resulting transformation.
      */
    def transformToString(inputNode: IXmlNode): String
  }
  object XsltProcessor {
    
    inline def apply(transformToDocument: IXmlNode => XmlDocument, transformToString: IXmlNode => String): XsltProcessor = {
      val __obj = js.Dynamic.literal(transformToDocument = js.Any.fromFunction1(transformToDocument), transformToString = js.Any.fromFunction1(transformToString))
      __obj.asInstanceOf[XsltProcessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XsltProcessor] (val x: Self) extends AnyVal {
      
      inline def setTransformToDocument(value: IXmlNode => XmlDocument): Self = StObject.set(x, "transformToDocument", js.Any.fromFunction1(value))
      
      inline def setTransformToString(value: IXmlNode => String): Self = StObject.set(x, "transformToString", js.Any.fromFunction1(value))
    }
  }
}
