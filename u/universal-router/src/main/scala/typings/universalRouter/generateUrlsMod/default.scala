package typings.universalRouter.generateUrlsMod

import typings.universalRouter.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router/src/generateUrls", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(router: typings.universalRouter.mod.default[Context, _]): js.Function2[/* routeName */ String, /* params */ js.UndefOr[Params], String] = js.native
  def apply(router: typings.universalRouter.mod.default[Context, _], options: GenerateUrlsOptions): js.Function2[/* routeName */ String, /* params */ js.UndefOr[Params], String] = js.native
  def apply(
    router: typings.universalRouter.universalRouterSyncMod.default[typings.universalRouter.universalRouterSyncMod.Context, _]
  ): js.Function2[/* routeName */ String, /* params */ js.UndefOr[Params], String] = js.native
  def apply(
    router: typings.universalRouter.universalRouterSyncMod.default[typings.universalRouter.universalRouterSyncMod.Context, _],
    options: GenerateUrlsOptions
  ): js.Function2[/* routeName */ String, /* params */ js.UndefOr[Params], String] = js.native
}

