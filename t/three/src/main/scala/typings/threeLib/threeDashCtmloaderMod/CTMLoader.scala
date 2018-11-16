package typings
package threeLib.threeDashCtmloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-ctmloader", "CTMLoader")
@js.native
class CTMLoader ()
  extends threeLib.threeDashCoreMod.Loader {
  /**
       * create buffergeometry by ctm file.
       * @param file(required)
       * @param callback(required)
       */
  def createModel(file: java.lang.String, callback: js.Function0[_]): js.Any = js.native
  /**
       * Load CTMLoader compressed models
       * @param url(required)
       * @param callback(required)
       * @param parameters
       */
  def load(url: java.lang.String, callback: js.Function1[/* geo */ js.Any, _]): js.Any = js.native
  /**
       * Load CTMLoader compressed models
       * @param url(required)
       * @param callback(required)
       * @param parameters
       */
  def load(url: java.lang.String, callback: js.Function1[/* geo */ js.Any, _], parameters: js.Any): js.Any = js.native
  /**
       * load multiple CTM parts defined in JSON.
       * @param url(required)
       * @param callback(required)
       * @param parameters
       */
  def loadParts(url: java.lang.String, callback: js.Function0[_]): js.Any = js.native
  /**
       * load multiple CTM parts defined in JSON.
       * @param url(required)
       * @param callback(required)
       * @param parameters
       */
  def loadParts(url: java.lang.String, callback: js.Function0[_], parameters: js.Any): js.Any = js.native
}

