package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ImageUtils")
@js.native
object ImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String): typings.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(url: String, mapping: typings.three.srcConstantsMod.Mapping): typings.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typings.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.srcTexturesTextureMod.Texture, Unit]
  ): typings.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typings.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String]): typings.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: typings.three.srcConstantsMod.Mapping): typings.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.srcTexturesTextureMod.Texture, Unit]
  ): typings.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.srcTexturesTextureMod.Texture = js.native
}

