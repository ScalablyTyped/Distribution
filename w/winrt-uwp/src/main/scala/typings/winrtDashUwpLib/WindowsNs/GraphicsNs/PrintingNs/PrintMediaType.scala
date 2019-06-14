package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

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
  sealed trait archival
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The option to auto select a media type. */
  @js.native
  sealed trait autoSelect
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The BackPrintFilm media type. */
  @js.native
  sealed trait backPrintFilm
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Bond media type. */
  @js.native
  sealed trait bond
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The CardStock media type. */
  @js.native
  sealed trait cardStock
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Continous media type. */
  @js.native
  sealed trait continuous
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The default media type for the printed output. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The EnvelopePlain media type. */
  @js.native
  sealed trait envelopePlain
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The EnvelopeWindow media type. */
  @js.native
  sealed trait envelopeWindow
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Fabric media type. */
  @js.native
  sealed trait fabric
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The HighResolution media type. */
  @js.native
  sealed trait highResolution
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Label media type. */
  @js.native
  sealed trait label
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The MultiLayerForm media type. */
  @js.native
  sealed trait multiLayerForm
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The MultiPartForm media type. */
  @js.native
  sealed trait multiPartForm
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The option to indicate that a media type has not been selected. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** A media type that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Photographic media type. */
  @js.native
  sealed trait photographic
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The PhotographicFilm media type. */
  @js.native
  sealed trait photographicFilm
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The PhotographicGlossy media type. */
  @js.native
  sealed trait photographicGlossy
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The PhotographicHighGloss media type. */
  @js.native
  sealed trait photographicHighGloss
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The PhotographicMatte media type. */
  @js.native
  sealed trait photographicMatte
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The PhotographicSatin media type. */
  @js.native
  sealed trait photographicSatin
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The PhotographicSemiGloss media type. */
  @js.native
  sealed trait photographicSemiGloss
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Plain media type. */
  @js.native
  sealed trait plain
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** A custom media type that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Screen media type. */
  @js.native
  sealed trait screen
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The ScreenPaged media type. */
  @js.native
  sealed trait screenPaged
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Stationery media type. */
  @js.native
  sealed trait stationery
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The TabStockFull media type. */
  @js.native
  sealed trait tabStockFull
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The TabStockPreCut media type. */
  @js.native
  sealed trait tabStockPreCut
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The Transparency media type. */
  @js.native
  sealed trait transparency
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /** The TShirtTransfer media type. */
  @js.native
  sealed trait tshirtTransfer
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType
  
  /* 4 */ val archival: archival with scala.Double = js.native
  /* 3 */ val autoSelect: autoSelect with scala.Double = js.native
  /* 5 */ val backPrintFilm: backPrintFilm with scala.Double = js.native
  /* 6 */ val bond: bond with scala.Double = js.native
  /* 7 */ val cardStock: cardStock with scala.Double = js.native
  /* 8 */ val continuous: continuous with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 9 */ val envelopePlain: envelopePlain with scala.Double = js.native
  /* 10 */ val envelopeWindow: envelopeWindow with scala.Double = js.native
  /* 11 */ val fabric: fabric with scala.Double = js.native
  /* 12 */ val highResolution: highResolution with scala.Double = js.native
  /* 13 */ val label: label with scala.Double = js.native
  /* 14 */ val multiLayerForm: multiLayerForm with scala.Double = js.native
  /* 15 */ val multiPartForm: multiPartForm with scala.Double = js.native
  /* 31 */ val none: none with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 16 */ val photographic: photographic with scala.Double = js.native
  /* 17 */ val photographicFilm: photographicFilm with scala.Double = js.native
  /* 18 */ val photographicGlossy: photographicGlossy with scala.Double = js.native
  /* 19 */ val photographicHighGloss: photographicHighGloss with scala.Double = js.native
  /* 20 */ val photographicMatte: photographicMatte with scala.Double = js.native
  /* 21 */ val photographicSatin: photographicSatin with scala.Double = js.native
  /* 22 */ val photographicSemiGloss: photographicSemiGloss with scala.Double = js.native
  /* 23 */ val plain: plain with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 24 */ val screen: screen with scala.Double = js.native
  /* 25 */ val screenPaged: screenPaged with scala.Double = js.native
  /* 26 */ val stationery: stationery with scala.Double = js.native
  /* 27 */ val tabStockFull: tabStockFull with scala.Double = js.native
  /* 28 */ val tabStockPreCut: tabStockPreCut with scala.Double = js.native
  /* 29 */ val transparency: transparency with scala.Double = js.native
  /* 30 */ val tshirtTransfer: tshirtTransfer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType with scala.Double] = js.native
}

