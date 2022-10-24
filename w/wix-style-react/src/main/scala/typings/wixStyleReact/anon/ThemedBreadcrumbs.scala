package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemedBreadcrumbs extends StObject {
  
  var themedBreadcrumbs: typings.react.mod.global.JSX.Element
}
object ThemedBreadcrumbs {
  
  inline def apply(themedBreadcrumbs: typings.react.mod.global.JSX.Element): ThemedBreadcrumbs = {
    val __obj = js.Dynamic.literal(themedBreadcrumbs = themedBreadcrumbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedBreadcrumbs]
  }
  
  extension [Self <: ThemedBreadcrumbs](x: Self) {
    
    inline def setThemedBreadcrumbs(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "themedBreadcrumbs", value.asInstanceOf[js.Any])
  }
}
