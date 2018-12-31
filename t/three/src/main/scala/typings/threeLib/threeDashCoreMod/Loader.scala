package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Loader")
@js.native
class Loader () extends js.Object {
  /**
    * default — null.
    * If set, assigns the crossOrigin attribute of the image to the value of crossOrigin, prior to starting the load.
    */
  var crossOrigin: java.lang.String = js.native
  def createMaterial(m: Material, texturePath: java.lang.String): scala.Boolean = js.native
  def createMaterial(m: Material, texturePath: java.lang.String, crossOrigin: java.lang.String): scala.Boolean = js.native
  /**
    * @deprecated Use THREE.LoaderUtils.extractUrlBase() instead.
    */
  def extractUrlBase(url: java.lang.String): java.lang.String = js.native
  def initMaterials(materials: js.Array[Material], texturePath: java.lang.String): js.Array[Material] = js.native
  /**
    * Will be called when load completes.
    * The default is a function with empty body.
    */
  def onLoadComplete(): scala.Unit = js.native
  /**
    * Will be called while load progresses.
    * The default is a function with empty body.
    */
  def onLoadProgress(): scala.Unit = js.native
  /**
    * Will be called when load starts.
    * The default is a function with empty body.
    */
  def onLoadStart(): scala.Unit = js.native
}

@JSImport("three/three-core", "Loader")
@js.native
object Loader extends js.Object {
  var Handlers: threeLib.threeDashCoreMod.LoaderHandler = js.native
}

