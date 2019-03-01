package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementsType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** The interface that is being implemented by the target. */
  var implements: java.lang.String
  /** The interface that implements another. */
  var target: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.implements
}

object ImplementsType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    implements: java.lang.String,
    target: java.lang.String,
    `type`: webidl2Lib.webidl2LibStrings.implements
  ): ImplementsType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("extAttrs")(extAttrs)
    __obj.updateDynamic("implements")(implements)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ImplementsType]
  }
}

