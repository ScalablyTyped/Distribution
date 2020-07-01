package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  def addRequestOptions(options: js.Any): Builder
  def convertResponseToObject(): Builder
  def convertsResponseToObject(): Boolean
  def del(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def delete(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
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
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def getFrom(): String
  def getJsonParser(): js.Any
  def getLinkType(): String
  def getMediaType(): String
  def getRequestLibrary(): js.Any
  def getRequestOptions(): js.Any
  def getResource(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def getTemplateParameters(): js.Any
  def getUri(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def getUrl(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def json(): Builder
  def jsonHal(): Builder
   // Alias for delete()
  def linkHeader(): Builder
  def newRequest(): Builder
  def parseResponseBodiesWith(parser: js.Any): Builder
  def patch(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
   // Alias for getUrl()
  def post(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def preferEmbeddedResources(flag: js.Any): Builder
  def put(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def resolveRelative(flag: js.Any): Builder
  def sendRawPayload(flag: js.Any): Builder
  def sendsRawPayload(): Boolean
  def setMediaType(type_name: String): Builder
  def setsAutoHeaders(): Boolean
  def useAutoHeaders(flag: js.Any): Builder
  def useContentNegotiation(): Builder
  def walk(first_pattern: String, rest_patterns: String*): Builder
  def withRequestLibrary(request: js.Any): Builder
  def withRequestOptions(options: js.Any): Builder
   // Alias for follow()
  def withTemplateParameters(parameters: js.Any): Builder
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
}

