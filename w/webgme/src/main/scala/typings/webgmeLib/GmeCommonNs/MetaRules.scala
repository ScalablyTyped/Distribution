package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaRules extends js.Object {
  var aspects: webgmeLib.Anon_Filter
  var attributes: webgmeLib.Anon_Level
  var children: MetaCardRule
  var constraints: Dictionary[webgmeLib.CoreNs.Constraint]
  var pointers: webgmeLib.Anon_Ptr
}

object MetaRules {
  @scala.inline
  def apply(
    aspects: webgmeLib.Anon_Filter,
    attributes: webgmeLib.Anon_Level,
    children: MetaCardRule,
    constraints: Dictionary[webgmeLib.CoreNs.Constraint],
    pointers: webgmeLib.Anon_Ptr
  ): MetaRules = {
    val __obj = js.Dynamic.literal(aspects = aspects, attributes = attributes, children = children, constraints = constraints, pointers = pointers)
  
    __obj.asInstanceOf[MetaRules]
  }
}

