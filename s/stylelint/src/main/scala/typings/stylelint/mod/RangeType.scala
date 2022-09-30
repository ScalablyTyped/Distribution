package typings.stylelint.mod

import typings.postcss.mod.Comment_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeType
  extends StObject
     with DisabledRange {
  
  var used: js.UndefOr[Boolean] = js.undefined
}
object RangeType {
  
  inline def apply(comment: Comment_, start: Double, strictStart: Boolean): RangeType = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], strictStart = strictStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeType]
  }
  
  extension [Self <: RangeType](x: Self) {
    
    inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
