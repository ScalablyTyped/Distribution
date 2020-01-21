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
    badConsumers: js.Array[Double] = null,
    minConsumer: Int | Double = null,
    producer: Int | Double = null
  ): IVersionDef = {
    val __obj = js.Dynamic.literal()
    if (badConsumers != null) __obj.updateDynamic("badConsumers")(badConsumers.asInstanceOf[js.Any])
    if (minConsumer != null) __obj.updateDynamic("minConsumer")(minConsumer.asInstanceOf[js.Any])
    if (producer != null) __obj.updateDynamic("producer")(producer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVersionDef]
  }
}

