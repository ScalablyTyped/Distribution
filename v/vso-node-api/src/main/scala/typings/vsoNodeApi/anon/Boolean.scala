package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boolean extends StObject {
  
  var boolean: scala.Double
  
  var branchFilter: scala.Double
  
  var multiLine: scala.Double
  
  var pickList: scala.Double
  
  var radio: scala.Double
  
  var string: scala.Double
  
  var stringList: scala.Double
}
object Boolean {
  
  inline def apply(
    boolean: scala.Double,
    branchFilter: scala.Double,
    multiLine: scala.Double,
    pickList: scala.Double,
    radio: scala.Double,
    string: scala.Double,
    stringList: scala.Double
  ): Boolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], branchFilter = branchFilter.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], stringList = stringList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
    
    inline def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setBranchFilter(value: scala.Double): Self = StObject.set(x, "branchFilter", value.asInstanceOf[js.Any])
    
    inline def setMultiLine(value: scala.Double): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    inline def setPickList(value: scala.Double): Self = StObject.set(x, "pickList", value.asInstanceOf[js.Any])
    
    inline def setRadio(value: scala.Double): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringList(value: scala.Double): Self = StObject.set(x, "stringList", value.asInstanceOf[js.Any])
  }
}
