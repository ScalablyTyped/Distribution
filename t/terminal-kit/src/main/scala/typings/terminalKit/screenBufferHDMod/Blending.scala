package typings.terminalKit.screenBufferHDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blending extends IsBlending {
  
  var blendSrcFgWithDstBg: Boolean = js.native
  
  def fn(src: Double, dst: Double): Double = js.native
  @JSName("fn")
  var fn_Original: BlendFunction = js.native
  
  var opacity: Double = js.native
}
