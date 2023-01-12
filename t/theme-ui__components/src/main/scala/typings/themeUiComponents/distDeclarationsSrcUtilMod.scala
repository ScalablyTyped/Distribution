package typings.themeUiComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcUtilMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMargin(props: MarginProps): MarginProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getMargin")(props.asInstanceOf[js.Any]).asInstanceOf[MarginProps]
  
  inline def getProps(test: js.Function1[/* k */ String, Boolean]): js.Function1[/* props */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProps")(test.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.Object, js.Object]]
  
  inline def internalProps(props: ThemeUIComponentsInternalProps): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("__internalProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def omitMargin[T /* <: js.Object */](props: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("omitMargin")(props.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /* Inlined parent std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUICSSProperties * / any, 'm' | 'mt' | 'mr' | 'mb' | 'ml' | 'mx' | 'my'> */
  trait MarginProps extends StObject {
    
    var m: js.UndefOr[Any] = js.undefined
    
    var mb: js.UndefOr[Any] = js.undefined
    
    var ml: js.UndefOr[Any] = js.undefined
    
    var mr: js.UndefOr[Any] = js.undefined
    
    var mt: js.UndefOr[Any] = js.undefined
    
    var mx: js.UndefOr[Any] = js.undefined
    
    var my: js.UndefOr[Any] = js.undefined
  }
  object MarginProps {
    
    inline def apply(): MarginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarginProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarginProps] (val x: Self) extends AnyVal {
      
      inline def setM(value: Any): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMb(value: Any): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      inline def setMl(value: Any): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      inline def setMr(value: Any): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      inline def setMt(value: Any): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      inline def setMx(value: Any): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      inline def setMy(value: Any): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    }
  }
  
  trait ThemeUIComponentsInternalProps extends StObject {
    
    var __css: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUICSSObject */ Any
      ] = js.undefined
    
    var __themeKey: js.UndefOr[String] = js.undefined
  }
  object ThemeUIComponentsInternalProps {
    
    inline def apply(): ThemeUIComponentsInternalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeUIComponentsInternalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeUIComponentsInternalProps] (val x: Self) extends AnyVal {
      
      inline def set__css(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUICSSObject */ Any
      ): Self = StObject.set(x, "__css", value.asInstanceOf[js.Any])
      
      inline def set__cssUndefined: Self = StObject.set(x, "__css", js.undefined)
      
      inline def set__themeKey(value: String): Self = StObject.set(x, "__themeKey", value.asInstanceOf[js.Any])
      
      inline def set__themeKeyUndefined: Self = StObject.set(x, "__themeKey", js.undefined)
    }
  }
}
