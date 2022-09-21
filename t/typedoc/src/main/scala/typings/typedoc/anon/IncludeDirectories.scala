package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDirectories extends StObject {
  
  var includeDirectories: js.UndefOr[Boolean] = js.undefined
}
object IncludeDirectories {
  
  inline def apply(): IncludeDirectories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeDirectories]
  }
  
  extension [Self <: IncludeDirectories](x: Self) {
    
    inline def setIncludeDirectories(value: Boolean): Self = StObject.set(x, "includeDirectories", value.asInstanceOf[js.Any])
    
    inline def setIncludeDirectoriesUndefined: Self = StObject.set(x, "includeDirectories", js.undefined)
  }
}
