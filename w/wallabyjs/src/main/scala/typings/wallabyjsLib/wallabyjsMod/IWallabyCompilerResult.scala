package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyCompilerResult extends js.Object {
  var code: java.lang.String
  var map: java.lang.String
  var ranges: js.Any
}

object IWallabyCompilerResult {
  @scala.inline
  def apply(code: java.lang.String, map: java.lang.String, ranges: js.Any): IWallabyCompilerResult = {
    val __obj = js.Dynamic.literal(code = code, map = map, ranges = ranges)
  
    __obj.asInstanceOf[IWallabyCompilerResult]
  }
}

