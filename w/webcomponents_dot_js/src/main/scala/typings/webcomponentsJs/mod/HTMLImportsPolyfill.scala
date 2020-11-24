package typings.webcomponentsJs.mod

import typings.webcomponentsJs.mod.global.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLImportsPolyfill extends js.Object {
  
  var IMPORT_LINK_TYPE: String = js.native
  
  var flags: js.Any = js.native
  
  var isIE: Boolean = js.native
  
  var ready: Boolean = js.native
  
  var rootDocument: Document = js.native
  
  var useNative: Boolean = js.native
  
  def whenReady(callback: js.Function0[Unit]): Unit = js.native
}
object HTMLImportsPolyfill {
  
  @scala.inline
  def apply(
    IMPORT_LINK_TYPE: String,
    flags: js.Any,
    isIE: Boolean,
    ready: Boolean,
    rootDocument: Document,
    useNative: Boolean,
    whenReady: js.Function0[Unit] => Unit
  ): HTMLImportsPolyfill = {
    val __obj = js.Dynamic.literal(IMPORT_LINK_TYPE = IMPORT_LINK_TYPE.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], rootDocument = rootDocument.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any], whenReady = js.Any.fromFunction1(whenReady))
    __obj.asInstanceOf[HTMLImportsPolyfill]
  }
  
  @scala.inline
  implicit class HTMLImportsPolyfillOps[Self <: HTMLImportsPolyfill] (val x: Self) extends AnyVal {
    
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
    def setIMPORT_LINK_TYPE(value: String): Self = this.set("IMPORT_LINK_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: js.Any): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIE(value: Boolean): Self = this.set("isIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDocument(value: Document): Self = this.set("rootDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenReady(value: js.Function0[Unit] => Unit): Self = this.set("whenReady", js.Any.fromFunction1(value))
  }
}
