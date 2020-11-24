package typings.textBuffer.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object TextBuffer {
  
  /** The types usable when constructing a point via the Point::fromObject method. */
  type PointCompatible = typings.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double])
  
  /** The types usable when constructing a range via the Range::fromObject method. */
  type RangeCompatible = typings.textBuffer.mod.global.TextBuffer.RangeLike | (js.Tuple2[
    typings.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
    typings.textBuffer.mod.global.TextBuffer.PointLike | (js.Tuple2[scala.Double, scala.Double])
  ])
}
