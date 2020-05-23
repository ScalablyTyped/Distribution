package typings.swiper.mod

import typings.swiper.swiperStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarOptions extends js.Object {
  /**
    *     Scrollbar draggable element CSS class
    *
    * @default 'swiper-scrollbar-drag'
    */
  var dragClass: js.UndefOr[String] = js.undefined
  /**
    * Size of scrollbar draggable element in px
    *
    * @default 'auto'
    */
  var dragSize: js.UndefOr[auto | Double] = js.undefined
  /**
    * Set to true to enable make scrollbar draggable that allows you to control slider position
    *
    * @default true
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * String with CSS selector or HTML element of the container with scrollbar.
    */
  var el: SelectableElement
  /**
    * Hide scrollbar automatically after user interaction
    *
    * @default true
    */
  var hide: js.UndefOr[Boolean] = js.undefined
  /**
    * Scrollbar element additional CSS class when it is disabled
    *
    * @default 'swiper-scrollbar-lock'
    */
  var lockClass: js.UndefOr[String] = js.undefined
  /**
    * Set to true to snap slider position to slides when you release scrollbar
    *
    * @default false
    */
  var snapOnRelease: js.UndefOr[Boolean] = js.undefined
}

object ScrollbarOptions {
  @scala.inline
  def apply(
    el: SelectableElement,
    dragClass: String = null,
    dragSize: auto | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hide: js.UndefOr[Boolean] = js.undefined,
    lockClass: String = null,
    snapOnRelease: js.UndefOr[Boolean] = js.undefined
  ): ScrollbarOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (dragSize != null) __obj.updateDynamic("dragSize")(dragSize.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (lockClass != null) __obj.updateDynamic("lockClass")(lockClass.asInstanceOf[js.Any])
    if (!js.isUndefined(snapOnRelease)) __obj.updateDynamic("snapOnRelease")(snapOnRelease.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
}

