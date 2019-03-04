package typings
package strongDashLogDashTransformerLib.strongDashLogDashTransformerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var format: java.lang.String
  var mergeMultiline: scala.Boolean
  var tag: java.lang.String
  var timeStamp: scala.Boolean
}

object Options {
  @scala.inline
  def apply(
    format: java.lang.String,
    mergeMultiline: scala.Boolean,
    tag: java.lang.String,
    timeStamp: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(format = format, mergeMultiline = mergeMultiline, tag = tag, timeStamp = timeStamp)
  
    __obj.asInstanceOf[Options]
  }
}

