package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * D3 scale function shape. Don't want to introduce typing dependency to d3
   */

trait D3Scale extends js.Object {
  def copy(): js.Any
  def domain(): js.Any
  def range(): js.Any
}

