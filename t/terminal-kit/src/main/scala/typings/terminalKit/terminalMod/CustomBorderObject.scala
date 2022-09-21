package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomBorderObject extends StObject {
  
  var bottomLeft: String
  
  var bottomRight: String
  
  var bottomTee: String
  
  var cross: String
  
  var horizontal: String
  
  var leftTee: String
  
  var rightTee: String
  
  var topLeft: String
  
  var topRight: String
  
  var topTee: String
  
  var vertical: String
}
object CustomBorderObject {
  
  inline def apply(
    bottomLeft: String,
    bottomRight: String,
    bottomTee: String,
    cross: String,
    horizontal: String,
    leftTee: String,
    rightTee: String,
    topLeft: String,
    topRight: String,
    topTee: String,
    vertical: String
  ): CustomBorderObject = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], bottomTee = bottomTee.asInstanceOf[js.Any], cross = cross.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], leftTee = leftTee.asInstanceOf[js.Any], rightTee = rightTee.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any], topTee = topTee.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomBorderObject]
  }
  
  extension [Self <: CustomBorderObject](x: Self) {
    
    inline def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
    
    inline def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
    
    inline def setBottomTee(value: String): Self = StObject.set(x, "bottomTee", value.asInstanceOf[js.Any])
    
    inline def setCross(value: String): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setLeftTee(value: String): Self = StObject.set(x, "leftTee", value.asInstanceOf[js.Any])
    
    inline def setRightTee(value: String): Self = StObject.set(x, "rightTee", value.asInstanceOf[js.Any])
    
    inline def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    inline def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    
    inline def setTopTee(value: String): Self = StObject.set(x, "topTee", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
