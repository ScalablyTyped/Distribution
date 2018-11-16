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

