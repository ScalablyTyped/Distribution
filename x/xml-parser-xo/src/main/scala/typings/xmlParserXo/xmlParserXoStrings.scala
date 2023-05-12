package typings.xmlParserXo

import typings.xmlParserXo.mod.XmlParserNodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlParserXoStrings {
  
  @js.native
  sealed trait CDATA
    extends StObject
       with XmlParserNodeType
  inline def CDATA: CDATA = "CDATA".asInstanceOf[CDATA]
  
  @js.native
  sealed trait Comment
    extends StObject
       with XmlParserNodeType
  inline def Comment: Comment = "Comment".asInstanceOf[Comment]
  
  @js.native
  sealed trait DocumentType
    extends StObject
       with XmlParserNodeType
  inline def DocumentType: DocumentType = "DocumentType".asInstanceOf[DocumentType]
  
  @js.native
  sealed trait Element
    extends StObject
       with XmlParserNodeType
  inline def Element: Element = "Element".asInstanceOf[Element]
  
  @js.native
  sealed trait ProcessingInstruction
    extends StObject
       with XmlParserNodeType
  inline def ProcessingInstruction: ProcessingInstruction = "ProcessingInstruction".asInstanceOf[ProcessingInstruction]
  
  @js.native
  sealed trait Text
    extends StObject
       with XmlParserNodeType
  inline def Text: Text = "Text".asInstanceOf[Text]
}
