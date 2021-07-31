package typings.stripe.mod

import typings.stripe.anon.Data
import typings.stripe.stripeStrings.file
import typings.stripe.stripeStrings.jpg
import typings.stripe.stripeStrings.pdf
import typings.stripe.stripeStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object files {
  
  trait IFileCreationOptions
    extends StObject
       with IDataOptions {
    
    var file: Data
    
    var purpose: IPurpose
  }
  object IFileCreationOptions {
    
    @scala.inline
    def apply(file: Data, purpose: IPurpose): IFileCreationOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileCreationOptions]
    }
    
    @scala.inline
    implicit class IFileCreationOptionsMutableBuilder[Self <: IFileCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Data): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurpose(value: IPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileListOptions
    extends StObject
       with IListOptionsCreated {
    
    /**
      * The file purpose to filter queries by. If none is provided, files will not be
      * filtered by purpose.
      */
    var purpose: IPurpose
  }
  object IFileListOptions {
    
    @scala.inline
    def apply(purpose: IPurpose): IFileListOptions = {
      val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileListOptions]
    }
    
    @scala.inline
    implicit class IFileListOptionsMutableBuilder[Self <: IFileListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPurpose(value: IPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileUpdate
    extends StObject
       with IResourceObject {
    
    var created: Double
    
    /**
      * Value is "file"
      */
    @JSName("object")
    var object_IFileUpdate: file
    
    /**
      * The purpose of the uploaded file. Possible values are "business_logo",
      * "dispute_evidence", "identity_document", "incorporation_article",
      * "incorporation_document".
      */
    var purpose: IPurpose
    
    /**
      * The size in bytes of the file object.
      */
    var size: Double
    
    /**
      * The type of the file returned. Returns one of the following:
      * pdf, jpg, png.
      */
    var `type`: pdf | jpg | png
    
    /**
      * A read-only URL where the uploaded file can be accessed. Will be nil
      * unless the uploaded file has one of the following purposes:
      *  business_logo, dispute_evidence, incorporation_document.
      * Also nil if retrieved with the publishable API key.
      */
    var url: String
  }
  object IFileUpdate {
    
    @scala.inline
    def apply(created: Double, id: String, purpose: IPurpose, size: Double, `type`: pdf | jpg | png, url: String): IFileUpdate = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("file")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileUpdate]
    }
    
    @scala.inline
    implicit class IFileUpdateMutableBuilder[Self <: IFileUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: file): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurpose(value: IPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: pdf | jpg | png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.business_logo
    - typings.stripe.stripeStrings.dispute_evidence
    - typings.stripe.stripeStrings.identity_document
    - typings.stripe.stripeStrings.incorporation_article
    - typings.stripe.stripeStrings.incorporation_document
  */
  trait IPurpose extends StObject
  object IPurpose {
    
    @scala.inline
    def business_logo: typings.stripe.stripeStrings.business_logo = "business_logo".asInstanceOf[typings.stripe.stripeStrings.business_logo]
    
    @scala.inline
    def dispute_evidence: typings.stripe.stripeStrings.dispute_evidence = "dispute_evidence".asInstanceOf[typings.stripe.stripeStrings.dispute_evidence]
    
    @scala.inline
    def identity_document: typings.stripe.stripeStrings.identity_document = "identity_document".asInstanceOf[typings.stripe.stripeStrings.identity_document]
    
    @scala.inline
    def incorporation_article: typings.stripe.stripeStrings.incorporation_article = "incorporation_article".asInstanceOf[typings.stripe.stripeStrings.incorporation_article]
    
    @scala.inline
    def incorporation_document: typings.stripe.stripeStrings.incorporation_document = "incorporation_document".asInstanceOf[typings.stripe.stripeStrings.incorporation_document]
  }
}
