package typings.useMediaAntdQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Lg extends StObject {
    
    var lg: MaxWidth = js.native
    
    var md: MaxWidth = js.native
    
    var sm: MaxWidth = js.native
    
    var xl: MaxWidth = js.native
    
    var xs: MatchMedia = js.native
    
    var xxl: MinWidth = js.native
  }
  object Lg {
    
    @scala.inline
    def apply(lg: MaxWidth, md: MaxWidth, sm: MaxWidth, xl: MaxWidth, xs: MatchMedia, xxl: MinWidth): Lg = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lg]
    }
    
    @scala.inline
    implicit class LgMutableBuilder[Self <: Lg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: MaxWidth): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: MaxWidth): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSm(value: MaxWidth): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXl(value: MaxWidth): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXs(value: MatchMedia): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxl(value: MinWidth): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MatchMedia extends StObject {
    
    var matchMedia: String = js.native
    
    var maxWidth: Double = js.native
  }
  object MatchMedia {
    
    @scala.inline
    def apply(matchMedia: String, maxWidth: Double): MatchMedia = {
      val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchMedia]
    }
    
    @scala.inline
    implicit class MatchMediaMutableBuilder[Self <: MatchMedia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchMedia(value: String): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaxWidth extends StObject {
    
    var matchMedia: String = js.native
    
    var maxWidth: Double = js.native
    
    var minWidth: Double = js.native
  }
  object MaxWidth {
    
    @scala.inline
    def apply(matchMedia: String, maxWidth: Double, minWidth: Double): MaxWidth = {
      val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxWidth]
    }
    
    @scala.inline
    implicit class MaxWidthMutableBuilder[Self <: MaxWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchMedia(value: String): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MinWidth extends StObject {
    
    var matchMedia: String = js.native
    
    var minWidth: Double = js.native
  }
  object MinWidth {
    
    @scala.inline
    def apply(matchMedia: String, minWidth: Double): MinWidth = {
      val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinWidth]
    }
    
    @scala.inline
    implicit class MinWidthMutableBuilder[Self <: MinWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchMedia(value: String): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    }
  }
}
