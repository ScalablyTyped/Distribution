package typings.xmlCore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core/dist/types/xml", JSImport.Namespace)
@js.native
object xmlMod extends js.Object {
  
  val APPLICATION_XML: /* "application/xml" */ String = js.native
  
  val DEFAULT_NAMESPACE_URI: /* "" */ String = js.native
  
  val DEFAULT_PREFIX: /* "" */ String = js.native
  
  @js.native
  sealed trait XmlNodeType extends js.Object
  @js.native
  object XmlNodeType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XmlNodeType with Double] = js.native
    
    @js.native
    sealed trait Attribute extends XmlNodeType
    /* 2 */ @js.native
    object Attribute extends TopLevel[Attribute with Double]
    
    @js.native
    sealed trait CDATA extends XmlNodeType
    /* 4 */ @js.native
    object CDATA extends TopLevel[CDATA with Double]
    
    @js.native
    sealed trait Comment extends XmlNodeType
    /* 8 */ @js.native
    object Comment extends TopLevel[Comment with Double]
    
    @js.native
    sealed trait Document extends XmlNodeType
    /* 9 */ @js.native
    object Document extends TopLevel[Document with Double]
    
    @js.native
    sealed trait DocumentFragment extends XmlNodeType
    /* 11 */ @js.native
    object DocumentFragment extends TopLevel[DocumentFragment with Double]
    
    @js.native
    sealed trait DocumentType extends XmlNodeType
    /* 10 */ @js.native
    object DocumentType extends TopLevel[DocumentType with Double]
    
    @js.native
    sealed trait Element extends XmlNodeType
    /* 1 */ @js.native
    object Element extends TopLevel[Element with Double]
    
    @js.native
    sealed trait EndElement extends XmlNodeType
    /* 15 */ @js.native
    object EndElement extends TopLevel[EndElement with Double]
    
    @js.native
    sealed trait EndEntity extends XmlNodeType
    /* 16 */ @js.native
    object EndEntity extends TopLevel[EndEntity with Double]
    
    @js.native
    sealed trait Entity extends XmlNodeType
    /* 6 */ @js.native
    object Entity extends TopLevel[Entity with Double]
    
    @js.native
    sealed trait EntityReference extends XmlNodeType
    /* 5 */ @js.native
    object EntityReference extends TopLevel[EntityReference with Double]
    
    @js.native
    sealed trait None extends XmlNodeType
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    @js.native
    sealed trait Notation extends XmlNodeType
    /* 12 */ @js.native
    object Notation extends TopLevel[Notation with Double]
    
    @js.native
    sealed trait ProcessingInstruction extends XmlNodeType
    /* 7 */ @js.native
    object ProcessingInstruction extends TopLevel[ProcessingInstruction with Double]
    
    @js.native
    sealed trait SignificantWhitespace extends XmlNodeType
    /* 14 */ @js.native
    object SignificantWhitespace extends TopLevel[SignificantWhitespace with Double]
    
    @js.native
    sealed trait Text extends XmlNodeType
    /* 3 */ @js.native
    object Text extends TopLevel[Text with Double]
    
    @js.native
    sealed trait Whitespace extends XmlNodeType
    /* 13 */ @js.native
    object Whitespace extends TopLevel[Whitespace with Double]
    
    @js.native
    sealed trait XmlDeclaration extends XmlNodeType
    /* 17 */ @js.native
    object XmlDeclaration extends TopLevel[XmlDeclaration with Double]
  }
}
