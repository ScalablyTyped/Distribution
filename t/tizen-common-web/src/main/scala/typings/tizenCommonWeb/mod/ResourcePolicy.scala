package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicy extends StObject {
  
  /**
    * Indicates resource initialized and activated.
    *
    * The default value is false
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates resource that is allowed to be discovered.
    *
    * The default value is true
    */
  var isDiscoverable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When this value is set true, the resource is allowed to be discovered only if discovery request contains an explicit query string.
    *
    * The default value is false
    */
  var isExplicitDiscoverable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates resource that is allowed to be observed.
    *
    * The default value is false
    */
  var isObservable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates secure resource.
    *
    * The default value is false
    */
  var isSecure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates resource which takes some delay to respond.
    *
    * The default value is false
    */
  var isSlow: js.UndefOr[Boolean] = js.undefined
}
object ResourcePolicy {
  
  inline def apply(): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePolicy] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setIsDiscoverable(value: Boolean): Self = StObject.set(x, "isDiscoverable", value.asInstanceOf[js.Any])
    
    inline def setIsDiscoverableUndefined: Self = StObject.set(x, "isDiscoverable", js.undefined)
    
    inline def setIsExplicitDiscoverable(value: Boolean): Self = StObject.set(x, "isExplicitDiscoverable", value.asInstanceOf[js.Any])
    
    inline def setIsExplicitDiscoverableUndefined: Self = StObject.set(x, "isExplicitDiscoverable", js.undefined)
    
    inline def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
    
    inline def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
    
    inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
    
    inline def setIsSlow(value: Boolean): Self = StObject.set(x, "isSlow", value.asInstanceOf[js.Any])
    
    inline def setIsSlowUndefined: Self = StObject.set(x, "isSlow", js.undefined)
  }
}
