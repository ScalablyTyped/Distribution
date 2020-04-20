package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewContextEventMap extends ProxyEventMap {
  var peek: PreviewContextPeekEvent
  var pop: PreviewContextPopEvent
}

object PreviewContextEventMap {
  @scala.inline
  def apply(peek: PreviewContextPeekEvent, pop: PreviewContextPopEvent): PreviewContextEventMap = {
    val __obj = js.Dynamic.literal(peek = peek.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextEventMap]
  }
}

