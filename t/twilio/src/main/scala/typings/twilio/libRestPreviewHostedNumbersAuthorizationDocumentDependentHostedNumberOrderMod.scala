package typings.twilio

import typings.twilio.anon.CallDelay
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.PhoneNumberCapabilities
import typings.twilio.libRestPreviewHostedNumbersMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewHostedNumbersAuthorizationDocumentDependentHostedNumberOrderMod {
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument/dependentHostedNumberOrder", "DependentHostedNumberOrderInstance")
  @js.native
  open class DependentHostedNumberOrderInstance protected () extends StObject {
    def this(_version: default, payload: DependentHostedNumberOrderResource, signingDocumentSid: String) = this()
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique SID identifier of the Account.
      */
    var accountSid: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the Address resource that represents the address of the owner of this phone number.
      */
    var addressSid: String = js.native
    
    /**
      * A value between 0-30 specifying the number of seconds to delay initiating the ownership verification call.
      */
    var callDelay: Double = js.native
    
    var capabilities: PhoneNumberCapabilities = js.native
    
    /**
      * Email recipients who will be informed when an Authorization Document has been sent and signed
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
      * Email of the owner of this phone number that is being hosted.
      */
    var email: String = js.native
    
    /**
      * A numerical extension to be used when making the ownership verification call.
      */
    var `extension`: String = js.native
    
    /**
      * A message that explains why a hosted_number_order went to status \"action-required\"
      */
    var failureReason: String = js.native
    
    /**
      * A human readable description of this resource, up to 64 characters.
      */
    var friendlyName: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the IncomingPhoneNumber resource created by this HostedNumberOrder.
      */
    var incomingPhoneNumberSid: String = js.native
    
    /**
      * An E164 formatted phone number hosted by this HostedNumberOrder.
      */
    var phoneNumber: String = js.native
    
    /**
      * A 34 character string that uniquely identifies this Authorization Document
      */
    var sid: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the LOA document associated with this HostedNumberOrder.
      */
    var signingDocumentSid: String = js.native
    
    var status: DependentHostedNumberOrderStatus = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): CallDelay = js.native
    
    /**
      * Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID.
      */
    var uniqueName: String = js.native
    
    /**
      * The number of attempts made to verify ownership of the phone number that is being hosted.
      */
    var verificationAttempts: Double = js.native
    
    /**
      * A list of 34 character strings that are unique identifiers for the calls placed as part of ownership verification.
      */
    var verificationCallSids: js.Array[String] = js.native
    
    /**
      * The digits passed during the ownership verification call.
      */
    var verificationCode: String = js.native
    
    /**
      * A 34 character string that uniquely identifies the Identity Document resource that represents the document for verifying ownership of the number to be hosted.
      */
    var verificationDocumentSid: String = js.native
    
    var verificationType: DependentHostedNumberOrderVerificationType = js.native
  }
  
  @js.native
  trait DependentHostedNumberOrderListInstance extends StObject {
    
    var _solution: DependentHostedNumberOrderSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Streams DependentHostedNumberOrderInstance records from the API.
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
      * @param { DependentHostedNumberOrderListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ DependentHostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: DependentHostedNumberOrderListInstanceEachOptions): Unit = js.native
    def each(
      params: DependentHostedNumberOrderListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DependentHostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of DependentHostedNumberOrderInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[DependentHostedNumberOrderPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    
    /**
      * Lists DependentHostedNumberOrderInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { DependentHostedNumberOrderListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[DependentHostedNumberOrderInstance], 
          Any
        ]
    ): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    def list(params: DependentHostedNumberOrderListInstanceOptions): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    def list(
      params: DependentHostedNumberOrderListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[DependentHostedNumberOrderInstance], 
          Any
        ]
    ): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    
    /**
      * Retrieve a single page of DependentHostedNumberOrderInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { DependentHostedNumberOrderListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[DependentHostedNumberOrderPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    def page(params: DependentHostedNumberOrderListInstancePageOptions): js.Promise[DependentHostedNumberOrderPage] = js.native
    def page(
      params: DependentHostedNumberOrderListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object DependentHostedNumberOrderListInstance {
    
    @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument/dependentHostedNumberOrder", "DependentHostedNumberOrderListInstance")
    @js.native
    def apply(version: default, signingDocumentSid: String): DependentHostedNumberOrderListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument/dependentHostedNumberOrder", "DependentHostedNumberOrderPage")
  @js.native
  open class DependentHostedNumberOrderPage protected ()
    extends typings.twilio.libBasePageMod.default[
          default, 
          DependentHostedNumberOrderPayload, 
          DependentHostedNumberOrderResource, 
          DependentHostedNumberOrderInstance
        ] {
    /**
      * Initialize the DependentHostedNumberOrderPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: DependentHostedNumberOrderSolution
    ) = this()
    
    /**
      * Build an instance of DependentHostedNumberOrderInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DependentHostedNumberOrderResource): DependentHostedNumberOrderInstance = js.native
  }
  
  trait DependentHostedNumberOrderListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DependentHostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** A human readable description of this resource, up to 64 characters. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A 34 character string that uniquely identifies the IncomingPhoneNumber resource created by this HostedNumberOrder. */
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** An E164 formatted phone number hosted by this HostedNumberOrder. */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    /** Status of an instance resource. It can hold one of the values: 1. opened 2. signing, 3. signed LOA, 4. canceled, 5. failed. See the section entitled [Status Values](https://www.twilio.com/docs/api/phone-numbers/hosted-number-authorization-documents#status-values) for more information on each of these statuses. */
    var status: js.UndefOr[DependentHostedNumberOrderStatus] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DependentHostedNumberOrderListInstanceEachOptions {
    
    inline def apply(): DependentHostedNumberOrderListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentHostedNumberOrderListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependentHostedNumberOrderListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ DependentHostedNumberOrderInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait DependentHostedNumberOrderListInstanceOptions extends StObject {
    
    /** A human readable description of this resource, up to 64 characters. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A 34 character string that uniquely identifies the IncomingPhoneNumber resource created by this HostedNumberOrder. */
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** An E164 formatted phone number hosted by this HostedNumberOrder. */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    /** Status of an instance resource. It can hold one of the values: 1. opened 2. signing, 3. signed LOA, 4. canceled, 5. failed. See the section entitled [Status Values](https://www.twilio.com/docs/api/phone-numbers/hosted-number-authorization-documents#status-values) for more information on each of these statuses. */
    var status: js.UndefOr[DependentHostedNumberOrderStatus] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DependentHostedNumberOrderListInstanceOptions {
    
    inline def apply(): DependentHostedNumberOrderListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentHostedNumberOrderListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependentHostedNumberOrderListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait DependentHostedNumberOrderListInstancePageOptions extends StObject {
    
    /** A human readable description of this resource, up to 64 characters. */
    var friendlyName: js.UndefOr[String] = js.undefined
    
    /** A 34 character string that uniquely identifies the IncomingPhoneNumber resource created by this HostedNumberOrder. */
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** An E164 formatted phone number hosted by this HostedNumberOrder. */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    /** Status of an instance resource. It can hold one of the values: 1. opened 2. signing, 3. signed LOA, 4. canceled, 5. failed. See the section entitled [Status Values](https://www.twilio.com/docs/api/phone-numbers/hosted-number-authorization-documents#status-values) for more information on each of these statuses. */
    var status: js.UndefOr[DependentHostedNumberOrderStatus] = js.undefined
    
    /** Provides a unique and addressable name to be assigned to this HostedNumberOrder, assigned by the developer, to be optionally used in addition to SID. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DependentHostedNumberOrderListInstancePageOptions {
    
    inline def apply(): DependentHostedNumberOrderListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentHostedNumberOrderListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependentHostedNumberOrderListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait DependentHostedNumberOrderPayload
    extends StObject
       with TwilioResponsePayload {
    
    var items: js.Array[DependentHostedNumberOrderResource]
  }
  object DependentHostedNumberOrderPayload {
    
    inline def apply(
      first_page_uri: String,
      items: js.Array[DependentHostedNumberOrderResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): DependentHostedNumberOrderPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependentHostedNumberOrderPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependentHostedNumberOrderPayload] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[DependentHostedNumberOrderResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: DependentHostedNumberOrderResource*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait DependentHostedNumberOrderResource extends StObject {
    
    var account_sid: String
    
    var address_sid: String
    
    var call_delay: Double
    
    var capabilities: PhoneNumberCapabilities
    
    var cc_emails: js.Array[String]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var `extension`: String
    
    var failure_reason: String
    
    var friendly_name: String
    
    var incoming_phone_number_sid: String
    
    var phone_number: String
    
    var sid: String
    
    var signing_document_sid: String
    
    var status: DependentHostedNumberOrderStatus
    
    var unique_name: String
    
    var verification_attempts: Double
    
    var verification_call_sids: js.Array[String]
    
    var verification_code: String
    
    var verification_document_sid: String
    
    var verification_type: DependentHostedNumberOrderVerificationType
  }
  object DependentHostedNumberOrderResource {
    
    inline def apply(
      account_sid: String,
      address_sid: String,
      call_delay: Double,
      capabilities: PhoneNumberCapabilities,
      cc_emails: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      `extension`: String,
      failure_reason: String,
      friendly_name: String,
      incoming_phone_number_sid: String,
      phone_number: String,
      sid: String,
      signing_document_sid: String,
      status: DependentHostedNumberOrderStatus,
      unique_name: String,
      verification_attempts: Double,
      verification_call_sids: js.Array[String],
      verification_code: String,
      verification_document_sid: String,
      verification_type: DependentHostedNumberOrderVerificationType
    ): DependentHostedNumberOrderResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_sid = address_sid.asInstanceOf[js.Any], call_delay = call_delay.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], failure_reason = failure_reason.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], incoming_phone_number_sid = incoming_phone_number_sid.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signing_document_sid = signing_document_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], verification_attempts = verification_attempts.asInstanceOf[js.Any], verification_call_sids = verification_call_sids.asInstanceOf[js.Any], verification_code = verification_code.asInstanceOf[js.Any], verification_document_sid = verification_document_sid.asInstanceOf[js.Any], verification_type = verification_type.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependentHostedNumberOrderResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependentHostedNumberOrderResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress_sid(value: String): Self = StObject.set(x, "address_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_delay(value: Double): Self = StObject.set(x, "call_delay", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCc_emails(value: js.Array[String]): Self = StObject.set(x, "cc_emails", value.asInstanceOf[js.Any])
      
      inline def setCc_emailsVarargs(value: String*): Self = StObject.set(x, "cc_emails", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFailure_reason(value: String): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIncoming_phone_number_sid(value: String): Self = StObject.set(x, "incoming_phone_number_sid", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSigning_document_sid(value: String): Self = StObject.set(x, "signing_document_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setVerification_attempts(value: Double): Self = StObject.set(x, "verification_attempts", value.asInstanceOf[js.Any])
      
      inline def setVerification_call_sids(value: js.Array[String]): Self = StObject.set(x, "verification_call_sids", value.asInstanceOf[js.Any])
      
      inline def setVerification_call_sidsVarargs(value: String*): Self = StObject.set(x, "verification_call_sids", js.Array(value*))
      
      inline def setVerification_code(value: String): Self = StObject.set(x, "verification_code", value.asInstanceOf[js.Any])
      
      inline def setVerification_document_sid(value: String): Self = StObject.set(x, "verification_document_sid", value.asInstanceOf[js.Any])
      
      inline def setVerification_type(value: DependentHostedNumberOrderVerificationType): Self = StObject.set(x, "verification_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependentHostedNumberOrderSolution extends StObject {
    
    var signingDocumentSid: String
  }
  object DependentHostedNumberOrderSolution {
    
    inline def apply(signingDocumentSid: String): DependentHostedNumberOrderSolution = {
      val __obj = js.Dynamic.literal(signingDocumentSid = signingDocumentSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependentHostedNumberOrderSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependentHostedNumberOrderSolution] (val x: Self) extends AnyVal {
      
      inline def setSigningDocumentSid(value: String): Self = StObject.set(x, "signingDocumentSid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.received
    - typings.twilio.twilioStrings.`pending-verification`
    - typings.twilio.twilioStrings.verified
    - typings.twilio.twilioStrings.`pending-loa`
    - typings.twilio.twilioStrings.`carrier-processing`
    - typings.twilio.twilioStrings.testing
    - typings.twilio.twilioStrings.completed
    - typings.twilio.twilioStrings.failed
    - typings.twilio.twilioStrings.`action-required`
  */
  trait DependentHostedNumberOrderStatus extends StObject
  object DependentHostedNumberOrderStatus {
    
    inline def `action-required`: typings.twilio.twilioStrings.`action-required` = "action-required".asInstanceOf[typings.twilio.twilioStrings.`action-required`]
    
    inline def `carrier-processing`: typings.twilio.twilioStrings.`carrier-processing` = "carrier-processing".asInstanceOf[typings.twilio.twilioStrings.`carrier-processing`]
    
    inline def completed: typings.twilio.twilioStrings.completed = "completed".asInstanceOf[typings.twilio.twilioStrings.completed]
    
    inline def failed: typings.twilio.twilioStrings.failed = "failed".asInstanceOf[typings.twilio.twilioStrings.failed]
    
    inline def `pending-loa`: typings.twilio.twilioStrings.`pending-loa` = "pending-loa".asInstanceOf[typings.twilio.twilioStrings.`pending-loa`]
    
    inline def `pending-verification`: typings.twilio.twilioStrings.`pending-verification` = "pending-verification".asInstanceOf[typings.twilio.twilioStrings.`pending-verification`]
    
    inline def received: typings.twilio.twilioStrings.received = "received".asInstanceOf[typings.twilio.twilioStrings.received]
    
    inline def testing: typings.twilio.twilioStrings.testing = "testing".asInstanceOf[typings.twilio.twilioStrings.testing]
    
    inline def verified: typings.twilio.twilioStrings.verified = "verified".asInstanceOf[typings.twilio.twilioStrings.verified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`phone-call`
    - typings.twilio.twilioStrings.`phone-bill`
  */
  trait DependentHostedNumberOrderVerificationType extends StObject
  object DependentHostedNumberOrderVerificationType {
    
    inline def `phone-bill`: typings.twilio.twilioStrings.`phone-bill` = "phone-bill".asInstanceOf[typings.twilio.twilioStrings.`phone-bill`]
    
    inline def `phone-call`: typings.twilio.twilioStrings.`phone-call` = "phone-call".asInstanceOf[typings.twilio.twilioStrings.`phone-call`]
  }
}
