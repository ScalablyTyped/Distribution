package typings.textBuffer.mod.global.TextBuffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** The types usable when constructing a point via the Point::fromObject method. */
type PointCompatible = PointLike | (js.Tuple2[Double, Double])

/** The types usable when constructing a range via the Range::fromObject method. */
type RangeCompatible = RangeLike | (js.Tuple2[PointLike | (js.Tuple2[Double, Double]), PointLike | (js.Tuple2[Double, Double])])
