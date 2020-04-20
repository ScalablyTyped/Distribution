package typings.xmldsigjs

import typings.xmldsigjs.canonicalizerMod.XmlCanonicalizer
import typings.xmldsigjs.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/transforms/exc_c14n", JSImport.Namespace)
@js.native
object excC14nMod extends js.Object {
  @js.native
  class XmlDsigExcC14NTransform () extends Transform {
    var xmlCanonicalizer: XmlCanonicalizer = js.native
    /**
      * Gets or sets a string that contains namespace prefixes to canonicalize
      * using the standard canonicalization algorithm.
      */
    def InclusiveNamespacesPrefixList: String = js.native
    def InclusiveNamespacesPrefixList(value: String): js.Any = js.native
  }
  
  @js.native
  class XmlDsigExcC14NWithCommentsTransform () extends XmlDsigExcC14NTransform
  
}

