package typings.themeUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @theme-ui/components.@theme-ui/components/dist/declarations/src/Close.CloseProps */
  trait CloseProps extends StObject {
    
    var size: js.UndefOr[Double | String] = js.undefined
  }
  object CloseProps {
    
    inline def apply(): CloseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Sx extends StObject {
    
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ] = js.undefined
  }
  object Sx {
    
    inline def apply(): Sx = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sx]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sx] (val x: Self) extends AnyVal {
      
      inline def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
}
