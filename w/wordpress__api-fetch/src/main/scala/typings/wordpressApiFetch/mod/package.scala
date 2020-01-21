package typings.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware = js.Function2[
    /* options */ typings.wordpressApiFetch.mod.APIFetchOptions, 
    /* next */ js.Function1[/* options */ typings.wordpressApiFetch.mod.APIFetchOptions, js.Promise[js.Any]], 
    js.Promise[js.Any]
  ]
}
