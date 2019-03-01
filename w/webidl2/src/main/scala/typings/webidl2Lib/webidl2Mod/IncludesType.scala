package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludesType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** The interface mixin that is being included by the target. */
  var includes: java.lang.String
  /** The interface that includes an interface mixin. */
  var target: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.includes
}

object IncludesType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    includes: java.lang.String,
    target: java.lang.String,
    `type`: webidl2Lib.webidl2LibStrings.includes
  ): IncludesType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("extAttrs")(extAttrs)
    __obj.updateDynamic("includes")(includes)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IncludesType]
  }
}

