package typings.atTensorflowTfjsDashNode.distImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageType extends js.Object

@JSImport("@tensorflow/tfjs-node/dist/image", "ImageType")
@js.native
object ImageType extends js.Object {
  @js.native
  sealed trait BMP extends ImageType
  
  @js.native
  sealed trait GIF extends ImageType
  
  @js.native
  sealed trait JPEG extends ImageType
  
  @js.native
  sealed trait PNG extends ImageType
  
  /* "BMP" */ val BMP: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.BMP with String = js.native
  /* "gif" */ val GIF: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.GIF with String = js.native
  /* "jpeg" */ val JPEG: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.JPEG with String = js.native
  /* "png" */ val PNG: typings.atTensorflowTfjsDashNode.distImageMod.ImageType.PNG with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageType with String] = js.native
}

