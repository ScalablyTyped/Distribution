package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highriskSpecialPrefixMod {
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/country/highriskSpecialPrefix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/country/highriskSpecialPrefix", "HighriskSpecialPrefixInstance")
  @js.native
  open class HighriskSpecialPrefixInstance protected () extends SerializableClass {
    /**
      * Initialize the HighriskSpecialPrefixContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param isoCode - The ISO country code
      */
    def this(version: typings.twilio.voiceV1Mod.^, payload: HighriskSpecialPrefixPayload, isoCode: String) = this()
    
    var prefix: String = js.native
  }
  
  /**
    * Initialize the HighriskSpecialPrefixList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param isoCode - The ISO country code
    */
  inline def HighriskSpecialPrefixList(version: typings.twilio.voiceV1Mod.^, isoCode: String): HighriskSpecialPrefixListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("HighriskSpecialPrefixList")(version.asInstanceOf[js.Any], isoCode.asInstanceOf[js.Any])).asInstanceOf[HighriskSpecialPrefixListInstance]
  
  @JSImport("twilio/lib/rest/voice/v1/dialingPermissions/country/highriskSpecialPrefix", "HighriskSpecialPrefixPage")
  @js.native
  open class HighriskSpecialPrefixPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.voiceV1Mod.^, 
          HighriskSpecialPrefixPayload, 
          HighriskSpecialPrefixResource, 
          HighriskSpecialPrefixInstance
        ] {
    /**
      * Initialize the HighriskSpecialPrefixPage
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
      version: typings.twilio.voiceV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: HighriskSpecialPrefixSolution
    ) = this()
    
    /**
      * Build an instance of HighriskSpecialPrefixInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: HighriskSpecialPrefixPayload): HighriskSpecialPrefixInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait HighriskSpecialPrefixListInstance extends StObject {
    
    /**
      * Streams HighriskSpecialPrefixInstance records from the API.
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
          /* item */ HighriskSpecialPrefixInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ HighriskSpecialPrefixInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: HighriskSpecialPrefixListInstanceEachOptions): Unit = js.native
    def each(
      opts: HighriskSpecialPrefixListInstanceEachOptions,
      callback: js.Function2[
          /* item */ HighriskSpecialPrefixInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of HighriskSpecialPrefixInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[HighriskSpecialPrefixPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ HighriskSpecialPrefixPage, Any]): js.Promise[HighriskSpecialPrefixPage] = js.native
    def getPage(targetUrl: String): js.Promise[HighriskSpecialPrefixPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HighriskSpecialPrefixPage, Any]
    ): js.Promise[HighriskSpecialPrefixPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HighriskSpecialPrefixPage, Any]
    ): js.Promise[HighriskSpecialPrefixPage] = js.native
    
    /**
      * Lists HighriskSpecialPrefixInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[HighriskSpecialPrefixInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[HighriskSpecialPrefixInstance], 
          Any
        ]
    ): js.Promise[js.Array[HighriskSpecialPrefixInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[HighriskSpecialPrefixInstance], 
          Any
        ]
    ): js.Promise[js.Array[HighriskSpecialPrefixInstance]] = js.native
    def list(opts: HighriskSpecialPrefixListInstanceOptions): js.Promise[js.Array[HighriskSpecialPrefixInstance]] = js.native
    def list(
      opts: HighriskSpecialPrefixListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[HighriskSpecialPrefixInstance], 
          Any
        ]
    ): js.Promise[js.Array[HighriskSpecialPrefixInstance]] = js.native
    
    /**
      * Retrieve a single page of HighriskSpecialPrefixInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[HighriskSpecialPrefixPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ HighriskSpecialPrefixPage, Any]): js.Promise[HighriskSpecialPrefixPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HighriskSpecialPrefixPage, Any]
    ): js.Promise[HighriskSpecialPrefixPage] = js.native
    def page(opts: HighriskSpecialPrefixListInstancePageOptions): js.Promise[HighriskSpecialPrefixPage] = js.native
    def page(
      opts: HighriskSpecialPrefixListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ HighriskSpecialPrefixPage, Any]
    ): js.Promise[HighriskSpecialPrefixPage] = js.native
    
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
  trait HighriskSpecialPrefixListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ HighriskSpecialPrefixInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object HighriskSpecialPrefixListInstanceEachOptions {
    
    inline def apply(): HighriskSpecialPrefixListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighriskSpecialPrefixListInstanceEachOptions]
    }
    
    extension [Self <: HighriskSpecialPrefixListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ HighriskSpecialPrefixInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
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
  trait HighriskSpecialPrefixListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object HighriskSpecialPrefixListInstanceOptions {
    
    inline def apply(): HighriskSpecialPrefixListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighriskSpecialPrefixListInstanceOptions]
    }
    
    extension [Self <: HighriskSpecialPrefixListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait HighriskSpecialPrefixListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object HighriskSpecialPrefixListInstancePageOptions {
    
    inline def apply(): HighriskSpecialPrefixListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighriskSpecialPrefixListInstancePageOptions]
    }
    
    extension [Self <: HighriskSpecialPrefixListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait HighriskSpecialPrefixPayload
    extends StObject
       with HighriskSpecialPrefixResource
       with TwilioResponsePayload
  object HighriskSpecialPrefixPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      prefix: String,
      previous_page_uri: String,
      uri: String
    ): HighriskSpecialPrefixPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighriskSpecialPrefixPayload]
    }
  }
  
  trait HighriskSpecialPrefixResource extends StObject {
    
    var prefix: String
  }
  object HighriskSpecialPrefixResource {
    
    inline def apply(prefix: String): HighriskSpecialPrefixResource = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighriskSpecialPrefixResource]
    }
    
    extension [Self <: HighriskSpecialPrefixResource](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait HighriskSpecialPrefixSolution extends StObject {
    
    var isoCode: js.UndefOr[String] = js.undefined
  }
  object HighriskSpecialPrefixSolution {
    
    inline def apply(): HighriskSpecialPrefixSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighriskSpecialPrefixSolution]
    }
    
    extension [Self <: HighriskSpecialPrefixSolution](x: Self) {
      
      inline def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
      
      inline def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
    }
  }
}
