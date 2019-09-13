package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.includes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludesType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** The interface mixin that is being included by the target. */
  var includes: String
  /** The interface that includes an interface mixin. */
  var target: String
  var `type`: includes
}

object IncludesType {
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttribute], includes: String, target: String, `type`: includes): IncludesType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, includes = includes, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IncludesType]
  }
}

