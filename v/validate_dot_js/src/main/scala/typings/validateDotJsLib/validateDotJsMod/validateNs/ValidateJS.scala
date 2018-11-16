package typings
package validateDotJsLib.validateDotJsMod.validateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateJS extends js.Object {
  var formatters: js.Any = js.native
  var validators: js.Any = js.native
  def apply(attributes: js.Any, constraints: js.Any): js.Any = js.native
  def apply(attributes: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
  def async(attributes: js.Any, constraints: js.Any): stdLib.Promise[_] = js.native
  def async(attributes: js.Any, constraints: js.Any, options: AsyncValidateOption): stdLib.Promise[_] = js.native
  def capitalize(value: java.lang.String): java.lang.String = js.native
  def cleanAttributes(attributes: js.Any, whitelist: js.Any): js.Any = js.native
  def collectFormValues(form: js.Any): js.Any = js.native
  def collectFormValues(form: js.Any, options: CollectFormValuesOption): js.Any = js.native
  def contains(obj: js.Any, value: js.Any): scala.Boolean = js.native
  def extend(obj: js.Any, otherObjects: js.Any*): js.Any = js.native
  def format(str: java.lang.String, vals: js.Any): java.lang.String = js.native
  def getDeepObjectValue(obj: js.Any, keypath: java.lang.String): js.Any = js.native
  def isArray(value: js.Any): scala.Boolean = js.native
  def isBoolean(value: js.Any): scala.Boolean = js.native
  def isDate(value: js.Any): scala.Boolean = js.native
  def isDefined(value: js.Any): scala.Boolean = js.native
  def isDomElement(value: js.Any): scala.Boolean = js.native
  def isEmpty(value: js.Any): scala.Boolean = js.native
  def isFunction(value: js.Any): scala.Boolean = js.native
  def isHash(value: js.Any): scala.Boolean = js.native
  def isInteger(value: js.Any): scala.Boolean = js.native
  def isNumber(value: js.Any): scala.Boolean = js.native
  def isObject(value: js.Any): scala.Boolean = js.native
  def isPromise(value: js.Any): scala.Boolean = js.native
  def isString(value: js.Any): scala.Boolean = js.native
  def prettify(value: java.lang.String): java.lang.String = js.native
  def result(value: js.Any, args: js.Any*): js.Any = js.native
  def single(value: js.Any, constraints: js.Any): js.Any = js.native
  def single(value: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
  def validate(attributes: js.Any, constraints: js.Any): js.Any = js.native
  def validate(attributes: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
}

