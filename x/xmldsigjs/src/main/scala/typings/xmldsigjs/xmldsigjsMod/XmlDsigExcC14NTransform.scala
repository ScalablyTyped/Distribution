package typings.xmldsigjs.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "XmlDsigExcC14NTransform")
@js.native
class XmlDsigExcC14NTransform () extends Transform {
  /**
    * Gets or sets a string that contains namespace prefixes to canonicalize
    * using the standard canonicalization algorithm.
    */
  var InclusiveNamespacesPrefixList: String = js.native
  var xmlCanonicalizer: XmlCanonicalizer = js.native
}

