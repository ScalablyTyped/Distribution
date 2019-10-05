package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiDetachRecord")
@js.native
object nlapiDetachRecord extends js.Object {
  /**
    * Detach a single record from another with optional properties.
    * @governance 10 units
    *
    * @param {string}    type1 The record type name being attached
    * @param {int}    id1 The internal ID for the record being attached
    * @param {string}    type2 The record type name being attached to
    * @param {int}    id2 The internal ID for the record being attached to
    * @param {Object}    [properties] Object containing name/value pairs used to configure detach operation
    * @return {void}
    *
    * @since    2008.2
    * @param type1
    * @param id1
    * @param type2
    * @param id2
    * @param properties?
    * @return
    */
  def apply(type1: String, id1: js.Any, type2: String, id2: js.Any): Unit = js.native
  def apply(type1: String, id1: js.Any, type2: String, id2: js.Any, properties: js.Any): Unit = js.native
}

