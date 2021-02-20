package typings.typedGithubApi

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestWithRawbodyMod {
  
  @js.native
  trait RequestWithRawBody
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var rawBody: js.UndefOr[Uint8Array] = js.native
  }
}
