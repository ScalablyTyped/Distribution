package typings
package websiteDashScraperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websiteDashScraperMod {
  type Callback = js.Function2[
    /* error */ js.Any | scala.Null, 
    /* result */ js.Array[Resource] | scala.Null, 
    scala.Unit
  ]
}
