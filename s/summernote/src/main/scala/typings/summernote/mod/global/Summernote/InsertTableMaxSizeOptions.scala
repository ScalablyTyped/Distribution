package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertTableMaxSizeOptions extends StObject {
  
  var col: Double = js.native
  
  var row: Double = js.native
}
object InsertTableMaxSizeOptions {
  
  @scala.inline
  def apply(col: Double, row: Double): InsertTableMaxSizeOptions = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableMaxSizeOptions]
  }
  
  @scala.inline
  implicit class InsertTableMaxSizeOptionsMutableBuilder[Self <: InsertTableMaxSizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
