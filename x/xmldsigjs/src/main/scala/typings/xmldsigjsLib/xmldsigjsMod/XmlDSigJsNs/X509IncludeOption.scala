package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait X509IncludeOption extends js.Object

@JSImport("xmldsigjs/XmlDSigJs", "X509IncludeOption")
@js.native
object X509IncludeOption extends js.Object {
  @js.native
  sealed trait EndCertOnly
    extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.X509IncludeOption
  
  @js.native
  sealed trait ExcludeRoot
    extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.X509IncludeOption
  
  @js.native
  sealed trait None
    extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.X509IncludeOption
  
  @js.native
  sealed trait WholeChain
    extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.X509IncludeOption
  
}

