package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.std.Partial
import typings.wixStyleReact.distTypesListItemActionMod.ListItemActionProps
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledIdOverrideOptionStyleValue[T /* <: Partial[ListItemActionProps] */] extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String | Double
  
  var overrideOptionStyle: `true`
  
  def value(props: T): ReactNode
}
object DisabledIdOverrideOptionStyleValue {
  
  inline def apply[T /* <: Partial[ListItemActionProps] */](id: String | Double, value: T => ReactNode): DisabledIdOverrideOptionStyleValue[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], overrideOptionStyle = true, value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[DisabledIdOverrideOptionStyleValue[T]]
  }
  
  extension [Self <: DisabledIdOverrideOptionStyleValue[?], T /* <: Partial[ListItemActionProps] */](x: Self & DisabledIdOverrideOptionStyleValue[T]) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: `true`): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T => ReactNode): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
