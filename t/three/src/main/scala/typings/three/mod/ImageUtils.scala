package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSImport("three", "ImageUtils.getDataURL")
  @js.native
  def getDataURL(image: js.Any): String = js.native
  
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(url: String): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(
    url: String,
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(url: String, mapping: typings.three.constantsMod.Mapping): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTexture")
  @js.native
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(array: js.Array[String]): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: js.UndefOr[scala.Nothing],
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(array: js.Array[String], mapping: typings.three.constantsMod.Mapping): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = js.native
  @JSImport("three", "ImageUtils.loadTextureCube")
  @js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
}
