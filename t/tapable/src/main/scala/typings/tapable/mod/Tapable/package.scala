package typings.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Tapable {
  
  type CallbackFunction = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* result */ js.UndefOr[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  
  type Handler = js.Function1[/* repeated */ js.Any, scala.Unit]
}
