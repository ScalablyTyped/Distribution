package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentDependentHostedNumberOrderMod.DependentHostedNumberOrderListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewHostedNumbersAuthorizationDocumentMod {
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", "AuthorizationDocumentContext")
  @js.native
  open class AuthorizationDocumentContext protected () extends StObject {
    /**
      * Initialize the AuthorizationDocumentContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - AuthorizationDocument sid.
      */
    def this(version: typings.twilio.libRestPreviewHostedNumbersMod.^, sid: String) = this()
    
    var dependentHostedNumberOrders: DependentHostedNumberOrderListInstance = js.native
    
    /**
      * fetch a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthorizationDocumentInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentInstance, Any]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentInstance, Any]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentInstance, Any]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(opts: AuthorizationDocumentInstanceUpdateOptions): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      opts: AuthorizationDocumentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentInstance, Any]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", "AuthorizationDocumentInstance")
  @js.native
  open class AuthorizationDocumentInstance protected () extends SerializableClass {
    /**
      * Initialize the AuthorizationDocumentContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - AuthorizationDocument sid.
      */
    def this(
      version: typings.twilio.libRestPreviewHostedNumbersMod.^,
      payload: AuthorizationDocumentPayload,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AuthorizationDocumentContext = js.native
    
    var addressSid: String = js.native
    
    var ccEmails: js.Array[String] = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the dependentHostedNumberOrders
      */
    def dependentHostedNumberOrders(): DependentHostedNumberOrderListInstance = js.native
    
    var email: String = js.native
    
    /**
      * fetch a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AuthorizationDocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AuthorizationDocumentInstance] = js.native
    
    var links: String = js.native
    
    var sid: String = js.native
    
    var status: AuthorizationDocumentStatus = js.native
    
    /**
      * update a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(opts: AuthorizationDocumentInstanceUpdateOptions): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      opts: AuthorizationDocumentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AuthorizationDocumentList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def AuthorizationDocumentList(version: typings.twilio.libRestPreviewHostedNumbersMod.^): AuthorizationDocumentListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthorizationDocumentList")(version.asInstanceOf[js.Any]).asInstanceOf[AuthorizationDocumentListInstance]
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", "AuthorizationDocumentPage")
  @js.native
  open class AuthorizationDocumentPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewHostedNumbersMod.^, 
          AuthorizationDocumentPayload, 
          AuthorizationDocumentResource, 
          AuthorizationDocumentInstance
        ] {
    /**
      * Initialize the AuthorizationDocumentPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.libRestPreviewHostedNumbersMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: AuthorizationDocumentSolution
    ) = this()
    
    /**
      * Build an instance of AuthorizationDocumentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AuthorizationDocumentPayload): AuthorizationDocumentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property addressSid - Address sid.
    * @property ccEmails - A list of emails.
    * @property contactPhoneNumber - Authorization Document's signee's phone number.
    * @property contactTitle - Title of signee of this Authorization Document.
    * @property email - Email.
    * @property hostedNumberOrderSids - A list of HostedNumberOrder sids.
    * @property status - The Status of this AuthorizationDocument.
    */
  trait AuthorizationDocumentInstanceUpdateOptions extends StObject {
    
    var addressSid: js.UndefOr[String] = js.undefined
    
    var ccEmails: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var contactPhoneNumber: js.UndefOr[String] = js.undefined
    
    var contactTitle: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var hostedNumberOrderSids: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentInstanceUpdateOptions {
    
    inline def apply(): AuthorizationDocumentInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentInstanceUpdateOptions]
    }
    
    extension [Self <: AuthorizationDocumentInstanceUpdateOptions](x: Self) {
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setAddressSidUndefined: Self = StObject.set(x, "addressSid", js.undefined)
      
      inline def setCcEmails(value: String | js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
      inline def setCcEmailsUndefined: Self = StObject.set(x, "ccEmails", js.undefined)
      
      inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
      
      inline def setContactPhoneNumber(value: String): Self = StObject.set(x, "contactPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setContactPhoneNumberUndefined: Self = StObject.set(x, "contactPhoneNumber", js.undefined)
      
      inline def setContactTitle(value: String): Self = StObject.set(x, "contactTitle", value.asInstanceOf[js.Any])
      
      inline def setContactTitleUndefined: Self = StObject.set(x, "contactTitle", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHostedNumberOrderSids(value: String | js.Array[String]): Self = StObject.set(x, "hostedNumberOrderSids", value.asInstanceOf[js.Any])
      
      inline def setHostedNumberOrderSidsUndefined: Self = StObject.set(x, "hostedNumberOrderSids", js.undefined)
      
      inline def setHostedNumberOrderSidsVarargs(value: String*): Self = StObject.set(x, "hostedNumberOrderSids", js.Array(value*))
      
      inline def setStatus(value: AuthorizationDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait AuthorizationDocumentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AuthorizationDocumentContext = js.native
    
    /**
      * create a AuthorizationDocumentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AuthorizationDocumentListInstanceCreateOptions): js.Promise[AuthorizationDocumentInstance] = js.native
    def create(
      opts: AuthorizationDocumentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AuthorizationDocumentInstance, Any]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    
    /**
      * Streams AuthorizationDocumentInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ AuthorizationDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AuthorizationDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AuthorizationDocumentListInstanceEachOptions): Unit = js.native
    def each(
      opts: AuthorizationDocumentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AuthorizationDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a authorization_document
      *
      * @param sid - AuthorizationDocument sid.
      */
    def get(sid: String): AuthorizationDocumentContext = js.native
    
    /**
      * Retrieve a single target page of AuthorizationDocumentInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AuthorizationDocumentPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]): js.Promise[AuthorizationDocumentPage] = js.native
    def getPage(targetUrl: String): js.Promise[AuthorizationDocumentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]
    ): js.Promise[AuthorizationDocumentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]
    ): js.Promise[AuthorizationDocumentPage] = js.native
    
    /**
      * Lists AuthorizationDocumentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    def list(opts: AuthorizationDocumentListInstanceOptions): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    def list(
      opts: AuthorizationDocumentListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    
    /**
      * Retrieve a single page of AuthorizationDocumentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AuthorizationDocumentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]): js.Promise[AuthorizationDocumentPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]
    ): js.Promise[AuthorizationDocumentPage] = js.native
    def page(opts: AuthorizationDocumentListInstancePageOptions): js.Promise[AuthorizationDocumentPage] = js.native
    def page(
      opts: AuthorizationDocumentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]
    ): js.Promise[AuthorizationDocumentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property addressSid - Address sid.
    * @property ccEmails - A list of emails.
    * @property contactPhoneNumber - Authorization Document's signee's phone number.
    * @property contactTitle - Title of signee of this Authorization Document.
    * @property email - Email.
    * @property hostedNumberOrderSids - A list of HostedNumberOrder sids.
    */
  trait AuthorizationDocumentListInstanceCreateOptions extends StObject {
    
    var addressSid: String
    
    var ccEmails: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var contactPhoneNumber: String
    
    var contactTitle: String
    
    var email: String
    
    var hostedNumberOrderSids: String | js.Array[String]
  }
  object AuthorizationDocumentListInstanceCreateOptions {
    
    inline def apply(
      addressSid: String,
      contactPhoneNumber: String,
      contactTitle: String,
      email: String,
      hostedNumberOrderSids: String | js.Array[String]
    ): AuthorizationDocumentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(addressSid = addressSid.asInstanceOf[js.Any], contactPhoneNumber = contactPhoneNumber.asInstanceOf[js.Any], contactTitle = contactTitle.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hostedNumberOrderSids = hostedNumberOrderSids.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationDocumentListInstanceCreateOptions]
    }
    
    extension [Self <: AuthorizationDocumentListInstanceCreateOptions](x: Self) {
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setCcEmails(value: String | js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
      inline def setCcEmailsUndefined: Self = StObject.set(x, "ccEmails", js.undefined)
      
      inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
      
      inline def setContactPhoneNumber(value: String): Self = StObject.set(x, "contactPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setContactTitle(value: String): Self = StObject.set(x, "contactTitle", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setHostedNumberOrderSids(value: String | js.Array[String]): Self = StObject.set(x, "hostedNumberOrderSids", value.asInstanceOf[js.Any])
      
      inline def setHostedNumberOrderSidsVarargs(value: String*): Self = StObject.set(x, "hostedNumberOrderSids", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property email - Email.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property status - The Status of this AuthorizationDocument.
    */
  trait AuthorizationDocumentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AuthorizationDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentListInstanceEachOptions {
    
    inline def apply(): AuthorizationDocumentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentListInstanceEachOptions]
    }
    
    extension [Self <: AuthorizationDocumentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AuthorizationDocumentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: AuthorizationDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property email - Email.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property status - The Status of this AuthorizationDocument.
    */
  trait AuthorizationDocumentListInstanceOptions extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentListInstanceOptions {
    
    inline def apply(): AuthorizationDocumentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentListInstanceOptions]
    }
    
    extension [Self <: AuthorizationDocumentListInstanceOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: AuthorizationDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property email - Email.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - The Status of this AuthorizationDocument.
    */
  trait AuthorizationDocumentListInstancePageOptions extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentListInstancePageOptions {
    
    inline def apply(): AuthorizationDocumentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentListInstancePageOptions]
    }
    
    extension [Self <: AuthorizationDocumentListInstancePageOptions](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: AuthorizationDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait AuthorizationDocumentPayload
    extends StObject
       with AuthorizationDocumentResource
       with TwilioResponsePayload
  object AuthorizationDocumentPayload {
    
    inline def apply(
      address_sid: String,
      cc_emails: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: AuthorizationDocumentStatus,
      uri: String,
      url: String
    ): AuthorizationDocumentPayload = {
      val __obj = js.Dynamic.literal(address_sid = address_sid.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationDocumentPayload]
    }
  }
  
  trait AuthorizationDocumentResource extends StObject {
    
    var address_sid: String
    
    var cc_emails: js.Array[String]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var links: String
    
    var sid: String
    
    var status: AuthorizationDocumentStatus
    
    var url: String
  }
  object AuthorizationDocumentResource {
    
    inline def apply(
      address_sid: String,
      cc_emails: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      links: String,
      sid: String,
      status: AuthorizationDocumentStatus,
      url: String
    ): AuthorizationDocumentResource = {
      val __obj = js.Dynamic.literal(address_sid = address_sid.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationDocumentResource]
    }
    
    extension [Self <: AuthorizationDocumentResource](x: Self) {
      
      inline def setAddress_sid(value: String): Self = StObject.set(x, "address_sid", value.asInstanceOf[js.Any])
      
      inline def setCc_emails(value: js.Array[String]): Self = StObject.set(x, "cc_emails", value.asInstanceOf[js.Any])
      
      inline def setCc_emailsVarargs(value: String*): Self = StObject.set(x, "cc_emails", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: AuthorizationDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorizationDocumentSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.opened
    - typings.twilio.twilioStrings.signing
    - typings.twilio.twilioStrings.signed
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.failed
  */
  trait AuthorizationDocumentStatus extends StObject
  object AuthorizationDocumentStatus {
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def failed: typings.twilio.twilioStrings.failed = "failed".asInstanceOf[typings.twilio.twilioStrings.failed]
    
    inline def opened: typings.twilio.twilioStrings.opened = "opened".asInstanceOf[typings.twilio.twilioStrings.opened]
    
    inline def signed: typings.twilio.twilioStrings.signed = "signed".asInstanceOf[typings.twilio.twilioStrings.signed]
    
    inline def signing: typings.twilio.twilioStrings.signing = "signing".asInstanceOf[typings.twilio.twilioStrings.signing]
  }
}
