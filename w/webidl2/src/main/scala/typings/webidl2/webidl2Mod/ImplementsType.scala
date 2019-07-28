package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.implements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementsType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** The interface that is being implemented by the target. */
  var implements: String
  /** The interface that implements another. */
  var target: String
  var `type`: implements
}

object ImplementsType {
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttributes], implements: String, target: String, `type`: implements): ImplementsType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, implements = implements, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ImplementsType]
  }
}

