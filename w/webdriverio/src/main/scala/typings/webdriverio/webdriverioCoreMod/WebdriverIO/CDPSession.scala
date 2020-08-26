package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<puppeteer.puppeteer.CDPSession> */
@js.native
trait CDPSession extends js.Object {
  var addListener: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  var constructor: js.UndefOr[js.Function0[js.Any]] = js.native
  var defaultMaxListeners: js.UndefOr[js.Any] = js.native
  var detach: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  var emit: js.UndefOr[js.Function2[/* event */ String, /* repeated */ js.Any, Boolean]] = js.native
  var errorMonitor: js.UndefOr[js.Any] = js.native
  var eventNames: js.UndefOr[js.Function0[js.Array[String | js.Symbol]]] = js.native
  var getMaxListeners: js.UndefOr[js.Function0[Double]] = js.native
  var listenerCount: js.UndefOr[js.Function1[/* type */ String, Double]] = js.native
  var listeners: js.UndefOr[js.Function1[/* event */ String, js.Array[js.Function]]] = js.native
  var off: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  var on: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  var once: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  var prependListener: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  var prependOnceListener: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  var rawListeners: js.UndefOr[js.Function1[/* event */ String, js.Array[js.Function]]] = js.native
  var removeAllListeners: js.UndefOr[js.Function0[this.type]] = js.native
  var removeListener: js.UndefOr[
    js.Function2[
      /* event */ String, 
      /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
      this.type
    ]
  ] = js.native
  var send: js.UndefOr[js.Function1[/* method */ String, js.Promise[js.Object]]] = js.native
  var setMaxListeners: js.UndefOr[js.Function1[/* n */ Double, this.type]] = js.native
}

object CDPSession {
  @scala.inline
  def apply(): CDPSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CDPSession]
  }
  @scala.inline
  implicit class CDPSessionOps[Self <: CDPSession] (val x: Self) extends AnyVal {
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
    def setAddListener(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => CDPSession
    ): Self = this.set("addListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddListener: Self = this.set("addListener", js.undefined)
    @scala.inline
    def setConstructor(value: () => js.Any): Self = this.set("constructor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setDefaultMaxListeners(value: js.Any): Self = this.set("defaultMaxListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMaxListeners: Self = this.set("defaultMaxListeners", js.undefined)
    @scala.inline
    def setDetach(value: () => js.Promise[Unit]): Self = this.set("detach", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDetach: Self = this.set("detach", js.undefined)
    @scala.inline
    def setEmit(value: (/* event */ String, /* repeated */ js.Any) => Boolean): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEmit: Self = this.set("emit", js.undefined)
    @scala.inline
    def setErrorMonitor(value: js.Any): Self = this.set("errorMonitor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMonitor: Self = this.set("errorMonitor", js.undefined)
    @scala.inline
    def setEventNames(value: () => js.Array[String | js.Symbol]): Self = this.set("eventNames", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEventNames: Self = this.set("eventNames", js.undefined)
    @scala.inline
    def setGetMaxListeners(value: () => Double): Self = this.set("getMaxListeners", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxListeners: Self = this.set("getMaxListeners", js.undefined)
    @scala.inline
    def setListenerCount(value: /* type */ String => Double): Self = this.set("listenerCount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteListenerCount: Self = this.set("listenerCount", js.undefined)
    @scala.inline
    def setListeners(value: /* event */ String => js.Array[js.Function]): Self = this.set("listeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    @scala.inline
    def setOff(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => CDPSession
    ): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    @scala.inline
    def setOn(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => CDPSession
    ): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnce(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => CDPSession
    ): Self = this.set("once", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setPrependListener(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => CDPSession
    ): Self = this.set("prependListener", js.Any.fromFunction2(value))
    @scala.inline
    def deletePrependListener: Self = this.set("prependListener", js.undefined)
    @scala.inline
    def setPrependOnceListener(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => CDPSession
    ): Self = this.set("prependOnceListener", js.Any.fromFunction2(value))
    @scala.inline
    def deletePrependOnceListener: Self = this.set("prependOnceListener", js.undefined)
    @scala.inline
    def setRawListeners(value: /* event */ String => js.Array[js.Function]): Self = this.set("rawListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRawListeners: Self = this.set("rawListeners", js.undefined)
    @scala.inline
    def setRemoveAllListeners(value: () => CDPSession): Self = this.set("removeAllListeners", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemoveAllListeners: Self = this.set("removeAllListeners", js.undefined)
    @scala.inline
    def setRemoveListener(
      value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => CDPSession
    ): Self = this.set("removeListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveListener: Self = this.set("removeListener", js.undefined)
    @scala.inline
    def setSend(value: /* method */ String => js.Promise[js.Object]): Self = this.set("send", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    @scala.inline
    def setSetMaxListeners(value: /* n */ Double => CDPSession): Self = this.set("setMaxListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxListeners: Self = this.set("setMaxListeners", js.undefined)
  }
  
}

