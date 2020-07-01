package typings.webpackCdnInject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Defines urls to be added to document body (tag type is defined by url's file extension).
    */
  var body: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Defines urls to be added to document head (tag type is defined by url's file extension).
    */
  var head: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(body: js.Array[String] = null, head: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

