package typings
package webgmeLib.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationRuleDetail extends js.Object {
  /** 
    * The maximum amount of target necessary for the relationship 
    * (if not present or '-1' then there is no maximum rule that applies) 
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** 
    * The minimum amount of target necessary for the relationship 
    * (if not present or '-1' then there is no minimum rule that applies) 
    */
  var min: js.UndefOr[scala.Double] = js.undefined
}

object RelationRuleDetail {
  @scala.inline
  def apply(max: scala.Int | scala.Double = null, min: scala.Int | scala.Double = null): RelationRuleDetail = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationRuleDetail]
  }
}

