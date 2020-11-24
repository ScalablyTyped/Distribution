package typings.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ typings.uws.anon.Origin, 
    /* callback */ js.Function1[/* res */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  
  type VerifyClientCallbackSync = js.Function1[/* info */ typings.uws.anon.Origin, scala.Boolean]
}
