package typings.universalRouter.universalRouterSyncMod

import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.RegexpToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pathToRegexp.mod.TokensToRegexpOptions because var conflicts: delimiter. Inlined encode, end, endsWith, sensitive, start, strict */ @js.native
trait RouterOptions[R, C /* <: RouterContext */]
  extends ParseOptions
     with RegexpToFunctionOptions {
  var baseUrl: js.UndefOr[String] = js.native
  var context: js.UndefOr[C] = js.native
  /**
    * Encode path tokens for use in the `RegExp`.
    */
  var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  /**
    * When `true` the regexp will match to the end of the string. (default: `true`)
    */
  var end: js.UndefOr[Boolean] = js.native
  /**
    * List of characters that can also be "end" characters.
    */
  var endsWith: js.UndefOr[String] = js.native
  var errorHandler: js.UndefOr[ErrorHandler[R]] = js.native
  var resolveRoute: js.UndefOr[ResolveRoute[R, C]] = js.native
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.native
  /**
    * When `true` the regexp will match from the beginning of the string. (default: `true`)
    */
  var start: js.UndefOr[Boolean] = js.native
  /**
    * When `true` the regexp allows an optional trailing delimiter to match. (default: `false`)
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object RouterOptions {
  @scala.inline
  def apply[R, /* <: typings.universalRouter.universalRouterSyncMod.RouterContext */ C](): RouterOptions[R, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions[R, C]]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions[_, _], R, /* <: typings.universalRouter.universalRouterSyncMod.RouterContext */ C] (val x: Self with (RouterOptions[R, C])) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setContext(value: C): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEncode(value: /* value */ String => String): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndsWith(value: String): Self = this.set("endsWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndsWith: Self = this.set("endsWith", js.undefined)
    @scala.inline
    def setErrorHandler(value: (/* error */ RouteError, /* context */ ResolveContext) => RouteResultSync[R]): Self = this.set("errorHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setResolveRoute(value: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResultSync[R]): Self = this.set("resolveRoute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResolveRoute: Self = this.set("resolveRoute", js.undefined)
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

