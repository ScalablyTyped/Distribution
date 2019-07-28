package typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureUsage extends js.Object

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/tex_util", "TextureUsage")
@js.native
object TextureUsage extends js.Object {
  @js.native
  sealed trait DOWNLOAD extends TextureUsage
  
  @js.native
  sealed trait PIXELS extends TextureUsage
  
  @js.native
  sealed trait RENDER extends TextureUsage
  
  @js.native
  sealed trait UPLOAD extends TextureUsage
  
  /* 3 */ val DOWNLOAD: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.TextureUsage.DOWNLOAD with Double = js.native
  /* 2 */ val PIXELS: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.TextureUsage.PIXELS with Double = js.native
  /* 0 */ val RENDER: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.TextureUsage.RENDER with Double = js.native
  /* 1 */ val UPLOAD: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.TextureUsage.UPLOAD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureUsage with Double] = js.native
}

