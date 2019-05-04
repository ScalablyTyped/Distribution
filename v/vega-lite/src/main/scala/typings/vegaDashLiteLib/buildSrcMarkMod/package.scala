package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcMarkMod {
  /* Rewritten from type alias, can be one of: 
    - HiddenComposite
    - Mark
    - MarkDef
  */
  type AnyMark = _AnyMark | HiddenComposite
  type HiddenComposite = vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark | vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMarkDef
  type OverlayMarkDef = MarkConfig with MarkDefMixins
}
