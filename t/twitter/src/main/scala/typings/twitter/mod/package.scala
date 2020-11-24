package typings.twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* error */ js.Any, 
    /* data */ typings.twitter.mod.ResponseData, 
    /* response */ typings.request.mod.Response, 
    scala.Unit
  ]
  
  type ResponseData = org.scalablytyped.runtime.StringDictionary[js.Any]
}
