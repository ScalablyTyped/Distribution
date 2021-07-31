package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOffsetSupport extends StObject {
  
  /**
    * The client supports processing label offsets instead of a
    * simple label string.
    *
    * @since 3.14.0
    */
  var labelOffsetSupport: js.UndefOr[Boolean] = js.undefined
}
object LabelOffsetSupport {
  
  @scala.inline
  def apply(): LabelOffsetSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOffsetSupport]
  }
  
  @scala.inline
  implicit class LabelOffsetSupportMutableBuilder[Self <: LabelOffsetSupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelOffsetSupport(value: Boolean): Self = StObject.set(x, "labelOffsetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOffsetSupportUndefined: Self = StObject.set(x, "labelOffsetSupport", js.undefined)
  }
}
