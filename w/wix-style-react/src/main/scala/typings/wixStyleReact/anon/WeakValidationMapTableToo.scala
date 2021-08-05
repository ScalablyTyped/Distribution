package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<wix-style-react.wix-style-react/dist/es/src/TableToolbar.TableToolbarProps> */
trait WeakValidationMapTableToo extends StObject {
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
}
object WeakValidationMapTableToo {
  
  inline def apply(): WeakValidationMapTableToo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTableToo]
  }
  
  extension [Self <: WeakValidationMapTableToo](x: Self) {
    
    inline def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
