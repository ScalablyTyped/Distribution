package typings
package xrmLib.XrmNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold a Label as part of the EntityMetadata
  */
trait LocalizedLabel extends js.Object {
  var Label: java.lang.String
  var LanguageCode: scala.Double
}

object LocalizedLabel {
  @scala.inline
  def apply(Label: java.lang.String, LanguageCode: scala.Double): LocalizedLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("LanguageCode")(LanguageCode)
    __obj.asInstanceOf[LocalizedLabel]
  }
}

