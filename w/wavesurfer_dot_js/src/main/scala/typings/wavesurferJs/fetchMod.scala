package typings.wavesurferJs

import typings.wavesurferJs.utilMod.Observer
import typings.wavesurferJs.xhrMod.XHROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("wavesurfer.js/src/util/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: XHROptions): Observer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Observer]
}
