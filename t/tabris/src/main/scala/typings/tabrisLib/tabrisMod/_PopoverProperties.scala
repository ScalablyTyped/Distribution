package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Popover
trait _PopoverProperties extends _NativeObjectProperties {
  /**
    * An anchor `Widget` the `Popover` should attach to. When the anchor is given the `Popover` is
    * positioned next to the anchor `Widget` and provides a visual indication of its relation. When omitted
    * the `Popover` is positioned centered on the screen.
    */
  var anchor: Widget
  /**
    * The height of the `Popover` when shown in windowed mode on large screen devices
    */
  var height: tabrisLib.dimension
  /**
    * The width of the `Popover` when shown in windowed mode on large screen devices.
    */
  var width: tabrisLib.dimension
}

object _PopoverProperties {
  @scala.inline
  def apply(anchor: Widget, height: tabrisLib.dimension, width: tabrisLib.dimension): _PopoverProperties = {
    val __obj = js.Dynamic.literal(anchor = anchor, height = height, width = width)
  
    __obj.asInstanceOf[_PopoverProperties]
  }
}

