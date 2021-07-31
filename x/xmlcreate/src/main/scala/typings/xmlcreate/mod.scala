package typings.xmlcreate

import typings.xmlcreate.xmlAttributeMod.IXmlAttributeOptions
import typings.xmlcreate.xmlAttributeMod.default
import typings.xmlcreate.xmlAttributeTextMod.IXmlAttributeTextOptions
import typings.xmlcreate.xmlCdataMod.IXmlCdataOptions
import typings.xmlcreate.xmlCharDataMod.IXmlCharDataOptions
import typings.xmlcreate.xmlCharRefMod.IXmlCharRefOptions
import typings.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.xmlDeclMod.IXmlDeclOptions
import typings.xmlcreate.xmlDocumentMod.IXmlDocumentOptions
import typings.xmlcreate.xmlDtdAttlistMod.IXmlDtdAttlistOptions
import typings.xmlcreate.xmlDtdElementMod.IXmlDtdElementOptions
import typings.xmlcreate.xmlDtdEntityMod.IXmlDtdEntityOptions
import typings.xmlcreate.xmlDtdMod.IXmlDtdOptions
import typings.xmlcreate.xmlDtdNotationMod.IXmlDtdNotationOptions
import typings.xmlcreate.xmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typings.xmlcreate.xmlElementMod.IXmlElementOptions
import typings.xmlcreate.xmlEntityRefMod.IXmlEntityRefOptions
import typings.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmlcreate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xmlcreate", "XmlAttribute")
  @js.native
  class XmlAttribute[Parent] protected () extends default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlAttributeText")
  @js.native
  class XmlAttributeText[Parent] protected ()
    extends typings.xmlcreate.xmlAttributeTextMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeTextOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCdata")
  @js.native
  class XmlCdata[Parent] protected ()
    extends typings.xmlcreate.xmlCdataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCdataOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCharData")
  @js.native
  class XmlCharData[Parent] protected ()
    extends typings.xmlcreate.xmlCharDataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCharRef")
  @js.native
  class XmlCharRef[Parent] protected ()
    extends typings.xmlcreate.xmlCharRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlComment")
  @js.native
  class XmlComment[Parent] protected ()
    extends typings.xmlcreate.xmlCommentMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDecl")
  @js.native
  class XmlDecl[Parent] protected ()
    extends typings.xmlcreate.xmlDeclMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDeclOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDocument")
  @js.native
  class XmlDocument protected ()
    extends typings.xmlcreate.xmlDocumentMod.default {
    def this(options: IXmlDocumentOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtd")
  @js.native
  class XmlDtd[Parent] protected ()
    extends typings.xmlcreate.xmlDtdMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdAttlist")
  @js.native
  class XmlDtdAttlist[Parent] protected ()
    extends typings.xmlcreate.xmlDtdAttlistMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdAttlistOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdElement")
  @js.native
  class XmlDtdElement[Parent] protected ()
    extends typings.xmlcreate.xmlDtdElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdElementOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdEntity")
  @js.native
  class XmlDtdEntity[Parent] protected ()
    extends typings.xmlcreate.xmlDtdEntityMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdNotation")
  @js.native
  class XmlDtdNotation[Parent] protected ()
    extends typings.xmlcreate.xmlDtdNotationMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdNotationOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdParamEntityRef")
  @js.native
  class XmlDtdParamEntityRef[Parent] protected ()
    extends typings.xmlcreate.xmlDtdParamEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdParamEntityRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlElement")
  @js.native
  class XmlElement[Parent] protected ()
    extends typings.xmlcreate.xmlElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlElementOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlEntityRef")
  @js.native
  class XmlEntityRef[Parent] protected ()
    extends typings.xmlcreate.xmlEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlEntityRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlProcInst")
  @js.native
  class XmlProcInst[Parent] protected ()
    extends typings.xmlcreate.xmlProcInstMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlProcInstOptions) = this()
  }
  
  @scala.inline
  def document(): typings.xmlcreate.xmlDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")().asInstanceOf[typings.xmlcreate.xmlDocumentMod.default]
  @scala.inline
  def document(options: IXmlDocumentOptions): typings.xmlcreate.xmlDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(options.asInstanceOf[js.Any]).asInstanceOf[typings.xmlcreate.xmlDocumentMod.default]
}
