package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.Capture.AppCapture")
@js.native
abstract class AppCapture ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.AppCapture {
  
  /* unmapped type */
  /* CompleteClass */
  var addEventListener: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var isCapturingAudio: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var isCapturingVideo: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var oncapturingchanged: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var removeEventListener: Any = js.native
}
object AppCapture {
  
  @JSGlobal("Windows.Media.Capture.AppCapture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Windows.Media.Capture.AppCapture.getForCurrentView")
  @js.native
  def getForCurrentView: Any = js.native
  inline def getForCurrentView_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getForCurrentView")(x.asInstanceOf[js.Any])
}
