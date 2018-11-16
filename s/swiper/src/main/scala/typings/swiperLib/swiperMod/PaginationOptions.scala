package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaginationOptions extends js.Object {
  var bulletActiveClass: js.UndefOr[java.lang.String] = js.undefined
  var bulletClass: js.UndefOr[java.lang.String] = js.undefined
  var bulletElement: js.UndefOr[java.lang.String] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var clickableClass: js.UndefOr[java.lang.String] = js.undefined
  var currentClass: js.UndefOr[java.lang.String] = js.undefined
  var dynamicBullets: js.UndefOr[scala.Boolean] = js.undefined
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
  var hiddenClass: js.UndefOr[java.lang.String] = js.undefined
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var modifierClass: js.UndefOr[java.lang.String] = js.undefined
  var progressbarFillClass: js.UndefOr[java.lang.String] = js.undefined
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
  var renderFraction: js.UndefOr[
    js.Function2[/* currentClass */ java.lang.String, /* totalClass */ java.lang.String, scala.Unit]
  ] = js.undefined
  var renderProgressbar: js.UndefOr[js.Function1[/* progressbarFillClass */ java.lang.String, scala.Unit]] = js.undefined
  var totalClass: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    swiperLib.swiperLibStrings.bullets | swiperLib.swiperLibStrings.fraction | swiperLib.swiperLibStrings.progressbar | swiperLib.swiperLibStrings.custom
  ] = js.undefined
}

