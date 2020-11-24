package typings.ultraStrftime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StrftimeFunction = js.Function3[
    /* fmt */ java.lang.String, 
    /* d */ js.UndefOr[typings.std.Date], 
    /* options */ js.UndefOr[typings.ultraStrftime.mod.Options], 
    java.lang.String
  ]
}
