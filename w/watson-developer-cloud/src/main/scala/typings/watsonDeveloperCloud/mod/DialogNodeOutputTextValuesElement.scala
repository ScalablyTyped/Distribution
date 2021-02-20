package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodeOutputTextValuesElement. */
@js.native
trait DialogNodeOutputTextValuesElement extends StObject {
  
  /** The text of a response. This string can include newline characters (`\\n`), Markdown tagging, or other special characters, if supported by the channel. It must be no longer than 4096 characters. */
  var text: js.UndefOr[String] = js.native
}
object DialogNodeOutputTextValuesElement {
  
  @scala.inline
  def apply(): DialogNodeOutputTextValuesElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutputTextValuesElement]
  }
  
  @scala.inline
  implicit class DialogNodeOutputTextValuesElementMutableBuilder[Self <: DialogNodeOutputTextValuesElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
