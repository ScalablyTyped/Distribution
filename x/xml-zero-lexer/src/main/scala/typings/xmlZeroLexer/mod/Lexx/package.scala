package typings.xmlZeroLexer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Lexx {
  /**
    * @example
    * [NodeTypes.ELEMENT_NODE, 1, 2]
    * [NodeTypes.TEXT_NODE, 3, 20]
    * [NodeTypes.CLOSE_ELEMENT]
    */
  type Token = js.Array[scala.Double]
}
