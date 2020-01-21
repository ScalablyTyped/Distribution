package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintMediaType extends js.Object

/** Specifies the media types for the printed output. */
@JSGlobal("Windows.Graphics.Printing.PrintMediaType")
@js.native
object PrintMediaType extends js.Object {
  /** The Archival media type. */
  @js.native
  sealed trait archival extends PrintMediaType
  
  /** The option to auto select a media type. */
  @js.native
  sealed trait autoSelect extends PrintMediaType
  
  /** The BackPrintFilm media type. */
  @js.native
  sealed trait backPrintFilm extends PrintMediaType
  
  /** The Bond media type. */
  @js.native
  sealed trait bond extends PrintMediaType
  
  /** The CardStock media type. */
  @js.native
  sealed trait cardStock extends PrintMediaType
  
  /** The Continous media type. */
  @js.native
  sealed trait continuous extends PrintMediaType
  
  /** The default media type for the printed output. */
  @js.native
  sealed trait default extends PrintMediaType
  
  /** The EnvelopePlain media type. */
  @js.native
  sealed trait envelopePlain extends PrintMediaType
  
  /** The EnvelopeWindow media type. */
  @js.native
  sealed trait envelopeWindow extends PrintMediaType
  
  /** The Fabric media type. */
  @js.native
  sealed trait fabric extends PrintMediaType
  
  /** The HighResolution media type. */
  @js.native
  sealed trait highResolution extends PrintMediaType
  
  /** The Label media type. */
  @js.native
  sealed trait label extends PrintMediaType
  
  /** The MultiLayerForm media type. */
  @js.native
  sealed trait multiLayerForm extends PrintMediaType
  
  /** The MultiPartForm media type. */
  @js.native
  sealed trait multiPartForm extends PrintMediaType
  
  /** The option to indicate that a media type has not been selected. */
  @js.native
  sealed trait none extends PrintMediaType
  
  /** A media type that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable extends PrintMediaType
  
  /** The Photographic media type. */
  @js.native
  sealed trait photographic extends PrintMediaType
  
  /** The PhotographicFilm media type. */
  @js.native
  sealed trait photographicFilm extends PrintMediaType
  
  /** The PhotographicGlossy media type. */
  @js.native
  sealed trait photographicGlossy extends PrintMediaType
  
  /** The PhotographicHighGloss media type. */
  @js.native
  sealed trait photographicHighGloss extends PrintMediaType
  
  /** The PhotographicMatte media type. */
  @js.native
  sealed trait photographicMatte extends PrintMediaType
  
  /** The PhotographicSatin media type. */
  @js.native
  sealed trait photographicSatin extends PrintMediaType
  
  /** The PhotographicSemiGloss media type. */
  @js.native
  sealed trait photographicSemiGloss extends PrintMediaType
  
  /** The Plain media type. */
  @js.native
  sealed trait plain extends PrintMediaType
  
  /** A custom media type that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintMediaType
  
  /** The Screen media type. */
  @js.native
  sealed trait screen extends PrintMediaType
  
  /** The ScreenPaged media type. */
  @js.native
  sealed trait screenPaged extends PrintMediaType
  
  /** The Stationery media type. */
  @js.native
  sealed trait stationery extends PrintMediaType
  
  /** The TabStockFull media type. */
  @js.native
  sealed trait tabStockFull extends PrintMediaType
  
  /** The TabStockPreCut media type. */
  @js.native
  sealed trait tabStockPreCut extends PrintMediaType
  
  /** The Transparency media type. */
  @js.native
  sealed trait transparency extends PrintMediaType
  
  /** The TShirtTransfer media type. */
  @js.native
  sealed trait tshirtTransfer extends PrintMediaType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintMediaType with Double] = js.native
  /* 4 */ @js.native
  object archival extends TopLevel[archival with Double]
  
  /* 3 */ @js.native
  object autoSelect extends TopLevel[autoSelect with Double]
  
  /* 5 */ @js.native
  object backPrintFilm extends TopLevel[backPrintFilm with Double]
  
  /* 6 */ @js.native
  object bond extends TopLevel[bond with Double]
  
  /* 7 */ @js.native
  object cardStock extends TopLevel[cardStock with Double]
  
  /* 8 */ @js.native
  object continuous extends TopLevel[continuous with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 9 */ @js.native
  object envelopePlain extends TopLevel[envelopePlain with Double]
  
  /* 10 */ @js.native
  object envelopeWindow extends TopLevel[envelopeWindow with Double]
  
  /* 11 */ @js.native
  object fabric extends TopLevel[fabric with Double]
  
  /* 12 */ @js.native
  object highResolution extends TopLevel[highResolution with Double]
  
  /* 13 */ @js.native
  object label extends TopLevel[label with Double]
  
  /* 14 */ @js.native
  object multiLayerForm extends TopLevel[multiLayerForm with Double]
  
  /* 15 */ @js.native
  object multiPartForm extends TopLevel[multiPartForm with Double]
  
  /* 31 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 16 */ @js.native
  object photographic extends TopLevel[photographic with Double]
  
  /* 17 */ @js.native
  object photographicFilm extends TopLevel[photographicFilm with Double]
  
  /* 18 */ @js.native
  object photographicGlossy extends TopLevel[photographicGlossy with Double]
  
  /* 19 */ @js.native
  object photographicHighGloss extends TopLevel[photographicHighGloss with Double]
  
  /* 20 */ @js.native
  object photographicMatte extends TopLevel[photographicMatte with Double]
  
  /* 21 */ @js.native
  object photographicSatin extends TopLevel[photographicSatin with Double]
  
  /* 22 */ @js.native
  object photographicSemiGloss extends TopLevel[photographicSemiGloss with Double]
  
  /* 23 */ @js.native
  object plain extends TopLevel[plain with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 24 */ @js.native
  object screen extends TopLevel[screen with Double]
  
  /* 25 */ @js.native
  object screenPaged extends TopLevel[screenPaged with Double]
  
  /* 26 */ @js.native
  object stationery extends TopLevel[stationery with Double]
  
  /* 27 */ @js.native
  object tabStockFull extends TopLevel[tabStockFull with Double]
  
  /* 28 */ @js.native
  object tabStockPreCut extends TopLevel[tabStockPreCut with Double]
  
  /* 29 */ @js.native
  object transparency extends TopLevel[transparency with Double]
  
  /* 30 */ @js.native
  object tshirtTransfer extends TopLevel[tshirtTransfer with Double]
  
}

