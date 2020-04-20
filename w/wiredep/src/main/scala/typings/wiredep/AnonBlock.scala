package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: RegExp
  var detect: AnonTypeOfBowerFile
  var replace: AnonAnotherTypeOfBowerFile
}

object AnonBlock {
  @scala.inline
  def apply(block: RegExp, detect: AnonTypeOfBowerFile, replace: AnonAnotherTypeOfBowerFile): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
}

