package typings.styledComponents.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentType
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewProps
import typings.styledComponents.distDistConstructorsConstructWithOptionsMod.NativeStyled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touchable extends StObject {
  
  var Image: NativeStyled[TypeofImageInstantiable, ImageProps, Any]
  
  var Text: NativeStyled[
    Instantiable1[/* props */ ReadonlyTextProps, typings.reactPrimitives.mod.Text], 
    TextProps, 
    Any
  ]
  
  var Touchable: NativeStyled[
    ComponentType[TouchableOpacityProps], 
    TouchableOpacityProps | TouchableOpacityPropschil, 
    Any
  ]
  
  var View: NativeStyled[TypeofViewInstantiable, ViewProps, Any]
}
object Touchable {
  
  inline def apply(
    Image: NativeStyled[TypeofImageInstantiable, ImageProps, Any],
    Text: NativeStyled[
      Instantiable1[/* props */ ReadonlyTextProps, typings.reactPrimitives.mod.Text], 
      TextProps, 
      Any
    ],
    Touchable: NativeStyled[
      ComponentType[TouchableOpacityProps], 
      TouchableOpacityProps | TouchableOpacityPropschil, 
      Any
    ],
    View: NativeStyled[TypeofViewInstantiable, ViewProps, Any]
  ): Touchable = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Touchable = Touchable.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touchable]
  }
  
  extension [Self <: Touchable](x: Self) {
    
    inline def setImage(value: NativeStyled[TypeofImageInstantiable, ImageProps, Any]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setText(
      value: NativeStyled[
          Instantiable1[/* props */ ReadonlyTextProps, typings.reactPrimitives.mod.Text], 
          TextProps, 
          Any
        ]
    ): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTouchable(
      value: NativeStyled[
          ComponentType[TouchableOpacityProps], 
          TouchableOpacityProps | TouchableOpacityPropschil, 
          Any
        ]
    ): Self = StObject.set(x, "Touchable", value.asInstanceOf[js.Any])
    
    inline def setView(value: NativeStyled[TypeofViewInstantiable, ViewProps, Any]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
