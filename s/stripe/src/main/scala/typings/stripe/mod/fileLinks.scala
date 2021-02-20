package typings.stripe.mod

import typings.stripe.stripeStrings.file_link
import typings.stripe.stripeStrings.now
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileLinks {
  
  @js.native
  trait IFileLink extends IResourceObject {
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * Whether this link is already expired.
      */
    var expired: Boolean = js.native
    
    /**
      * Time at which the link expires.
      */
    var expires_at: Double | Null = js.native
    
    /**
      * The file object this link points to
      */
    var file: String = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: IMetadata = js.native
    
    /**
      * Value is 'file_link'
      */
    @JSName("object")
    var object_IFileLink: file_link = js.native
    
    /**
      * The publicly accessible URL to download the file.
      */
    var url: String = js.native
  }
  object IFileLink {
    
    @scala.inline
    def apply(
      created: Double,
      expired: Boolean,
      file: String,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      `object`: file_link,
      url: String
    ): IFileLink = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileLink]
    }
    
    @scala.inline
    implicit class IFileLinkMutableBuilder[Self <: IFileLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: file_link): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFileLinksCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * A future timestamp after which the link will no longer be usable.
      */
    var expires_at: js.UndefOr[Double] = js.native
    
    /**
      * The ID of the file
      */
    var file: String = js.native
  }
  object IFileLinksCreationOptions {
    
    @scala.inline
    def apply(file: String): IFileLinksCreationOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileLinksCreationOptions]
    }
    
    @scala.inline
    implicit class IFileLinksCreationOptionsMutableBuilder[Self <: IFileLinksCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFileLinksListOptions extends IListOptionsCreated {
    
    /**
      * Filter links by their expiration status. By default, all links are returned.
      */
    var expired: js.UndefOr[Boolean] = js.native
    
    /**
      * Only return links for the given file.
      */
    var file: js.UndefOr[String] = js.native
  }
  object IFileLinksListOptions {
    
    @scala.inline
    def apply(): IFileLinksListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileLinksListOptions]
    }
    
    @scala.inline
    implicit class IFileLinksListOptionsMutableBuilder[Self <: IFileLinksListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  @js.native
  trait IFileLinksUpdateOptions extends IDataOptionsWithMetadata {
    
    var expires_at: js.UndefOr[Double | now] = js.native
  }
  object IFileLinksUpdateOptions {
    
    @scala.inline
    def apply(): IFileLinksUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileLinksUpdateOptions]
    }
    
    @scala.inline
    implicit class IFileLinksUpdateOptionsMutableBuilder[Self <: IFileLinksUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires_at(value: Double | now): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    }
  }
}
