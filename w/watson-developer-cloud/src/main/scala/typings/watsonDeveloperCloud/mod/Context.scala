package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** State information for the conversation. To maintain state, include the context from the previous response. */
trait Context
  extends /** Context accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** The unique identifier of the conversation. */
  var conversation_id: js.UndefOr[String] = js.undefined
  /** Metadata related to the message. */
  var metadata: js.UndefOr[MessageContextMetadata] = js.undefined
  /** For internal use only. */
  var system: js.UndefOr[SystemResponse] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    StringDictionary: /** Context accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null,
    conversation_id: String = null,
    metadata: MessageContextMetadata = null,
    system: SystemResponse = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (conversation_id != null) __obj.updateDynamic("conversation_id")(conversation_id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

