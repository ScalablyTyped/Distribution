package typings.xmlCore

import org.scalablytyped.runtime.TopLevel
import typings.xmlCore.xmlCoreStrings._empty
import typings.xmlCore.xmlCoreStrings.applicationSlashxml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core/dist/types/xml", JSImport.Namespace)
@js.native
object xmlMod extends js.Object {
  @js.native
  sealed trait XmlNodeType extends js.Object
  
  val APPLICATION_XML: applicationSlashxml = js.native
  val DEFAULT_NAMESPACE_URI: _empty = js.native
  val DEFAULT_PREFIX: _empty = js.native
  @js.native
  object XmlNodeType extends js.Object {
    @js.native
    sealed trait Attribute extends XmlNodeType
    
    @js.native
    sealed trait CDATA extends XmlNodeType
    
    @js.native
    sealed trait Comment extends XmlNodeType
    
    @js.native
    sealed trait Document extends XmlNodeType
    
    @js.native
    sealed trait DocumentFragment extends XmlNodeType
    
    @js.native
    sealed trait DocumentType extends XmlNodeType
    
    @js.native
    sealed trait Element extends XmlNodeType
    
    @js.native
    sealed trait EndElement extends XmlNodeType
    
    @js.native
    sealed trait EndEntity extends XmlNodeType
    
    @js.native
    sealed trait Entity extends XmlNodeType
    
    @js.native
    sealed trait EntityReference extends XmlNodeType
    
    @js.native
    sealed trait None extends XmlNodeType
    
    @js.native
    sealed trait Notation extends XmlNodeType
    
    @js.native
    sealed trait ProcessingInstruction extends XmlNodeType
    
    @js.native
    sealed trait SignificantWhitespace extends XmlNodeType
    
    @js.native
    sealed trait Text extends XmlNodeType
    
    @js.native
    sealed trait Whitespace extends XmlNodeType
    
    @js.native
    sealed trait XmlDeclaration extends XmlNodeType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XmlNodeType with Double] = js.native
    /* 2 */ @js.native
    object Attribute extends TopLevel[Attribute with Double]
    
    /* 4 */ @js.native
    object CDATA extends TopLevel[CDATA with Double]
    
    /* 8 */ @js.native
    object Comment extends TopLevel[Comment with Double]
    
    /* 9 */ @js.native
    object Document extends TopLevel[Document with Double]
    
    /* 11 */ @js.native
    object DocumentFragment extends TopLevel[DocumentFragment with Double]
    
    /* 10 */ @js.native
    object DocumentType extends TopLevel[DocumentType with Double]
    
    /* 1 */ @js.native
    object Element extends TopLevel[Element with Double]
    
    /* 15 */ @js.native
    object EndElement extends TopLevel[EndElement with Double]
    
    /* 16 */ @js.native
    object EndEntity extends TopLevel[EndEntity with Double]
    
    /* 6 */ @js.native
    object Entity extends TopLevel[Entity with Double]
    
    /* 5 */ @js.native
    object EntityReference extends TopLevel[EntityReference with Double]
    
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    /* 12 */ @js.native
    object Notation extends TopLevel[Notation with Double]
    
    /* 7 */ @js.native
    object ProcessingInstruction extends TopLevel[ProcessingInstruction with Double]
    
    /* 14 */ @js.native
    object SignificantWhitespace extends TopLevel[SignificantWhitespace with Double]
    
    /* 3 */ @js.native
    object Text extends TopLevel[Text with Double]
    
    /* 13 */ @js.native
    object Whitespace extends TopLevel[Whitespace with Double]
    
    /* 17 */ @js.native
    object XmlDeclaration extends TopLevel[XmlDeclaration with Double]
    
  }
  
}

