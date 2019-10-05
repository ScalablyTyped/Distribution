package typings.xrm.Xrm.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold a Label as part of the EntityMetadata
  */
trait LocalizedLabel extends js.Object {
  var Label: String
  var LanguageCode: Double
}

object LocalizedLabel {
  @scala.inline
  def apply(Label: String, LanguageCode: Double): LocalizedLabel = {
    val __obj = js.Dynamic.literal(Label = Label, LanguageCode = LanguageCode)
  
    __obj.asInstanceOf[LocalizedLabel]
  }
}

