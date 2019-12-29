package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.kde
import typings.vegaDashTypings.vegaDashTypingsStrings.lognormal
import typings.vegaDashTypings.vegaDashTypingsStrings.mixture
import typings.vegaDashTypings.vegaDashTypingsStrings.normal
import typings.vegaDashTypings.vegaDashTypingsStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.typesSpecTransformMod.DistributionNormal
  - typings.vegaDashTypings.typesSpecTransformMod.DistributionLogNormal
  - typings.vegaDashTypings.typesSpecTransformMod.DistributionUniform
  - typings.vegaDashTypings.typesSpecTransformMod.DistributionKDE
  - typings.vegaDashTypings.typesSpecTransformMod.DistributionMixture
*/
trait Distribution extends js.Object

object Distribution {
  @scala.inline
  def DistributionLogNormal(function: lognormal, mean: Double | SignalRef = null, stdev: Double | SignalRef = null): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (stdev != null) __obj.updateDynamic("stdev")(stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionKDE(
    field: String | TransformField,
    function: kde,
    bandwidth: Double | SignalRef = null,
    from: DataName = null
  ): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionMixture(
    field: String | TransformField,
    function: mixture,
    distributions: (js.Array[Distribution | SignalRef]) | SignalRef = null,
    weights: (js.Array[Double | SignalRef]) | SignalRef = null
  ): Distribution = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    if (distributions != null) __obj.updateDynamic("distributions")(distributions.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionNormal(function: normal, mean: Double | SignalRef = null, stdev: Double | SignalRef = null): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (stdev != null) __obj.updateDynamic("stdev")(stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  def DistributionUniform(function: uniform, max: Double | SignalRef = null, min: Double | SignalRef = null): Distribution = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}

