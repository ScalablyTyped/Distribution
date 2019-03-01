package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: stdLib.RegExp
  var detect: Anon_TypeOfBowerFile
  var replace: Anon_AnotherTypeOfBowerFile
}

object Anon_Block {
  @scala.inline
  def apply(block: stdLib.RegExp, detect: Anon_TypeOfBowerFile, replace: Anon_AnotherTypeOfBowerFile): Anon_Block = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("detect")(detect)
    __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[Anon_Block]
  }
}

