package typings.three

import typings.three.constantsMod.Mapping
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/ImageUtils", JSImport.Namespace)
@js.native
object imageUtilsMod extends js.Object {
  @js.native
  object ImageUtils extends js.Object {
    var crossOrigin: String = js.native
    def getDataURL(image: js.Any): String = js.native
    def loadTexture(url: String): Texture = js.native
    def loadTexture(url: String, mapping: Mapping): Texture = js.native
    def loadTexture(url: String, mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    def loadTexture(
      url: String,
      mapping: Mapping,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    def loadTextureCube(array: js.Array[String]): Texture = js.native
    def loadTextureCube(array: js.Array[String], mapping: Mapping): Texture = js.native
    def loadTextureCube(array: js.Array[String], mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    def loadTextureCube(
      array: js.Array[String],
      mapping: Mapping,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
  }
  
}

