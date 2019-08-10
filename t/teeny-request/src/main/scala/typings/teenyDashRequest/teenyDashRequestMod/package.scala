package typings.teenyDashRequest

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object teenyDashRequestMod {
  type Headers = StringDictionary[js.UndefOr[String]]
  type RequestCallback[T] = js.Function3[
    /* err */ Error | Null, 
    /* response */ Response[js.Any], 
    /* body */ js.UndefOr[T], 
    Unit
  ]
}
