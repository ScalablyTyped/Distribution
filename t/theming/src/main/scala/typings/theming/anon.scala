package typings.theming

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Theme] extends StObject {
    
    var theme: js.UndefOr[NonNullable[Theme]] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply[Theme](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[?], Theme] (val x: Self & `0`[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: NonNullable[Theme]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ThemeNonNullable[Theme] extends StObject {
    
    var theme: NonNullable[Theme]
  }
  object ThemeNonNullable {
    
    @scala.inline
    def apply[Theme](theme: NonNullable[Theme]): ThemeNonNullable[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeNonNullable[Theme]]
    }
    
    @scala.inline
    implicit class ThemeNonNullableMutableBuilder[Self <: ThemeNonNullable[?], Theme] (val x: Self & ThemeNonNullable[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: NonNullable[Theme]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
