package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarOptions extends js.Object {
  /**
    * 	Scrollbar draggable element CSS class
    *
    * @default 'swiper-scrollbar-drag'
    */
  var dragClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Size of scrollbar draggable element in px
    *
    * @default 'auto'
    */
  var dragSize: js.UndefOr[swiperLib.swiperLibStrings.auto | scala.Double] = js.undefined
  /**
    * Set to true to enable make scrollbar draggable that allows you to control slider position
    *
    * @default true
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String with CSS selector or HTML element of the container with scrollbar.
    */
  var el: SelectableElement
  /**
    * Hide scrollbar automatically after user interaction
    *
    * @default true
    */
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Scrollbar element additional CSS class when it is disabled
    *
    * @default 'swiper-scrollbar-lock'
    */
  var lockClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set to true to snap slider position to slides when you release scrollbar
    *
    * @default false
    */
  var snapOnRelease: js.UndefOr[scala.Boolean] = js.undefined
}

object ScrollbarOptions {
  @scala.inline
  def apply(
    el: SelectableElement,
    dragClass: java.lang.String = null,
    dragSize: swiperLib.swiperLibStrings.auto | scala.Double = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    lockClass: java.lang.String = null,
    snapOnRelease: js.UndefOr[scala.Boolean] = js.undefined
  ): ScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass)
    if (dragSize != null) __obj.updateDynamic("dragSize")(dragSize.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (lockClass != null) __obj.updateDynamic("lockClass")(lockClass)
    if (!js.isUndefined(snapOnRelease)) __obj.updateDynamic("snapOnRelease")(snapOnRelease)
    __obj.asInstanceOf[ScrollbarOptions]
  }
}

