package typings
package threeLib.threeDashDdsloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dds extends js.Object {
  var format: threeLib.threeDashCoreMod.CompressedPixelFormat
  var height: scala.Double
  var mipmapCount: scala.Double
  var mipmaps: js.Array[stdLib.ImageData]
  var width: scala.Double
}

object Dds {
  @scala.inline
  def apply(
    format: threeLib.threeDashCoreMod.CompressedPixelFormat,
    height: scala.Double,
    mipmapCount: scala.Double,
    mipmaps: js.Array[stdLib.ImageData],
    width: scala.Double
  ): Dds = {
    val __obj = js.Dynamic.literal(format = format, height = height, mipmapCount = mipmapCount, mipmaps = mipmaps, width = width)
  
    __obj.asInstanceOf[Dds]
  }
}

