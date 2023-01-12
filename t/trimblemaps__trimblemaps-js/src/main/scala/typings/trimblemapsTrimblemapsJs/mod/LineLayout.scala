package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.bevel
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.butt
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.miter
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.round
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLayout
  extends StObject
     with Layout
     with _AnyLayout {
  
  var `line-cap`: js.UndefOr[butt | round | square] = js.undefined
  
  var `line-join`: js.UndefOr[bevel | round | miter | Expression] = js.undefined
  
  var `line-miter-limit`: js.UndefOr[Double | Expression] = js.undefined
  
  var `line-round-limit`: js.UndefOr[Double | Expression] = js.undefined
  
  var `line-sort-key`: js.UndefOr[Double | Expression] = js.undefined
}
object LineLayout {
  
  inline def apply(): LineLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineLayout] (val x: Self) extends AnyVal {
    
    inline def `setLine-cap`(value: butt | round | square): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    inline def `setLine-capUndefined`: Self = StObject.set(x, "line-cap", js.undefined)
    
    inline def `setLine-join`(value: bevel | round | miter | Expression): Self = StObject.set(x, "line-join", value.asInstanceOf[js.Any])
    
    inline def `setLine-joinUndefined`: Self = StObject.set(x, "line-join", js.undefined)
    
    inline def `setLine-miter-limit`(value: Double | Expression): Self = StObject.set(x, "line-miter-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-miter-limitUndefined`: Self = StObject.set(x, "line-miter-limit", js.undefined)
    
    inline def `setLine-round-limit`(value: Double | Expression): Self = StObject.set(x, "line-round-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-round-limitUndefined`: Self = StObject.set(x, "line-round-limit", js.undefined)
    
    inline def `setLine-sort-key`(value: Double | Expression): Self = StObject.set(x, "line-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setLine-sort-keyUndefined`: Self = StObject.set(x, "line-sort-key", js.undefined)
  }
}
