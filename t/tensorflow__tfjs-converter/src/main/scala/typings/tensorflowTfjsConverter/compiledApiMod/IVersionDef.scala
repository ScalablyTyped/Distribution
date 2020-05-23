package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersionDef extends js.Object {
  /** VersionDef badConsumers */
  var badConsumers: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** VersionDef minConsumer */
  var minConsumer: js.UndefOr[Double | Null] = js.undefined
  /** VersionDef producer */
  var producer: js.UndefOr[Double | Null] = js.undefined
}

object IVersionDef {
  @scala.inline
  def apply(
    badConsumers: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    minConsumer: js.UndefOr[Null | Double] = js.undefined,
    producer: js.UndefOr[Null | Double] = js.undefined
  ): IVersionDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(badConsumers)) __obj.updateDynamic("badConsumers")(badConsumers.asInstanceOf[js.Any])
    if (!js.isUndefined(minConsumer)) __obj.updateDynamic("minConsumer")(minConsumer.asInstanceOf[js.Any])
    if (!js.isUndefined(producer)) __obj.updateDynamic("producer")(producer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVersionDef]
  }
}

