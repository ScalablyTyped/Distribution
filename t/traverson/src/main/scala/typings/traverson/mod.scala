package typings.traverson

import org.scalablytyped.runtime.Shortcut
import typings.traverson.mod.Traverson.TraversonMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("traverson", JSImport.Namespace)
  @js.native
  val ^ : TraversonMethods = js.native
  
  object Traverson {
    
    trait Builder extends StObject {
      
      def addRequestOptions(options: Any): Builder
      
      def convertResponseToObject(): Builder
      
      def convertsResponseToObject(): Boolean
      
      def del(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def delete(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def disableAutoHeaders(): Builder
      
      def doesContentNegotiation(): Boolean
      
      def doesPreferEmbeddedResources(): Boolean
      
      def doesResolveRelative(): Boolean
      
      def enableAutoHeaders(): Builder
      
      def follow(first_pattern: String, rest_patterns: String*): Builder
      
      def followLocationHeader(): Builder
      
      def from(url: String): Builder
      
      def get(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def getFrom(): String
      
      def getJsonParser(): Any
      
      def getLinkType(): String
      
      def getMediaType(): String
      
      def getRequestLibrary(): Any
      
      def getRequestOptions(): Any
      
      def getResource(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def getTemplateParameters(): Any
      
      def getUri(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def getUrl(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def json(): Builder
      
      def jsonHal(): Builder
      
      // Alias for delete()
      def linkHeader(): Builder
      
      def newRequest(): Builder
      
      def parseResponseBodiesWith(parser: Any): Builder
      
      def patch(
        data: Any,
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      // Alias for getUrl()
      def post(
        data: Any,
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def preferEmbeddedResources(flag: Any): Builder
      
      def put(
        data: Any,
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def resolveRelative(flag: Any): Builder
      
      def sendRawPayload(flag: Any): Builder
      
      def sendsRawPayload(): Boolean
      
      def setMediaType(type_name: String): Builder
      
      def setsAutoHeaders(): Boolean
      
      def useAutoHeaders(flag: Any): Builder
      
      def useContentNegotiation(): Builder
      
      def walk(first_pattern: String, rest_patterns: String*): Builder
      
      def withRequestLibrary(request: Any): Builder
      
      def withRequestOptions(options: Any): Builder
      
      // Alias for follow()
      def withTemplateParameters(parameters: Any): Builder
    }
    object Builder {
      
      inline def apply(
        addRequestOptions: Any => Builder,
        convertResponseToObject: () => Builder,
        convertsResponseToObject: () => Boolean,
        del: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        delete: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        disableAutoHeaders: () => Builder,
        doesContentNegotiation: () => Boolean,
        doesPreferEmbeddedResources: () => Boolean,
        doesResolveRelative: () => Boolean,
        enableAutoHeaders: () => Builder,
        follow: (String, /* repeated */ String) => Builder,
        followLocationHeader: () => Builder,
        from: String => Builder,
        get: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        getFrom: () => String,
        getJsonParser: () => Any,
        getLinkType: () => String,
        getMediaType: () => String,
        getRequestLibrary: () => Any,
        getRequestOptions: () => Any,
        getResource: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        getTemplateParameters: () => Any,
        getUri: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        getUrl: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        json: () => Builder,
        jsonHal: () => Builder,
        linkHeader: () => Builder,
        newRequest: () => Builder,
        parseResponseBodiesWith: Any => Builder,
        patch: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
        post: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
        preferEmbeddedResources: Any => Builder,
        put: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
        resolveRelative: Any => Builder,
        sendRawPayload: Any => Builder,
        sendsRawPayload: () => Boolean,
        setMediaType: String => Builder,
        setsAutoHeaders: () => Boolean,
        useAutoHeaders: Any => Builder,
        useContentNegotiation: () => Builder,
        walk: (String, /* repeated */ String) => Builder,
        withRequestLibrary: Any => Builder,
        withRequestOptions: Any => Builder,
        withTemplateParameters: Any => Builder
      ): Builder = {
        val __obj = js.Dynamic.literal(addRequestOptions = js.Any.fromFunction1(addRequestOptions), convertResponseToObject = js.Any.fromFunction0(convertResponseToObject), convertsResponseToObject = js.Any.fromFunction0(convertsResponseToObject), del = js.Any.fromFunction1(del), delete = js.Any.fromFunction1(delete), disableAutoHeaders = js.Any.fromFunction0(disableAutoHeaders), doesContentNegotiation = js.Any.fromFunction0(doesContentNegotiation), doesPreferEmbeddedResources = js.Any.fromFunction0(doesPreferEmbeddedResources), doesResolveRelative = js.Any.fromFunction0(doesResolveRelative), enableAutoHeaders = js.Any.fromFunction0(enableAutoHeaders), follow = js.Any.fromFunction2(follow), followLocationHeader = js.Any.fromFunction0(followLocationHeader), from = js.Any.fromFunction1(from), get = js.Any.fromFunction1(get), getFrom = js.Any.fromFunction0(getFrom), getJsonParser = js.Any.fromFunction0(getJsonParser), getLinkType = js.Any.fromFunction0(getLinkType), getMediaType = js.Any.fromFunction0(getMediaType), getRequestLibrary = js.Any.fromFunction0(getRequestLibrary), getRequestOptions = js.Any.fromFunction0(getRequestOptions), getResource = js.Any.fromFunction1(getResource), getTemplateParameters = js.Any.fromFunction0(getTemplateParameters), getUri = js.Any.fromFunction1(getUri), getUrl = js.Any.fromFunction1(getUrl), json = js.Any.fromFunction0(json), jsonHal = js.Any.fromFunction0(jsonHal), linkHeader = js.Any.fromFunction0(linkHeader), newRequest = js.Any.fromFunction0(newRequest), parseResponseBodiesWith = js.Any.fromFunction1(parseResponseBodiesWith), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), preferEmbeddedResources = js.Any.fromFunction1(preferEmbeddedResources), put = js.Any.fromFunction2(put), resolveRelative = js.Any.fromFunction1(resolveRelative), sendRawPayload = js.Any.fromFunction1(sendRawPayload), sendsRawPayload = js.Any.fromFunction0(sendsRawPayload), setMediaType = js.Any.fromFunction1(setMediaType), setsAutoHeaders = js.Any.fromFunction0(setsAutoHeaders), useAutoHeaders = js.Any.fromFunction1(useAutoHeaders), useContentNegotiation = js.Any.fromFunction0(useContentNegotiation), walk = js.Any.fromFunction2(walk), withRequestLibrary = js.Any.fromFunction1(withRequestLibrary), withRequestOptions = js.Any.fromFunction1(withRequestOptions), withTemplateParameters = js.Any.fromFunction1(withTemplateParameters))
        __obj.asInstanceOf[Builder]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Builder] (val x: Self) extends AnyVal {
        
        inline def setAddRequestOptions(value: Any => Builder): Self = StObject.set(x, "addRequestOptions", js.Any.fromFunction1(value))
        
        inline def setConvertResponseToObject(value: () => Builder): Self = StObject.set(x, "convertResponseToObject", js.Any.fromFunction0(value))
        
        inline def setConvertsResponseToObject(value: () => Boolean): Self = StObject.set(x, "convertsResponseToObject", js.Any.fromFunction0(value))
        
        inline def setDel(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
        
        inline def setDelete(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
        
        inline def setDisableAutoHeaders(value: () => Builder): Self = StObject.set(x, "disableAutoHeaders", js.Any.fromFunction0(value))
        
        inline def setDoesContentNegotiation(value: () => Boolean): Self = StObject.set(x, "doesContentNegotiation", js.Any.fromFunction0(value))
        
        inline def setDoesPreferEmbeddedResources(value: () => Boolean): Self = StObject.set(x, "doesPreferEmbeddedResources", js.Any.fromFunction0(value))
        
        inline def setDoesResolveRelative(value: () => Boolean): Self = StObject.set(x, "doesResolveRelative", js.Any.fromFunction0(value))
        
        inline def setEnableAutoHeaders(value: () => Builder): Self = StObject.set(x, "enableAutoHeaders", js.Any.fromFunction0(value))
        
        inline def setFollow(value: (String, /* repeated */ String) => Builder): Self = StObject.set(x, "follow", js.Any.fromFunction2(value))
        
        inline def setFollowLocationHeader(value: () => Builder): Self = StObject.set(x, "followLocationHeader", js.Any.fromFunction0(value))
        
        inline def setFrom(value: String => Builder): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
        
        inline def setGet(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setGetFrom(value: () => String): Self = StObject.set(x, "getFrom", js.Any.fromFunction0(value))
        
        inline def setGetJsonParser(value: () => Any): Self = StObject.set(x, "getJsonParser", js.Any.fromFunction0(value))
        
        inline def setGetLinkType(value: () => String): Self = StObject.set(x, "getLinkType", js.Any.fromFunction0(value))
        
        inline def setGetMediaType(value: () => String): Self = StObject.set(x, "getMediaType", js.Any.fromFunction0(value))
        
        inline def setGetRequestLibrary(value: () => Any): Self = StObject.set(x, "getRequestLibrary", js.Any.fromFunction0(value))
        
        inline def setGetRequestOptions(value: () => Any): Self = StObject.set(x, "getRequestOptions", js.Any.fromFunction0(value))
        
        inline def setGetResource(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "getResource", js.Any.fromFunction1(value))
        
        inline def setGetTemplateParameters(value: () => Any): Self = StObject.set(x, "getTemplateParameters", js.Any.fromFunction0(value))
        
        inline def setGetUri(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "getUri", js.Any.fromFunction1(value))
        
        inline def setGetUrl(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
        
        inline def setJson(value: () => Builder): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
        
        inline def setJsonHal(value: () => Builder): Self = StObject.set(x, "jsonHal", js.Any.fromFunction0(value))
        
        inline def setLinkHeader(value: () => Builder): Self = StObject.set(x, "linkHeader", js.Any.fromFunction0(value))
        
        inline def setNewRequest(value: () => Builder): Self = StObject.set(x, "newRequest", js.Any.fromFunction0(value))
        
        inline def setParseResponseBodiesWith(value: Any => Builder): Self = StObject.set(x, "parseResponseBodiesWith", js.Any.fromFunction1(value))
        
        inline def setPatch(
          value: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
        ): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
        
        inline def setPost(
          value: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
        ): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
        
        inline def setPreferEmbeddedResources(value: Any => Builder): Self = StObject.set(x, "preferEmbeddedResources", js.Any.fromFunction1(value))
        
        inline def setPut(
          value: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
        ): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
        
        inline def setResolveRelative(value: Any => Builder): Self = StObject.set(x, "resolveRelative", js.Any.fromFunction1(value))
        
        inline def setSendRawPayload(value: Any => Builder): Self = StObject.set(x, "sendRawPayload", js.Any.fromFunction1(value))
        
        inline def setSendsRawPayload(value: () => Boolean): Self = StObject.set(x, "sendsRawPayload", js.Any.fromFunction0(value))
        
        inline def setSetMediaType(value: String => Builder): Self = StObject.set(x, "setMediaType", js.Any.fromFunction1(value))
        
        inline def setSetsAutoHeaders(value: () => Boolean): Self = StObject.set(x, "setsAutoHeaders", js.Any.fromFunction0(value))
        
        inline def setUseAutoHeaders(value: Any => Builder): Self = StObject.set(x, "useAutoHeaders", js.Any.fromFunction1(value))
        
        inline def setUseContentNegotiation(value: () => Builder): Self = StObject.set(x, "useContentNegotiation", js.Any.fromFunction0(value))
        
        inline def setWalk(value: (String, /* repeated */ String) => Builder): Self = StObject.set(x, "walk", js.Any.fromFunction2(value))
        
        inline def setWithRequestLibrary(value: Any => Builder): Self = StObject.set(x, "withRequestLibrary", js.Any.fromFunction1(value))
        
        inline def setWithRequestOptions(value: Any => Builder): Self = StObject.set(x, "withRequestOptions", js.Any.fromFunction1(value))
        
        inline def setWithTemplateParameters(value: Any => Builder): Self = StObject.set(x, "withTemplateParameters", js.Any.fromFunction1(value))
      }
    }
    
    trait InAction extends StObject {
      
      def abort(): Unit
    }
    object InAction {
      
      inline def apply(abort: () => Unit): InAction = {
        val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
        __obj.asInstanceOf[InAction]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InAction] (val x: Self) extends AnyVal {
        
        inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      }
    }
    
    trait Json extends StObject {
      
      def parseJson(): Any
    }
    object Json {
      
      inline def apply(parseJson: () => Any): Json = {
        val __obj = js.Dynamic.literal(parseJson = js.Any.fromFunction0(parseJson))
        __obj.asInstanceOf[Json]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
        
        inline def setParseJson(value: () => Any): Self = StObject.set(x, "parseJson", js.Any.fromFunction0(value))
      }
    }
    
    trait Traversal extends StObject {
      
      def continue(): Builder
    }
    object Traversal {
      
      inline def apply(continue: () => Builder): Traversal = {
        val __obj = js.Dynamic.literal(continue = js.Any.fromFunction0(continue))
        __obj.asInstanceOf[Traversal]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Traversal] (val x: Self) extends AnyVal {
        
        inline def setContinue(value: () => Builder): Self = StObject.set(x, "continue", js.Any.fromFunction0(value))
      }
    }
    
    trait TraversonMethods extends StObject {
      
      def errors(): TraversonMethods
      
      def from(uri: String): Builder
      
      def json(): Builder
      
      def jsonHal(): Builder
      
      def mediaTypes(): TraversonMethods
      
      def newRequest(): Builder
      
      def registerMediaType(name: String, handler: Any): TraversonMethods
    }
    object TraversonMethods {
      
      inline def apply(
        errors: () => TraversonMethods,
        from: String => Builder,
        json: () => Builder,
        jsonHal: () => Builder,
        mediaTypes: () => TraversonMethods,
        newRequest: () => Builder,
        registerMediaType: (String, Any) => TraversonMethods
      ): TraversonMethods = {
        val __obj = js.Dynamic.literal(errors = js.Any.fromFunction0(errors), from = js.Any.fromFunction1(from), json = js.Any.fromFunction0(json), jsonHal = js.Any.fromFunction0(jsonHal), mediaTypes = js.Any.fromFunction0(mediaTypes), newRequest = js.Any.fromFunction0(newRequest), registerMediaType = js.Any.fromFunction2(registerMediaType))
        __obj.asInstanceOf[TraversonMethods]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TraversonMethods] (val x: Self) extends AnyVal {
        
        inline def setErrors(value: () => TraversonMethods): Self = StObject.set(x, "errors", js.Any.fromFunction0(value))
        
        inline def setFrom(value: String => Builder): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
        
        inline def setJson(value: () => Builder): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
        
        inline def setJsonHal(value: () => Builder): Self = StObject.set(x, "jsonHal", js.Any.fromFunction0(value))
        
        inline def setMediaTypes(value: () => TraversonMethods): Self = StObject.set(x, "mediaTypes", js.Any.fromFunction0(value))
        
        inline def setNewRequest(value: () => Builder): Self = StObject.set(x, "newRequest", js.Any.fromFunction0(value))
        
        inline def setRegisterMediaType(value: (String, Any) => TraversonMethods): Self = StObject.set(x, "registerMediaType", js.Any.fromFunction2(value))
      }
    }
  }
  
  type _To = TraversonMethods
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TraversonMethods = ^
}
