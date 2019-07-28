package typings.three.srcLoadersLoaderMod

import typings.three.srcLoadersFileLoaderMod.LoaderHandler
import typings.three.srcMaterialsMaterialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/Loader", "Loader")
@js.native
class Loader () extends js.Object {
  /**
  	 * default — null.
  	 * If set, assigns the crossOrigin attribute of the image to the value of crossOrigin, prior to starting the load.
  	 */
  var crossOrigin: String = js.native
  def createMaterial(m: Material, texturePath: String): Boolean = js.native
  def createMaterial(m: Material, texturePath: String, crossOrigin: String): Boolean = js.native
  /**
  	 * @deprecated Use THREE.LoaderUtils.extractUrlBase() instead.
  	 */
  def extractUrlBase(url: String): String = js.native
  def initMaterials(materials: js.Array[Material], texturePath: String): js.Array[Material] = js.native
  /**
  	 * Will be called when load completes.
  	 * The default is a function with empty body.
  	 */
  def onLoadComplete(): Unit = js.native
  /**
  	 * Will be called while load progresses.
  	 * The default is a function with empty body.
  	 */
  def onLoadProgress(): Unit = js.native
  /**
  	 * Will be called when load starts.
  	 * The default is a function with empty body.
  	 */
  def onLoadStart(): Unit = js.native
}

/* static members */
@JSImport("three/src/loaders/Loader", "Loader")
@js.native
object Loader extends js.Object {
  var Handlers: LoaderHandler = js.native
}

