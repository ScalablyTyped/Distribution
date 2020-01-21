package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
trait DialogNodeOutput
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** An array of objects describing the output defined for the dialog node. */
  var generic: js.UndefOr[js.Array[DialogNodeOutputGeneric]] = js.undefined
  /** Options that modify how specified output is handled. */
  var modifiers: js.UndefOr[DialogNodeOutputModifiers] = js.undefined
}

object DialogNodeOutput {
  @scala.inline
  def apply(
    StringDictionary: /** DialogNodeOutput accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null,
    generic: js.Array[DialogNodeOutputGeneric] = null,
    modifiers: DialogNodeOutputModifiers = null
  ): DialogNodeOutput = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (generic != null) __obj.updateDynamic("generic")(generic.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutput]
  }
}

