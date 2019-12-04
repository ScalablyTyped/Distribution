package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.ObjectIdentifier
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "AttributeTypeAndValue")
@js.native
class AttributeTypeAndValue () extends js.Object {
  def this(params: js.Any) = this()
  /**
    * 
    * 
    * @type {ObjectIdentifier}
    * @memberOf AttributeTypeAndValue
    */
  var `type`: ObjectIdentifier = js.native
  /**
    * 
    * 
    * @type {*}
    * @memberOf AttributeTypeAndValue
    */
  var value: js.Any = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def isEqual(compareTo: ArrayBuffer): Boolean = js.native
  /**
    * Compare two AttributeTypeAndValue values, or AttributeTypeAndValue with ArrayBuffer value
    * 
    * @param {(AttributeTypeAndValue|ArrayBuffer)} compareTo The value compare to current
    * @returns {boolean}
    * 
    * @memberOf AttributeTypeAndValue
    */
  def isEqual(compareTo: AttributeTypeAndValue): Boolean = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "AttributeTypeAndValue")
@js.native
object AttributeTypeAndValue extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

