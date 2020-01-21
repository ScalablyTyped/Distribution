package typings.typedGithubApi

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/utils/request-with-rawbody", JSImport.Namespace)
@js.native
object requestWithRawbodyMod extends js.Object {
  @js.native
  trait RequestWithRawBody
    extends Request[ParamsDictionary, js.Any, js.Any] {
    var rawBody: js.UndefOr[Uint8Array] = js.native
  }
  
}

