package typings.universalRouter.generateUrlsMod

import typings.universalRouter.mod.RouterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router/src/generateUrls", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Create a function to generate urls by route names.
    */
  def apply(router: typings.universalRouter.mod.default[_, RouterContext]): GenerateUrl = js.native
  def apply(router: typings.universalRouter.mod.default[_, RouterContext], options: GenerateUrlsOptions): GenerateUrl = js.native
}

