package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.twilioStrings.end
import typings.twilio.twilioStrings.first_page_uri
import typings.twilio.twilioStrings.last_page_uri
import typings.twilio.twilioStrings.next_page_uri
import typings.twilio.twilioStrings.num_pages
import typings.twilio.twilioStrings.page
import typings.twilio.twilioStrings.page_size
import typings.twilio.twilioStrings.previous_page_uri
import typings.twilio.twilioStrings.start
import typings.twilio.twilioStrings.total
import typings.twilio.twilioStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod {
  
  /**
    * Base page object to maintain request state.
    */
  @JSImport("twilio/lib/base/Page", JSImport.Namespace)
  @js.native
  open class ^[TVersion /* <: typings.twilio.versionMod.^ */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance] protected ()
    extends StObject
       with Page[TVersion, TPayload, TResource, TInstance] {
    /**
      * Base page object to maintain request state.
      *
      * @param version - A twilio version instance
      * @param response - The http response
      * @param solution - path solution
      */
    def this(version: TVersion, response: typings.twilio.responseMod.^[String | js.Object], solution: Solution) = this()
    
    /**w
      * Get the url of the next page of records
      *
      * @return url of the next page
      */
    /* CompleteClass */
    override def getNextPageUrl(): String = js.native
    
    /**
      * Get the url of the previous page of records
      *
      * @return url of the previous page
      */
    /* CompleteClass */
    override def getPreviousPageUrl(): String = js.native
    
    /**
      * Load a list of records
      *
      * @param  resources json payload of records
      * @return list of resources
      */
    /* CompleteClass */
    override def loadInstance(resources: js.Array[TResource]): js.Array[TInstance] = js.native
    
    /**
      * Load a page of records
      * @throws {Error} If records cannot be deserialized
      *
      * @param  payload json payload
      * @return the page of records
      */
    /* CompleteClass */
    override def loadPage(payload: TPayload): js.Array[TResource] = js.native
    
    /**
      * Fetch the next page of records
      *
      * @return promise that resolves to next page of results
      */
    /* CompleteClass */
    override def nextPage(): js.Promise[Page[TVersion, TPayload, TResource, TInstance]] = js.native
    
    /**
      * Fetch the previous page of records
      *
      * @return promise that resolves to previous page of results
      */
    /* CompleteClass */
    override def previousPage(): js.Promise[Page[TVersion, TPayload, TResource, TInstance]] = js.native
    
    /**
      * Parse json response from API
      * @throws If non 200 status code is returned
      *
      * @param  response API response
      * @return json parsed response
      */
    /* CompleteClass */
    override def processResponse(response: typings.twilio.responseMod.^[String | js.Object]): TPayload = js.native
  }
  @JSImport("twilio/lib/base/Page", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @constant META_KEYS
    * @description meta keys returned in a list request
    */
  /* static member */
  @JSImport("twilio/lib/base/Page", "META_KEYS")
  @js.native
  def META_KEYS: js.Tuple11[
    end, 
    first_page_uri, 
    last_page_uri, 
    next_page_uri, 
    num_pages, 
    page, 
    page_size, 
    previous_page_uri, 
    start, 
    total, 
    uri
  ] = js.native
  inline def META_KEYS_=(
    x: js.Tuple11[
      end, 
      first_page_uri, 
      last_page_uri, 
      next_page_uri, 
      num_pages, 
      page, 
      page_size, 
      previous_page_uri, 
      start, 
      total, 
      uri
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("META_KEYS")(x.asInstanceOf[js.Any])
  
  /**
    * Base page object to maintain request state.
    */
  trait Page[TVersion /* <: typings.twilio.versionMod.^ */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance] extends StObject {
    
    /**w
      * Get the url of the next page of records
      *
      * @return url of the next page
      */
    def getNextPageUrl(): String
    
    /**
      * Get the url of the previous page of records
      *
      * @return url of the previous page
      */
    def getPreviousPageUrl(): String
    
    /**
      * Load a list of records
      *
      * @param  resources json payload of records
      * @return list of resources
      */
    def loadInstance(resources: js.Array[TResource]): js.Array[TInstance]
    
    /**
      * Load a page of records
      * @throws {Error} If records cannot be deserialized
      *
      * @param  payload json payload
      * @return the page of records
      */
    def loadPage(payload: TPayload): js.Array[TResource]
    
    /**
      * Fetch the next page of records
      *
      * @return promise that resolves to next page of results
      */
    def nextPage(): js.Promise[Page[TVersion, TPayload, TResource, TInstance]]
    
    /**
      * Fetch the previous page of records
      *
      * @return promise that resolves to previous page of results
      */
    def previousPage(): js.Promise[Page[TVersion, TPayload, TResource, TInstance]]
    
    /**
      * Parse json response from API
      * @throws If non 200 status code is returned
      *
      * @param  response API response
      * @return json parsed response
      */
    def processResponse(response: typings.twilio.responseMod.^[String | js.Object]): TPayload
  }
  object Page {
    
    inline def apply[TVersion /* <: typings.twilio.versionMod.^ */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance](
      getNextPageUrl: () => String,
      getPreviousPageUrl: () => String,
      loadInstance: js.Array[TResource] => js.Array[TInstance],
      loadPage: TPayload => js.Array[TResource],
      nextPage: () => js.Promise[Page[TVersion, TPayload, TResource, TInstance]],
      previousPage: () => js.Promise[Page[TVersion, TPayload, TResource, TInstance]],
      processResponse: typings.twilio.responseMod.^[String | js.Object] => TPayload
    ): Page[TVersion, TPayload, TResource, TInstance] = {
      val __obj = js.Dynamic.literal(getNextPageUrl = js.Any.fromFunction0(getNextPageUrl), getPreviousPageUrl = js.Any.fromFunction0(getPreviousPageUrl), loadInstance = js.Any.fromFunction1(loadInstance), loadPage = js.Any.fromFunction1(loadPage), nextPage = js.Any.fromFunction0(nextPage), previousPage = js.Any.fromFunction0(previousPage), processResponse = js.Any.fromFunction1(processResponse))
      __obj.asInstanceOf[Page[TVersion, TPayload, TResource, TInstance]]
    }
    
    extension [Self <: Page[?, ?, ?, ?], TVersion /* <: typings.twilio.versionMod.^ */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance](x: Self & (Page[TVersion, TPayload, TResource, TInstance])) {
      
      inline def setGetNextPageUrl(value: () => String): Self = StObject.set(x, "getNextPageUrl", js.Any.fromFunction0(value))
      
      inline def setGetPreviousPageUrl(value: () => String): Self = StObject.set(x, "getPreviousPageUrl", js.Any.fromFunction0(value))
      
      inline def setLoadInstance(value: js.Array[TResource] => js.Array[TInstance]): Self = StObject.set(x, "loadInstance", js.Any.fromFunction1(value))
      
      inline def setLoadPage(value: TPayload => js.Array[TResource]): Self = StObject.set(x, "loadPage", js.Any.fromFunction1(value))
      
      inline def setNextPage(value: () => js.Promise[Page[TVersion, TPayload, TResource, TInstance]]): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
      
      inline def setPreviousPage(value: () => js.Promise[Page[TVersion, TPayload, TResource, TInstance]]): Self = StObject.set(x, "previousPage", js.Any.fromFunction0(value))
      
      inline def setProcessResponse(value: typings.twilio.responseMod.^[String | js.Object] => TPayload): Self = StObject.set(x, "processResponse", js.Any.fromFunction1(value))
    }
  }
  
  trait Solution extends StObject
  
  trait TwilioResponsePayload extends StObject {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
    
    // DEPRECTATED: start: number;
    // DEPRECTATED: total: number;
    var uri: String
  }
  object TwilioResponsePayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): TwilioResponsePayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwilioResponsePayload]
    }
    
    extension [Self <: TwilioResponsePayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
