package typings.winrtUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClosedCaptionOpacity extends StObject
/** Specifies the opacity of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionOpacity")
@js.native
object ClosedCaptionOpacity extends StObject {
  
  /** Default opacity. */
  @js.native
  sealed trait default extends ClosedCaptionOpacity
  
  /** 100% opaque. */
  @js.native
  sealed trait oneHundredPercent extends ClosedCaptionOpacity
  
  /** 75% opaque. */
  @js.native
  sealed trait seventyFivePercent extends ClosedCaptionOpacity
  
  /** 25% opaque. */
  @js.native
  sealed trait twentyFivePercent extends ClosedCaptionOpacity
  
  /** Completely transparent. */
  @js.native
  sealed trait zeroPercent extends ClosedCaptionOpacity
}
