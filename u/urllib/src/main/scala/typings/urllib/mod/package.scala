package typings.urllib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function3[
    /* err */ typings.std.Error, 
    /* data */ T, 
    /* res */ typings.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
