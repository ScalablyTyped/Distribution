package typings
package tetherLib.tetherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Tether constructor
@JSImport("tether", JSImport.Namespace)
@js.native
class namespaced protected () extends Tether {
  def this(options: tetherLib.tetherMod.TetherNs.ITetherOptions) = this()
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def disable(): scala.Unit = js.native
  /* CompleteClass */
  override def enable(): scala.Unit = js.native
  /* CompleteClass */
  override def position(): scala.Unit = js.native
  /* CompleteClass */
  override def setOptions(options: tetherLib.tetherMod.TetherNs.ITetherOptions): scala.Unit = js.native
}

/* static members */
@JSImport("tether", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def position(): scala.Unit = js.native
}

