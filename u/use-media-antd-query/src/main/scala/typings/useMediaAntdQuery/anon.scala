package typings.useMediaAntdQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lg extends StObject {
    
    var lg: MaxWidth
    
    var md: MaxWidth
    
    var sm: MaxWidth
    
    var xl: MaxWidth
    
    var xs: MatchMedia
    
    var xxl: MinWidth
  }
  object Lg {
    
    inline def apply(lg: MaxWidth, md: MaxWidth, sm: MaxWidth, xl: MaxWidth, xs: MatchMedia, xxl: MinWidth): Lg = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lg] (val x: Self) extends AnyVal {
      
      inline def setLg(value: MaxWidth): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setMd(value: MaxWidth): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setSm(value: MaxWidth): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setXl(value: MaxWidth): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXs(value: MatchMedia): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXxl(value: MinWidth): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatchMedia extends StObject {
    
    var matchMedia: String
    
    var maxWidth: Double
  }
  object MatchMedia {
    
    inline def apply(matchMedia: String, maxWidth: Double): MatchMedia = {
      val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchMedia]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchMedia] (val x: Self) extends AnyVal {
      
      inline def setMatchMedia(value: String): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxWidth extends StObject {
    
    var matchMedia: String
    
    var maxWidth: Double
    
    var minWidth: Double
  }
  object MaxWidth {
    
    inline def apply(matchMedia: String, maxWidth: Double, minWidth: Double): MaxWidth = {
      val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxWidth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxWidth] (val x: Self) extends AnyVal {
      
      inline def setMatchMedia(value: String): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinWidth extends StObject {
    
    var matchMedia: String
    
    var minWidth: Double
  }
  object MinWidth {
    
    inline def apply(matchMedia: String, minWidth: Double): MinWidth = {
      val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinWidth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinWidth] (val x: Self) extends AnyVal {
      
      inline def setMatchMedia(value: String): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    }
  }
}
