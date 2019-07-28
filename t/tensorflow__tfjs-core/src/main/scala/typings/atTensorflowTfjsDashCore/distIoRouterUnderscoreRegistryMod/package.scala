package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distIoRouterUnderscoreRegistryMod {
  type IORouter = js.Function2[
    /* url */ String | js.Array[String], 
    /* onProgress */ js.UndefOr[js.Function], 
    IOHandler
  ]
}
