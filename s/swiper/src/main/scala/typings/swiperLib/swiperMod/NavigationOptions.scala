package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationOptions extends js.Object {
  /**
       * CSS class name added to navigation button when it becomes disabled
       *
       * @default 'swiper-button-disabled'
       */
  var disabledClass: js.UndefOr[java.lang.String] = js.undefined
  /**
       * CSS class name added to navigation button when it becomes hidden
       *
       * @default 'swiper-button-hidden'
       */
  var hiddenClass: js.UndefOr[java.lang.String] = js.undefined
  /**
       * buttons visibility after click on Slider's container
       *
       * @default false Toggle navigation
       */
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * String with CSS selector or HTML element of the element that will work
       * like "next" button after click on it
       *
       * @default null
       */
  var nextEl: js.UndefOr[SelectableElement] = js.undefined
  /**
       * String with CSS selector or HTML element of the element that will work
       * like "prev" button after click on it
       *
       * @default null
       */
  var prevEl: js.UndefOr[SelectableElement] = js.undefined
}

