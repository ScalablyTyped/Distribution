package typings.swaggerParser.anon

import typings.node.Buffer
import typings.std.Error
import typings.std.RegExp
import typings.swaggerParser.mod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<swagger-parser.swagger-parser.ResolverOptions> */
trait PartialResolverOptions extends js.Object {
  var canRead: js.UndefOr[
    Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
  ] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var read: js.UndefOr[
    js.Function2[
      /* file */ FileInfo, 
      /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]], 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.undefined
}

object PartialResolverOptions {
  @scala.inline
  def apply(
    canRead: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean]) = null,
    order: js.UndefOr[Double] = js.undefined,
    read: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]]) => String | Buffer | (js.Promise[String | Buffer]) = null
  ): PartialResolverOptions = {
    val __obj = js.Dynamic.literal()
    if (canRead != null) __obj.updateDynamic("canRead")(canRead.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2(read))
    __obj.asInstanceOf[PartialResolverOptions]
  }
}

