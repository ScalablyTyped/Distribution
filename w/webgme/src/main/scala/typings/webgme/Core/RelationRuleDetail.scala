package typings.webgme.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationRuleDetail extends js.Object {
  /** 
    * The maximum amount of target necessary for the relationship 
    * (if not present or '-1' then there is no maximum rule that applies) 
    */
  var max: js.UndefOr[Double] = js.undefined
  /** 
    * The minimum amount of target necessary for the relationship 
    * (if not present or '-1' then there is no minimum rule that applies) 
    */
  var min: js.UndefOr[Double] = js.undefined
}

object RelationRuleDetail {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): RelationRuleDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationRuleDetail]
  }
}

