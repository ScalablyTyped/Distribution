package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.File.Purpose
import typings.stripe.mod.Stripe.FileLink
import typings.stripe.stripeStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.File> */
trait ResponseFile extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The time at which the file expires and is no longer available in epoch seconds.
    */
  var expires_at: Double | Null
  
  /**
    * A filename for the file, suitable for saving to a filesystem.
    */
  var filename: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * A list of [file links](https://stripe.com/docs/api#file_links) that point at this file.
    */
  var links: js.UndefOr[ApiList[FileLink] | Null] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: file
  
  /**
    * The [purpose](https://stripe.com/docs/file-upload#uploading-a-file) of the uploaded file.
    */
  var purpose: Purpose
  
  /**
    * The size in bytes of the file object.
    */
  var size: Double
  
  /**
    * A user friendly title for the document.
    */
  var title: String | Null
  
  /**
    * The type of the file returned (e.g., `csv`, `pdf`, `jpg`, or `png`).
    */
  var `type`: String | Null
  
  /**
    * The URL from which the file can be downloaded using your live secret API key.
    */
  var url: String | Null
}
object ResponseFile {
  
  inline def apply(created: Double, id: String, lastResponse: ApiVersion, purpose: Purpose, size: Double): ResponseFile = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], expires_at = null, filename = null, title = null, url = null)
    __obj.updateDynamic("object")("file")
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[ResponseFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseFile] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: ApiList[FileLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksNull: Self = StObject.set(x, "links", null)
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setObject(value: file): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPurpose(value: Purpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
