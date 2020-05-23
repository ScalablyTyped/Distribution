package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vizJs {
  type RenderFunction = js.Function3[
    /* instance */ typings.vizJs.Module, 
    /* src */ java.lang.String, 
    /* options */ typings.vizJs.Options, 
    java.lang.String
  ]
}
