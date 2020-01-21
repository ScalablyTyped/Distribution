package typings.three

import typings.three.polyfillsMod.TypedArray
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DataTexture3D", JSImport.Namespace)
@js.native
object dataTexture3DMod extends js.Object {
  @js.native
  class DataTexture3D protected () extends Texture {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
  }
  
}

