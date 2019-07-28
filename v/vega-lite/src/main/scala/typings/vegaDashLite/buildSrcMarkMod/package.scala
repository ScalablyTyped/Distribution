package typings.vegaDashLite

import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMark
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMarkDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcMarkMod {
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashLite.buildSrcMarkMod.HiddenComposite
    - typings.vegaDashLite.buildSrcMarkMod.Mark
    - typings.vegaDashLite.buildSrcMarkMod.MarkDef
  */
  type AnyMark = _AnyMark | HiddenComposite
  type HiddenComposite = CompositeMark | CompositeMarkDef
  type OverlayMarkDef = MarkConfig with MarkDefMixins
}
