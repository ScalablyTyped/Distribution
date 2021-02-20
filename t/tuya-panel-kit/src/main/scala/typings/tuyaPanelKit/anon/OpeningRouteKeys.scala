package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackTypesMod.StackDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpeningRouteKeys extends StObject {
  
  var closingRouteKeys: js.Array[String] = js.native
  
  var descriptors: StackDescriptorMap = js.native
  
  var openingRouteKeys: js.Array[String] = js.native
  
  var previousDescriptors: StackDescriptorMap = js.native
  
  // tslint:disable-next-line array-type
  var previousRoutes: js.Array[ReadonlykeystringnamestriKey] = js.native
  
  var replacingRouteKeys: js.Array[String] = js.native
  
  // tslint:disable-next-line array-type
  var routes: js.Array[ReadonlykeystringnamestriKey] = js.native
}
object OpeningRouteKeys {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OpeningRouteKeysMutableBuilder[Self <: OpeningRouteKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutes(value: js.Array[ReadonlykeystringnamestriKey]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRoutesVarargs(value: ReadonlykeystringnamestriKey*): Self = StObject.set(x, "previousRoutes", js.Array(value :_*))
    
    @scala.inline
    def setReplacingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "replacingRouteKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacingRouteKeysVarargs(value: String*): Self = StObject.set(x, "replacingRouteKeys", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[ReadonlykeystringnamestriKey]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: ReadonlykeystringnamestriKey*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
