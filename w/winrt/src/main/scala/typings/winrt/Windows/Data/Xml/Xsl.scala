package typings.winrt.Windows.Data.Xml

import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Xsl {
  
  trait IXsltProcessor extends StObject {
    
    def transformToString(inputNode: IXmlNode): String
  }
  object IXsltProcessor {
    
    inline def apply(transformToString: IXmlNode => String): IXsltProcessor = {
      val __obj = js.Dynamic.literal(transformToString = js.Any.fromFunction1(transformToString))
      __obj.asInstanceOf[IXsltProcessor]
    }
    
    extension [Self <: IXsltProcessor](x: Self) {
      
      inline def setTransformToString(value: IXmlNode => String): Self = StObject.set(x, "transformToString", js.Any.fromFunction1(value))
    }
  }
  
  trait IXsltProcessorFactory extends StObject {
    
    def createInstance(document: XmlDocument): XsltProcessor
  }
  object IXsltProcessorFactory {
    
    inline def apply(createInstance: XmlDocument => XsltProcessor): IXsltProcessorFactory = {
      val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction1(createInstance))
      __obj.asInstanceOf[IXsltProcessorFactory]
    }
    
    extension [Self <: IXsltProcessorFactory](x: Self) {
      
      inline def setCreateInstance(value: XmlDocument => XsltProcessor): Self = StObject.set(x, "createInstance", js.Any.fromFunction1(value))
    }
  }
  
  trait XsltProcessor
    extends StObject
       with IXsltProcessor
  object XsltProcessor {
    
    inline def apply(transformToString: IXmlNode => String): XsltProcessor = {
      val __obj = js.Dynamic.literal(transformToString = js.Any.fromFunction1(transformToString))
      __obj.asInstanceOf[XsltProcessor]
    }
  }
}
