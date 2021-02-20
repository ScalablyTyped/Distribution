package typings.three

import typings.three.constantsMod.Mapping
import typings.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageUtilsMod {
  
  object ImageUtils {
    
    @JSImport("three/src/extras/ImageUtils", "ImageUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.crossOrigin")
    @js.native
    def crossOrigin: String = js.native
    @scala.inline
    def crossOrigin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.getDataURL")
    @js.native
    def getDataURL(image: js.Any): String = js.native
    
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(url: String): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(
      url: String,
      mapping: js.UndefOr[scala.Nothing],
      onLoad: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(url: String, mapping: js.UndefOr[scala.Nothing], onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(
      url: String,
      mapping: js.UndefOr[scala.Nothing],
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(url: String, mapping: Mapping): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(
      url: String,
      mapping: Mapping,
      onLoad: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(url: String, mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTexture")
    @js.native
    def loadTexture(
      url: String,
      mapping: Mapping,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(array: js.Array[String]): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(
      array: js.Array[String],
      mapping: js.UndefOr[scala.Nothing],
      onLoad: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(
      array: js.Array[String],
      mapping: js.UndefOr[scala.Nothing],
      onLoad: js.Function1[/* texture */ Texture, Unit]
    ): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(
      array: js.Array[String],
      mapping: js.UndefOr[scala.Nothing],
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(array: js.Array[String], mapping: Mapping): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(
      array: js.Array[String],
      mapping: Mapping,
      onLoad: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(array: js.Array[String], mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    @JSImport("three/src/extras/ImageUtils", "ImageUtils.loadTextureCube")
    @js.native
    def loadTextureCube(
      array: js.Array[String],
      mapping: Mapping,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = js.native
  }
}
