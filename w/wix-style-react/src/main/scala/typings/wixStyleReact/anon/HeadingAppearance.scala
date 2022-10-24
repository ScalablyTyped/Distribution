package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadingAppearance extends StObject {
  
  var children: Any
  
  var headingAppearance: js.UndefOr[String] = js.undefined
}
object HeadingAppearance {
  
  inline def apply(children: Any): HeadingAppearance = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingAppearance]
  }
  
  extension [Self <: HeadingAppearance](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setHeadingAppearance(value: String): Self = StObject.set(x, "headingAppearance", value.asInstanceOf[js.Any])
    
    inline def setHeadingAppearanceUndefined: Self = StObject.set(x, "headingAppearance", js.undefined)
  }
}
