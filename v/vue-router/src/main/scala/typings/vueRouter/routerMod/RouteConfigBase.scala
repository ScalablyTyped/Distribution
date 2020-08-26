package typings.vueRouter.routerMod

import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteConfigBase extends js.Object {
  var alias: js.UndefOr[String | js.Array[String]] = js.native
  var beforeEnter: js.UndefOr[NavigationGuard[Vue]] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Array[RouteConfig]] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var path: String = js.native
  var pathToRegexpOptions: js.UndefOr[PathToRegexpOptions] = js.native
  var redirect: js.UndefOr[RedirectOption] = js.native
}

object RouteConfigBase {
  @scala.inline
  def apply(path: String): RouteConfigBase = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigBase]
  }
  @scala.inline
  implicit class RouteConfigBaseOps[Self <: RouteConfigBase] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasVarargs(value: String*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: String | js.Array[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setBeforeEnter(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[Vue]) => js.Any): Self = this.set("beforeEnter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeEnter: Self = this.set("beforeEnter", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: RouteConfig*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[RouteConfig]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPathToRegexpOptions(value: PathToRegexpOptions): Self = this.set("pathToRegexpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathToRegexpOptions: Self = this.set("pathToRegexpOptions", js.undefined)
    @scala.inline
    def setRedirectFunction1(value: /* to */ Route => RawLocation): Self = this.set("redirect", js.Any.fromFunction1(value))
    @scala.inline
    def setRedirect(value: RedirectOption): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
  }
  
}

