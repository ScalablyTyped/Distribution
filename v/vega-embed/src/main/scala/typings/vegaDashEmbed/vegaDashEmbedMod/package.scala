package typings.vegaDashEmbed

import typings.vegaDashLite.buildSrcSpecMod.TopLevelSpec
import typings.vegaDashTypings.typesSpecMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vegaDashEmbedMod {
  type PatchFunc = js.Function1[/* spec */ Spec, Spec]
  type VisualizationSpec = TopLevelSpec | Spec
}
