package typings.strongGlobalize

import org.scalablytyped.runtime.StringDictionary
import typings.strongGlobalize.libConfigMod.AnyObject
import typings.strongGlobalize.libConfigMod.GlobalizeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGlobalizeMod {
  
  @JSImport("strong-globalize/lib/globalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("strong-globalize/lib/globalize", "STRONGLOOP_GLB")
  @js.native
  val STRONGLOOP_GLB: GlobalizeConfig = js.native
  
  inline def alert(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  @JSImport("strong-globalize/lib/globalize", "c")
  @js.native
  val c: js.Function4[
    /* value */ Any, 
    /* currencySymbol */ String, 
    /* options */ js.UndefOr[AnyObject[Any]], 
    /* lang */ js.UndefOr[String], 
    Any
  ] = js.native
  
  inline def consoleEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("consoleEnabled")().asInstanceOf[Boolean]
  
  inline def critical(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("critical")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  @JSImport("strong-globalize/lib/globalize", "d")
  @js.native
  val d: js.Function3[
    /* value */ js.Date, 
    /* options */ js.UndefOr[AnyObject[Any]], 
    /* lang */ js.UndefOr[String], 
    Any
  ] = js.native
  
  inline def data(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def debug(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def emergency(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emergency")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def error(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def formatCurrency(value: Any, currencySymbol: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], currencySymbol.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatCurrency(value: Any, currencySymbol: String, options: Unit, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], currencySymbol.asInstanceOf[js.Any], options.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatCurrency(value: Any, currencySymbol: String, options: AnyObject[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], currencySymbol.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatCurrency(value: Any, currencySymbol: String, options: AnyObject[Any], lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], currencySymbol.asInstanceOf[js.Any], options.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatDate(value: js.Date): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def formatDate(value: js.Date, options: Unit, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatDate(value: js.Date, options: AnyObject[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatDate(value: js.Date, options: AnyObject[Any], lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatJson(fullPath: String, variables: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatJson")(fullPath.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatJson(fullPath: String, variables: js.Array[String], lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatJson")(fullPath.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatMessage(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def formatMessage(path: String, variables: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(path.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatMessage(path: String, variables: String, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(path.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatMessage(path: String, variables: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(path.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatMessage(path: String, variables: js.Array[String], lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(path.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatMessage(path: String, variables: Unit, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(path.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatNumber(value: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def formatNumber(value: Double, options: Unit, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatNumber(value: Double, options: AnyObject[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatNumber(value: Double, options: AnyObject[Any], lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def help(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("help")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def info(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def informational(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("informational")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def input(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def loadGlobalize(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadGlobalize")().asInstanceOf[Any]
  inline def loadGlobalize(lang: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadGlobalize")(lang.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def loadGlobalize(lang: String, enumerateNodeModules: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadGlobalize")(lang.asInstanceOf[js.Any], enumerateNodeModules.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def loadGlobalize(lang: Unit, enumerateNodeModules: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadGlobalize")(lang.asInstanceOf[js.Any], enumerateNodeModules.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def log(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def logPersistent(level: String, message: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logPersistent")(level.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logPersistent(level: Unit, message: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logPersistent")(level.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("strong-globalize/lib/globalize", "m")
  @js.native
  val m: js.Function3[
    /* path */ String, 
    /* variables */ js.UndefOr[js.Array[String] | String], 
    /* lang */ js.UndefOr[String], 
    Any
  ] = js.native
  
  @JSImport("strong-globalize/lib/globalize", "n")
  @js.native
  val n: js.Function3[
    /* value */ Double, 
    /* options */ js.UndefOr[AnyObject[Any]], 
    /* lang */ js.UndefOr[String], 
    Any
  ] = js.native
  
  inline def notice(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("notice")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def packMessage(args: js.Array[Any], fn: js.Function1[/* msg */ Any, Any], withOriginalMsg: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("packMessage")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], withOriginalMsg.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def packMessage(args: js.Array[Any], fn: js.Function1[/* msg */ Any, Any], withOriginalMsg: Boolean, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("packMessage")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], withOriginalMsg.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def packMessage(args: js.Array[Any], fn: Null, withOriginalMsg: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("packMessage")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], withOriginalMsg.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def packMessage(args: js.Array[Any], fn: Null, withOriginalMsg: Boolean, lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("packMessage")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], withOriginalMsg.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def prompt(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def rfc5424(level: String, args: js.Array[Any], print: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rfc5424")(level.asInstanceOf[js.Any], args.asInstanceOf[js.Any], print.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def rfc5424(level: String, args: js.Array[Any], print: js.Function1[/* repeated */ Any, Unit], lang: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rfc5424")(level.asInstanceOf[js.Any], args.asInstanceOf[js.Any], print.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setAppLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppLanguages")().asInstanceOf[js.Array[String]]
  inline def setAppLanguages(langs: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppLanguages")(langs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def setDefaultLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLanguage")().asInstanceOf[js.UndefOr[String]]
  inline def setDefaultLanguage(lang: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def setPersistentLogging(logFn: js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPersistentLogging")(logFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setPersistentLogging(
    logFn: js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit],
    disableConsole: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistentLogging")(logFn.asInstanceOf[js.Any], disableConsole.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setRootDir(rootPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootDir")(rootPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def silly(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("silly")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  @JSImport("strong-globalize/lib/globalize", "t")
  @js.native
  val t: js.Function3[
    /* path */ String, 
    /* variables */ js.UndefOr[js.Array[String] | String], 
    /* lang */ js.UndefOr[String], 
    Any
  ] = js.native
  
  inline def verbose(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def warn(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def warning(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
}
