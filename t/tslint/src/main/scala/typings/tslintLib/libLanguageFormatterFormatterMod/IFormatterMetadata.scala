package typings
package tslintLib.libLanguageFormatterFormatterMod

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
  var description: java.lang.String
  /**
    * More elaborate details about the formatter.
    */
  var descriptionDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the formatter.
    */
  var formatterName: java.lang.String
  /**
    * Sample output from the formatter.
    */
  var sample: java.lang.String
}

object IFormatterMetadata {
  @scala.inline
  def apply(
    consumer: ConsumerType,
    description: java.lang.String,
    formatterName: java.lang.String,
    sample: java.lang.String,
    descriptionDetails: java.lang.String = null
  ): IFormatterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consumer")(consumer)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("formatterName")(formatterName)
    __obj.updateDynamic("sample")(sample)
    if (descriptionDetails != null) __obj.updateDynamic("descriptionDetails")(descriptionDetails)
    __obj.asInstanceOf[IFormatterMetadata]
  }
}

