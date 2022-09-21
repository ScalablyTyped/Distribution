package typings.vueInbrowserCompilerIndependentUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag
  extends StObject
     with RootTag
     with BlockTag {
  
  var content: String | Boolean
}
object Tag {
  
  inline def apply(content: String | Boolean, title: String): Tag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setContent(value: String | Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
