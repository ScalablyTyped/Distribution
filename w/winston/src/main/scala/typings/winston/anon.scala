package typings.winston

import typings.winston.configMod.CliConfigSetColors
import typings.winston.configMod.CliConfigSetLevels
import typings.winston.configMod.NpmConfigSetColors
import typings.winston.configMod.NpmConfigSetLevels
import typings.winston.configMod.SyslogConfigSetColors
import typings.winston.configMod.SyslogConfigSetLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bearer extends StObject {
    
    var bearer: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Bearer {
    
    @scala.inline
    def apply(): Bearer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bearer]
    }
    
    @scala.inline
    implicit class BearerMutableBuilder[Self <: Bearer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Colors extends StObject {
    
    var colors: CliConfigSetColors
    
    var levels: CliConfigSetLevels
  }
  object Colors {
    
    @scala.inline
    def apply(colors: CliConfigSetColors, levels: CliConfigSetLevels): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: CliConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: CliConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorsLevels extends StObject {
    
    var colors: SyslogConfigSetColors
    
    var levels: SyslogConfigSetLevels
  }
  object ColorsLevels {
    
    @scala.inline
    def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): ColorsLevels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorsLevels]
    }
    
    @scala.inline
    implicit class ColorsLevelsMutableBuilder[Self <: ColorsLevels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: SyslogConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: SyslogConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  trait Levels extends StObject {
    
    var colors: NpmConfigSetColors
    
    var levels: NpmConfigSetLevels
  }
  object Levels {
    
    @scala.inline
    def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Levels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Levels]
    }
    
    @scala.inline
    implicit class LevelsMutableBuilder[Self <: Levels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: NpmConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: NpmConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
}
