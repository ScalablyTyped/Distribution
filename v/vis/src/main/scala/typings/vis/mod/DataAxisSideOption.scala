package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataAxisSideOption extends StObject {
  
  var format: js.UndefOr[js.Function0[String]] = js.native
  
  var range: js.UndefOr[RangeType] = js.native
  
  var title: js.UndefOr[TitleOption] = js.native
}
object DataAxisSideOption {
  
  @scala.inline
  def apply(): DataAxisSideOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataAxisSideOption]
  }
  
  @scala.inline
  implicit class DataAxisSideOptionMutableBuilder[Self <: DataAxisSideOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRange(value: RangeType): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setTitle(value: TitleOption): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
