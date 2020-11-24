package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.kde
import typings.vegaTypings.vegaTypingsStrings.lognormal
import typings.vegaTypings.vegaTypingsStrings.mixture
import typings.vegaTypings.vegaTypingsStrings.normal
import typings.vegaTypings.vegaTypingsStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.transformMod.DistributionNormal
  - typings.vegaTypings.transformMod.DistributionLogNormal
  - typings.vegaTypings.transformMod.DistributionUniform
  - typings.vegaTypings.transformMod.DistributionKDE
  - typings.vegaTypings.transformMod.DistributionMixture
*/
trait Distribution extends js.Object
object Distribution {
  
  @scala.inline
  def DistributionMixture(field: String | TransformField, function: mixture): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionNormal(function: normal): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionLogNormal(function: lognormal): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionUniform(function: uniform): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  def DistributionKDE(field: String | TransformField, function: kde): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}
