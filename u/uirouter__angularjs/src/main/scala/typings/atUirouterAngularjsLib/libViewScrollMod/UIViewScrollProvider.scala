package typings
package atUirouterAngularjsLib.libViewScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIViewScrollProvider extends js.Object {
  /**
    * Uses standard anchorScroll behavior
    *
    * Reverts [[$uiViewScroll]] back to using the core [`$anchorScroll`](http://docs.angularjs.org/api/ng.$anchorScroll)
    * service for scrolling based on the url anchor.
    */
  def useAnchorScroll(): scala.Unit
}

object UIViewScrollProvider {
  @scala.inline
  def apply(useAnchorScroll: js.Function0[scala.Unit]): UIViewScrollProvider = {
    val __obj = js.Dynamic.literal(useAnchorScroll = useAnchorScroll)
  
    __obj.asInstanceOf[UIViewScrollProvider]
  }
}

