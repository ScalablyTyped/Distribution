package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionQuery extends StObject {
  
  /**
    * When retrieving extensions with a query; frequently the caller only needs a small subset of the assets. The caller may specify a list of asset types that should be returned if the extension contains it. All other assets will not be returned.
    */
  var assetTypes: js.Array[String]
  
  /**
    * Each filter is a unique query and will have matching set of extensions returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
  var filters: js.Array[QueryFilter]
  
  /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched extensions.
    */
  var flags: ExtensionQueryFlags
}
object ExtensionQuery {
  
  @scala.inline
  def apply(assetTypes: js.Array[String], filters: js.Array[QueryFilter], flags: ExtensionQueryFlags): ExtensionQuery = {
    val __obj = js.Dynamic.literal(assetTypes = assetTypes.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionQuery]
  }
  
  @scala.inline
  implicit class ExtensionQueryMutableBuilder[Self <: ExtensionQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetTypes(value: js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[QueryFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: QueryFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ExtensionQueryFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
  }
}
