package typings.victory.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  var data: js.UndefOr[CSSPropertiestypeScatterS] = js.undefined
  
  var labels: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[CSSProperties] = js.undefined
}
object Labels {
  
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit class LabelsMutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CSSPropertiestypeScatterS): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLabels(value: CSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setTitle(value: CSSProperties): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
