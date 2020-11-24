package typings.wpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HTTPHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Routes = org.scalablytyped.runtime.StringDictionary[typings.wpapi.mod.Route]
  
  type TransportFunction = js.Function2[
    /* wpreq */ typings.wpapi.mod.WPRequest, 
    /* cb */ js.UndefOr[typings.wpapi.mod.WPRequestCallback], 
    js.Promise[js.Any]
  ]
  
  type WPRequestCallback = js.Function2[/* error */ typings.std.Error, /* data */ js.Any, scala.Unit]
  
  type WPRequestFactory = js.Function0[typings.wpapi.mod.WPRequest]
}
