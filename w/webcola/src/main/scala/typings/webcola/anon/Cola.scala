package typings.webcola.anon

import typings.webcola.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cola extends js.Object {
  var cola: Layout
  var powerGraph: js.Any
}

object Cola {
  @scala.inline
  def apply(cola: Layout, powerGraph: js.Any): Cola = {
    val __obj = js.Dynamic.literal(cola = cola.asInstanceOf[js.Any], powerGraph = powerGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cola]
  }
}

