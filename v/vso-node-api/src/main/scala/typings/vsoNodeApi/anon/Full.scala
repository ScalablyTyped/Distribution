package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  var full: scala.Double
  
  var none: scala.Double
  
  var oneLevel: scala.Double
  
  var oneLevelPlusNestedEmptyFolders: scala.Double
}
object Full {
  
  inline def apply(
    full: scala.Double,
    none: scala.Double,
    oneLevel: scala.Double,
    oneLevelPlusNestedEmptyFolders: scala.Double
  ): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], oneLevel = oneLevel.asInstanceOf[js.Any], oneLevelPlusNestedEmptyFolders = oneLevelPlusNestedEmptyFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  extension [Self <: Full](x: Self) {
    
    inline def setFull(value: scala.Double): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setOneLevel(value: scala.Double): Self = StObject.set(x, "oneLevel", value.asInstanceOf[js.Any])
    
    inline def setOneLevelPlusNestedEmptyFolders(value: scala.Double): Self = StObject.set(x, "oneLevelPlusNestedEmptyFolders", value.asInstanceOf[js.Any])
  }
}
