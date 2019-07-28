package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distIoTypesMod {
  type LoadHandler = js.Function0[js.Promise[ModelArtifacts]]
  type OnProgressCallback = js.Function1[/* fraction */ Double, Unit]
  type SaveHandler = js.Function1[/* modelArtifact */ ModelArtifacts, js.Promise[SaveResult]]
  type WeightsManifestConfig = js.Array[WeightsManifestGroupConfig]
}
