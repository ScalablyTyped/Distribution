package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOptionsWithDependencyType
  extends StObject
     with ResolveOptionsWebpackOptions {
  
  var dependencyType: js.UndefOr[String] = js.undefined
  
  var resolveToContext: js.UndefOr[Boolean] = js.undefined
}
object ResolveOptionsWithDependencyType {
  
  inline def apply(): ResolveOptionsWithDependencyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptionsWithDependencyType]
  }
  
  extension [Self <: ResolveOptionsWithDependencyType](x: Self) {
    
    inline def setDependencyType(value: String): Self = StObject.set(x, "dependencyType", value.asInstanceOf[js.Any])
    
    inline def setDependencyTypeUndefined: Self = StObject.set(x, "dependencyType", js.undefined)
    
    inline def setResolveToContext(value: Boolean): Self = StObject.set(x, "resolveToContext", value.asInstanceOf[js.Any])
    
    inline def setResolveToContextUndefined: Self = StObject.set(x, "resolveToContext", js.undefined)
  }
}
