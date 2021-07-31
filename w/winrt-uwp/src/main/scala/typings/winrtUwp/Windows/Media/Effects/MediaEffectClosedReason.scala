package typings.winrtUwp.Windows.Media.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaEffectClosedReason extends StObject
/** Specifies the reason why a media effect was closed. */
@JSGlobal("Windows.Media.Effects.MediaEffectClosedReason")
@js.native
object MediaEffectClosedReason extends StObject {
  
  /** The operation is complete. */
  @js.native
  sealed trait done
    extends StObject
       with MediaEffectClosedReason
  
  /** The effect has been unloaded. */
  @js.native
  sealed trait effectCurrentlyUnloaded
    extends StObject
       with MediaEffectClosedReason
  
  /** An unknown error has occurred. */
  @js.native
  sealed trait unknownError
    extends StObject
       with MediaEffectClosedReason
  
  /** The media effect does not support the required encoding format. */
  @js.native
  sealed trait unsupportedEncodingFormat
    extends StObject
       with MediaEffectClosedReason
}
