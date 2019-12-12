package typings.xmldsigjs.xmldsigjsMod

import org.scalablytyped.runtime.TopLevel
import typings.xmldsigjs.xmldsigjsMod.XmlCanonicalizerState.AfterDocElement
import typings.xmldsigjs.xmldsigjsMod.XmlCanonicalizerState.BeforeDocElement
import typings.xmldsigjs.xmldsigjsMod.XmlCanonicalizerState.InsideDocElement
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XmlCanonicalizerState with Double] = js.native
  /* 2 */ @js.native
  object AfterDocElement extends TopLevel[AfterDocElement with Double]
  
  /* 0 */ @js.native
  object BeforeDocElement extends TopLevel[BeforeDocElement with Double]
  
  /* 1 */ @js.native
  object InsideDocElement extends TopLevel[InsideDocElement with Double]
  
}

