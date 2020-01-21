package typings.swToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler = js.Function1[
    /* request */ typings.swToolbox.mod.Request, 
    js.Promise[typings.swToolbox.mod.Response]
  ]
  type PrecacheURL = typings.swToolbox.mod.Request | java.lang.String
  type PrecacheURLs = js.Promise[js.Array[typings.swToolbox.mod.PrecacheURL]] | js.Array[typings.swToolbox.mod.PrecacheURL]
  type URLPattern = java.lang.String | typings.std.RegExp
}
