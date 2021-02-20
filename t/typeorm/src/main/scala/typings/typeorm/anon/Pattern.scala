package typings.typeorm.anon

import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import typings.typeorm.typeormStrings.STI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern extends StObject {
  
  var column: js.UndefOr[String | ColumnOptions] = js.native
  
  var pattern: js.UndefOr[STI] = js.native
}
object Pattern {
  
  @scala.inline
  def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: String | ColumnOptions): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setPattern(value: STI): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
