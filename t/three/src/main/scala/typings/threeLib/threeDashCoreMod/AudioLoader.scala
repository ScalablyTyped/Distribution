package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "AudioLoader")
@js.native
class AudioLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  def load(url: java.lang.String, onLoad: js.Function, onPrgress: js.Function, onError: js.Function): scala.Unit = js.native
}

