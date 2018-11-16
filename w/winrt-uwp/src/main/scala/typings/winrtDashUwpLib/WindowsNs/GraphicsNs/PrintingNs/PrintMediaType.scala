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
  
  val archival: archival with java.lang.String = js.native
  val autoSelect: autoSelect with java.lang.String = js.native
  val backPrintFilm: backPrintFilm with java.lang.String = js.native
  val bond: bond with java.lang.String = js.native
  val cardStock: cardStock with java.lang.String = js.native
  val continuous: continuous with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val envelopePlain: envelopePlain with java.lang.String = js.native
  val envelopeWindow: envelopeWindow with java.lang.String = js.native
  val fabric: fabric with java.lang.String = js.native
  val highResolution: highResolution with java.lang.String = js.native
  val label: label with java.lang.String = js.native
  val multiLayerForm: multiLayerForm with java.lang.String = js.native
  val multiPartForm: multiPartForm with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val photographic: photographic with java.lang.String = js.native
  val photographicFilm: photographicFilm with java.lang.String = js.native
  val photographicGlossy: photographicGlossy with java.lang.String = js.native
  val photographicHighGloss: photographicHighGloss with java.lang.String = js.native
  val photographicMatte: photographicMatte with java.lang.String = js.native
  val photographicSatin: photographicSatin with java.lang.String = js.native
  val photographicSemiGloss: photographicSemiGloss with java.lang.String = js.native
  val plain: plain with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val screen: screen with java.lang.String = js.native
  val screenPaged: screenPaged with java.lang.String = js.native
  val stationery: stationery with java.lang.String = js.native
  val tabStockFull: tabStockFull with java.lang.String = js.native
  val tabStockPreCut: tabStockPreCut with java.lang.String = js.native
  val transparency: transparency with java.lang.String = js.native
  val tshirtTransfer: tshirtTransfer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintMediaType with java.lang.String
  ] = js.native
}

