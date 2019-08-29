package typings.three.srcLoadersMaterialLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/MaterialLoader", "MaterialLoader")
@js.native
class MaterialLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  var textures: StringDictionary[Texture] = js.native
  def getTexture(name: String): Texture = js.native
  def load(url: String, onLoad: js.Function1[/* material */ Material, Unit]): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* material */ Material, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* material */ Material, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
  ): Unit = js.native
  def parse(json: js.Any): Material = js.native
  def setTextures(textures: StringDictionary[Texture]): Unit = js.native
}

