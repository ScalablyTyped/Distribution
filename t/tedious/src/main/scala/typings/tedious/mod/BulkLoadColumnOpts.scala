package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkLoadColumnOpts
  extends StObject
     with ParameterOptions {
  
  //  Indicates whether the column accepts NULL values.
  var nullable: Boolean
  
  //  If the name of the column is different from the name of the property found on rowObj arguments passed to , then you can use this option to specify the property name.
  var objName: js.UndefOr[String] = js.undefined
}
object BulkLoadColumnOpts {
  
  @scala.inline
  def apply(nullable: Boolean): BulkLoadColumnOpts = {
    val __obj = js.Dynamic.literal(nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkLoadColumnOpts]
  }
  
  @scala.inline
  implicit class BulkLoadColumnOptsMutableBuilder[Self <: BulkLoadColumnOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjName(value: String): Self = StObject.set(x, "objName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjNameUndefined: Self = StObject.set(x, "objName", js.undefined)
  }
}
