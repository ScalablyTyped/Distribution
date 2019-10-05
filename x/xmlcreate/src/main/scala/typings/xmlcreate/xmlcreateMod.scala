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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate", JSImport.Namespace)
@js.native
object xmlcreateMod extends js.Object {
  @js.native
  class XmlAttribute[Parent] protected () extends default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeOptions) = this()
  }
  
  @js.native
  class XmlAttributeText[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlAttributeTextMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeTextOptions) = this()
  }
  
  @js.native
  class XmlCdata[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCdataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCdataOptions) = this()
  }
  
  @js.native
  class XmlCharData[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCharDataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  }
  
  @js.native
  class XmlCharRef[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCharRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharRefOptions) = this()
  }
  
  @js.native
  class XmlComment[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlCommentMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  }
  
  @js.native
  class XmlDecl[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDeclMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDeclOptions) = this()
  }
  
  @js.native
  class XmlDocument protected ()
    extends typings.xmlcreate.libNodesXmlDocumentMod.default {
    def this(options: IXmlDocumentOptions) = this()
  }
  
  @js.native
  class XmlDtd[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdOptions) = this()
  }
  
  @js.native
  class XmlDtdAttlist[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdAttlistMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdAttlistOptions) = this()
  }
  
  @js.native
  class XmlDtdElement[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdElementOptions) = this()
  }
  
  @js.native
  class XmlDtdEntity[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdEntityMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  }
  
  @js.native
  class XmlDtdNotation[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdNotationMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdNotationOptions) = this()
  }
  
  @js.native
  class XmlDtdParamEntityRef[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlDtdParamEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdParamEntityRefOptions) = this()
  }
  
  @js.native
  class XmlElement[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlElementOptions) = this()
  }
  
  @js.native
  class XmlEntityRef[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlEntityRefOptions) = this()
  }
  
  @js.native
  class XmlProcInst[Parent] protected ()
    extends typings.xmlcreate.libNodesXmlProcInstMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlProcInstOptions) = this()
  }
  
  def document(): typings.xmlcreate.libNodesXmlDocumentMod.default = js.native
  def document(options: IXmlDocumentOptions): typings.xmlcreate.libNodesXmlDocumentMod.default = js.native
}

