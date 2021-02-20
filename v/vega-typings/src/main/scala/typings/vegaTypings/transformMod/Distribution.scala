package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.kde
import typings.vegaTypings.vegaTypingsStrings.lognormal
import typings.vegaTypings.vegaTypingsStrings.mixture
import typings.vegaTypings.vegaTypingsStrings.normal
import typings.vegaTypings.vegaTypingsStrings.uniform
import org.scalablytyped.runtime.StObject
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
trait Distribution extends StObject
object Distribution {
  
  @scala.inline
  def DistributionKDE(field: String | TransformField, function: kde): typings.vegaTypings.transformMod.DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionKDE]
  }
  
  @scala.inline
  def DistributionLogNormal(function: lognormal): typings.vegaTypings.transformMod.DistributionLogNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionLogNormal]
  }
  
  @scala.inline
  def DistributionMixture(field: String | TransformField, function: mixture): typings.vegaTypings.transformMod.DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionMixture]
  }
  
  @scala.inline
  def DistributionNormal(function: normal): typings.vegaTypings.transformMod.DistributionNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionNormal]
  }
  
  @scala.inline
  def DistributionUniform(function: uniform): typings.vegaTypings.transformMod.DistributionUniform = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionUniform]
  }
}
