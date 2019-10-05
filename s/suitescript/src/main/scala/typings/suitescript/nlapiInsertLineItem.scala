package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiInsertLineItem")
@js.native
object nlapiInsertLineItem extends js.Object {
  /**
    * Insert and select a new line into the sublist on a page or userevent.
    *
    * @param {string} type sublist name
    * @param {int} [line] line number at which to insert a new line.
    * @return{void}
    *
    * @since 2005.0
    * @param type
    * @param line?
    */
  def apply(`type`: String): Unit = js.native
  def apply(`type`: String, line: js.Any): Unit = js.native
}

