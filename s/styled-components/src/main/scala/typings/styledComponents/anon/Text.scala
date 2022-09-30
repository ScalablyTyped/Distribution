package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var Image: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.Image, imported_react-native.ImageProps, unknown> */ Any
  
  var Text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.Text, imported_react-native.TextProps, unknown> */ Any
  
  var Touchable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<imported_react.ComponentType<imported_react-native.TouchableOpacityProps>, imported_react-native.TouchableOpacityProps | imported_react-native.TouchableOpacityProps & {  children :imported_react.ReactNode | undefined}, unknown> */ Any
  
  var View: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.View, imported_react-native.ViewProps, unknown> */ Any
}
object Text {
  
  inline def apply(
    Image: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.Image, imported_react-native.ImageProps, unknown> */ Any,
    Text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.Text, imported_react-native.TextProps, unknown> */ Any,
    Touchable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<imported_react.ComponentType<imported_react-native.TouchableOpacityProps>, imported_react-native.TouchableOpacityProps | imported_react-native.TouchableOpacityProps & {  children :imported_react.ReactNode | undefined}, unknown> */ Any,
    View: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.View, imported_react-native.ViewProps, unknown> */ Any
  ): Text = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Touchable = Touchable.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setImage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.Image, imported_react-native.ImageProps, unknown> */ Any
    ): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setText(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.Text, imported_react-native.TextProps, unknown> */ Any
    ): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTouchable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<imported_react.ComponentType<imported_react-native.TouchableOpacityProps>, imported_react-native.TouchableOpacityProps | imported_react-native.TouchableOpacityProps & {  children :imported_react.ReactNode | undefined}, unknown> */ Any
    ): Self = StObject.set(x, "Touchable", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeStyled<typeof reactPrimitives.View, imported_react-native.ViewProps, unknown> */ Any
    ): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
