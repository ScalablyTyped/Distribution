package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWordpressApiDashFetchMod {
  type Middleware = js.Function2[
    /* options */ APIFetchOptions, 
    /* next */ js.Function1[/* options */ APIFetchOptions, js.Promise[js.Any]], 
    js.Promise[js.Any]
  ]
}
