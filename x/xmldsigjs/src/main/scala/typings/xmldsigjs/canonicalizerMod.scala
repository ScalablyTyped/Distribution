package typings.xmldsigjs

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.xmlCore.mod.NamespaceManager
import typings.xmlCore.xmlMod.XmlNodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canonicalizerMod {
  
  @JSImport("xmldsigjs/build/types/canonicalizer", "XmlCanonicalizer")
  @js.native
  open class XmlCanonicalizer protected () extends StObject {
    def this(withComments: Boolean, excC14N: Boolean) = this()
    def this(withComments: Boolean, excC14N: Boolean, propagatedNamespaces: NamespaceManager) = this()
    
    def Canonicalize(node: Node): String = js.native
    
    def InclusiveNamespacesPrefixList: String = js.native
    def InclusiveNamespacesPrefixList_=(value: String): Unit = js.native
    
    /* private */ var IsNamespaceInclusive: Any = js.native
    
    /* private */ var IsNamespaceRendered: Any = js.native
    
    /* private */ var IsTextNode: Any = js.native
    
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
    
    /* protected */ var document: Document = js.native
    
    /* protected */ var exclusive: Boolean = js.native
    
    /* protected */ var inclusiveNamespacesPrefixList: js.Array[String] = js.native
    
    /* protected */ var propagatedNamespaces: NamespaceManager = js.native
    
    /* protected */ var result: js.Array[String] = js.native
    
    /* protected */ var state: XmlCanonicalizerState = js.native
    
    /* protected */ var visibleNamespaces: NamespaceManager = js.native
    
    /* protected */ var withComments: Boolean = js.native
  }
  
  @js.native
  sealed trait XmlCanonicalizerState extends StObject
  @JSImport("xmldsigjs/build/types/canonicalizer", "XmlCanonicalizerState")
  @js.native
  object XmlCanonicalizerState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XmlCanonicalizerState & Double] = js.native
    
    @js.native
    sealed trait AfterDocElement
      extends StObject
         with XmlCanonicalizerState
    /* 2 */ val AfterDocElement: typings.xmldsigjs.canonicalizerMod.XmlCanonicalizerState.AfterDocElement & Double = js.native
    
    @js.native
    sealed trait BeforeDocElement
      extends StObject
         with XmlCanonicalizerState
    /* 0 */ val BeforeDocElement: typings.xmldsigjs.canonicalizerMod.XmlCanonicalizerState.BeforeDocElement & Double = js.native
    
    @js.native
    sealed trait InsideDocElement
      extends StObject
         with XmlCanonicalizerState
    /* 1 */ val InsideDocElement: typings.xmldsigjs.canonicalizerMod.XmlCanonicalizerState.InsideDocElement & Double = js.native
  }
}
