package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the text content of an element or attribute. */
trait IXmlText extends IXmlCharacterData {
  /**
    * Splits this text node into two text nodes at the specified offset and inserts the new text node into the tree as a sibling that immediately follows this node.
    * @param offset The number of characters at which to split this text node into two nodes, starting from zero.
    * @return The new text node.
    */
  def splitText(offset: scala.Double): IXmlText
}

