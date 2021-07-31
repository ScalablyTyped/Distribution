package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.std.Partial
import typings.wixStyleReact.listItemActionMod.ListItemActionProps
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideOptionStyle[T /* <: Partial[ListItemActionProps] */] extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String | Double
  
  var overrideOptionStyle: `true`
  
  def value(props: T): ReactNode
}
object OverrideOptionStyle {
  
  @scala.inline
  def apply[T /* <: Partial[ListItemActionProps] */](id: String | Double, value: T => ReactNode): OverrideOptionStyle[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], overrideOptionStyle = true, value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[OverrideOptionStyle[T]]
  }
  
  @scala.inline
  implicit class OverrideOptionStyleMutableBuilder[Self <: OverrideOptionStyle[?], T /* <: Partial[ListItemActionProps] */] (val x: Self & OverrideOptionStyle[T]) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideOptionStyle(value: `true`): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T => ReactNode): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
