package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("twilio/lib/rest/verify/v2/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/template", "TemplateInstance")
  @js.native
  open class TemplateInstance protected () extends SerializableClass {
    /**
      * Initialize the TemplateContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: TemplatePayload) = this()
    
    var accountSid: String = js.native
    
    var friendlyName: String = js.native
    
    var sid: String = js.native
    
    var translations: Any = js.native
  }
  
  /**
    * Initialize the TemplateList
    *
    * @param version - Version of the resource
    */
  inline def TemplateList(version: typings.twilio.verifyV2Mod.^): TemplateListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("TemplateList")(version.asInstanceOf[js.Any]).asInstanceOf[TemplateListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/template", "TemplatePage")
  @js.native
  open class TemplatePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, TemplatePayload, TemplateResource, TemplateInstance] {
    /**
      * Initialize the TemplatePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TemplateSolution
    ) = this()
    
    /**
      * Build an instance of TemplateInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TemplatePayload): TemplateInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TemplateListInstance extends StObject {
    
    /**
      * Streams TemplateInstance records from the API.
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
          /* item */ TemplateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TemplateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TemplateListInstanceEachOptions): Unit = js.native
    def each(
      opts: TemplateListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TemplateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of TemplateInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TemplatePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TemplatePage, Any]): js.Promise[TemplatePage] = js.native
    def getPage(targetUrl: String): js.Promise[TemplatePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TemplatePage, Any]
    ): js.Promise[TemplatePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TemplatePage, Any]
    ): js.Promise[TemplatePage] = js.native
    
    /**
      * Lists TemplateInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TemplateInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TemplateInstance], Any]): js.Promise[js.Array[TemplateInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TemplateInstance], Any]
    ): js.Promise[js.Array[TemplateInstance]] = js.native
    def list(opts: TemplateListInstanceOptions): js.Promise[js.Array[TemplateInstance]] = js.native
    def list(
      opts: TemplateListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TemplateInstance], Any]
    ): js.Promise[js.Array[TemplateInstance]] = js.native
    
    /**
      * Retrieve a single page of TemplateInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TemplatePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TemplatePage, Any]): js.Promise[TemplatePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TemplatePage, Any]): js.Promise[TemplatePage] = js.native
    def page(opts: TemplateListInstancePageOptions): js.Promise[TemplatePage] = js.native
    def page(
      opts: TemplateListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TemplatePage, Any]
    ): js.Promise[TemplatePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - Filter templates using friendly name
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
    */
  trait TemplateListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TemplateInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TemplateListInstanceEachOptions {
    
    inline def apply(): TemplateListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateListInstanceEachOptions]
    }
    
    extension [Self <: TemplateListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TemplateInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - Filter templates using friendly name
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
    */
  trait TemplateListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TemplateListInstanceOptions {
    
    inline def apply(): TemplateListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateListInstanceOptions]
    }
    
    extension [Self <: TemplateListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - Filter templates using friendly name
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait TemplateListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TemplateListInstancePageOptions {
    
    inline def apply(): TemplateListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateListInstancePageOptions]
    }
    
    extension [Self <: TemplateListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TemplatePayload
    extends StObject
       with TemplateResource
       with TwilioResponsePayload
  object TemplatePayload {
    
    inline def apply(
      account_sid: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      translations: js.Object,
      uri: String
    ): TemplatePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplatePayload]
    }
  }
  
  trait TemplateResource extends StObject {
    
    var account_sid: String
    
    var friendly_name: String
    
    var sid: String
    
    var translations: js.Object
  }
  object TemplateResource {
    
    inline def apply(account_sid: String, friendly_name: String, sid: String, translations: js.Object): TemplateResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateResource]
    }
    
    extension [Self <: TemplateResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateSolution extends StObject
}
