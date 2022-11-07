package typings.three.mod

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "CompressedArrayTexture")
@js.native
open class CompressedArrayTexture protected ()
  extends typings.three.srcThreeMod.CompressedArrayTexture {
  def this(mipmaps: js.Array[ImageData], width: Double, height: Double, depth: Double) = this()
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    depth: Double,
    format: typings.three.srcConstantsMod.CompressedPixelFormat
  ) = this()
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    depth: Double,
    format: Unit,
    `type`: typings.three.srcConstantsMod.TextureDataType
  ) = this()
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    depth: Double,
    format: typings.three.srcConstantsMod.CompressedPixelFormat,
    `type`: typings.three.srcConstantsMod.TextureDataType
  ) = this()
}
