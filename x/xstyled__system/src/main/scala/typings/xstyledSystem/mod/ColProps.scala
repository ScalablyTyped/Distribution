package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColProps extends StObject {
  
  val col: js.UndefOr[ResponsiveValue[String | Double | Boolean]] = js.native
}
object ColProps {
  
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  
  @scala.inline
  implicit class ColPropsMutableBuilder[Self <: ColProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: ResponsiveValue[String | Double | Boolean]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    @scala.inline
    def setColVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "col", js.Array(value :_*))
  }
}
