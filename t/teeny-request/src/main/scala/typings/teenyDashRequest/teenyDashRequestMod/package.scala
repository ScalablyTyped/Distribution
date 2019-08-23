package typings.teenyDashRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object teenyDashRequestMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type Headers = StringDictionary[js.Any]
  type RequestCallback[T] = js.Function3[
    /* err */ Error | Null, 
    /* response */ Response[js.Any], 
    /* body */ js.UndefOr[T], 
    Unit
  ]
}
