package typings.winrt.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.VideoEffects")
@js.native
class VideoEffects ()
  extends StObject
     with typings.winrt.Windows.Media.VideoEffects
/* static members */
object VideoEffects {
  
  @JSGlobal("Windows.Media.VideoEffects")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Windows.Media.VideoEffects.videoStabilization")
  @js.native
  def videoStabilization: String = js.native
  inline def videoStabilization_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videoStabilization")(x.asInstanceOf[js.Any])
}
