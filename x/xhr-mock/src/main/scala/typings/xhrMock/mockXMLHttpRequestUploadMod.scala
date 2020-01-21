package typings.xhrMock

import typings.xhrMock.mockXMLHttpRequestEventTargetMod.MockXMLHttpRequestEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockXMLHttpRequestUpload", JSImport.Namespace)
@js.native
object mockXMLHttpRequestUploadMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - typings.std.XMLHttpRequestEventTarget because Already inherited
  - typings.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  trait MockXMLHttpRequestUpload extends MockXMLHttpRequestEventTarget
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.EventTarget because Already inherited
  - typings.std.XMLHttpRequestEventTarget because Already inherited
  - typings.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  class default () extends MockXMLHttpRequestEventTarget
  
}

