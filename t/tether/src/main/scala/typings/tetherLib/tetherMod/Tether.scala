package typings
package tetherLib.tetherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Tether constructor
trait Tether extends js.Object {
  def destroy(): scala.Unit
  def disable(): scala.Unit
  def enable(): scala.Unit
  def position(): scala.Unit
  def setOptions(options: tetherLib.tetherMod.TetherNs.ITetherOptions): scala.Unit
}

