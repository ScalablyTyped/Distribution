package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var heading: TextThemeMap
  
  var paragraph: TextThemeMap
  
  var title: TextThemeMap
}
object Text {
  
  inline def apply(heading: TextThemeMap, paragraph: TextThemeMap, title: TextThemeMap): Text = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setHeading(value: TextThemeMap): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setParagraph(value: TextThemeMap): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: TextThemeMap): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
