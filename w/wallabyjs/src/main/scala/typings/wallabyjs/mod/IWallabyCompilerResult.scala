package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyCompilerResult extends js.Object {
  var code: String
  var map: String
  var ranges: js.Any
}

object IWallabyCompilerResult {
  @scala.inline
  def apply(code: String, map: String, ranges: js.Any): IWallabyCompilerResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyCompilerResult]
  }
}

