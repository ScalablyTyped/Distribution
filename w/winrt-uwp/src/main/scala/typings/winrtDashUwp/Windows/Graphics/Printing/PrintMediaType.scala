package typings.winrtDashUwp.Windows.Graphics.Printing

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
  
  /* 4 */ val archival: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.archival with Double = js.native
  /* 3 */ val autoSelect: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.autoSelect with Double = js.native
  /* 5 */ val backPrintFilm: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.backPrintFilm with Double = js.native
  /* 6 */ val bond: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.bond with Double = js.native
  /* 7 */ val cardStock: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.cardStock with Double = js.native
  /* 8 */ val continuous: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.continuous with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.default with Double = js.native
  /* 9 */ val envelopePlain: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.envelopePlain with Double = js.native
  /* 10 */ val envelopeWindow: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.envelopeWindow with Double = js.native
  /* 11 */ val fabric: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.fabric with Double = js.native
  /* 12 */ val highResolution: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.highResolution with Double = js.native
  /* 13 */ val label: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.label with Double = js.native
  /* 14 */ val multiLayerForm: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.multiLayerForm with Double = js.native
  /* 15 */ val multiPartForm: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.multiPartForm with Double = js.native
  /* 31 */ val none: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.notAvailable with Double = js.native
  /* 16 */ val photographic: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.photographic with Double = js.native
  /* 17 */ val photographicFilm: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.photographicFilm with Double = js.native
  /* 18 */ val photographicGlossy: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.photographicGlossy with Double = js.native
  /* 19 */ val photographicHighGloss: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.photographicHighGloss with Double = js.native
  /* 20 */ val photographicMatte: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.photographicMatte with Double = js.native
  /* 21 */ val photographicSatin: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.photographicSatin with Double = js.native
  /* 22 */ val photographicSemiGloss: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.photographicSemiGloss with Double = js.native
  /* 23 */ val plain: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.plain with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.printerCustom with Double = js.native
  /* 24 */ val screen: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.screen with Double = js.native
  /* 25 */ val screenPaged: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.screenPaged with Double = js.native
  /* 26 */ val stationery: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.stationery with Double = js.native
  /* 27 */ val tabStockFull: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.tabStockFull with Double = js.native
  /* 28 */ val tabStockPreCut: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.tabStockPreCut with Double = js.native
  /* 29 */ val transparency: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.transparency with Double = js.native
  /* 30 */ val tshirtTransfer: typings.winrtDashUwp.Windows.Graphics.Printing.PrintMediaType.tshirtTransfer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintMediaType with Double] = js.native
}

