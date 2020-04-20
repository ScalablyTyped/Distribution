package typings.tabris

import typings.std.ArrayBuffer
import typings.tabris.tabrisStrings.`force-cache`
import typings.tabris.tabrisStrings.`import`
import typings.tabris.tabrisStrings.`no-cache`
import typings.tabris.tabrisStrings.`no-cors`
import typings.tabris.tabrisStrings.`no-store`
import typings.tabris.tabrisStrings.`object`
import typings.tabris.tabrisStrings.`only-if-cached`
import typings.tabris.tabrisStrings.`same-origin`
import typings.tabris.tabrisStrings.audio
import typings.tabris.tabrisStrings.beacon
import typings.tabris.tabrisStrings.cors
import typings.tabris.tabrisStrings.cspreport
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.download
import typings.tabris.tabrisStrings.embed
import typings.tabris.tabrisStrings.eventsource
import typings.tabris.tabrisStrings.favicon
import typings.tabris.tabrisStrings.font
import typings.tabris.tabrisStrings.form
import typings.tabris.tabrisStrings.frame
import typings.tabris.tabrisStrings.hyperlink
import typings.tabris.tabrisStrings.iframe
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.imageset
import typings.tabris.tabrisStrings.include
import typings.tabris.tabrisStrings.internal
import typings.tabris.tabrisStrings.location
import typings.tabris.tabrisStrings.manifest
import typings.tabris.tabrisStrings.omit
import typings.tabris.tabrisStrings.ping
import typings.tabris.tabrisStrings.plugin
import typings.tabris.tabrisStrings.prefetch
import typings.tabris.tabrisStrings.reload
import typings.tabris.tabrisStrings.script
import typings.tabris.tabrisStrings.serviceworker
import typings.tabris.tabrisStrings.sharedworker
import typings.tabris.tabrisStrings.style
import typings.tabris.tabrisStrings.subresource
import typings.tabris.tabrisStrings.track
import typings.tabris.tabrisStrings.video
import typings.tabris.tabrisStrings.worker
import typings.tabris.tabrisStrings.xmlhttprequest
import typings.tabris.tabrisStrings.xslt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Request
/**
  * Represents an HTTP Request as used by `fetch()`.
  */
@JSGlobal("Request")
@js.native
class Request protected () extends js.Object {
  def this(input: String) = this()
  def this(input: Request) = this()
  def this(input: String, init: RequestInit) = this()
  def this(input: Request, init: RequestInit) = this()
  val bodyUsed: Boolean = js.native
  val cache: default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload = js.native
  val context: audio | beacon | cspreport | download | embed | eventsource | favicon | typings.tabris.tabrisStrings.fetch | font | form | frame | hyperlink | iframe | image | imageset | `import` | internal | location | manifest | `object` | ping | plugin | prefetch | script | serviceworker | sharedworker | style | subresource | track | video | worker | xmlhttprequest | xslt = js.native
  val credentials: include | omit | `same-origin` = js.native
  val headers: Headers = js.native
  val method: String = js.native
  val mode: cors | `no-cors` | `same-origin` = js.native
  val referrer: String = js.native
  val url: String = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def json(): js.Promise[_] = js.native
  @JSName("json")
  def json_T[T](): js.Promise[T] = js.native
  def text(): js.Promise[String] = js.native
}

