package typings.teenyRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RequestCallback[T] = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* response */ typings.teenyRequest.mod.Response[js.Any], 
    /* body */ js.UndefOr[T], 
    scala.Unit
  ]
}
