package typings.xmlcreate

import typings.xmlcreate.libNodesXmlAttributeMod.IXmlAttributeOptions
import typings.xmlcreate.libNodesXmlAttributeMod.default
import typings.xmlcreate.libNodesXmlAttributeTextMod.IXmlAttributeTextOptions
import typings.xmlcreate.libNodesXmlCdataMod.IXmlCdataOptions
import typings.xmlcreate.libNodesXmlCharDataMod.IXmlCharDataOptions
import typings.xmlcreate.libNodesXmlCharRefMod.IXmlCharRefOptions
import typings.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.libNodesXmlDeclMod.IXmlDeclOptions
import typings.xmlcreate.libNodesXmlDocumentMod.IXmlDocumentOptions
import typings.xmlcreate.libNodesXmlDtdAttlistMod.IXmlDtdAttlistOptions
import typings.xmlcreate.libNodesXmlDtdElementMod.IXmlDtdElementOptions
import typings.xmlcreate.libNodesXmlDtdEntityMod.IXmlDtdEntityOptions
import typings.xmlcreate.libNodesXmlDtdMod.IXmlDtdOptions
import typings.xmlcreate.libNodesXmlDtdNotationMod.IXmlDtdNotationOptions
import typings.xmlcreate.libNodesXmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typings.xmlcreate.libNodesXmlElementMod.IXmlElementOptions
import typings.xmlcreate.libNodesXmlEntityRefMod.IXmlEntityRefOptions
import typings.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmlcreate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xmlcreate", "XmlAttribute")
  @js.native
  open class XmlAttribute[Parent] protected () extends default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlAttributeText")
  @js.native
  open class XmlAttributeText[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlAttributeTextMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeTextOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCdata")
  @js.native
  open class XmlCdata[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCdataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCdataOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCharData")
  @js.native
  open class XmlCharData[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCharDataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCharRef")
  @js.native
  open class XmlCharRef[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCharRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlComment")
  @js.native
  open class XmlComment[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCommentMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDecl")
  @js.native
  open class XmlDecl[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDeclMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDeclOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDocument")
  @js.native
  open class XmlDocument protected ()
    extends typings.xmlcreate.libNodesXmlDocumentMod.default {
    def this(options: IXmlDocumentOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtd")
  @js.native
  open class XmlDtd[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdAttlist")
  @js.native
  open class XmlDtdAttlist[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdAttlistMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdAttlistOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdElement")
  @js.native
  open class XmlDtdElement[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdElementOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdEntity")
  @js.native
  open class XmlDtdEntity[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdEntityMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdNotation")
  @js.native
  open class XmlDtdNotation[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdNotationMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdNotationOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdParamEntityRef")
  @js.native
  open class XmlDtdParamEntityRef[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdParamEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdParamEntityRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlElement")
  @js.native
  open class XmlElement[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlElementOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlEntityRef")
  @js.native
  open class XmlEntityRef[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlEntityRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlProcInst")
  @js.native
  open class XmlProcInst[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlProcInstMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlProcInstOptions) = this()
  }
  
  inline def document(): typings.xmlcreate.libNodesXmlDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")().asInstanceOf[typings.xmlcreate.libNodesXmlDocumentMod.default]
  inline def document(options: IXmlDocumentOptions): typings.xmlcreate.libNodesXmlDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(options.asInstanceOf[js.Any]).asInstanceOf[typings.xmlcreate.libNodesXmlDocumentMod.default]
}
