package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFooter extends StObject {
  
  var columnFooter: js.UndefOr[Double] = js.native
  
  var columnHeader: js.UndefOr[Double] = js.native
  
  var columnTitle: js.UndefOr[Double] = js.native
  
  var rowFooter: js.UndefOr[Double] = js.native
  
  var rowHeader: js.UndefOr[Double] = js.native
  
  var rowTitle: js.UndefOr[Double] = js.native
}
object ColumnFooter {
  
  @scala.inline
  def apply(): ColumnFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFooter]
  }
  
  @scala.inline
  implicit class ColumnFooterMutableBuilder[Self <: ColumnFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnFooter(value: Double): Self = StObject.set(x, "columnFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFooterUndefined: Self = StObject.set(x, "columnFooter", js.undefined)
    
    @scala.inline
    def setColumnHeader(value: Double): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
    
    @scala.inline
    def setColumnTitle(value: Double): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    @scala.inline
    def setRowFooter(value: Double): Self = StObject.set(x, "rowFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFooterUndefined: Self = StObject.set(x, "rowFooter", js.undefined)
    
    @scala.inline
    def setRowHeader(value: Double): Self = StObject.set(x, "rowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeaderUndefined: Self = StObject.set(x, "rowHeader", js.undefined)
    
    @scala.inline
    def setRowTitle(value: Double): Self = StObject.set(x, "rowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTitleUndefined: Self = StObject.set(x, "rowTitle", js.undefined)
  }
}
