package typings.twilio

import org.scalablytyped.runtime.StringDictionary
import typings.twilio.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBasePageMod {
  
  @JSImport("twilio/lib/base/Page", JSImport.Default)
  @js.native
  open class default[TVersion /* <: typings.twilio.libBaseVersionMod.default */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance] protected ()
    extends StObject
       with Page[TVersion, TPayload, TResource, TInstance] {
    /**
      *
      * Base page object to maintain request state.
      *
      * @param version - A twilio version instance
      * @param response - The http response
      * @param solution - path solution
      */
    def this(
      version: TVersion,
      response: typings.twilio.libHttpResponseMod.default[String | TPayload],
      solution: Solution
    ) = this()
    
    /* CompleteClass */
    var _payload: TPayload = js.native
    
    /* CompleteClass */
    var _solution: Solution = js.native
    
    /* CompleteClass */
    var _version: TVersion = js.native
    
    /* CompleteClass */
    override def forOwn(
      obj: js.Object,
      iteratee: js.Function3[/* val */ Any, /* key */ String, /* object */ js.Object, Unit]
    ): Unit = js.native
    
    /**
      * Build a new instance given a json payload
      *
      * @param payload - Payload response from the API
      * @returns instance of a resource
      */
    /* CompleteClass */
    override def getInstance(payload: Any): TInstance = js.native
    
    /**
      * Get the url of the next page of records
      *
      * @returns url of the next page, or undefined if the
      * next page URI/URL is not defined.
      */
    /* CompleteClass */
    override def getNextPageUrl(): js.UndefOr[String] = js.native
    
    /**
      * Get the url of the previous page of records
      *
      * @returns url of the previous page, or undefined if the
      * previous page URI/URL is not defined.
      */
    /* CompleteClass */
    override def getPreviousPageUrl(): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    var instances: js.Array[TInstance] = js.native
    
    /**
      * Load a list of records
      *
      * @param resources - json payload of records
      * @returns list of resources
      */
    /* CompleteClass */
    override def loadInstances(resources: js.Array[TResource]): js.Array[TInstance] = js.native
    
    /**
      * Load a page of records
      *
      * @param  {object} payload json payload
      * @return {array} the page of records
      */
    /* CompleteClass */
    override def loadPage(payload: TPayload): js.Array[TResource] = js.native
    
    /**
      * Fetch the next page of records
      *
      * @returns promise that resolves to next page of results,
      * or undefined if there isn't a nextPageUrl undefined.
      */
    /* CompleteClass */
    override def nextPage(): js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]] = js.native
    
    /**
      * Fetch the previous page of records
      *
      * @returns promise that resolves to previous page of
      * results, or undefined if there isn't a previousPageUrl undefined.
      */
    /* CompleteClass */
    override def previousPage(): js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]] = js.native
    
    /**
      * Parse json response from API
      *
      * @param response - API response
      *
      * @throws Error If non 200 status code is returned
      *
      * @returns json parsed response
      */
    /* CompleteClass */
    override def processResponse(response: typings.twilio.libHttpResponseMod.default[String | TPayload]): TPayload = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  /* static members */
  object default {
    
    @JSImport("twilio/lib/base/Page", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Meta keys returned in a list request
      *
      * @constant META_KEYS
      */
    @JSImport("twilio/lib/base/Page", "default.META_KEYS")
    @js.native
    def META_KEYS: js.Array[String] = js.native
    inline def META_KEYS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("META_KEYS")(x.asInstanceOf[js.Any])
  }
  
  trait Page[TVersion /* <: typings.twilio.libBaseVersionMod.default */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance] extends StObject {
    
    var _payload: TPayload
    
    var _solution: Solution
    
    var _version: TVersion
    
    def forOwn(
      obj: js.Object,
      iteratee: js.Function3[/* val */ Any, /* key */ String, /* object */ js.Object, Unit]
    ): Unit
    
    /**
      * Build a new instance given a json payload
      *
      * @param payload - Payload response from the API
      * @returns instance of a resource
      */
    def getInstance(payload: Any): TInstance
    
    /**
      * Get the url of the next page of records
      *
      * @returns url of the next page, or undefined if the
      * next page URI/URL is not defined.
      */
    def getNextPageUrl(): js.UndefOr[String]
    
    /**
      * Get the url of the previous page of records
      *
      * @returns url of the previous page, or undefined if the
      * previous page URI/URL is not defined.
      */
    def getPreviousPageUrl(): js.UndefOr[String]
    
    var instances: js.Array[TInstance]
    
    /**
      * Load a list of records
      *
      * @param resources - json payload of records
      * @returns list of resources
      */
    def loadInstances(resources: js.Array[TResource]): js.Array[TInstance]
    
    /**
      * Load a page of records
      *
      * @param  {object} payload json payload
      * @return {array} the page of records
      */
    def loadPage(payload: TPayload): js.Array[TResource]
    
    /**
      * Fetch the next page of records
      *
      * @returns promise that resolves to next page of results,
      * or undefined if there isn't a nextPageUrl undefined.
      */
    def nextPage(): js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]]
    
    var nextPageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Fetch the previous page of records
      *
      * @returns promise that resolves to previous page of
      * results, or undefined if there isn't a previousPageUrl undefined.
      */
    def previousPage(): js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]]
    
    var previousPageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Parse json response from API
      *
      * @param response - API response
      *
      * @throws Error If non 200 status code is returned
      *
      * @returns json parsed response
      */
    def processResponse(response: typings.twilio.libHttpResponseMod.default[String | TPayload]): TPayload
    
    def toJSON(): js.Object
  }
  object Page {
    
    inline def apply[TVersion /* <: typings.twilio.libBaseVersionMod.default */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance](
      _payload: TPayload,
      _solution: Solution,
      _version: TVersion,
      forOwn: (js.Object, js.Function3[/* val */ Any, /* key */ String, /* object */ js.Object, Unit]) => Unit,
      getInstance: Any => TInstance,
      getNextPageUrl: () => js.UndefOr[String],
      getPreviousPageUrl: () => js.UndefOr[String],
      instances: js.Array[TInstance],
      loadInstances: js.Array[TResource] => js.Array[TInstance],
      loadPage: TPayload => js.Array[TResource],
      nextPage: () => js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]],
      previousPage: () => js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]],
      processResponse: typings.twilio.libHttpResponseMod.default[String | TPayload] => TPayload,
      toJSON: () => js.Object
    ): Page[TVersion, TPayload, TResource, TInstance] = {
      val __obj = js.Dynamic.literal(_payload = _payload.asInstanceOf[js.Any], _solution = _solution.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], forOwn = js.Any.fromFunction2(forOwn), getInstance = js.Any.fromFunction1(getInstance), getNextPageUrl = js.Any.fromFunction0(getNextPageUrl), getPreviousPageUrl = js.Any.fromFunction0(getPreviousPageUrl), instances = instances.asInstanceOf[js.Any], loadInstances = js.Any.fromFunction1(loadInstances), loadPage = js.Any.fromFunction1(loadPage), nextPage = js.Any.fromFunction0(nextPage), previousPage = js.Any.fromFunction0(previousPage), processResponse = js.Any.fromFunction1(processResponse), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Page[TVersion, TPayload, TResource, TInstance]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Page[?, ?, ?, ?], TVersion /* <: typings.twilio.libBaseVersionMod.default */, TPayload /* <: TwilioResponsePayload */, TResource, TInstance] (val x: Self & (Page[TVersion, TPayload, TResource, TInstance])) extends AnyVal {
      
      inline def setForOwn(
        value: (js.Object, js.Function3[/* val */ Any, /* key */ String, /* object */ js.Object, Unit]) => Unit
      ): Self = StObject.set(x, "forOwn", js.Any.fromFunction2(value))
      
      inline def setGetInstance(value: Any => TInstance): Self = StObject.set(x, "getInstance", js.Any.fromFunction1(value))
      
      inline def setGetNextPageUrl(value: () => js.UndefOr[String]): Self = StObject.set(x, "getNextPageUrl", js.Any.fromFunction0(value))
      
      inline def setGetPreviousPageUrl(value: () => js.UndefOr[String]): Self = StObject.set(x, "getPreviousPageUrl", js.Any.fromFunction0(value))
      
      inline def setInstances(value: js.Array[TInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesVarargs(value: TInstance*): Self = StObject.set(x, "instances", js.Array(value*))
      
      inline def setLoadInstances(value: js.Array[TResource] => js.Array[TInstance]): Self = StObject.set(x, "loadInstances", js.Any.fromFunction1(value))
      
      inline def setLoadPage(value: TPayload => js.Array[TResource]): Self = StObject.set(x, "loadPage", js.Any.fromFunction1(value))
      
      inline def setNextPage(value: () => js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]]): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
      
      inline def setNextPageUrl(value: String): Self = StObject.set(x, "nextPageUrl", value.asInstanceOf[js.Any])
      
      inline def setNextPageUrlUndefined: Self = StObject.set(x, "nextPageUrl", js.undefined)
      
      inline def setPreviousPage(value: () => js.UndefOr[js.Promise[Page[TVersion, TPayload, TResource, TInstance]]]): Self = StObject.set(x, "previousPage", js.Any.fromFunction0(value))
      
      inline def setPreviousPageUrl(value: String): Self = StObject.set(x, "previousPageUrl", value.asInstanceOf[js.Any])
      
      inline def setPreviousPageUrlUndefined: Self = StObject.set(x, "previousPageUrl", js.undefined)
      
      inline def setProcessResponse(value: typings.twilio.libHttpResponseMod.default[String | TPayload] => TPayload): Self = StObject.set(x, "processResponse", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def set_payload(value: TPayload): Self = StObject.set(x, "_payload", value.asInstanceOf[js.Any])
      
      inline def set_solution(value: Solution): Self = StObject.set(x, "_solution", value.asInstanceOf[js.Any])
      
      inline def set_version(value: TVersion): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    }
  }
  
  type Solution = StringDictionary[Any]
  
  trait TwilioResponsePayload
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    var next_page_uri: String
    
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwilioResponsePayload] (val x: Self) extends AnyVal {
      
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
