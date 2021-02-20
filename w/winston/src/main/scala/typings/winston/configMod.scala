package typings.winston

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.winston.anon.Colors
import typings.winston.anon.ColorsLevels
import typings.winston.anon.Levels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod extends Shortcut {
  
  @JSImport("winston/lib/winston/config", JSImport.Namespace)
  @js.native
  val ^ : Config = js.native
  
  @js.native
  trait AbstractConfigSet extends StObject {
    
    var colors: AbstractConfigSetColors = js.native
    
    var levels: AbstractConfigSetLevels = js.native
  }
  object AbstractConfigSet {
    
    @scala.inline
    def apply(colors: AbstractConfigSetColors, levels: AbstractConfigSetLevels): AbstractConfigSet = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractConfigSet]
    }
    
    @scala.inline
    implicit class AbstractConfigSetMutableBuilder[Self <: AbstractConfigSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: AbstractConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: AbstractConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  type AbstractConfigSetColors = StringDictionary[String | js.Array[String]]
  
  type AbstractConfigSetLevels = StringDictionary[Double]
  
  @js.native
  trait CliConfigSetColors extends AbstractConfigSetColors {
    
    var data: String | js.Array[String] = js.native
    
    var debug: String | js.Array[String] = js.native
    
    var error: String | js.Array[String] = js.native
    
    var help: String | js.Array[String] = js.native
    
    var info: String | js.Array[String] = js.native
    
    var input: String | js.Array[String] = js.native
    
    var prompt: String | js.Array[String] = js.native
    
    var silly: String | js.Array[String] = js.native
    
    var verbose: String | js.Array[String] = js.native
    
    var warn: String | js.Array[String] = js.native
  }
  object CliConfigSetColors {
    
    @scala.inline
    def apply(
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
    implicit class CliConfigSetColorsMutableBuilder[Self <: CliConfigSetColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String | js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: String | js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value :_*))
      
      @scala.inline
      def setError(value: String | js.Array[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorVarargs(value: String*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setHelp(value: String | js.Array[String]): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpVarargs(value: String*): Self = StObject.set(x, "help", js.Array(value :_*))
      
      @scala.inline
      def setInfo(value: String | js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: String | js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
      
      @scala.inline
      def setPrompt(value: String | js.Array[String]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptVarargs(value: String*): Self = StObject.set(x, "prompt", js.Array(value :_*))
      
      @scala.inline
      def setSilly(value: String | js.Array[String]): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSillyVarargs(value: String*): Self = StObject.set(x, "silly", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: String | js.Array[String]): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseVarargs(value: String*): Self = StObject.set(x, "verbose", js.Array(value :_*))
      
      @scala.inline
      def setWarn(value: String | js.Array[String]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnVarargs(value: String*): Self = StObject.set(x, "warn", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CliConfigSetLevels extends AbstractConfigSetLevels {
    
    var data: Double = js.native
    
    var debug: Double = js.native
    
    var error: Double = js.native
    
    var help: Double = js.native
    
    var info: Double = js.native
    
    var input: Double = js.native
    
    var prompt: Double = js.native
    
    var silly: Double = js.native
    
    var verbose: Double = js.native
    
    var warn: Double = js.native
  }
  object CliConfigSetLevels {
    
    @scala.inline
    def apply(
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
    implicit class CliConfigSetLevelsMutableBuilder[Self <: CliConfigSetLevels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelp(value: Double): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: Double): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(value: Double): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilly(value: Double): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: Double): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    def addColors(colors: AbstractConfigSetColors): Unit = js.native
    
    var allColors: AbstractConfigSetColors = js.native
    
    var cli: Colors = js.native
    
    var npm: Levels = js.native
    
    var syslog: ColorsLevels = js.native
  }
  object Config {
    
    @scala.inline
    def apply(
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
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddColors(value: AbstractConfigSetColors => Unit): Self = StObject.set(x, "addColors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllColors(value: AbstractConfigSetColors): Self = StObject.set(x, "allColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCli(value: Colors): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpm(value: Levels): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyslog(value: ColorsLevels): Self = StObject.set(x, "syslog", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NpmConfigSetColors extends AbstractConfigSetColors {
    
    var debug: String | js.Array[String] = js.native
    
    var error: String | js.Array[String] = js.native
    
    var info: String | js.Array[String] = js.native
    
    var silly: String | js.Array[String] = js.native
    
    var verbose: String | js.Array[String] = js.native
    
    var warn: String | js.Array[String] = js.native
  }
  object NpmConfigSetColors {
    
    @scala.inline
    def apply(
      debug: String | js.Array[String],
      error: String | js.Array[String],
      info: String | js.Array[String],
      silly: String | js.Array[String],
      verbose: String | js.Array[String],
      warn: String | js.Array[String]
    ): NpmConfigSetColors = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NpmConfigSetColors]
    }
    
    @scala.inline
    implicit class NpmConfigSetColorsMutableBuilder[Self <: NpmConfigSetColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: String | js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value :_*))
      
      @scala.inline
      def setError(value: String | js.Array[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorVarargs(value: String*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setInfo(value: String | js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value :_*))
      
      @scala.inline
      def setSilly(value: String | js.Array[String]): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSillyVarargs(value: String*): Self = StObject.set(x, "silly", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: String | js.Array[String]): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseVarargs(value: String*): Self = StObject.set(x, "verbose", js.Array(value :_*))
      
      @scala.inline
      def setWarn(value: String | js.Array[String]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnVarargs(value: String*): Self = StObject.set(x, "warn", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NpmConfigSetLevels extends AbstractConfigSetLevels {
    
    var debug: Double = js.native
    
    var error: Double = js.native
    
    var http: Double = js.native
    
    var info: Double = js.native
    
    var silly: Double = js.native
    
    var verbose: Double = js.native
    
    var warn: Double = js.native
  }
  object NpmConfigSetLevels {
    
    @scala.inline
    def apply(
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
    implicit class NpmConfigSetLevelsMutableBuilder[Self <: NpmConfigSetLevels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp(value: Double): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilly(value: Double): Self = StObject.set(x, "silly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: Double): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SyslogConfigSetColors extends AbstractConfigSetColors {
    
    var alert: String | js.Array[String] = js.native
    
    var crit: String | js.Array[String] = js.native
    
    var debug: String | js.Array[String] = js.native
    
    var emerg: String | js.Array[String] = js.native
    
    var error: String | js.Array[String] = js.native
    
    var info: String | js.Array[String] = js.native
    
    var notice: String | js.Array[String] = js.native
    
    var warning: String | js.Array[String] = js.native
  }
  object SyslogConfigSetColors {
    
    @scala.inline
    def apply(
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
    implicit class SyslogConfigSetColorsMutableBuilder[Self <: SyslogConfigSetColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: String | js.Array[String]): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertVarargs(value: String*): Self = StObject.set(x, "alert", js.Array(value :_*))
      
      @scala.inline
      def setCrit(value: String | js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: String | js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value :_*))
      
      @scala.inline
      def setEmerg(value: String | js.Array[String]): Self = StObject.set(x, "emerg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmergVarargs(value: String*): Self = StObject.set(x, "emerg", js.Array(value :_*))
      
      @scala.inline
      def setError(value: String | js.Array[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorVarargs(value: String*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setInfo(value: String | js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value :_*))
      
      @scala.inline
      def setNotice(value: String | js.Array[String]): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeVarargs(value: String*): Self = StObject.set(x, "notice", js.Array(value :_*))
      
      @scala.inline
      def setWarning(value: String | js.Array[String]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningVarargs(value: String*): Self = StObject.set(x, "warning", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SyslogConfigSetLevels extends AbstractConfigSetLevels {
    
    var alert: Double = js.native
    
    var crit: Double = js.native
    
    var debug: Double = js.native
    
    var emerg: Double = js.native
    
    var error: Double = js.native
    
    var info: Double = js.native
    
    var notice: Double = js.native
    
    var warning: Double = js.native
  }
  object SyslogConfigSetLevels {
    
    @scala.inline
    def apply(
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
    implicit class SyslogConfigSetLevelsMutableBuilder[Self <: SyslogConfigSetLevels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: Double): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrit(value: Double): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmerg(value: Double): Self = StObject.set(x, "emerg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice(value: Double): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Config
  
  /* This means you don't have to write `^`, but can instead just say `configMod.foo` */
  override def _to: Config = ^
}
