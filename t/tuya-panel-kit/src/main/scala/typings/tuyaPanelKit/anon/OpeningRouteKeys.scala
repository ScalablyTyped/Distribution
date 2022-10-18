package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpeningRouteKeys extends StObject {
  
  var closingRouteKeys: js.Array[String]
  
  var descriptors: StackDescriptorMap
  
  var openingRouteKeys: js.Array[String]
  
  var previousDescriptors: StackDescriptorMap
  
  // tslint:disable-next-line array-type
  var previousRoutes: js.Array[ReadonlykeystringnamestriKey]
  
  var replacingRouteKeys: js.Array[String]
  
  // tslint:disable-next-line array-type
  var routes: js.Array[ReadonlykeystringnamestriKey]
}
object OpeningRouteKeys {
  
  inline def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    openingRouteKeys: js.Array[String],
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[ReadonlykeystringnamestriKey],
    replacingRouteKeys: js.Array[String],
    routes: js.Array[ReadonlykeystringnamestriKey]
  ): OpeningRouteKeys = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningRouteKeys]
  }
  
  extension [Self <: OpeningRouteKeys](x: Self) {
    
    inline def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
    
    inline def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value*))
    
    inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
    
    inline def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value*))
    
    inline def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
    
    inline def setPreviousRoutes(value: js.Array[ReadonlykeystringnamestriKey]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
    
    inline def setPreviousRoutesVarargs(value: ReadonlykeystringnamestriKey*): Self = StObject.set(x, "previousRoutes", js.Array(value*))
    
    inline def setReplacingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "replacingRouteKeys", value.asInstanceOf[js.Any])
    
    inline def setReplacingRouteKeysVarargs(value: String*): Self = StObject.set(x, "replacingRouteKeys", js.Array(value*))
    
    inline def setRoutes(value: js.Array[ReadonlykeystringnamestriKey]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: ReadonlykeystringnamestriKey*): Self = StObject.set(x, "routes", js.Array(value*))
  }
}
