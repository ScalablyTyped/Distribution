package typings.thenRequest

import typings.httpBasic.httpVerbMod.HttpVerb
import typings.thenRequest.optionsMod.Options
import typings.thenRequest.responsePromiseMod.ResponsePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("then-request/lib/RequestFn", JSImport.Namespace)
@js.native
object requestFnMod extends js.Object {
  
  type RequestFn = js.Function3[
    /* method */ HttpVerb, 
    /* url */ String, 
    /* options */ js.UndefOr[Options], 
    ResponsePromise
  ]
}
