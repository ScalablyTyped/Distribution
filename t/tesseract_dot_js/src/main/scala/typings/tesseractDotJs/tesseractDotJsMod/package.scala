package typings.tesseractDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tesseractDotJsMod {
  import typings.node.Buffer
  import typings.std.Blob
  import typings.std.CanvasRenderingContext2D
  import typings.std.File
  import typings.std.HTMLCanvasElement
  import typings.std.HTMLImageElement
  import typings.std.HTMLVideoElement
  import typings.std.ImageData

  type ImageLike = String | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | CanvasRenderingContext2D | File | Blob | ImageData | Buffer
}
