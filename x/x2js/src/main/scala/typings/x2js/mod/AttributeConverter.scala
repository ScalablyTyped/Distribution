package typings.x2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeConverter extends js.Object {
  /**
    * Will be called for every attribute where test() returns true, replacing the original value of the attribute.
    * 
    * @param {string} name
    * @param {*} value
    * @returns {string}
    * 
    * @memberOf X2JS.AttributeConverter
    */
  def convert(name: String, value: js.Any): String
  /**
    * Indicates whether an attribute should be converted.
    * 
    * @param {string} name
    * @param {*} value
    * @returns {boolean}
    * 
    * @memberOf X2JS.AttributeConverter
    */
  def test(name: String, value: js.Any): Boolean
}

object AttributeConverter {
  @scala.inline
  def apply(convert: (String, js.Any) => String, test: (String, js.Any) => Boolean): AttributeConverter = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), test = js.Any.fromFunction2(test))
    __obj.asInstanceOf[AttributeConverter]
  }
}

