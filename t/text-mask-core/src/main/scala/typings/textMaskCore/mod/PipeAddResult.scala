package typings.textMaskCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeAddResult extends _PipeResult {
  var indexesOfPipedChars: js.Array[Double]
  var value: String
}

object PipeAddResult {
  @scala.inline
  def apply(indexesOfPipedChars: js.Array[Double], value: String): PipeAddResult = {
    val __obj = js.Dynamic.literal(indexesOfPipedChars = indexesOfPipedChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PipeAddResult]
  }
}

