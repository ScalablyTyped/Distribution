package typings.winrtUwp.Windows.Graphics.Printing

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
  
}

