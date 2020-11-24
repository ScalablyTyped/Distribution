package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Builder extends js.Object {
  
  def addRequestOptions(options: js.Any): Builder = js.native
  
  def convertResponseToObject(): Builder = js.native
  
  def convertsResponseToObject(): Boolean = js.native
  
  def del(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def delete(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def disableAutoHeaders(): Builder = js.native
  
  def doesContentNegotiation(): Boolean = js.native
  
  def doesPreferEmbeddedResources(): Boolean = js.native
  
  def doesResolveRelative(): Boolean = js.native
  
  def enableAutoHeaders(): Builder = js.native
  
  def follow(first_pattern: String, rest_patterns: String*): Builder = js.native
  
  def followLocationHeader(): Builder = js.native
  
  def from(url: String): Builder = js.native
  
  def get(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def getFrom(): String = js.native
  
  def getJsonParser(): js.Any = js.native
  
  def getLinkType(): String = js.native
  
  def getMediaType(): String = js.native
  
  def getRequestLibrary(): js.Any = js.native
  
  def getRequestOptions(): js.Any = js.native
  
  def getResource(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def getTemplateParameters(): js.Any = js.native
  
  def getUri(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def getUrl(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def json(): Builder = js.native
  
  def jsonHal(): Builder = js.native
  
   // Alias for delete()
  def linkHeader(): Builder = js.native
  
  def newRequest(): Builder = js.native
  
  def parseResponseBodiesWith(parser: js.Any): Builder = js.native
  
  def patch(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
   // Alias for getUrl()
  def post(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def preferEmbeddedResources(flag: js.Any): Builder = js.native
  
  def put(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction = js.native
  
  def resolveRelative(flag: js.Any): Builder = js.native
  
  def sendRawPayload(flag: js.Any): Builder = js.native
  
  def sendsRawPayload(): Boolean = js.native
  
  def setMediaType(type_name: String): Builder = js.native
  
  def setsAutoHeaders(): Boolean = js.native
  
  def useAutoHeaders(flag: js.Any): Builder = js.native
  
  def useContentNegotiation(): Builder = js.native
  
  def walk(first_pattern: String, rest_patterns: String*): Builder = js.native
  
  def withRequestLibrary(request: js.Any): Builder = js.native
  
  def withRequestOptions(options: js.Any): Builder = js.native
  
   // Alias for follow()
  def withTemplateParameters(parameters: js.Any): Builder = js.native
}
object Builder {
  
  @scala.inline
  def apply(
    addRequestOptions: js.Any => Builder,
    convertResponseToObject: () => Builder,
    convertsResponseToObject: () => Boolean,
    del: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    delete: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    disableAutoHeaders: () => Builder,
    doesContentNegotiation: () => Boolean,
    doesPreferEmbeddedResources: () => Boolean,
    doesResolveRelative: () => Boolean,
    enableAutoHeaders: () => Builder,
    follow: (String, /* repeated */ String) => Builder,
    followLocationHeader: () => Builder,
    from: String => Builder,
    get: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    getFrom: () => String,
    getJsonParser: () => js.Any,
    getLinkType: () => String,
    getMediaType: () => String,
    getRequestLibrary: () => js.Any,
    getRequestOptions: () => js.Any,
    getResource: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    getTemplateParameters: () => js.Any,
    getUri: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    getUrl: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
    json: () => Builder,
    jsonHal: () => Builder,
    linkHeader: () => Builder,
    newRequest: () => Builder,
    parseResponseBodiesWith: js.Any => Builder,
    patch: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
    post: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
    preferEmbeddedResources: js.Any => Builder,
    put: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
    resolveRelative: js.Any => Builder,
    sendRawPayload: js.Any => Builder,
    sendsRawPayload: () => Boolean,
    setMediaType: String => Builder,
    setsAutoHeaders: () => Boolean,
    useAutoHeaders: js.Any => Builder,
    useContentNegotiation: () => Builder,
    walk: (String, /* repeated */ String) => Builder,
    withRequestLibrary: js.Any => Builder,
    withRequestOptions: js.Any => Builder,
    withTemplateParameters: js.Any => Builder
  ): Builder = {
    val __obj = js.Dynamic.literal(addRequestOptions = js.Any.fromFunction1(addRequestOptions), convertResponseToObject = js.Any.fromFunction0(convertResponseToObject), convertsResponseToObject = js.Any.fromFunction0(convertsResponseToObject), del = js.Any.fromFunction1(del), delete = js.Any.fromFunction1(delete), disableAutoHeaders = js.Any.fromFunction0(disableAutoHeaders), doesContentNegotiation = js.Any.fromFunction0(doesContentNegotiation), doesPreferEmbeddedResources = js.Any.fromFunction0(doesPreferEmbeddedResources), doesResolveRelative = js.Any.fromFunction0(doesResolveRelative), enableAutoHeaders = js.Any.fromFunction0(enableAutoHeaders), follow = js.Any.fromFunction2(follow), followLocationHeader = js.Any.fromFunction0(followLocationHeader), from = js.Any.fromFunction1(from), get = js.Any.fromFunction1(get), getFrom = js.Any.fromFunction0(getFrom), getJsonParser = js.Any.fromFunction0(getJsonParser), getLinkType = js.Any.fromFunction0(getLinkType), getMediaType = js.Any.fromFunction0(getMediaType), getRequestLibrary = js.Any.fromFunction0(getRequestLibrary), getRequestOptions = js.Any.fromFunction0(getRequestOptions), getResource = js.Any.fromFunction1(getResource), getTemplateParameters = js.Any.fromFunction0(getTemplateParameters), getUri = js.Any.fromFunction1(getUri), getUrl = js.Any.fromFunction1(getUrl), json = js.Any.fromFunction0(json), jsonHal = js.Any.fromFunction0(jsonHal), linkHeader = js.Any.fromFunction0(linkHeader), newRequest = js.Any.fromFunction0(newRequest), parseResponseBodiesWith = js.Any.fromFunction1(parseResponseBodiesWith), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), preferEmbeddedResources = js.Any.fromFunction1(preferEmbeddedResources), put = js.Any.fromFunction2(put), resolveRelative = js.Any.fromFunction1(resolveRelative), sendRawPayload = js.Any.fromFunction1(sendRawPayload), sendsRawPayload = js.Any.fromFunction0(sendsRawPayload), setMediaType = js.Any.fromFunction1(setMediaType), setsAutoHeaders = js.Any.fromFunction0(setsAutoHeaders), useAutoHeaders = js.Any.fromFunction1(useAutoHeaders), useContentNegotiation = js.Any.fromFunction0(useContentNegotiation), walk = js.Any.fromFunction2(walk), withRequestLibrary = js.Any.fromFunction1(withRequestLibrary), withRequestOptions = js.Any.fromFunction1(withRequestOptions), withTemplateParameters = js.Any.fromFunction1(withTemplateParameters))
    __obj.asInstanceOf[Builder]
  }
  
  @scala.inline
  implicit class BuilderOps[Self <: Builder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddRequestOptions(value: js.Any => Builder): Self = this.set("addRequestOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertResponseToObject(value: () => Builder): Self = this.set("convertResponseToObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertsResponseToObject(value: () => Boolean): Self = this.set("convertsResponseToObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDel(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableAutoHeaders(value: () => Builder): Self = this.set("disableAutoHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoesContentNegotiation(value: () => Boolean): Self = this.set("doesContentNegotiation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoesPreferEmbeddedResources(value: () => Boolean): Self = this.set("doesPreferEmbeddedResources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoesResolveRelative(value: () => Boolean): Self = this.set("doesResolveRelative", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableAutoHeaders(value: () => Builder): Self = this.set("enableAutoHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFollow(value: (String, /* repeated */ String) => Builder): Self = this.set("follow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFollowLocationHeader(value: () => Builder): Self = this.set("followLocationHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFrom(value: String => Builder): Self = this.set("from", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFrom(value: () => String): Self = this.set("getFrom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJsonParser(value: () => js.Any): Self = this.set("getJsonParser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLinkType(value: () => String): Self = this.set("getLinkType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMediaType(value: () => String): Self = this.set("getMediaType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestLibrary(value: () => js.Any): Self = this.set("getRequestLibrary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestOptions(value: () => js.Any): Self = this.set("getRequestOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResource(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = this.set("getResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTemplateParameters(value: () => js.Any): Self = this.set("getTemplateParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUri(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = this.set("getUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUrl(
      value: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
    ): Self = this.set("getUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJson(value: () => Builder): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJsonHal(value: () => Builder): Self = this.set("jsonHal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLinkHeader(value: () => Builder): Self = this.set("linkHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRequest(value: () => Builder): Self = this.set("newRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParseResponseBodiesWith(value: js.Any => Builder): Self = this.set("parseResponseBodiesWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(
      value: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
    ): Self = this.set("patch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPost(
      value: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
    ): Self = this.set("post", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPreferEmbeddedResources(value: js.Any => Builder): Self = this.set("preferEmbeddedResources", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(
      value: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
    ): Self = this.set("put", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveRelative(value: js.Any => Builder): Self = this.set("resolveRelative", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendRawPayload(value: js.Any => Builder): Self = this.set("sendRawPayload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendsRawPayload(value: () => Boolean): Self = this.set("sendsRawPayload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMediaType(value: String => Builder): Self = this.set("setMediaType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetsAutoHeaders(value: () => Boolean): Self = this.set("setsAutoHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseAutoHeaders(value: js.Any => Builder): Self = this.set("useAutoHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseContentNegotiation(value: () => Builder): Self = this.set("useContentNegotiation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWalk(value: (String, /* repeated */ String) => Builder): Self = this.set("walk", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWithRequestLibrary(value: js.Any => Builder): Self = this.set("withRequestLibrary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithRequestOptions(value: js.Any => Builder): Self = this.set("withRequestOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithTemplateParameters(value: js.Any => Builder): Self = this.set("withTemplateParameters", js.Any.fromFunction1(value))
  }
}
