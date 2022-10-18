package typings.thenRequest

import typings.httpBasic.libHttpVerbMod.HttpVerb
import typings.thenRequest.libOptionsMod.Options
import typings.thenRequest.libResponsePromiseMod.ResponsePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRequestFnMod {
  
  type RequestFn = js.Function3[
    /* method */ HttpVerb, 
    /* url */ String, 
    /* options */ js.UndefOr[Options], 
    ResponsePromise
  ]
}
