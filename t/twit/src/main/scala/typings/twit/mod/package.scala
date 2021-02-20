package typings.twit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* err */ typings.std.Error, 
    /* result */ typings.twit.mod.Response, 
    /* response */ typings.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
  
  type Response = js.Object
}
