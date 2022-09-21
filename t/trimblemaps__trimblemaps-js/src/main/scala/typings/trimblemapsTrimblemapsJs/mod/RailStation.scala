package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.ERPC
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FSAC
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.R260
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.SPLC
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.StationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RailStation extends StObject {
  
  var format: FSAC | R260 | SPLC | ERPC | StationState
  
  var name: String
  
  var railroad: String
}
object RailStation {
  
  inline def apply(format: FSAC | R260 | SPLC | ERPC | StationState, name: String, railroad: String): RailStation = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], railroad = railroad.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailStation]
  }
  
  extension [Self <: RailStation](x: Self) {
    
    inline def setFormat(value: FSAC | R260 | SPLC | ERPC | StationState): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRailroad(value: String): Self = StObject.set(x, "railroad", value.asInstanceOf[js.Any])
  }
}
