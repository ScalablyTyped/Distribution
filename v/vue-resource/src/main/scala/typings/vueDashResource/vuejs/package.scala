package typings.vueDashResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vuejs {
  type $resource = js.Function4[
    /* url */ String, 
    /* params */ js.UndefOr[js.Object], 
    /* actions */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[HttpOptions], 
    ResourceMethods
  ]
}
