package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var range: Double | Boolean
  
  var scale: typings.vegaTypings.typesSpecEncodeMod.Field
}
object Range {
  
  inline def apply(range: Double | Boolean, scale: typings.vegaTypings.typesSpecEncodeMod.Field): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setRange(value: Double | Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
