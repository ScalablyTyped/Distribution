package typings.tensorflowTfjsBackendWebgl.texUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureUsage extends js.Object
@JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "TextureUsage")
@js.native
object TextureUsage extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureUsage with Double] = js.native
  
  @js.native
  sealed trait DOWNLOAD extends TextureUsage
  /* 3 */ @js.native
  object DOWNLOAD extends TopLevel[DOWNLOAD with Double]
  
  @js.native
  sealed trait PIXELS extends TextureUsage
  /* 2 */ @js.native
  object PIXELS extends TopLevel[PIXELS with Double]
  
  @js.native
  sealed trait RENDER extends TextureUsage
  /* 0 */ @js.native
  object RENDER extends TopLevel[RENDER with Double]
  
  @js.native
  sealed trait UPLOAD extends TextureUsage
  /* 1 */ @js.native
  object UPLOAD extends TopLevel[UPLOAD with Double]
}
