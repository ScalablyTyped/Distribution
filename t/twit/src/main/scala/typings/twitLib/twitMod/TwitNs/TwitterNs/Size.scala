package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var h: scala.Double
  var resize: twitLib.twitLibStrings.crop | twitLib.twitLibStrings.fit
  var w: scala.Double
}

object Size {
  @scala.inline
  def apply(h: scala.Double, resize: twitLib.twitLibStrings.crop | twitLib.twitLibStrings.fit, w: scala.Double): Size = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    __obj.updateDynamic("w")(w)
    __obj.asInstanceOf[Size]
  }
}

