package typings.workboxBuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserNamespace extends StObject {
  
  var browserNamespace: js.UndefOr[String] = js.undefined
  
  var packageType: js.UndefOr[String] = js.undefined
  
  var prodOnly: js.UndefOr[Boolean] = js.undefined
}
object BrowserNamespace {
  
  inline def apply(): BrowserNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserNamespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserNamespace] (val x: Self) extends AnyVal {
    
    inline def setBrowserNamespace(value: String): Self = StObject.set(x, "browserNamespace", value.asInstanceOf[js.Any])
    
    inline def setBrowserNamespaceUndefined: Self = StObject.set(x, "browserNamespace", js.undefined)
    
    inline def setPackageType(value: String): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setProdOnly(value: Boolean): Self = StObject.set(x, "prodOnly", value.asInstanceOf[js.Any])
    
    inline def setProdOnlyUndefined: Self = StObject.set(x, "prodOnly", js.undefined)
  }
}
