package typings.stripe.mod

import typings.stripe.stripeStrings.file_link
import typings.stripe.stripeStrings.now
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileLinks {
  
  trait IFileLink
    extends StObject
       with IResourceObject {
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * Whether this link is already expired.
      */
    var expired: Boolean
    
    /**
      * Time at which the link expires.
      */
    var expires_at: Double | Null
    
    /**
      * The file object this link points to
      */
    var file: String
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: IMetadata
    
    /**
      * Value is 'file_link'
      */
    @JSName("object")
    var object_IFileLink: file_link
    
    /**
      * The publicly accessible URL to download the file.
      */
    var url: String
  }
  object IFileLink {
    
    inline def apply(
      created: Double,
      expired: Boolean,
      file: String,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      url: String
    ): IFileLink = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], expires_at = null)
      __obj.updateDynamic("object")("file_link")
      __obj.asInstanceOf[IFileLink]
    }
    
    extension [Self <: IFileLink](x: Self) {
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setObject(value: file_link): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileLinksCreationOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * A future timestamp after which the link will no longer be usable.
      */
    var expires_at: js.UndefOr[Double] = js.undefined
    
    /**
      * The ID of the file
      */
    var file: String
  }
  object IFileLinksCreationOptions {
    
    inline def apply(file: String): IFileLinksCreationOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileLinksCreationOptions]
    }
    
    extension [Self <: IFileLinksCreationOptions](x: Self) {
      
      inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      inline def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileLinksListOptions
    extends StObject
       with IListOptionsCreated {
    
    /**
      * Filter links by their expiration status. By default, all links are returned.
      */
    var expired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only return links for the given file.
      */
    var file: js.UndefOr[String] = js.undefined
  }
  object IFileLinksListOptions {
    
    inline def apply(): IFileLinksListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileLinksListOptions]
    }
    
    extension [Self <: IFileLinksListOptions](x: Self) {
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  trait IFileLinksUpdateOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    var expires_at: js.UndefOr[Double | now] = js.undefined
  }
  object IFileLinksUpdateOptions {
    
    inline def apply(): IFileLinksUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileLinksUpdateOptions]
    }
    
    extension [Self <: IFileLinksUpdateOptions](x: Self) {
      
      inline def setExpires_at(value: Double | now): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      inline def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    }
  }
}
