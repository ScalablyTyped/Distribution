package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  /**
    * CSS class name of currently active pagination bullet
    */
  var bulletActiveClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS class name of single pagination bullet
    */
  var bulletClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines which HTML tag will be use to represent single pagination bullet. Only for bullets pagination type.
    */
  var bulletElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true then clicking on pagination button will cause transition to appropriate slide. Only for bullets pagination type
    */
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * CSS class name set to pagination when it is clickable
    */
  var clickableClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS class name of the element with currently active index in "fraction" pagination
    */
  var currentClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Good to enable if you use bullets pagination with a lot of slides. So it will keep only few bullets visible at the same time.
    */
  var dynamicBullets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of main bullets visible when dynamicBullets enabled.
    */
  var dynamicMainBullets: js.UndefOr[scala.Double] = js.undefined
  /**
    * String with CSS selector or HTML element of the container with pagination
    */
  var el: SelectableElement
  /**
    * format fraction pagination current number. Function receives current number,
    * and you need to return formatted value
    */
  var formatFractionCurrent: js.UndefOr[js.Function1[/* number */ scala.Double, scala.Double]] = js.undefined
  /**
    * format fraction pagination total number. Function receives total number, and you
    * need to return formatted value
    */
  var formatFractionTotal: js.UndefOr[js.Function1[/* number */ scala.Double, scala.Double]] = js.undefined
  /**
    * CSS class name of pagination when it becomes inactive
    */
  var hiddenClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggle (hide/true) pagination container visibility after click on Slider's container
    */
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The beginning of the modifier CSS class name that will be added to pagination depending on parameters
    */
  var modifierClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS class name of pagination progressbar fill element
    */
  var progressbarFillClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Makes pagination progressbar opposite to Swiper's `direction` parameter, means vertical progressbar for horizontal swiper
    * direction and horizontal progressbar for vertical swiper direction
    */
  var progressbarOpposite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This parameter allows totally customize pagination bullets, you need to pass here a function that accepts index number of
    * pagination bullet and required element class name (className). Only for bullets pagination type
    */
  var renderBullet: js.UndefOr[
    js.Function2[/* index */ scala.Double, /* className */ java.lang.String, scala.Unit]
  ] = js.undefined
  /**
    * This parameter is required for custom pagination type where you have to specify
    * how it should be rendered.
    *
    * @example
    * var swiper = new Swiper('.swiper-container', {
    *   //...
    *   renderCustom: function (swiper, current, total) {
    *     return current + ' of ' + total;
    *   }
    * });
    */
  var renderCustom: js.UndefOr[
    js.Function3[/* swiper */ Swiper, /* current */ scala.Double, /* total */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * This parameter allows to customize "fraction" pagination html. Only for fraction pagination type
    */
  var renderFraction: js.UndefOr[
    js.Function2[/* currentClass */ java.lang.String, /* totalClass */ java.lang.String, scala.Unit]
  ] = js.undefined
  /**
    * This parameter allows to customize "progress" pagination. Only for progress pagination type
    */
  var renderProgressbar: js.UndefOr[js.Function1[/* progressbarFillClass */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * CSS class name of the element with total number of "snaps" in "fraction" pagination
    */
  var totalClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String with type of pagination. Can be "bullets", "fraction", "progressbar" or "custom"
    */
  var `type`: js.UndefOr[
    swiperLib.swiperLibStrings.bullets | swiperLib.swiperLibStrings.fraction | swiperLib.swiperLibStrings.progressbar | swiperLib.swiperLibStrings.custom
  ] = js.undefined
}

object PaginationOptions {
  @scala.inline
  def apply(
    el: SelectableElement,
    bulletActiveClass: java.lang.String = null,
    bulletClass: java.lang.String = null,
    bulletElement: java.lang.String = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    clickableClass: java.lang.String = null,
    currentClass: java.lang.String = null,
    dynamicBullets: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicMainBullets: scala.Int | scala.Double = null,
    formatFractionCurrent: /* number */ scala.Double => scala.Double = null,
    formatFractionTotal: /* number */ scala.Double => scala.Double = null,
    hiddenClass: java.lang.String = null,
    hideOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    modifierClass: java.lang.String = null,
    progressbarFillClass: java.lang.String = null,
    progressbarOpposite: js.UndefOr[scala.Boolean] = js.undefined,
    renderBullet: (/* index */ scala.Double, /* className */ java.lang.String) => scala.Unit = null,
    renderCustom: (/* swiper */ Swiper, /* current */ scala.Double, /* total */ scala.Double) => scala.Unit = null,
    renderFraction: (/* currentClass */ java.lang.String, /* totalClass */ java.lang.String) => scala.Unit = null,
    renderProgressbar: /* progressbarFillClass */ java.lang.String => scala.Unit = null,
    totalClass: java.lang.String = null,
    `type`: swiperLib.swiperLibStrings.bullets | swiperLib.swiperLibStrings.fraction | swiperLib.swiperLibStrings.progressbar | swiperLib.swiperLibStrings.custom = null
  ): PaginationOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (bulletActiveClass != null) __obj.updateDynamic("bulletActiveClass")(bulletActiveClass)
    if (bulletClass != null) __obj.updateDynamic("bulletClass")(bulletClass)
    if (bulletElement != null) __obj.updateDynamic("bulletElement")(bulletElement)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (clickableClass != null) __obj.updateDynamic("clickableClass")(clickableClass)
    if (currentClass != null) __obj.updateDynamic("currentClass")(currentClass)
    if (!js.isUndefined(dynamicBullets)) __obj.updateDynamic("dynamicBullets")(dynamicBullets)
    if (dynamicMainBullets != null) __obj.updateDynamic("dynamicMainBullets")(dynamicMainBullets.asInstanceOf[js.Any])
    if (formatFractionCurrent != null) __obj.updateDynamic("formatFractionCurrent")(js.Any.fromFunction1(formatFractionCurrent))
    if (formatFractionTotal != null) __obj.updateDynamic("formatFractionTotal")(js.Any.fromFunction1(formatFractionTotal))
    if (hiddenClass != null) __obj.updateDynamic("hiddenClass")(hiddenClass)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (modifierClass != null) __obj.updateDynamic("modifierClass")(modifierClass)
    if (progressbarFillClass != null) __obj.updateDynamic("progressbarFillClass")(progressbarFillClass)
    if (!js.isUndefined(progressbarOpposite)) __obj.updateDynamic("progressbarOpposite")(progressbarOpposite)
    if (renderBullet != null) __obj.updateDynamic("renderBullet")(js.Any.fromFunction2(renderBullet))
    if (renderCustom != null) __obj.updateDynamic("renderCustom")(js.Any.fromFunction3(renderCustom))
    if (renderFraction != null) __obj.updateDynamic("renderFraction")(js.Any.fromFunction2(renderFraction))
    if (renderProgressbar != null) __obj.updateDynamic("renderProgressbar")(js.Any.fromFunction1(renderProgressbar))
    if (totalClass != null) __obj.updateDynamic("totalClass")(totalClass)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

