package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: RegExp
  var detect: Anon_TypeOfBowerFile
  var replace: Anon_AnotherTypeOfBowerFile
}

object Anon_Block {
  @scala.inline
  def apply(block: RegExp, detect: Anon_TypeOfBowerFile, replace: Anon_AnotherTypeOfBowerFile): Anon_Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Block]
  }
}

