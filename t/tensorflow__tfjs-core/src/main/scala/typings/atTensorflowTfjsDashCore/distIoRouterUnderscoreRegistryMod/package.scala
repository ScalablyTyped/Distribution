package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distIoRouterUnderscoreRegistryMod {
  import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler

  type IORouter = js.Function2[
    /* url */ String | js.Array[String], 
    /* onProgress */ js.UndefOr[js.Function], 
    IOHandler
  ]
}
