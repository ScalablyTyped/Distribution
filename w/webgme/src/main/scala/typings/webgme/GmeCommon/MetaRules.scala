package typings.webgme.GmeCommon

import typings.webgme.anon.Filter
import typings.webgme.anon.Level
import typings.webgme.anon.Ptr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaRules extends js.Object {
  var aspects: Filter
  var attributes: Level
  var children: MetaCardRule
  var constraints: Dictionary[typings.webgme.Core.Constraint]
  var pointers: Ptr
}

object MetaRules {
  @scala.inline
  def apply(
    aspects: Filter,
    attributes: Level,
    children: MetaCardRule,
    constraints: Dictionary[typings.webgme.Core.Constraint],
    pointers: Ptr
  ): MetaRules = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaRules]
  }
}

