package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.themeUiComponents.anon.As
import typings.themeUiComponents.distDeclarationsSrcInputMod.InputProps
import typings.themeUiComponents.distDeclarationsSrcUtilMod.MarginProps
import typings.themeUiComponents.themeUiComponentsStrings.as
import typings.themeUiComponents.themeUiComponentsStrings.label
import typings.themeUiComponents.themeUiComponentsStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcFieldMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Field", "Field")
  @js.native
  val Field: typings.themeUiComponents.distDeclarationsSrcFieldMod.Field = js.native
  type Field = js.Function1[/* props */ FieldProps[ComponentType[InputProps]], Element]
  
  trait FieldOwnProps
    extends StObject
       with MarginProps {
    
    /**
      * Text for Label component
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the for, id, and name attributes
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object FieldOwnProps {
    
    inline def apply(): FieldOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldOwnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldOwnProps] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type FieldProps[T /* <: ElementType[Any] */] = FieldOwnProps & (Omit[ComponentPropsWithRef[T], as | label | name]) & As[T]
}
