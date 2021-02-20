package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag
  extends RootTag
     with BlockTag {
  
  var content: String | Boolean = js.native
}
object Tag {
  
  @scala.inline
  def apply(content: String | Boolean, title: String): Tag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String | Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
