package typings.wavesurferJs

import typings.std.HTMLElement
import typings.wavesurferJs.typesUtilMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilStyleMod {
  
  @JSImport("wavesurfer.js/src/util/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: HTMLElement */](el: T, styles: Styles): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[T]
}
