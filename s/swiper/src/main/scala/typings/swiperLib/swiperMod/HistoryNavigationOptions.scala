package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryNavigationOptions extends js.Object {
  /**
    * Url key for slides
    *
    * @default 'slides'
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Works in addition to hashnav or history to replace current url state with the
    * new one instead of adding it to history
    *
    * @default false
    */
  var replaceState: js.UndefOr[scala.Boolean] = js.undefined
}

