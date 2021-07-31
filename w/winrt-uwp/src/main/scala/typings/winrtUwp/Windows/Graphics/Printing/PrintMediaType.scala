package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintMediaType extends StObject
/** Specifies the media types for the printed output. */
@JSGlobal("Windows.Graphics.Printing.PrintMediaType")
@js.native
object PrintMediaType extends StObject {
  
  /** The default media type for the printed output. */
  @js.native
  sealed trait default
    extends StObject
       with PrintMediaType
  
  /** The Archival media type. */
  @js.native
  sealed trait archival
    extends StObject
       with PrintMediaType
  
  /** The option to auto select a media type. */
  @js.native
  sealed trait autoSelect
    extends StObject
       with PrintMediaType
  
  /** The BackPrintFilm media type. */
  @js.native
  sealed trait backPrintFilm
    extends StObject
       with PrintMediaType
  
  /** The Bond media type. */
  @js.native
  sealed trait bond
    extends StObject
       with PrintMediaType
  
  /** The CardStock media type. */
  @js.native
  sealed trait cardStock
    extends StObject
       with PrintMediaType
  
  /** The Continous media type. */
  @js.native
  sealed trait continuous
    extends StObject
       with PrintMediaType
  
  /** The EnvelopePlain media type. */
  @js.native
  sealed trait envelopePlain
    extends StObject
       with PrintMediaType
  
  /** The EnvelopeWindow media type. */
  @js.native
  sealed trait envelopeWindow
    extends StObject
       with PrintMediaType
  
  /** The Fabric media type. */
  @js.native
  sealed trait fabric
    extends StObject
       with PrintMediaType
  
  /** The HighResolution media type. */
  @js.native
  sealed trait highResolution
    extends StObject
       with PrintMediaType
  
  /** The Label media type. */
  @js.native
  sealed trait label
    extends StObject
       with PrintMediaType
  
  /** The MultiLayerForm media type. */
  @js.native
  sealed trait multiLayerForm
    extends StObject
       with PrintMediaType
  
  /** The MultiPartForm media type. */
  @js.native
  sealed trait multiPartForm
    extends StObject
       with PrintMediaType
  
  /** The option to indicate that a media type has not been selected. */
  @js.native
  sealed trait none
    extends StObject
       with PrintMediaType
  
  /** A media type that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintMediaType
  
  /** The Photographic media type. */
  @js.native
  sealed trait photographic
    extends StObject
       with PrintMediaType
  
  /** The PhotographicFilm media type. */
  @js.native
  sealed trait photographicFilm
    extends StObject
       with PrintMediaType
  
  /** The PhotographicGlossy media type. */
  @js.native
  sealed trait photographicGlossy
    extends StObject
       with PrintMediaType
  
  /** The PhotographicHighGloss media type. */
  @js.native
  sealed trait photographicHighGloss
    extends StObject
       with PrintMediaType
  
  /** The PhotographicMatte media type. */
  @js.native
  sealed trait photographicMatte
    extends StObject
       with PrintMediaType
  
  /** The PhotographicSatin media type. */
  @js.native
  sealed trait photographicSatin
    extends StObject
       with PrintMediaType
  
  /** The PhotographicSemiGloss media type. */
  @js.native
  sealed trait photographicSemiGloss
    extends StObject
       with PrintMediaType
  
  /** The Plain media type. */
  @js.native
  sealed trait plain
    extends StObject
       with PrintMediaType
  
  /** A custom media type that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintMediaType
  
  /** The Screen media type. */
  @js.native
  sealed trait screen
    extends StObject
       with PrintMediaType
  
  /** The ScreenPaged media type. */
  @js.native
  sealed trait screenPaged
    extends StObject
       with PrintMediaType
  
  /** The Stationery media type. */
  @js.native
  sealed trait stationery
    extends StObject
       with PrintMediaType
  
  /** The TabStockFull media type. */
  @js.native
  sealed trait tabStockFull
    extends StObject
       with PrintMediaType
  
  /** The TabStockPreCut media type. */
  @js.native
  sealed trait tabStockPreCut
    extends StObject
       with PrintMediaType
  
  /** The Transparency media type. */
  @js.native
  sealed trait transparency
    extends StObject
       with PrintMediaType
  
  /** The TShirtTransfer media type. */
  @js.native
  sealed trait tshirtTransfer
    extends StObject
       with PrintMediaType
}
