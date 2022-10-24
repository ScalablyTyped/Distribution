package typings.wixStyleReact.anon

import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var size: js.UndefOr[small | medium | large] = js.undefined
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
