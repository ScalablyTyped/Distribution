package typings.validateDotJs.validateDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateJS extends js.Object {
  var formatters: js.Any = js.native
  var validators: js.Any = js.native
  def apply(attributes: js.Any, constraints: js.Any): js.Any = js.native
  def apply(attributes: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
  def async(attributes: js.Any, constraints: js.Any): js.Promise[_] = js.native
  def async(attributes: js.Any, constraints: js.Any, options: AsyncValidateOption): js.Promise[_] = js.native
  def capitalize(value: String): String = js.native
  def cleanAttributes(attributes: js.Any, whitelist: js.Any): js.Any = js.native
  def collectFormValues(form: js.Any): js.Any = js.native
  def collectFormValues(form: js.Any, options: CollectFormValuesOption): js.Any = js.native
  def contains(obj: js.Any, value: js.Any): Boolean = js.native
  def extend(obj: js.Any, otherObjects: js.Any*): js.Any = js.native
  def format(str: String, vals: js.Any): String = js.native
  def getDeepObjectValue(obj: js.Any, keypath: String): js.Any = js.native
  def isArray(value: js.Any): Boolean = js.native
  def isBoolean(value: js.Any): Boolean = js.native
  def isDate(value: js.Any): Boolean = js.native
  def isDefined(value: js.Any): Boolean = js.native
  def isDomElement(value: js.Any): Boolean = js.native
  def isEmpty(value: js.Any): Boolean = js.native
  def isFunction(value: js.Any): Boolean = js.native
  def isHash(value: js.Any): Boolean = js.native
  def isInteger(value: js.Any): Boolean = js.native
  def isNumber(value: js.Any): Boolean = js.native
  def isObject(value: js.Any): Boolean = js.native
  def isPromise(value: js.Any): Boolean = js.native
  def isString(value: js.Any): Boolean = js.native
  def prettify(value: String): String = js.native
  def result(value: js.Any, args: js.Any*): js.Any = js.native
  def single(value: js.Any, constraints: js.Any): js.Any = js.native
  def single(value: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
  def validate(attributes: js.Any, constraints: js.Any): js.Any = js.native
  def validate(attributes: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
}

