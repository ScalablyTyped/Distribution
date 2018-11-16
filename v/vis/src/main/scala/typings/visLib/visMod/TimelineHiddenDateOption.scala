package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimelineHiddenDateOption extends js.Object {
  var end: DateType
  var repeat: js.UndefOr[
    visLib.visLibStrings.daily | visLib.visLibStrings.weekly | visLib.visLibStrings.monthly | visLib.visLibStrings.yearly
  ] = js.undefined
  var start: DateType
}

