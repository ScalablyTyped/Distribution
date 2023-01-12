package typings.winston

import typings.winston.libWinstonConfigMod.CliConfigSetColors
import typings.winston.libWinstonConfigMod.CliConfigSetLevels
import typings.winston.libWinstonConfigMod.NpmConfigSetColors
import typings.winston.libWinstonConfigMod.NpmConfigSetLevels
import typings.winston.libWinstonConfigMod.SyslogConfigSetColors
import typings.winston.libWinstonConfigMod.SyslogConfigSetLevels
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
    
    inline def apply(): Bearer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bearer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bearer] (val x: Self) extends AnyVal {
      
      inline def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
      
      inline def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Colors extends StObject {
    
    var colors: CliConfigSetColors
    
    var levels: CliConfigSetLevels
  }
  object Colors {
    
    inline def apply(colors: CliConfigSetColors, levels: CliConfigSetLevels): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      inline def setColors(value: CliConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: CliConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorsLevels extends StObject {
    
    var colors: SyslogConfigSetColors
    
    var levels: SyslogConfigSetLevels
  }
  object ColorsLevels {
    
    inline def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): ColorsLevels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorsLevels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorsLevels] (val x: Self) extends AnyVal {
      
      inline def setColors(value: SyslogConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: SyslogConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  trait Levels extends StObject {
    
    var colors: NpmConfigSetColors
    
    var levels: NpmConfigSetLevels
  }
  object Levels {
    
    inline def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Levels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Levels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Levels] (val x: Self) extends AnyVal {
      
      inline def setColors(value: NpmConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: NpmConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
}
