package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Type
  /** The primitive number type. */
  var num: Type
  /** The primitive string type. */
  var str: Type
  var topScope: Scope
}

object Context {
  @scala.inline
  def apply(bool: Type, num: Type, str: Type, topScope: Scope): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bool")(bool)
    __obj.updateDynamic("num")(num)
    __obj.updateDynamic("str")(str)
    __obj.updateDynamic("topScope")(topScope)
    __obj.asInstanceOf[Context]
  }
}

