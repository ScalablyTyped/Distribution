package typings.strongGlobalize

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.strongGlobalize.anon.HeadersAnyObject
import typings.strongGlobalize.anon.Typeofglobalize
import typings.strongGlobalize.anon.Typeofhelper
import typings.strongGlobalize.configMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strongGlobalizeMod {
  
  @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize")
  @js.native
  open class StrongGlobalize () extends StObject {
    def this(options: AnyObject[Any]) = this()
    
    def Error(args: Any*): js.Error = js.native
    
    /* private */ var _options: Any = js.native
    
    def alert(args: Any*): Any = js.native
    
    def c(value: Any, currencySymbol: String): Any = js.native
    def c(value: Any, currencySymbol: String, options: AnyObject[Any]): Any = js.native
    
    def critical(args: Any*): Any = js.native
    
    def d(value: js.Date): Any = js.native
    def d(value: js.Date, options: AnyObject[Any]): Any = js.native
    
    def data(args: Any*): Any = js.native
    
    def debug(args: Any*): Any = js.native
    
    def emergency(args: Any*): Any = js.native
    
    def error(args: Any*): Any = js.native
    
    def ewrite(args: Any*): Any = js.native
    
    def f(args: Any*): Any = js.native
    
    def format(args: Any*): Any = js.native
    
    def formatCurrency(value: Any, currencySymbol: String): Any = js.native
    def formatCurrency(value: Any, currencySymbol: String, options: AnyObject[Any]): Any = js.native
    
    def formatDate(value: js.Date): Any = js.native
    def formatDate(value: js.Date, options: AnyObject[Any]): Any = js.native
    
    def formatMessage(msgPath: String, variables: String): Any = js.native
    def formatMessage(msgPath: String, variables: js.Array[String]): Any = js.native
    
    def formatNumber(value: Double): Any = js.native
    def formatNumber(value: Double, options: AnyObject[Any]): Any = js.native
    
    def getLanguage(): Any = js.native
    
    def help(args: Any*): Any = js.native
    
    def http(req: HeadersAnyObject): StrongGlobalize = js.native
    
    def info(args: Any*): Any = js.native
    
    def informational(args: Any*): Any = js.native
    
    def input(args: Any*): Any = js.native
    
    def log(args: Any*): Any = js.native
    
    def m(msgPath: String, variables: String): Any = js.native
    def m(msgPath: String, variables: js.Array[String]): Any = js.native
    
    def n(value: Double): Any = js.native
    def n(value: Double, options: AnyObject[Any]): Any = js.native
    
    def notice(args: Any*): Any = js.native
    
    def owrite(args: Any*): Any = js.native
    
    def prompt(args: Any*): Any = js.native
    
    def setLanguage(): Unit = js.native
    def setLanguage(lang: String): Unit = js.native
    
    def silly(args: Any*): Any = js.native
    
    def t(msgPath: String, variables: String): Any = js.native
    def t(msgPath: String, variables: js.Array[String]): Any = js.native
    
    def verbose(args: Any*): Any = js.native
    
    def warn(args: Any*): Any = js.native
    
    def warning(args: Any*): Any = js.native
    
    def write(args: Any*): Unit = js.native
  }
  /* static members */
  object StrongGlobalize {
    
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize.STRONGLOOP_GLB")
    @js.native
    val STRONGLOOP_GLB: AnyObject[Any] = js.native
    
    inline def SetAppLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetAppLanguages")().asInstanceOf[js.Array[String]]
    inline def SetAppLanguages(langs: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetAppLanguages")(langs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize.SetAppLanguages")
    @js.native
    def SetAppLanguages_FStrongGlobalize: js.Function1[/* langs */ js.UndefOr[js.Array[String]], js.Array[String]] = js.native
    
    inline def SetAppLanguages_FStrongGlobalize_=(x: js.Function1[/* langs */ js.UndefOr[js.Array[String]], js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetAppLanguages")(x.asInstanceOf[js.Any])
    
    inline def SetDefaultLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetDefaultLanguage")().asInstanceOf[js.UndefOr[String]]
    inline def SetDefaultLanguage(lang: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetDefaultLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize.SetDefaultLanguage")
    @js.native
    def SetDefaultLanguage_FStrongGlobalize: js.Function1[/* lang */ js.UndefOr[String], js.UndefOr[String]] = js.native
    
    inline def SetDefaultLanguage_FStrongGlobalize_=(x: js.Function1[/* lang */ js.UndefOr[String], js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultLanguage")(x.asInstanceOf[js.Any])
    
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize.SetPersistentLogging")
    @js.native
    def SetPersistentLogging: js.Function2[
        /* logFn */ js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit], 
        /* disableConsole */ js.UndefOr[Boolean], 
        Unit
      ] = js.native
    inline def SetPersistentLogging(logFn: js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetPersistentLogging")(logFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def SetPersistentLogging(
      logFn: js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit],
      disableConsole: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetPersistentLogging")(logFn.asInstanceOf[js.Any], disableConsole.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def SetPersistentLogging_=(
      x: js.Function2[
          /* logFn */ js.Function2[/* level */ String, /* message */ StringDictionary[Any], Unit], 
          /* disableConsole */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetPersistentLogging")(x.asInstanceOf[js.Any])
    
    inline def SetRootDir(rootDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetRootDir")(rootDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def SetRootDir(rootDir: String, options: AnyObject[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRootDir")(rootDir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize.globalize")
    @js.native
    val globalize: Typeofglobalize = js.native
    
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize.helper")
    @js.native
    val helper: Typeofhelper = js.native
    
    /**
      * This function is useful for applications (e.g. express)
      * that have an HTTP Request object with headers.
      *
      * You can pass the request object, and it will negotiate
      * the best matching language to globalize the message.
      *
      * The matching algorithm is done against the languages
      * supported by the application. (those included in the intl dir)
      *
      * @param req
      * @returns {*}
      */
    @JSImport("strong-globalize/lib/strong-globalize", "StrongGlobalize.sgCache")
    @js.native
    val sgCache: Map[String, StrongGlobalize] = js.native
  }
}
