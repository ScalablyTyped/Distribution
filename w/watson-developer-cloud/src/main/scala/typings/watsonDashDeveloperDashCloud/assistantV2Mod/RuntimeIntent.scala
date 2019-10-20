package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An intent identified in the user input. */
trait RuntimeIntent extends js.Object {
  /** A decimal percentage that represents Watson's confidence in the intent. */
  var confidence: Double
  /** The name of the recognized intent. */
  var intent: String
}

object RuntimeIntent {
  @scala.inline
  def apply(confidence: Double, intent: String): RuntimeIntent = {
    val __obj = js.Dynamic.literal(confidence = confidence, intent = intent)
  
    __obj.asInstanceOf[RuntimeIntent]
  }
}

