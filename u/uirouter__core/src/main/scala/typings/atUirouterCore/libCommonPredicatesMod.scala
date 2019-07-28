package typings.atUirouterCore

import typings.atUirouterCore.libCommonCommonMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/predicates", JSImport.Namespace)
@js.native
object libCommonPredicatesMod extends js.Object {
  val isDefined: Predicate[js.Any] = js.native
  val isNullOrUndefined: Predicate[js.Any] = js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  def isDate(x: js.Any): /* is std.Date */ Boolean = js.native
  def isFunction(x: js.Any): /* is std.Function */ Boolean = js.native
  def isInjectable(`val`: js.Any): Boolean = js.native
  def isNull(o: js.Any): Boolean = js.native
  def isNumber(x: js.Any): /* is number */ Boolean = js.native
  def isObject(x: js.Any): Boolean = js.native
  def isPromise(x: js.Any): /* is std.Promise<any> */ Boolean = js.native
  def isRegExp(x: js.Any): /* is std.RegExp */ Boolean = js.native
  def isString(x: js.Any): /* is string */ Boolean = js.native
  def isUndefined(x: js.Any): Boolean = js.native
}

