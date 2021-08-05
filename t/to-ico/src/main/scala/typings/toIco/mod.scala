package typings.toIco

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(input: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def apply(input: String, options: ToIcoOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def apply(input: js.Array[String | Buffer]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def apply(input: js.Array[String | Buffer], options: ToIcoOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def apply(input: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def apply(input: Buffer, options: ToIcoOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("to-ico", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ToIcoOptions extends StObject {
    
    /**
      * Use the largest image and resize to sizes defined using the [sizes](#sizes) option.
      *
      * @default false
      */
    var resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of sizes to use when resizing.
      *
      * @default [16, 24, 32, 48, 64, 128, 256]
      */
    var sizes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ToIcoOptions {
    
    inline def apply(): ToIcoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToIcoOptions]
    }
    
    extension [Self <: ToIcoOptions](x: Self) {
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    }
  }
}
