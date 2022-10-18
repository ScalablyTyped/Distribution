package typings.styledTools

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.styledTools.mod.ThemeWithPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Theme /* <: StringDictionary[Any] */] extends StObject {
    
    var theme: Theme
  }
  object `0` {
    
    inline def apply[Theme /* <: StringDictionary[Any] */](theme: Theme): `0`[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    extension [Self <: `0`[?], Theme /* <: StringDictionary[Any] */](x: Self & `0`[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Palette[Theme /* <: ThemeWithPalette */] extends StObject {
    
    var palette: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: keyof Theme['palette'] */ js.Any
      ] = js.undefined
    
    var theme: Theme
    
    var tone: js.UndefOr[Double] = js.undefined
  }
  object Palette {
    
    inline def apply[Theme /* <: ThemeWithPalette */](theme: Theme): Palette[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Palette[Theme]]
    }
    
    extension [Self <: Palette[?], Theme /* <: ThemeWithPalette */](x: Self & Palette[Theme]) {
      
      inline def setPalette(
        value: /* import warning: importer.ImportType#apply Failed type conversion: keyof Theme['palette'] */ js.Any
      ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTone(value: Double): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
      
      inline def setToneUndefined: Self = StObject.set(x, "tone", js.undefined)
    }
  }
  
  trait PaletteTheme[Theme /* <: ThemeWithPalette */] extends StObject {
    
    var palette: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: keyof Theme['palette'] */ js.Any
      ] = js.undefined
    
    var theme: Partial[Theme]
  }
  object PaletteTheme {
    
    inline def apply[Theme /* <: ThemeWithPalette */](theme: Partial[Theme]): PaletteTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteTheme[Theme]]
    }
    
    extension [Self <: PaletteTheme[?], Theme /* <: ThemeWithPalette */](x: Self & PaletteTheme[Theme]) {
      
      inline def setPalette(
        value: /* import warning: importer.ImportType#apply Failed type conversion: keyof Theme['palette'] */ js.Any
      ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setTheme(value: Partial[Theme]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeTheme[Theme /* <: ThemeWithPalette */] extends StObject {
    
    var theme: Theme
  }
  object ThemeTheme {
    
    inline def apply[Theme /* <: ThemeWithPalette */](theme: Theme): ThemeTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme[Theme]]
    }
    
    extension [Self <: ThemeTheme[?], Theme /* <: ThemeWithPalette */](x: Self & ThemeTheme[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tone[Theme /* <: ThemeWithPalette */] extends StObject {
    
    var theme: Theme
    
    var tone: js.UndefOr[Double] = js.undefined
  }
  object Tone {
    
    inline def apply[Theme /* <: ThemeWithPalette */](theme: Theme): Tone[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tone[Theme]]
    }
    
    extension [Self <: Tone[?], Theme /* <: ThemeWithPalette */](x: Self & Tone[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTone(value: Double): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
      
      inline def setToneUndefined: Self = StObject.set(x, "tone", js.undefined)
    }
  }
}
