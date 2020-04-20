package typings.webcola

import typings.webcola.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCola extends js.Object {
  var cola: Layout
  var powerGraph: js.Any
}

object AnonCola {
  @scala.inline
  def apply(cola: Layout, powerGraph: js.Any): AnonCola = {
    val __obj = js.Dynamic.literal(cola = cola.asInstanceOf[js.Any], powerGraph = powerGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCola]
  }
}

