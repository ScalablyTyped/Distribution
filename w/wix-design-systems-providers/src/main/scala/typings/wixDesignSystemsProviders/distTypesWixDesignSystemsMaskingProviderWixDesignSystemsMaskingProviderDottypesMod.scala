package typings.wixDesignSystemsProviders

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixDesignSystemsMaskingProviderWixDesignSystemsMaskingProviderDottypesMod {
  
  trait WixDesignSystemsMaskingContextProps extends StObject {
    
    var maskingClassNames: String
  }
  object WixDesignSystemsMaskingContextProps {
    
    inline def apply(maskingClassNames: String): WixDesignSystemsMaskingContextProps = {
      val __obj = js.Dynamic.literal(maskingClassNames = maskingClassNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[WixDesignSystemsMaskingContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WixDesignSystemsMaskingContextProps] (val x: Self) extends AnyVal {
      
      inline def setMaskingClassNames(value: String): Self = StObject.set(x, "maskingClassNames", value.asInstanceOf[js.Any])
    }
  }
  
  trait WixDesignSystemsMaskingProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object WixDesignSystemsMaskingProviderProps {
    
    inline def apply(): WixDesignSystemsMaskingProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixDesignSystemsMaskingProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WixDesignSystemsMaskingProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
