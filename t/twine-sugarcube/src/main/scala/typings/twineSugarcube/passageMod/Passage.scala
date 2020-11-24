package typings.twineSugarcube.passageMod

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Passage extends PassageBase {
  
  /**
    * Returns the description of the passage (created from either an excerpt of the passage or the
    * Config.passages.descriptions object).
    * @since 2.0.0
    */
  def description(): String = js.native
  
  /**
    * The DOM ID of the passage (created from the slugified passage title).
    * @since 2.0.0
    */
  var domId: String = js.native
  
  /**
    * Returns the text of the Passage object (similar to <Passage>.text) after applying nobr tag and image passage
    * processing to it.
    * @since 2.0.0
    */
  def processText(): String = js.native
}
object Passage {
  
  @scala.inline
  def apply(
    description: () => String,
    domId: String,
    processText: () => String,
    tags: Array[String],
    text: String,
    title: String
  ): Passage = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), domId = domId.asInstanceOf[js.Any], processText = js.Any.fromFunction0(processText), tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passage]
  }
  
  @scala.inline
  implicit class PassageOps[Self <: Passage] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: () => String): Self = this.set("description", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDomId(value: String): Self = this.set("domId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessText(value: () => String): Self = this.set("processText", js.Any.fromFunction0(value))
  }
}
