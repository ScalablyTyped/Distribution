package typings.twilio

import typings.std.Record
import typings.twilio.anon.AddressSid
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentDependentHostedNumberOrderMod.DependentHostedNumberOrderListInstance
import typings.twilio.libRestPreviewHostedNumbersMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewHostedNumbersAuthorizationDocumentMod {
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", "AuthorizationDocumentContextImpl")
  @js.native
  open class AuthorizationDocumentContextImpl protected ()
    extends StObject
       with AuthorizationDocumentContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _dependentHostedNumberOrders: js.UndefOr[DependentHostedNumberOrderListInstance] = js.native
    
    /* protected */ var _solution: AuthorizationDocumentContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    @JSName("dependentHostedNumberOrders")
    def dependentHostedNumberOrders_MAuthorizationDocumentContextImpl: DependentHostedNumberOrderListInstance = js.native
    
    def update(
      params: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AuthorizationDocumentInstance], 
          Any
        ],
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", "AuthorizationDocumentInstance")
  @js.native
  open class AuthorizationDocumentInstance protected () extends StObject {
    def this(_version: default, payload: AuthorizationDocumentResource) = this()
    def this(_version: default, payload: AuthorizationDocumentResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[AuthorizationDocumentContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: AuthorizationDocumentContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * A 34 character string that uniquely identifies the Address resource that is associated with this AuthorizationDocument.
      */
    var addressSid: String = js.native
    
    /**
      * Email recipients who will be informed when an Authorization Document has been sent and signed.
      */
    var ccEmails: js.Array[String] = js.native
    
    /**
      * The date this resource was created, given as [GMT RFC 2822](http://www.ietf.org/rfc/rfc2822.txt) format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * The date that this resource was updated, given as [GMT RFC 2822](http://www.ietf.org/rfc/rfc2822.txt) format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * Access the dependentHostedNumberOrders.
      */
    def dependentHostedNumberOrders(): DependentHostedNumberOrderListInstance = js.native
    
    /**
      * Email that this AuthorizationDocument will be sent to for signing.
      */
    var email: String = js.native
    
    /**
      * Fetch a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AuthorizationDocumentInstance
      */
    def fetch(): js.Promise[AuthorizationDocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AuthorizationDocumentInstance] = js.native
    
    var links: Record[String, String] = js.native
    
    /**
      * A 34 character string that uniquely identifies this AuthorizationDocument.
      */
    var sid: String = js.native
    
    var status: AuthorizationDocumentStatus = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): AddressSid = js.native
    
    /**
      * Update a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AuthorizationDocumentInstance
      */
    def update(): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AuthorizationDocumentInstance] = js.native
    /**
      * Update a AuthorizationDocumentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AuthorizationDocumentInstance
      */
    def update(params: AuthorizationDocumentContextUpdateOptions): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      params: AuthorizationDocumentContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait AuthorizationDocumentListInstance extends StObject {
    
    def apply(sid: String): AuthorizationDocumentContext = js.native
    
    var _solution: AuthorizationDocumentSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a AuthorizationDocumentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AuthorizationDocumentInstance
      */
    def create(params: AuthorizationDocumentListInstanceCreateOptions): js.Promise[AuthorizationDocumentInstance] = js.native
    def create(
      params: AuthorizationDocumentListInstanceCreateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AuthorizationDocumentInstance], 
          Any
        ]
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
      * @param { AuthorizationDocumentListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ AuthorizationDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: AuthorizationDocumentListInstanceEachOptions): Unit = js.native
    def each(
      params: AuthorizationDocumentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AuthorizationDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): AuthorizationDocumentContext = js.native
    
    /**
      * Retrieve a single target page of AuthorizationDocumentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[AuthorizationDocumentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]
    ): js.Promise[AuthorizationDocumentPage] = js.native
    
    /**
      * Lists AuthorizationDocumentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { AuthorizationDocumentListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    def list(params: AuthorizationDocumentListInstanceOptions): js.Promise[js.Array[AuthorizationDocumentInstance]] = js.native
    def list(
      params: AuthorizationDocumentListInstanceOptions,
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
      * @param { AuthorizationDocumentListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[AuthorizationDocumentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]): js.Promise[AuthorizationDocumentPage] = js.native
    def page(params: AuthorizationDocumentListInstancePageOptions): js.Promise[AuthorizationDocumentPage] = js.native
    def page(
      params: AuthorizationDocumentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthorizationDocumentPage, Any]
    ): js.Promise[AuthorizationDocumentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object AuthorizationDocumentListInstance {
    
    @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", "AuthorizationDocumentListInstance")
    @js.native
    def apply(version: default): AuthorizationDocumentListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument", "AuthorizationDocumentPage")
  @js.native
  open class AuthorizationDocumentPage protected ()
    extends typings.twilio.libBasePageMod.default[
          default, 
          AuthorizationDocumentPayload, 
          AuthorizationDocumentResource, 
          AuthorizationDocumentInstance
        ] {
    /**
      * Initialize the AuthorizationDocumentPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: AuthorizationDocumentSolution
    ) = this()
    
    /**
      * Build an instance of AuthorizationDocumentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AuthorizationDocumentResource): AuthorizationDocumentInstance = js.native
  }
  
  @js.native
  trait AuthorizationDocumentContext extends StObject {
    
    var dependentHostedNumberOrders: DependentHostedNumberOrderListInstance = js.native
    
    /**
      * Fetch a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AuthorizationDocumentInstance
      */
    def fetch(): js.Promise[AuthorizationDocumentInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a AuthorizationDocumentInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AuthorizationDocumentInstance
      */
    def update(): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
    /**
      * Update a AuthorizationDocumentInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AuthorizationDocumentInstance
      */
    def update(params: AuthorizationDocumentContextUpdateOptions): js.Promise[AuthorizationDocumentInstance] = js.native
    def update(
      params: AuthorizationDocumentContextUpdateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AuthorizationDocumentInstance], 
          Any
        ]
    ): js.Promise[AuthorizationDocumentInstance] = js.native
  }
  
  trait AuthorizationDocumentContextSolution extends StObject {
    
    var sid: String
  }
  object AuthorizationDocumentContextSolution {
    
    inline def apply(sid: String): AuthorizationDocumentContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationDocumentContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorizationDocumentContextUpdateOptions extends StObject {
    
    /** A 34 character string that uniquely identifies the Address resource that is associated with this AuthorizationDocument. */
    var addressSid: js.UndefOr[String] = js.undefined
    
    /** Email recipients who will be informed when an Authorization Document has been sent and signed */
    var ccEmails: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The contact phone number of the person authorized to sign the Authorization Document. */
    var contactPhoneNumber: js.UndefOr[String] = js.undefined
    
    /** The title of the person authorized to sign the Authorization Document for this phone number. */
    var contactTitle: js.UndefOr[String] = js.undefined
    
    /** Email that this AuthorizationDocument will be sent to for signing. */
    var email: js.UndefOr[String] = js.undefined
    
    /** A list of HostedNumberOrder sids that this AuthorizationDocument will authorize for hosting phone number capabilities on Twilio\\\'s platform. */
    var hostedNumberOrderSids: js.UndefOr[js.Array[String]] = js.undefined
    
    /**  */
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentContextUpdateOptions {
    
    inline def apply(): AuthorizationDocumentContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setAddressSidUndefined: Self = StObject.set(x, "addressSid", js.undefined)
      
      inline def setCcEmails(value: js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
      inline def setCcEmailsUndefined: Self = StObject.set(x, "ccEmails", js.undefined)
      
      inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
      
      inline def setContactPhoneNumber(value: String): Self = StObject.set(x, "contactPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setContactPhoneNumberUndefined: Self = StObject.set(x, "contactPhoneNumber", js.undefined)
      
      inline def setContactTitle(value: String): Self = StObject.set(x, "contactTitle", value.asInstanceOf[js.Any])
      
      inline def setContactTitleUndefined: Self = StObject.set(x, "contactTitle", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHostedNumberOrderSids(value: js.Array[String]): Self = StObject.set(x, "hostedNumberOrderSids", value.asInstanceOf[js.Any])
      
      inline def setHostedNumberOrderSidsUndefined: Self = StObject.set(x, "hostedNumberOrderSids", js.undefined)
      
      inline def setHostedNumberOrderSidsVarargs(value: String*): Self = StObject.set(x, "hostedNumberOrderSids", js.Array(value*))
      
      inline def setStatus(value: AuthorizationDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait AuthorizationDocumentListInstanceCreateOptions extends StObject {
    
    /** A 34 character string that uniquely identifies the Address resource that is associated with this AuthorizationDocument. */
    var addressSid: String
    
    /** Email recipients who will be informed when an Authorization Document has been sent and signed. */
    var ccEmails: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The contact phone number of the person authorized to sign the Authorization Document. */
    var contactPhoneNumber: String
    
    /** The title of the person authorized to sign the Authorization Document for this phone number. */
    var contactTitle: String
    
    /** Email that this AuthorizationDocument will be sent to for signing. */
    var email: String
    
    /** A list of HostedNumberOrder sids that this AuthorizationDocument will authorize for hosting phone number capabilities on Twilio\\\'s platform. */
    var hostedNumberOrderSids: js.Array[String]
  }
  object AuthorizationDocumentListInstanceCreateOptions {
    
    inline def apply(
      addressSid: String,
      contactPhoneNumber: String,
      contactTitle: String,
      email: String,
      hostedNumberOrderSids: js.Array[String]
    ): AuthorizationDocumentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(addressSid = addressSid.asInstanceOf[js.Any], contactPhoneNumber = contactPhoneNumber.asInstanceOf[js.Any], contactTitle = contactTitle.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hostedNumberOrderSids = hostedNumberOrderSids.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationDocumentListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
      
      inline def setCcEmails(value: js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
      
      inline def setCcEmailsUndefined: Self = StObject.set(x, "ccEmails", js.undefined)
      
      inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
      
      inline def setContactPhoneNumber(value: String): Self = StObject.set(x, "contactPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setContactTitle(value: String): Self = StObject.set(x, "contactTitle", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setHostedNumberOrderSids(value: js.Array[String]): Self = StObject.set(x, "hostedNumberOrderSids", value.asInstanceOf[js.Any])
      
      inline def setHostedNumberOrderSidsVarargs(value: String*): Self = StObject.set(x, "hostedNumberOrderSids", js.Array(value*))
    }
  }
  
  trait AuthorizationDocumentListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AuthorizationDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Email that this AuthorizationDocument will be sent to for signing. */
    var email: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** Status of an instance resource. It can hold one of the values: 1. opened 2. signing, 3. signed LOA, 4. canceled, 5. failed. See the section entitled [Status Values](https://www.twilio.com/docs/api/phone-numbers/hosted-number-authorization-documents#status-values) for more information on each of these statuses. */
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentListInstanceEachOptions {
    
    inline def apply(): AuthorizationDocumentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentListInstanceEachOptions] (val x: Self) extends AnyVal {
      
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
  
  trait AuthorizationDocumentListInstanceOptions extends StObject {
    
    /** Email that this AuthorizationDocument will be sent to for signing. */
    var email: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** Status of an instance resource. It can hold one of the values: 1. opened 2. signing, 3. signed LOA, 4. canceled, 5. failed. See the section entitled [Status Values](https://www.twilio.com/docs/api/phone-numbers/hosted-number-authorization-documents#status-values) for more information on each of these statuses. */
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentListInstanceOptions {
    
    inline def apply(): AuthorizationDocumentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentListInstanceOptions] (val x: Self) extends AnyVal {
      
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
  
  trait AuthorizationDocumentListInstancePageOptions extends StObject {
    
    /** Email that this AuthorizationDocument will be sent to for signing. */
    var email: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** Status of an instance resource. It can hold one of the values: 1. opened 2. signing, 3. signed LOA, 4. canceled, 5. failed. See the section entitled [Status Values](https://www.twilio.com/docs/api/phone-numbers/hosted-number-authorization-documents#status-values) for more information on each of these statuses. */
    var status: js.UndefOr[AuthorizationDocumentStatus] = js.undefined
  }
  object AuthorizationDocumentListInstancePageOptions {
    
    inline def apply(): AuthorizationDocumentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationDocumentListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentListInstancePageOptions] (val x: Self) extends AnyVal {
      
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
       with TwilioResponsePayload {
    
    var items: js.Array[AuthorizationDocumentResource]
  }
  object AuthorizationDocumentPayload {
    
    inline def apply(
      first_page_uri: String,
      items: js.Array[AuthorizationDocumentResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): AuthorizationDocumentPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationDocumentPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentPayload] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[AuthorizationDocumentResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: AuthorizationDocumentResource*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait AuthorizationDocumentResource extends StObject {
    
    var address_sid: String
    
    var cc_emails: js.Array[String]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var links: Record[String, String]
    
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
      links: Record[String, String],
      sid: String,
      status: AuthorizationDocumentStatus,
      url: String
    ): AuthorizationDocumentResource = {
      val __obj = js.Dynamic.literal(address_sid = address_sid.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationDocumentResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationDocumentResource] (val x: Self) extends AnyVal {
      
      inline def setAddress_sid(value: String): Self = StObject.set(x, "address_sid", value.asInstanceOf[js.Any])
      
      inline def setCc_emails(value: js.Array[String]): Self = StObject.set(x, "cc_emails", value.asInstanceOf[js.Any])
      
      inline def setCc_emailsVarargs(value: String*): Self = StObject.set(x, "cc_emails", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
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
