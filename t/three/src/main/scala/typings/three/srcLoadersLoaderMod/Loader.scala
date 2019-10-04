package typings.three.srcLoadersLoaderMod

import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/Loader", "Loader")
@js.native
class Loader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var crossOrigin: String = js.native
  var manager: LoadingManager = js.native
  var path: String = js.native
  var resourcePath: String = js.native
  /*
  	load(): void;
  	parse(): void;
  	*/
  def setCrossOrigin(crossOrigin: String): this.type = js.native
  def setPath(path: String): this.type = js.native
  def setResourcePath(resourcePath: String): this.type = js.native
}

