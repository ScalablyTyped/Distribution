package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XmlCanonicalizerState extends js.Object

@JSImport("xmldsigjs/XmlDSigJs", "XmlCanonicalizerState")
@js.native
object XmlCanonicalizerState extends js.Object {
  @js.native
  sealed trait AfterDocElement
    extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.XmlCanonicalizerState
  
  @js.native
  sealed trait BeforeDocElement
    extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.XmlCanonicalizerState
  
  @js.native
  sealed trait InsideDocElement
    extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.XmlCanonicalizerState
  
}

