package typings.vegaTypings.anon

import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.autosizeMod.AutoSizeType
import typings.vegaTypings.vegaTypingsStrings.content
import typings.vegaTypings.vegaTypingsStrings.padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contains extends AutoSize {
  
  var contains: js.UndefOr[content | padding] = js.native
  
  var resize: js.UndefOr[Boolean] = js.native
  
  var `type`: AutoSizeType = js.native
}
object Contains {
  
  @scala.inline
  def apply(`type`: AutoSizeType): Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  
  @scala.inline
  implicit class ContainsMutableBuilder[Self <: Contains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: content | padding): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setType(value: AutoSizeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
