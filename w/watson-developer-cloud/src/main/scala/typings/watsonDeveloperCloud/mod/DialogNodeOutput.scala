package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
@js.native
trait DialogNodeOutput
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** An array of objects describing the output defined for the dialog node. */
  var generic: js.UndefOr[js.Array[DialogNodeOutputGeneric]] = js.native
  /** Options that modify how specified output is handled. */
  var modifiers: js.UndefOr[DialogNodeOutputModifiers] = js.native
}

object DialogNodeOutput {
  @scala.inline
  def apply(): DialogNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutput]
  }
  @scala.inline
  implicit class DialogNodeOutputOps[Self <: DialogNodeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGenericVarargs(value: DialogNodeOutputGeneric*): Self = this.set("generic", js.Array(value :_*))
    @scala.inline
    def setGeneric(value: js.Array[DialogNodeOutputGeneric]): Self = this.set("generic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneric: Self = this.set("generic", js.undefined)
    @scala.inline
    def setModifiers(value: DialogNodeOutputModifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
  }
  
}

