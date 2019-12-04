package typings.xhrDashMock

import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequestEventTarget
import typings.xhrDashMock.libMockEventTargetMod.MockEventTarget
import typings.xhrDashMock.libMockXMLHttpRequestEventTargetMod.MockXMLHttpRequestEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockXMLHttpRequestEventTarget", JSImport.Namespace)
@js.native
object libMockXMLHttpRequestEventTargetMod extends js.Object {
  @js.native
  trait MockXMLHttpRequestEventTarget
    extends MockEventTarget
       with XMLHttpRequestEventTarget {
    @JSName("onabort")
    def onabort_MMockXMLHttpRequestEventTarget(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent[EventTarget]): js.Any = js.native
    @JSName("onerror")
    def onerror_MMockXMLHttpRequestEventTarget(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent[EventTarget]): js.Any = js.native
    @JSName("onload")
    def onload_MMockXMLHttpRequestEventTarget(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent[EventTarget]): js.Any = js.native
    @JSName("onloadend")
    def onloadend_MMockXMLHttpRequestEventTarget(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent[EventTarget]): js.Any = js.native
    @JSName("onloadstart")
    def onloadstart_MMockXMLHttpRequestEventTarget(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent[EventTarget]): js.Any = js.native
    @JSName("onprogress")
    def onprogress_MMockXMLHttpRequestEventTarget(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent[EventTarget]): js.Any = js.native
    @JSName("ontimeout")
    def ontimeout_MMockXMLHttpRequestEventTarget(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent[EventTarget]): js.Any = js.native
  }
  
  @js.native
  class default () extends MockXMLHttpRequestEventTarget
  
}

