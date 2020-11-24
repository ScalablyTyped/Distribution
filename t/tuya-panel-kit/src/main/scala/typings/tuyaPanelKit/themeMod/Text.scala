package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends js.Object {
  
  var heading: TextThemeMap = js.native
  
  var paragraph: TextThemeMap = js.native
  
  var title: TextThemeMap = js.native
}
object Text {
  
  @scala.inline
  def apply(heading: TextThemeMap, paragraph: TextThemeMap, title: TextThemeMap): Text = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
    
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
    def setHeading(value: TextThemeMap): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraph(value: TextThemeMap): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: TextThemeMap): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
