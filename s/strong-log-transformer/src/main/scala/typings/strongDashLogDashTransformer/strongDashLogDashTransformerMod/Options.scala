package typings.strongDashLogDashTransformer.strongDashLogDashTransformerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var format: String
  var mergeMultiline: Boolean
  var tag: String
  var timeStamp: Boolean
}

object Options {
  @scala.inline
  def apply(format: String, mergeMultiline: Boolean, tag: String, timeStamp: Boolean): Options = {
    val __obj = js.Dynamic.literal(format = format, mergeMultiline = mergeMultiline, tag = tag, timeStamp = timeStamp)
  
    __obj.asInstanceOf[Options]
  }
}

