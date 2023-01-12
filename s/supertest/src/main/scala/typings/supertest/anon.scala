package typings.supertest

import typings.superagent.mod.Parser
import typings.superagent.mod.Plugin
import typings.superagent.mod.Response
import typings.superagent.mod.Serializer
import typings.supertest.supertestStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<supertest.supertest.Request, 'use' | 'on' | 'set' | 'query' | 'type' | 'accept' | 'auth' | 'withCredentials' | 'retry' | 'ok' | 'redirects' | 'timeout' | 'buffer' | 'serialize' | 'parse' | 'ca' | 'key' | 'pfx' | 'cert'> */
  trait PickRequestuseonsetqueryt extends StObject {
    
    def accept(`type`: String): this.type
    @JSName("accept")
    var accept_Original: js.Function1[/* type */ String, this.type]
    
    def auth(user: String, pass: String): this.type
    @JSName("auth")
    var auth_Original: js.Function2[/* user */ String, /* pass */ String, this.type]
    
    def buffer(): this.type
    @JSName("buffer")
    var buffer_Original: js.Function0[this.type]
    
    def ca(cert: String): this.type
    @JSName("ca")
    var ca_Original: js.Function1[/* cert */ String, this.type]
    
    def cert(cert: String): this.type
    @JSName("cert")
    var cert_Original: js.Function1[/* cert */ String, this.type]
    
    def key(cert: String): this.type
    @JSName("key")
    var key_Original: js.Function1[/* cert */ String, this.type]
    
    def ok(callback: js.Function1[/* res */ Response, Boolean]): this.type
    @JSName("ok")
    var ok_Original: js.Function1[/* callback */ js.Function1[/* res */ Response, Boolean], this.type]
    
    @JSName("on")
    var on_Original: js.Function2[error, /* handler */ js.Function1[/* err */ Any, Unit], this.type]
    @JSName("on")
    def on_error(name: error, handler: js.Function1[/* err */ Any, Unit]): this.type
    
    def parse(parser: Parser): this.type
    @JSName("parse")
    var parse_Original: js.Function1[/* parser */ Parser, this.type]
    
    def pfx(cert: String): this.type
    @JSName("pfx")
    var pfx_Original: js.Function1[/* cert */ String, this.type]
    
    def query(`val`: js.Object): this.type
    @JSName("query")
    var query_Original: js.Function1[/* val */ js.Object, this.type]
    
    def redirects(n: Double): this.type
    @JSName("redirects")
    var redirects_Original: js.Function1[/* n */ Double, this.type]
    
    def retry(): this.type
    @JSName("retry")
    var retry_Original: js.Function0[this.type]
    
    def serialize(serializer: Serializer): this.type
    @JSName("serialize")
    var serialize_Original: js.Function1[/* serializer */ Serializer, this.type]
    
    def set(field: js.Object): this.type
    @JSName("set")
    var set_Original: js.Function1[/* field */ js.Object, this.type]
    
    def timeout(ms: Double): this.type
    @JSName("timeout")
    var timeout_Original: js.Function1[/* ms */ Double, this.type]
    
    def `type`(`val`: String): this.type
    @JSName("type")
    var type_Original: js.Function1[/* val */ String, this.type]
    
    def use(fn: Plugin): this.type
    @JSName("use")
    var use_Original: js.Function1[/* fn */ Plugin, this.type]
    
    def withCredentials(): this.type
    @JSName("withCredentials")
    var withCredentials_Original: js.Function0[this.type]
  }
  object PickRequestuseonsetqueryt {
    
    inline def apply(
      accept: /* type */ String => PickRequestuseonsetqueryt,
      auth: (/* user */ String, /* pass */ String) => PickRequestuseonsetqueryt,
      buffer: () => PickRequestuseonsetqueryt,
      ca: /* cert */ String => PickRequestuseonsetqueryt,
      cert: /* cert */ String => PickRequestuseonsetqueryt,
      key: /* cert */ String => PickRequestuseonsetqueryt,
      ok: /* callback */ js.Function1[/* res */ Response, Boolean] => PickRequestuseonsetqueryt,
      on: (error, /* handler */ js.Function1[/* err */ Any, Unit]) => PickRequestuseonsetqueryt,
      parse: /* parser */ Parser => PickRequestuseonsetqueryt,
      pfx: /* cert */ String => PickRequestuseonsetqueryt,
      query: /* val */ js.Object => PickRequestuseonsetqueryt,
      redirects: /* n */ Double => PickRequestuseonsetqueryt,
      retry: () => PickRequestuseonsetqueryt,
      serialize: /* serializer */ Serializer => PickRequestuseonsetqueryt,
      set: /* field */ js.Object => PickRequestuseonsetqueryt,
      timeout: /* ms */ Double => PickRequestuseonsetqueryt,
      `type`: /* val */ String => PickRequestuseonsetqueryt,
      use: /* fn */ Plugin => PickRequestuseonsetqueryt,
      withCredentials: () => PickRequestuseonsetqueryt
    ): PickRequestuseonsetqueryt = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), auth = js.Any.fromFunction2(auth), buffer = js.Any.fromFunction0(buffer), ca = js.Any.fromFunction1(ca), cert = js.Any.fromFunction1(cert), key = js.Any.fromFunction1(key), ok = js.Any.fromFunction1(ok), on = js.Any.fromFunction2(on), parse = js.Any.fromFunction1(parse), pfx = js.Any.fromFunction1(pfx), query = js.Any.fromFunction1(query), redirects = js.Any.fromFunction1(redirects), retry = js.Any.fromFunction0(retry), serialize = js.Any.fromFunction1(serialize), set = js.Any.fromFunction1(set), timeout = js.Any.fromFunction1(timeout), use = js.Any.fromFunction1(use), withCredentials = js.Any.fromFunction0(withCredentials))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[PickRequestuseonsetqueryt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickRequestuseonsetqueryt] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: /* type */ String => PickRequestuseonsetqueryt): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setAuth(value: (/* user */ String, /* pass */ String) => PickRequestuseonsetqueryt): Self = StObject.set(x, "auth", js.Any.fromFunction2(value))
      
      inline def setBuffer(value: () => PickRequestuseonsetqueryt): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      inline def setCa(value: /* cert */ String => PickRequestuseonsetqueryt): Self = StObject.set(x, "ca", js.Any.fromFunction1(value))
      
      inline def setCert(value: /* cert */ String => PickRequestuseonsetqueryt): Self = StObject.set(x, "cert", js.Any.fromFunction1(value))
      
      inline def setKey(value: /* cert */ String => PickRequestuseonsetqueryt): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setOk(value: /* callback */ js.Function1[/* res */ Response, Boolean] => PickRequestuseonsetqueryt): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
      
      inline def setOn(value: (error, /* handler */ js.Function1[/* err */ Any, Unit]) => PickRequestuseonsetqueryt): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setParse(value: /* parser */ Parser => PickRequestuseonsetqueryt): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setPfx(value: /* cert */ String => PickRequestuseonsetqueryt): Self = StObject.set(x, "pfx", js.Any.fromFunction1(value))
      
      inline def setQuery(value: /* val */ js.Object => PickRequestuseonsetqueryt): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setRedirects(value: /* n */ Double => PickRequestuseonsetqueryt): Self = StObject.set(x, "redirects", js.Any.fromFunction1(value))
      
      inline def setRetry(value: () => PickRequestuseonsetqueryt): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      inline def setSerialize(value: /* serializer */ Serializer => PickRequestuseonsetqueryt): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSet(value: /* field */ js.Object => PickRequestuseonsetqueryt): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: /* ms */ Double => PickRequestuseonsetqueryt): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
      
      inline def setType(value: /* val */ String => PickRequestuseonsetqueryt): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setUse(value: /* fn */ Plugin => PickRequestuseonsetqueryt): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
      
      inline def setWithCredentials(value: () => PickRequestuseonsetqueryt): Self = StObject.set(x, "withCredentials", js.Any.fromFunction0(value))
    }
  }
}
