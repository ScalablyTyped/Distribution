package typings.tslint.libLanguageFormatterFormatterMod

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
    val __obj = js.Dynamic.literal(consumer = consumer, description = description, formatterName = formatterName, sample = sample)
    if (descriptionDetails != null) __obj.updateDynamic("descriptionDetails")(descriptionDetails)
    __obj.asInstanceOf[IFormatterMetadata]
  }
}

