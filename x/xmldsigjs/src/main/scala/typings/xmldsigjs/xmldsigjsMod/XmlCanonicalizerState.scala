package typings.xmldsigjs.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XmlCanonicalizerState extends js.Object

@JSImport("xmldsigjs", "XmlCanonicalizerState")
@js.native
object XmlCanonicalizerState extends js.Object {
  @js.native
  sealed trait AfterDocElement extends XmlCanonicalizerState
  
  @js.native
  sealed trait BeforeDocElement extends XmlCanonicalizerState
  
  @js.native
  sealed trait InsideDocElement extends XmlCanonicalizerState
  
  /* 2 */ val AfterDocElement: typings.xmldsigjs.xmldsigjsMod.XmlCanonicalizerState.AfterDocElement with Double = js.native
  /* 0 */ val BeforeDocElement: typings.xmldsigjs.xmldsigjsMod.XmlCanonicalizerState.BeforeDocElement with Double = js.native
  /* 1 */ val InsideDocElement: typings.xmldsigjs.xmldsigjsMod.XmlCanonicalizerState.InsideDocElement with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XmlCanonicalizerState with Double] = js.native
}

