package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vegaDashEmbedMod {
  type PatchFunc = js.Function1[
    /* spec */ vegaDashTypingsLib.typesSpecMod.Spec, 
    vegaDashTypingsLib.typesSpecMod.Spec
  ]
  type VisualizationSpec = vegaDashLiteLib.buildSrcSpecMod.TopLevelSpec | vegaDashTypingsLib.typesSpecMod.Spec
}
