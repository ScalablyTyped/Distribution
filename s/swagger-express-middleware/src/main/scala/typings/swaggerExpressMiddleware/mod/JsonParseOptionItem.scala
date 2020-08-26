package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonParseOptionItem extends js.Object {
  /**
    * if deflated bodies will be inflated. (default: true)
    */
  var inflate: js.UndefOr[Boolean] = js.native
  /**
    * Controls the maximum request body size.
    * If this is a number, then the value specifies the number of bytes; if it is a string, the value is passed to the bytes library for parsing.
    * Defaults to '100kb'
    */
  var limit: js.UndefOr[String | Double] = js.native
  /**
    * passed to JSON.parse().
    */
  var receiver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  /**
    * only parse objects and arrays. (default: true)
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like json), a mime type (like application/json), or a mime * type with a wildcard (like * / * or * /json).
    * If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value. Defaults to application/json
    */
  var `type`: js.UndefOr[
    (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) | String
  ] = js.native
  /**
    * The verify option, if supplied, is called as verify(req, res, buf, encoding), where buf is a Buffer of the raw request body and encoding is the encoding of the request.
    * The parsing can be aborted by throwing an error.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.native
}

object JsonParseOptionItem {
  @scala.inline
  def apply(): JsonParseOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonParseOptionItem]
  }
  @scala.inline
  implicit class JsonParseOptionItemOps[Self <: JsonParseOptionItem] (val x: Self) extends AnyVal {
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
    def setInflate(value: Boolean): Self = this.set("inflate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInflate: Self = this.set("inflate", js.undefined)
    @scala.inline
    def setLimit(value: String | Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setReceiver(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("receiver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTypeFunction1(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = this.set("type", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerify(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response, /* buf */ Buffer, /* encoding */ String) => Unit
    ): Self = this.set("verify", js.Any.fromFunction4(value))
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
  
}

