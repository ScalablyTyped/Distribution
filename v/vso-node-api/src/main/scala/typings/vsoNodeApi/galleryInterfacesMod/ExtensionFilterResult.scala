package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionFilterResult extends js.Object {
  
  /**
    * This is the set of appplications that matched the query filter supplied.
    */
  var extensions: js.Array[PublishedExtension] = js.native
  
  /**
    * The PagingToken is returned from a request when more records exist that match the result than were requested or could be returned. A follow-up query with this paging token can be used to retrieve more results.
    */
  var pagingToken: String = js.native
  
  /**
    * This is the additional optional metadata for the given result. E.g. Total count of results which is useful in case of paged results
    */
  var resultMetadata: js.Array[ExtensionFilterResultMetadata] = js.native
}
object ExtensionFilterResult {
  
  @scala.inline
  def apply(
    extensions: js.Array[PublishedExtension],
    pagingToken: String,
    resultMetadata: js.Array[ExtensionFilterResultMetadata]
  ): ExtensionFilterResult = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], pagingToken = pagingToken.asInstanceOf[js.Any], resultMetadata = resultMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFilterResult]
  }
  
  @scala.inline
  implicit class ExtensionFilterResultOps[Self <: ExtensionFilterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtensionsVarargs(value: PublishedExtension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[PublishedExtension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingToken(value: String): Self = this.set("pagingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMetadataVarargs(value: ExtensionFilterResultMetadata*): Self = this.set("resultMetadata", js.Array(value :_*))
    
    @scala.inline
    def setResultMetadata(value: js.Array[ExtensionFilterResultMetadata]): Self = this.set("resultMetadata", value.asInstanceOf[js.Any])
  }
}
