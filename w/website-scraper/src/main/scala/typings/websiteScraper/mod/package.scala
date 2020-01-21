package typings.websiteScraper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ js.Any | scala.Null, 
    /* result */ js.Array[typings.websiteScraper.mod.Resource] | scala.Null, 
    scala.Unit
  ]
}
