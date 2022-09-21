package typings.typedoc.jsxElementsMod

import typings.typedoc.typedocStrings.captions
import typings.typedoc.typedocStrings.chapters
import typings.typedoc.typedocStrings.descriptions
import typings.typedoc.typedocStrings.metadata
import typings.typedoc.typedocStrings.subtitles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxTrackElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var kind: js.UndefOr[subtitles | captions | descriptions | chapters | metadata] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srclang: js.UndefOr[String] = js.undefined
}
object JsxTrackElementProps {
  
  inline def apply(): JsxTrackElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxTrackElementProps]
  }
  
  extension [Self <: JsxTrackElementProps](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setKind(value: subtitles | captions | descriptions | chapters | metadata): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
    
    inline def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
  }
}
