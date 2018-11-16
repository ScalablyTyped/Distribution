package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlCanonicalizer extends js.Object {
  var InclusiveNamespacesPrefixList: java.lang.String = js.native
  var document: stdLib.Document = js.native
  var exclusive: scala.Boolean = js.native
  var inclusiveNamespacesPrefixList: js.Array[java.lang.String] = js.native
  var propagatedNamespaces: xmlDashCoreLib.xmlDashCoreMod.NamespaceManager = js.native
  var result: js.Array[java.lang.String] = js.native
  var state: XmlCanonicalizerState = js.native
  var visibleNamespaces: xmlDashCoreLib.xmlDashCoreMod.NamespaceManager = js.native
  var withComments: scala.Boolean = js.native
  def Canonicalize(node: stdLib.Node): java.lang.String = js.native
  /* protected */ def IsNamespaceInclusive(node: stdLib.Element): scala.Boolean = js.native
  /* protected */ def IsNamespaceInclusive(node: stdLib.Element, prefix: java.lang.String): scala.Boolean = js.native
  /* protected */ def IsNamespaceRendered(): scala.Boolean = js.native
  /* protected */ def IsNamespaceRendered(prefix: java.lang.String): scala.Boolean = js.native
  /* protected */ def IsNamespaceRendered(prefix: java.lang.String, uri: java.lang.String): scala.Boolean = js.native
  /* protected */ def IsNamespaceRendered(prefix: scala.Null, uri: java.lang.String): scala.Boolean = js.native
  /* protected */ def IsTextNode(`type`: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType): scala.Boolean = js.native
  /* protected */ def NormalizeString(input: java.lang.String, `type`: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType): java.lang.String = js.native
  /* protected */ def NormalizeString(input: scala.Null, `type`: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.XmlNodeType): java.lang.String = js.native
  /* protected */ def WriteAttributesAxis(node: stdLib.Node): scala.Unit = js.native
  /* protected */ def WriteCommentNode(node: stdLib.Node): scala.Unit = js.native
  /* protected */ def WriteDocumentNode(node: stdLib.Node): scala.Unit = js.native
  /* protected */ def WriteElementNode(node: stdLib.Element): scala.Unit = js.native
  /* protected */ def WriteNamespacesAxis(node: stdLib.Element): scala.Double = js.native
  /* protected */ def WriteNode(node: stdLib.Node): scala.Unit = js.native
  /* protected */ def WriteProcessingInstructionNode(node: stdLib.Node): scala.Unit = js.native
  /* protected */ def WriteTextNode(node: stdLib.Node): scala.Unit = js.native
}

