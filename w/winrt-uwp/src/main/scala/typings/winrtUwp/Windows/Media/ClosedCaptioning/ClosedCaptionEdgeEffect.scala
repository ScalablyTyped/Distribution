package typings.winrtUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClosedCaptionEdgeEffect extends StObject
/** Specifies the edge effect of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect")
@js.native
object ClosedCaptionEdgeEffect extends StObject {
  
  /** The default edge effect. */
  @js.native
  sealed trait default extends ClosedCaptionEdgeEffect
  
  /** Depressed edge. */
  @js.native
  sealed trait depressed extends ClosedCaptionEdgeEffect
  
  /** Drop shadow. */
  @js.native
  sealed trait dropShadow extends ClosedCaptionEdgeEffect
  
  /** No edge effect. */
  @js.native
  sealed trait none extends ClosedCaptionEdgeEffect
  
  /** Raised edge. */
  @js.native
  sealed trait raised extends ClosedCaptionEdgeEffect
  
  /** Uniform edge */
  @js.native
  sealed trait uniform extends ClosedCaptionEdgeEffect
}
