package typings.wavesurferJs

import typings.wavesurferJs.srcWavesurferMod.WaveSurfer
import typings.wavesurferJs.srcWavesurferMod.default
import typings.wavesurferJs.typesParamsMod.WaveSurferParams
import typings.wavesurferJs.typesUtilMod.WaveSurferUtil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("wavesurfer.js", JSImport.Namespace)
  @js.native
  open class ^ protected () extends default {
    def this(params: WaveSurferParams) = this()
  }
  @JSImport("wavesurfer.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wavesurfer.js", "VERSION")
  @js.native
  def VERSION: String = js.native
  inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  inline def create(params: WaveSurferParams): WaveSurfer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[WaveSurfer]
  
  @JSImport("wavesurfer.js", "util")
  @js.native
  def util: WaveSurferUtil = js.native
  inline def util_=(x: WaveSurferUtil): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("util")(x.asInstanceOf[js.Any])
}
