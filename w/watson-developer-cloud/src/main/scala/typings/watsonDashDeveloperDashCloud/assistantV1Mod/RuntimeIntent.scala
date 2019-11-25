package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An intent identified in the user input. */
trait RuntimeIntent
  extends /** RuntimeIntent accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** A decimal percentage that represents Watson's confidence in the intent. */
  var confidence: Double
  /** The name of the recognized intent. */
  var intent: String
}

object RuntimeIntent {
  @scala.inline
  def apply(
    confidence: Double,
    intent: String,
    StringDictionary: /** RuntimeIntent accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null
  ): RuntimeIntent = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RuntimeIntent]
  }
}

