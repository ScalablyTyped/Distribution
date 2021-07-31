package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameLocation
  extends StObject
     with DocumentSpan {
  
  val prefixText: js.UndefOr[java.lang.String] = js.undefined
  
  val suffixText: js.UndefOr[java.lang.String] = js.undefined
}
object RenameLocation {
  
  @scala.inline
  def apply(fileName: java.lang.String, textSpan: TextSpan): RenameLocation = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameLocation]
  }
  
  @scala.inline
  implicit class RenameLocationMutableBuilder[Self <: RenameLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixText(value: java.lang.String): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixTextUndefined: Self = StObject.set(x, "prefixText", js.undefined)
    
    @scala.inline
    def setSuffixText(value: java.lang.String): Self = StObject.set(x, "suffixText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixTextUndefined: Self = StObject.set(x, "suffixText", js.undefined)
  }
}
