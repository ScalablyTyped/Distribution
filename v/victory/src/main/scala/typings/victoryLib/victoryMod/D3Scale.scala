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

object D3Scale {
  @scala.inline
  def apply(copy: js.Function0[js.Any], domain: js.Function0[js.Any], range: js.Function0[js.Any]): D3Scale = {
    val __obj = js.Dynamic.literal(copy = copy, domain = domain, range = range)
  
    __obj.asInstanceOf[D3Scale]
  }
}

