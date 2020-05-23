package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a button is clicked.
  */
trait ButtonBarClickEvent extends ButtonBarBaseEvent {
  /**
    * Index of the clicked button.
    */
  var index: Double
}

object ButtonBarClickEvent {
  @scala.inline
  def apply(index: Double, source: ButtonBar): ButtonBarClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonBarClickEvent]
  }
}

