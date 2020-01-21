package typings.tslint.formatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatterMetadata extends js.Object {
  /**
    * Sample output from the formatter.
    */
  var consumer: ConsumerType
  /**
    * A short, one line description of what the formatter does.
    */
  var description: String
  /**
    * More elaborate details about the formatter.
    */
  var descriptionDetails: js.UndefOr[String] = js.undefined
  /**
    * The name of the formatter.
    */
  var formatterName: String
  /**
    * Sample output from the formatter.
    */
  var sample: String
}

object IFormatterMetadata {
  @scala.inline
  def apply(
    consumer: ConsumerType,
    description: String,
    formatterName: String,
    sample: String,
    descriptionDetails: String = null
  ): IFormatterMetadata = {
    val __obj = js.Dynamic.literal(consumer = consumer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formatterName = formatterName.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
    if (descriptionDetails != null) __obj.updateDynamic("descriptionDetails")(descriptionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormatterMetadata]
  }
}

