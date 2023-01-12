package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionFilterResult extends StObject {
  
  /**
    * This is the set of appplications that matched the query filter supplied.
    */
  var extensions: js.Array[PublishedExtension]
  
  /**
    * The PagingToken is returned from a request when more records exist that match the result than were requested or could be returned. A follow-up query with this paging token can be used to retrieve more results.
    */
  var pagingToken: String
  
  /**
    * This is the additional optional metadata for the given result. E.g. Total count of results which is useful in case of paged results
    */
  var resultMetadata: js.Array[ExtensionFilterResultMetadata]
}
object ExtensionFilterResult {
  
  inline def apply(
    extensions: js.Array[PublishedExtension],
    pagingToken: String,
    resultMetadata: js.Array[ExtensionFilterResultMetadata]
  ): ExtensionFilterResult = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], pagingToken = pagingToken.asInstanceOf[js.Any], resultMetadata = resultMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFilterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionFilterResult] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: js.Array[PublishedExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: PublishedExtension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setPagingToken(value: String): Self = StObject.set(x, "pagingToken", value.asInstanceOf[js.Any])
    
    inline def setResultMetadata(value: js.Array[ExtensionFilterResultMetadata]): Self = StObject.set(x, "resultMetadata", value.asInstanceOf[js.Any])
    
    inline def setResultMetadataVarargs(value: ExtensionFilterResultMetadata*): Self = StObject.set(x, "resultMetadata", js.Array(value*))
  }
}
