package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range
  extends StObject
     with ScaledValueRef[js.Any] {
  
  var range: Double | Boolean
  
  var scale: typings.vegaTypings.encodeMod.Field
}
object Range {
  
  inline def apply(range: Double | Boolean, scale: typings.vegaTypings.encodeMod.Field): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setRange(value: Double | Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
