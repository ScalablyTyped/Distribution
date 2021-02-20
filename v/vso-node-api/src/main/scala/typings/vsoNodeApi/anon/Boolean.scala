package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Boolean extends StObject {
  
  var boolean: scala.Double = js.native
  
  var branchFilter: scala.Double = js.native
  
  var multiLine: scala.Double = js.native
  
  var pickList: scala.Double = js.native
  
  var radio: scala.Double = js.native
  
  var string: scala.Double = js.native
  
  var stringList: scala.Double = js.native
}
object Boolean {
  
  @scala.inline
  def apply(
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
  implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolean(value: scala.Double): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFilter(value: scala.Double): Self = StObject.set(x, "branchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLine(value: scala.Double): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickList(value: scala.Double): Self = StObject.set(x, "pickList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadio(value: scala.Double): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringList(value: scala.Double): Self = StObject.set(x, "stringList", value.asInstanceOf[js.Any])
  }
}
