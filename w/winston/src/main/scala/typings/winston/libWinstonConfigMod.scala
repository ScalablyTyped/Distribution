package typings.winston

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.winston.anon.Colors
import typings.winston.anon.ColorsLevels
import typings.winston.anon.Levels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWinstonConfigMod extends Shortcut {
  
  @JSImport("winston/lib/winston/config", JSImport.Namespace)
  @js.native
  val ^ : Config = js.native
  
  trait AbstractConfigSet extends StObject {
    
    var colors: AbstractConfigSetColors
    
    var levels: AbstractConfigSetLevels
  }
  object AbstractConfigSet {
    
    inline def apply(colors: AbstractConfigSetColors, levels: AbstractConfigSetLevels): AbstractConfigSet = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractConfigSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractConfigSet] (val x: Self) extends AnyVal {
      
      inline def setColors(value: AbstractConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: AbstractConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  type AbstractConfigSetColors = StringDictionary[String | js.Array[String]]
  
  type AbstractConfigSetLevels = StringDictionary[Double]
  
  trait CliConfigSetColors
    extends StObject
       with AbstractConfigSetColors {
    
    var data: String | js.Array[String]
    
    var debug: String | js.Array[String]
    
    var error: String | js.Array[String]
    
    var help: String | js.Array[String]
    
    var info: String | js.Array[String]
    
    var input: String | js.Array[String]
    
    var prompt: String | js.Array[String]
    
    var silly: String | js.Array[String]
    
    var verbose: String | js.Array[String]
    
    var warn: String | js.Array[String]
  }
  object CliConfigSetColors {
    
    inline def apply(
      data: String | js.Array[String],
      debug: String | js.Array[String],
      error: String | js.Array[String],
      help: String | js.Array[String],
      info: String | js.Array[String],
      input: String | js.Array[String],
      prompt: String | js.Array[String],
      silly: String | js.Array[String],
      verbose: String | js.Array[String],
      warn: String | js.Array[String]
    ): CliConfigSetColors = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CliConfigSetColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CliConfigSetColors] (val x: Self) extends AnyVal {
      
      inline def setData(value: String | js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDebug(value: String | js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value*))
      
      inline def setError(value: String | js.Array[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorVarargs(value: String*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setHelp(value: String | js.Array[String]): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpVarargs(value: String*): Self = StObject.set(x, "help", js.Array(value*))
      
      inline def setInfo(value: String | js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value*))
      
      inline def setInput(value: String | js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setPrompt(value: String | js.Array[String]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptVarargs(value: String*): Self = StObject.set(x, "prompt", js.Array(value*))
      
      inline def setSilly(value: String | js.Array[String]): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      inline def setSillyVarargs(value: String*): Self = StObject.set(x, "silly", js.Array(value*))
      
      inline def setVerbose(value: String | js.Array[String]): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseVarargs(value: String*): Self = StObject.set(x, "verbose", js.Array(value*))
      
      inline def setWarn(value: String | js.Array[String]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnVarargs(value: String*): Self = StObject.set(x, "warn", js.Array(value*))
    }
  }
  
  trait CliConfigSetLevels
    extends StObject
       with AbstractConfigSetLevels {
    
    var data: Double
    
    var debug: Double
    
    var error: Double
    
    var help: Double
    
    var info: Double
    
    var input: Double
    
    var prompt: Double
    
    var silly: Double
    
    var verbose: Double
    
    var warn: Double
  }
  object CliConfigSetLevels {
    
    inline def apply(
      data: Double,
      debug: Double,
      error: Double,
      help: Double,
      info: Double,
      input: Double,
      prompt: Double,
      silly: Double,
      verbose: Double,
      warn: Double
    ): CliConfigSetLevels = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CliConfigSetLevels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CliConfigSetLevels] (val x: Self) extends AnyVal {
      
      inline def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: Double): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Double): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: Double): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setSilly(value: Double): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Double): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    def addColors(colors: AbstractConfigSetColors): Unit
    
    var allColors: AbstractConfigSetColors
    
    var cli: Colors
    
    var npm: Levels
    
    var syslog: ColorsLevels
  }
  object Config {
    
    inline def apply(
      addColors: AbstractConfigSetColors => Unit,
      allColors: AbstractConfigSetColors,
      cli: Colors,
      npm: Levels,
      syslog: ColorsLevels
    ): Config = {
      val __obj = js.Dynamic.literal(addColors = js.Any.fromFunction1(addColors), allColors = allColors.asInstanceOf[js.Any], cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setAddColors(value: AbstractConfigSetColors => Unit): Self = StObject.set(x, "addColors", js.Any.fromFunction1(value))
      
      inline def setAllColors(value: AbstractConfigSetColors): Self = StObject.set(x, "allColors", value.asInstanceOf[js.Any])
      
      inline def setCli(value: Colors): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      inline def setNpm(value: Levels): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      inline def setSyslog(value: ColorsLevels): Self = StObject.set(x, "syslog", value.asInstanceOf[js.Any])
    }
  }
  
  trait NpmConfigSetColors
    extends StObject
       with AbstractConfigSetColors {
    
    var debug: String | js.Array[String]
    
    var error: String | js.Array[String]
    
    var http: String | js.Array[String]
    
    var info: String | js.Array[String]
    
    var silly: String | js.Array[String]
    
    var verbose: String | js.Array[String]
    
    var warn: String | js.Array[String]
  }
  object NpmConfigSetColors {
    
    inline def apply(
      debug: String | js.Array[String],
      error: String | js.Array[String],
      http: String | js.Array[String],
      info: String | js.Array[String],
      silly: String | js.Array[String],
      verbose: String | js.Array[String],
      warn: String | js.Array[String]
    ): NpmConfigSetColors = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NpmConfigSetColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NpmConfigSetColors] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: String | js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value*))
      
      inline def setError(value: String | js.Array[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorVarargs(value: String*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setHttp(value: String | js.Array[String]): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpVarargs(value: String*): Self = StObject.set(x, "http", js.Array(value*))
      
      inline def setInfo(value: String | js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value*))
      
      inline def setSilly(value: String | js.Array[String]): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      inline def setSillyVarargs(value: String*): Self = StObject.set(x, "silly", js.Array(value*))
      
      inline def setVerbose(value: String | js.Array[String]): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseVarargs(value: String*): Self = StObject.set(x, "verbose", js.Array(value*))
      
      inline def setWarn(value: String | js.Array[String]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnVarargs(value: String*): Self = StObject.set(x, "warn", js.Array(value*))
    }
  }
  
  trait NpmConfigSetLevels
    extends StObject
       with AbstractConfigSetLevels {
    
    var debug: Double
    
    var error: Double
    
    var http: Double
    
    var info: Double
    
    var silly: Double
    
    var verbose: Double
    
    var warn: Double
  }
  object NpmConfigSetLevels {
    
    inline def apply(
      debug: Double,
      error: Double,
      http: Double,
      info: Double,
      silly: Double,
      verbose: Double,
      warn: Double
    ): NpmConfigSetLevels = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NpmConfigSetLevels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NpmConfigSetLevels] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHttp(value: Double): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setSilly(value: Double): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Double): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyslogConfigSetColors
    extends StObject
       with AbstractConfigSetColors {
    
    var alert: String | js.Array[String]
    
    var crit: String | js.Array[String]
    
    var debug: String | js.Array[String]
    
    var emerg: String | js.Array[String]
    
    var error: String | js.Array[String]
    
    var info: String | js.Array[String]
    
    var notice: String | js.Array[String]
    
    var warning: String | js.Array[String]
  }
  object SyslogConfigSetColors {
    
    inline def apply(
      alert: String | js.Array[String],
      crit: String | js.Array[String],
      debug: String | js.Array[String],
      emerg: String | js.Array[String],
      error: String | js.Array[String],
      info: String | js.Array[String],
      notice: String | js.Array[String],
      warning: String | js.Array[String]
    ): SyslogConfigSetColors = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyslogConfigSetColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyslogConfigSetColors] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: String | js.Array[String]): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertVarargs(value: String*): Self = StObject.set(x, "alert", js.Array(value*))
      
      inline def setCrit(value: String | js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value*))
      
      inline def setDebug(value: String | js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value*))
      
      inline def setEmerg(value: String | js.Array[String]): Self = StObject.set(x, "emerg", value.asInstanceOf[js.Any])
      
      inline def setEmergVarargs(value: String*): Self = StObject.set(x, "emerg", js.Array(value*))
      
      inline def setError(value: String | js.Array[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorVarargs(value: String*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setInfo(value: String | js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value*))
      
      inline def setNotice(value: String | js.Array[String]): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setNoticeVarargs(value: String*): Self = StObject.set(x, "notice", js.Array(value*))
      
      inline def setWarning(value: String | js.Array[String]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningVarargs(value: String*): Self = StObject.set(x, "warning", js.Array(value*))
    }
  }
  
  trait SyslogConfigSetLevels
    extends StObject
       with AbstractConfigSetLevels {
    
    var alert: Double
    
    var crit: Double
    
    var debug: Double
    
    var emerg: Double
    
    var error: Double
    
    var info: Double
    
    var notice: Double
    
    var warning: Double
  }
  object SyslogConfigSetLevels {
    
    inline def apply(
      alert: Double,
      crit: Double,
      debug: Double,
      emerg: Double,
      error: Double,
      info: Double,
      notice: Double,
      warning: Double
    ): SyslogConfigSetLevels = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyslogConfigSetLevels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyslogConfigSetLevels] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: Double): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: Double): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setEmerg(value: Double): Self = StObject.set(x, "emerg", value.asInstanceOf[js.Any])
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: Double): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Config
  
  /* This means you don't have to write `^`, but can instead just say `libWinstonConfigMod.foo` */
  override def _to: Config = ^
}
