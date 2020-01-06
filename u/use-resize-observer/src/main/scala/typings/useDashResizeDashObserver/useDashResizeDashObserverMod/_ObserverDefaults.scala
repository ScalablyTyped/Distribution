package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.react.reactMod.RefObject
import typings.std.HTMLElement
import typings.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`false`
import typings.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ObserverDefaults[TElement /* <: HTMLElement */] extends js.Object

object _ObserverDefaults {
  @scala.inline
  def DefaultsWithoutSize[TElement /* <: HTMLElement */](ref: RefObject[TElement] = null, useDefaults: `false` = null): _ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithHeightOnly[TElement /* <: HTMLElement */](defaultHeight: Double, ref: RefObject[TElement] = null, useDefaults: `true` = null): _ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(defaultHeight = defaultHeight.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithWidthOnly[TElement /* <: HTMLElement */](defaultWidth: Double, ref: RefObject[TElement] = null, useDefaults: `true` = null): _ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(defaultWidth = defaultWidth.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ObserverDefaults[TElement]]
  }
}

