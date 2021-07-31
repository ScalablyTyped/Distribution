package typings.vegaTypings.transformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def DistributionKDE(field: String | TransformField): typings.vegaTypings.transformMod.DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "kde")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionKDE]
  }
  
  @scala.inline
  def DistributionLogNormal(): typings.vegaTypings.transformMod.DistributionLogNormal = {
    val __obj = js.Dynamic.literal(function = "lognormal")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionLogNormal]
  }
  
  @scala.inline
  def DistributionMixture(field: String | TransformField): typings.vegaTypings.transformMod.DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "mixture")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionMixture]
  }
  
  @scala.inline
  def DistributionNormal(): typings.vegaTypings.transformMod.DistributionNormal = {
    val __obj = js.Dynamic.literal(function = "normal")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionNormal]
  }
  
  @scala.inline
  def DistributionUniform(): typings.vegaTypings.transformMod.DistributionUniform = {
    val __obj = js.Dynamic.literal(function = "uniform")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DistributionUniform]
  }
}
