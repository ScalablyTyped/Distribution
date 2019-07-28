package typings.xmldsigjs.xmldsigjsMod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.xmlDashCore.xmlDashCoreMod.NamespaceManager
import typings.xmlDashCore.xmlDashCoreMod.XmlNodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "XmlCanonicalizer")
@js.native
class XmlCanonicalizer protected () extends js.Object {
  def this(withComments: Boolean, excC14N: Boolean) = this()
  def this(withComments: Boolean, excC14N: Boolean, propagatedNamespaces: NamespaceManager) = this()
  var InclusiveNamespacesPrefixList: String = js.native
  var document: Document = js.native
  var exclusive: Boolean = js.native
  var inclusiveNamespacesPrefixList: js.Array[String] = js.native
  var propagatedNamespaces: NamespaceManager = js.native
  var result: js.Array[String] = js.native
  var state: XmlCanonicalizerState = js.native
  var visibleNamespaces: NamespaceManager = js.native
  var withComments: Boolean = js.native
  def Canonicalize(node: Node): String = js.native
  /* protected */ def IsNamespaceInclusive(node: Element): Boolean = js.native
  /* protected */ def IsNamespaceInclusive(node: Element, prefix: String): Boolean = js.native
  /* protected */ def IsNamespaceRendered(): Boolean = js.native
  /* protected */ def IsNamespaceRendered(prefix: String): Boolean = js.native
  /* protected */ def IsNamespaceRendered(prefix: String, uri: String): Boolean = js.native
  /* protected */ def IsNamespaceRendered(prefix: Null, uri: String): Boolean = js.native
  /* protected */ def IsTextNode(`type`: XmlNodeType): Boolean = js.native
  /* protected */ def NormalizeString(input: String, `type`: XmlNodeType): String = js.native
  /* protected */ def NormalizeString(input: Null, `type`: XmlNodeType): String = js.native
  /* protected */ def WriteAttributesAxis(node: Node): Unit = js.native
  /* protected */ def WriteCommentNode(node: Node): Unit = js.native
  /* protected */ def WriteDocumentNode(node: Node): Unit = js.native
  /* protected */ def WriteElementNode(node: Element): Unit = js.native
  /* protected */ def WriteNamespacesAxis(node: Element): Double = js.native
  /* protected */ def WriteNode(node: Node): Unit = js.native
  /* protected */ def WriteProcessingInstructionNode(node: Node): Unit = js.native
  /* protected */ def WriteTextNode(node: Node): Unit = js.native
}

