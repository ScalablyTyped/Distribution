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

