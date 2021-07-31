package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageUtils {
  
  @JSImport("three", "ImageUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "ImageUtils.crossOrigin")
  @js.native
  def crossOrigin: String = js.native
  @scala.inline
  def crossOrigin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getDataURL(image: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def loadTexture(url: String): typings.three.textureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any]).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTexture(
    url: String,
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTexture(
    url: String,
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTexture(url: String, mapping: Unit, onLoad: Unit, onError: js.Function1[/* message */ String, Unit]): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTexture(url: String, mapping: typings.three.constantsMod.Mapping): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  
  @scala.inline
  def loadTextureCube(array: js.Array[String]): typings.three.textureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any]).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTextureCube(array: js.Array[String], mapping: typings.three.constantsMod.Mapping): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
  @scala.inline
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.three.textureMod.Texture]
}
