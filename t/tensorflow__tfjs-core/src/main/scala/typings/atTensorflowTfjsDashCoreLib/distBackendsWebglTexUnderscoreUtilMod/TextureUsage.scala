package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureUsage extends js.Object

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/tex_util", "TextureUsage")
@js.native
object TextureUsage extends js.Object {
  @js.native
  sealed trait DOWNLOAD
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureUsage
  
  @js.native
  sealed trait PIXELS
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureUsage
  
  @js.native
  sealed trait RENDER
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureUsage
  
  @js.native
  sealed trait UPLOAD
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureUsage
  
  /* 3 */ val DOWNLOAD: DOWNLOAD with scala.Double = js.native
  /* 2 */ val PIXELS: PIXELS with scala.Double = js.native
  /* 0 */ val RENDER: RENDER with scala.Double = js.native
  /* 1 */ val UPLOAD: UPLOAD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.TextureUsage with scala.Double
  ] = js.native
}

