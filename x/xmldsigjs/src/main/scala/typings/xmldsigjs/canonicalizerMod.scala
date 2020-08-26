package typings.xmldsigjs

import org.scalablytyped.runtime.TopLevel
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.xmlCore.mod.NamespaceManager
import typings.xmlCore.xmlMod.XmlNodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/canonicalizer", JSImport.Namespace)
@js.native
object canonicalizerMod extends js.Object {
  @js.native
  class XmlCanonicalizer protected () extends js.Object {
    def this(withComments: Boolean, excC14N: Boolean) = this()
    def this(withComments: Boolean, excC14N: Boolean, propagatedNamespaces: NamespaceManager) = this()
    var IsNamespaceInclusive: js.Any = js.native
    var IsNamespaceRendered: js.Any = js.native
    var IsTextNode: js.Any = js.native
    var document: Document = js.native
    var exclusive: Boolean = js.native
    var inclusiveNamespacesPrefixList: js.Array[String] = js.native
    var propagatedNamespaces: NamespaceManager = js.native
    var result: js.Array[String] = js.native
    var state: XmlCanonicalizerState = js.native
    var visibleNamespaces: NamespaceManager = js.native
    var withComments: Boolean = js.native
    def Canonicalize(node: Node): String = js.native
    def InclusiveNamespacesPrefixList: String = js.native
    def InclusiveNamespacesPrefixList_=(value: String): Unit = js.native
    /* protected */ def NormalizeString(input: String, `type`: XmlNodeType): String = js.native
    /* protected */ def NormalizeString(input: Null, `type`: XmlNodeType): String = js.native
    /* protected */ def WriteAttributesAxis(node: Element): Unit = js.native
    /* protected */ def WriteCommentNode(node: Node): Unit = js.native
    /* protected */ def WriteDocumentNode(node: Node): Unit = js.native
    /* protected */ def WriteElementNode(node: Element): Unit = js.native
    /* protected */ def WriteNamespacesAxis(node: Element): Double = js.native
    /* protected */ def WriteNode(node: Node): Unit = js.native
    /* protected */ def WriteProcessingInstructionNode(node: Node): Unit = js.native
    /* protected */ def WriteTextNode(node: Node): Unit = js.native
  }
  
  @js.native
  sealed trait XmlCanonicalizerState extends js.Object
  
  @js.native
  object XmlCanonicalizerState extends js.Object {
    @js.native
    sealed trait AfterDocElement extends XmlCanonicalizerState
    
    @js.native
    sealed trait BeforeDocElement extends XmlCanonicalizerState
    
    @js.native
    sealed trait InsideDocElement extends XmlCanonicalizerState
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XmlCanonicalizerState with Double] = js.native
    /* 2 */ @js.native
    object AfterDocElement extends TopLevel[AfterDocElement with Double]
    
    /* 0 */ @js.native
    object BeforeDocElement extends TopLevel[BeforeDocElement with Double]
    
    /* 1 */ @js.native
    object InsideDocElement extends TopLevel[InsideDocElement with Double]
    
  }
  
}

