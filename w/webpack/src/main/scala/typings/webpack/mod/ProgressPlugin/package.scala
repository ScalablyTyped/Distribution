package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProgressPlugin {
  /**
    * A handler function which will be called when webpack hooks report progress
    */
  type Handler = js.Function3[
    /* percentage */ scala.Double, 
    /* msg */ java.lang.String, 
    /* repeated */ java.lang.String, 
    scala.Unit
  ]
}
