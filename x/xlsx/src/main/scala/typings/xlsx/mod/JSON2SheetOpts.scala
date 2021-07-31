package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSON2SheetOpts
  extends StObject
     with CommonOptions
     with DateNFOption {
  
  /** Use specified column order */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Skip header row in generated sheet */
  var skipHeader: js.UndefOr[Boolean] = js.undefined
}
object JSON2SheetOpts {
  
  @scala.inline
  def apply(): JSON2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSON2SheetOpts]
  }
  
  @scala.inline
  implicit class JSON2SheetOptsMutableBuilder[Self <: JSON2SheetOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    @scala.inline
    def setSkipHeader(value: Boolean): Self = StObject.set(x, "skipHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipHeaderUndefined: Self = StObject.set(x, "skipHeader", js.undefined)
  }
}
