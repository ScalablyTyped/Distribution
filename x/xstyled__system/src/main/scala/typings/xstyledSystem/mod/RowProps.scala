package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowProps extends StObject {
  
  val row: js.UndefOr[ResponsiveValue[String | Double | Boolean]] = js.native
}
object RowProps {
  
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  @scala.inline
  implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: ResponsiveValue[String | Double | Boolean]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setRowVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "row", js.Array(value :_*))
  }
}
