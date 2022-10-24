package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesListItemSectionMod.ListItemSectionTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookEllipsis extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var id: String | Double
  
  var suffix: js.UndefOr[ReactNode] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[ListItemSectionTypes] = js.undefined
}
object DataHookEllipsis {
  
  inline def apply(id: String | Double): DataHookEllipsis = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookEllipsis]
  }
  
  extension [Self <: DataHookEllipsis](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: ListItemSectionTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
