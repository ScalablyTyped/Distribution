package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rendering site for an ILayout2.
  **/
trait ILayoutSite2 extends js.Object {
  //#region Properties
  /**
    * Gets the number of groups in the site.
    **/
  var groupCount: scala.Double
  /**
    * Gets the number of items in the site.
    **/
  var itemCount: winjsLib.WinJSNs.Promise[scala.Double]
  /**
    * Gets the pixel range of the realization area.
    **/
  var realizedRange: js.Any
  /**
    * Gets the tree for use by an object that implements the ILayout2 interface.
    **/
  var tree: js.Any
  /**
    * Gets the pixel range of visible items in the site.
    **/
  var visibleRange: js.Any
}

object ILayoutSite2 {
  @scala.inline
  def apply(
    groupCount: scala.Double,
    itemCount: winjsLib.WinJSNs.Promise[scala.Double],
    realizedRange: js.Any,
    tree: js.Any,
    visibleRange: js.Any
  ): ILayoutSite2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupCount")(groupCount)
    __obj.updateDynamic("itemCount")(itemCount)
    __obj.updateDynamic("realizedRange")(realizedRange)
    __obj.updateDynamic("tree")(tree)
    __obj.updateDynamic("visibleRange")(visibleRange)
    __obj.asInstanceOf[ILayoutSite2]
  }
}

