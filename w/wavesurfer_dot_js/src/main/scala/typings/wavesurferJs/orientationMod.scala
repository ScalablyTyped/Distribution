package typings.wavesurferJs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orientationMod {
  
  @JSImport("wavesurfer.js/src/util/orientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: HTMLElement, vertical: Boolean): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
