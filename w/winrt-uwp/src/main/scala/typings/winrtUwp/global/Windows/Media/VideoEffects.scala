package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides video-related effects. */
/* note: abstract class */ @JSGlobal("Windows.Media.VideoEffects")
@js.native
open class VideoEffects ()
  extends StObject
     with typings.winrtUwp.Windows.Media.VideoEffects
object VideoEffects {
  
  @JSGlobal("Windows.Media.VideoEffects")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a video stabilization effect which can be used on a video object to reduce the shakiness in the video. */
  /* static member */
  @JSGlobal("Windows.Media.VideoEffects.videoStabilization")
  @js.native
  def videoStabilization: String = js.native
  inline def videoStabilization_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videoStabilization")(x.asInstanceOf[js.Any])
}
