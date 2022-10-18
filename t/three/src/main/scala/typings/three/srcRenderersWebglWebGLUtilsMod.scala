package typings.three

import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLUtilsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLUtils", "WebGLUtils")
  @js.native
  open class WebGLUtils protected () extends StObject {
    def this(gl: WebGL2RenderingContext, extensions: Any, capabilities: Any) = this()
    def this(gl: WebGLRenderingContext, extensions: Any, capabilities: Any) = this()
    
    def convert(p: CompressedPixelFormat): Double | Null = js.native
    def convert(p: CompressedPixelFormat, encoding: TextureEncoding): Double | Null = js.native
    def convert(p: PixelFormat): Double | Null = js.native
    def convert(p: PixelFormat, encoding: TextureEncoding): Double | Null = js.native
    def convert(p: TextureDataType): Double | Null = js.native
    def convert(p: TextureDataType, encoding: TextureEncoding): Double | Null = js.native
  }
}
