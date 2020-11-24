package typings.toIco.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("to-ico", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Convert PNG to ICO in memory
    *
    * @param input Array of PNG image buffers.
    *
    * The images must have a size of `16x16`, `24x24`, `32x32`, `48x48`, `64x64`, `128x128` or `256x256` and they must
    * have an 8 bit per sample (channel) bit-depth (on Unix you can check this with the `file` command: RGB(A) is
    * supported, while [colormap](https://en.wikipedia.org/wiki/Indexed_color) is not, because it's 8 bits per pixel
    * instead of 8 bits per channel, which is 24 or 32 bits per pixel depending on the presence of the alpha channel).
    * These are limitations in the underlying [`pngjs`](https://github.com/lukeapage/pngjs#pngjs) library. If you have a
    * colormap PNG you can convert it to an RGB/RGBA PNG with commonly used image editing tools.
    */
  def apply(input: String): js.Promise[Buffer] = js.native
  def apply(input: String, options: ToIcoOptions): js.Promise[Buffer] = js.native
  def apply(input: js.Array[String | Buffer]): js.Promise[Buffer] = js.native
  def apply(input: js.Array[String | Buffer], options: ToIcoOptions): js.Promise[Buffer] = js.native
  def apply(input: Buffer): js.Promise[Buffer] = js.native
  def apply(input: Buffer, options: ToIcoOptions): js.Promise[Buffer] = js.native
}
