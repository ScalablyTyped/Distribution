package typings.three

import typings.three.constantsMod.Mapping
import typings.three.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @scala.inline
    def getDataURL(image: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def loadTexture(url: String): Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any]).asInstanceOf[Texture]
    @scala.inline
    def loadTexture(url: String, mapping: Unit, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTexture(
      url: String,
      mapping: Unit,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTexture(url: String, mapping: Unit, onLoad: Unit, onError: js.Function1[/* message */ String, Unit]): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTexture(url: String, mapping: Mapping): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTexture(url: String, mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTexture(
      url: String,
      mapping: Mapping,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTexture(url: String, mapping: Mapping, onLoad: Unit, onError: js.Function1[/* message */ String, Unit]): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
    
    @scala.inline
    def loadTextureCube(array: js.Array[String]): Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any]).asInstanceOf[Texture]
    @scala.inline
    def loadTextureCube(array: js.Array[String], mapping: Unit, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTextureCube(
      array: js.Array[String],
      mapping: Unit,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTextureCube(
      array: js.Array[String],
      mapping: Unit,
      onLoad: Unit,
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTextureCube(array: js.Array[String], mapping: Mapping): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTextureCube(array: js.Array[String], mapping: Mapping, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTextureCube(
      array: js.Array[String],
      mapping: Mapping,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
    @scala.inline
    def loadTextureCube(
      array: js.Array[String],
      mapping: Mapping,
      onLoad: Unit,
      onError: js.Function1[/* message */ String, Unit]
    ): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Texture]
  }
}
