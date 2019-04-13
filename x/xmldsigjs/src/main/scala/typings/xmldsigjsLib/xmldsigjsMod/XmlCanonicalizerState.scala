package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XmlCanonicalizerState extends js.Object

@JSImport("xmldsigjs", "XmlCanonicalizerState")
@js.native
object XmlCanonicalizerState extends js.Object {
  @js.native
  sealed trait AfterDocElement
    extends xmldsigjsLib.xmldsigjsMod.XmlCanonicalizerState
  
  @js.native
  sealed trait BeforeDocElement
    extends xmldsigjsLib.xmldsigjsMod.XmlCanonicalizerState
  
  @js.native
  sealed trait InsideDocElement
    extends xmldsigjsLib.xmldsigjsMod.XmlCanonicalizerState
  
  /* 2 */ val AfterDocElement: AfterDocElement with scala.Double = js.native
  /* 0 */ val BeforeDocElement: BeforeDocElement with scala.Double = js.native
  /* 1 */ val InsideDocElement: InsideDocElement with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xmldsigjsLib.xmldsigjsMod.XmlCanonicalizerState with scala.Double] = js.native
}

