package typings.winrtUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClosedCaptionEdgeEffect extends StObject
/** Specifies the edge effect of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect")
@js.native
object ClosedCaptionEdgeEffect extends StObject {
  
  /** The default edge effect. */
  @js.native
  sealed trait default
    extends StObject
       with ClosedCaptionEdgeEffect
  
  /** Depressed edge. */
  @js.native
  sealed trait depressed
    extends StObject
       with ClosedCaptionEdgeEffect
  
  /** Drop shadow. */
  @js.native
  sealed trait dropShadow
    extends StObject
       with ClosedCaptionEdgeEffect
  
  /** No edge effect. */
  @js.native
  sealed trait none
    extends StObject
       with ClosedCaptionEdgeEffect
  
  /** Raised edge. */
  @js.native
  sealed trait raised
    extends StObject
       with ClosedCaptionEdgeEffect
  
  /** Uniform edge */
  @js.native
  sealed trait uniform
    extends StObject
       with ClosedCaptionEdgeEffect
}
