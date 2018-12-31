package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeFilter extends js.Object {
  def acceptNode(node: Node): scala.Double
}

@JSGlobal("NodeFilter")
@js.native
object NodeFilter extends js.Object {
  val FILTER_ACCEPT: scala.Double = js.native
  val FILTER_REJECT: scala.Double = js.native
  val FILTER_SKIP: scala.Double = js.native
  val SHOW_ALL: scala.Double = js.native
  val SHOW_ATTRIBUTE: scala.Double = js.native
  val SHOW_CDATA_SECTION: scala.Double = js.native
  val SHOW_COMMENT: scala.Double = js.native
  val SHOW_DOCUMENT: scala.Double = js.native
  val SHOW_DOCUMENT_FRAGMENT: scala.Double = js.native
  val SHOW_DOCUMENT_TYPE: scala.Double = js.native
  val SHOW_ELEMENT: scala.Double = js.native
  val SHOW_ENTITY: scala.Double = js.native
  val SHOW_ENTITY_REFERENCE: scala.Double = js.native
  val SHOW_NOTATION: scala.Double = js.native
  val SHOW_PROCESSING_INSTRUCTION: scala.Double = js.native
  val SHOW_TEXT: scala.Double = js.native
}

