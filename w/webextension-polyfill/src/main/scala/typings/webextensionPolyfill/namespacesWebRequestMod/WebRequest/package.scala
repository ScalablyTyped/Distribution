package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import typings.webextensionPolyfill.webextensionPolyfillStrings.cipher
import typings.webextensionPolyfill.webextensionPolyfillStrings.extraHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A BlockingResponse or a Promise<BlockingResponse>
  */
type BlockingResponseOrPromise = BlockingResponse | js.Promise[BlockingResponse]

/**
  * An array of HTTP headers. Each header is represented as a dictionary containing the keys <code>name</code>
  * and either <code>value</code> or <code>binaryValue</code>.
  */
type HttpHeaders = js.Array[HttpHeadersItemType]

type OnErrorOccurredOptions = extraHeaders

type TransportWeaknessReasons = cipher

/**
  * If the request has been classified this is an array of $(ref:UrlClassificationFlags).
  */
type UrlClassificationParty = js.Array[UrlClassificationFlags]
