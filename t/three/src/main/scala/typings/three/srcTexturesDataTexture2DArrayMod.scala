package typings.three

import typings.three.srcPolyfillsMod.TypedArray
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DataTexture2DArray", JSImport.Namespace)
@js.native
object srcTexturesDataTexture2DArrayMod extends js.Object {
  @js.native
  class DataTexture2DArray protected () extends Texture {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
  }
  
}

