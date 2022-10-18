package typings.vegaTypings.typesSpecTransformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecTransformMod.DistributionNormal
  - typings.vegaTypings.typesSpecTransformMod.DistributionLogNormal
  - typings.vegaTypings.typesSpecTransformMod.DistributionUniform
  - typings.vegaTypings.typesSpecTransformMod.DistributionKDE
  - typings.vegaTypings.typesSpecTransformMod.DistributionMixture
*/
trait Distribution extends StObject
object Distribution {
  
  inline def DistributionKDE(field: String | TransformField): typings.vegaTypings.typesSpecTransformMod.DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "kde")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.DistributionKDE]
  }
  
  inline def DistributionLogNormal(): typings.vegaTypings.typesSpecTransformMod.DistributionLogNormal = {
    val __obj = js.Dynamic.literal(function = "lognormal")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.DistributionLogNormal]
  }
  
  inline def DistributionMixture(field: String | TransformField): typings.vegaTypings.typesSpecTransformMod.DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "mixture")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.DistributionMixture]
  }
  
  inline def DistributionNormal(): typings.vegaTypings.typesSpecTransformMod.DistributionNormal = {
    val __obj = js.Dynamic.literal(function = "normal")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.DistributionNormal]
  }
  
  inline def DistributionUniform(): typings.vegaTypings.typesSpecTransformMod.DistributionUniform = {
    val __obj = js.Dynamic.literal(function = "uniform")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.DistributionUniform]
  }
}
