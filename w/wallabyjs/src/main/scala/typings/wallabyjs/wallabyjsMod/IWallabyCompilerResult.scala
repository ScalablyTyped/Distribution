package typings.wallabyjs.wallabyjsMod

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
    val __obj = js.Dynamic.literal(code = code, map = map, ranges = ranges)
  
    __obj.asInstanceOf[IWallabyCompilerResult]
  }
}

