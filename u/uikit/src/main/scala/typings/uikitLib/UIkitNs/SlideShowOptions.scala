package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SlideShowOptions extends js.Object {
  /**
           * Defines the preferred transition between items.
           * @default 'fade
           */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Defines whether or not the slideshow items should switch automatically.
           * @default false
           */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines the timespan between switching slideshow items.
           * @default 7000
           */
  var autoplayInterval: js.UndefOr[scala.Double] = js.undefined
  /**
           * Defines the transition duration.
           * @default 500
           */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
           * Defines the slideshow height.
           * @default 'auto'
           */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Defines whether or not the Ken Burns effect is active. If kenburns is a numeric value, it will be used as
           * the animation duration.
           * @default false
           */
  var kenburns: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Animation series.
           * @default 'uk-animation-middle-left, uk-animation-top-right, uk-animation-bottom-left, uk-animation-top-center,uk-animation-bottom-right'
           */
  var kenburnsanimations: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Pause autoplay when hovering a slideshow.
           * @default true
           */
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines the number of slices, if a "Slice" transition is set.
           * @default 15
           */
  var slices: js.UndefOr[scala.Double] = js.undefined
  /**
           * Defines the first slideshow item to be displayed.
           * @default 0
           */
  var start: js.UndefOr[scala.Double] = js.undefined
  /**
           * Defines whether or not a video starts automatically.
           * @default true
           */
  var videoautoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines whether or not a video is muted.
           * @default false
           */
  var videomute: js.UndefOr[scala.Boolean] = js.undefined
}

