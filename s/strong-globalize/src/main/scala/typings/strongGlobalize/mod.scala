package typings.strongGlobalize

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.strongGlobalize.anon.Typeofglobalize
import typings.strongGlobalize.anon.Typeofhelper
import typings.strongGlobalize.libConfigMod.AnyObject
import typings.strongGlobalize.libStrongGlobalizeMod.StrongGlobalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("strong-globalize", JSImport.Namespace)
  @js.native
  open class ^ () extends StrongGlobalize {
    def this(options: AnyObject[Any]) = this()
  }
  @JSImport("strong-globalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("strong-globalize", "STRONGLOOP_GLB")
  @js.native
  val STRONGLOOP_GLB: AnyObject[Any] = js.native
  
  inline def SetAppLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetAppLanguages")().asInstanceOf[js.Array[String]]
  inline def SetAppLanguages(langs: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetAppLanguages")(langs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @JSImport("strong-globalize", "SetAppLanguages")
  @js.native
  def SetAppLanguages_Fmod: js.Function1[/* langs */ js.UndefOr[js.Array[String]], js.Array[String]] = js.native
  
  inline def SetAppLanguages_Fmod_=(x: js.Function1[/* langs */ js.UndefOr[js.Array[String]], js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetAppLanguages")(x.asInstanceOf[js.Any])
  
  inline def SetDefaultLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetDefaultLanguage")().asInstanceOf[js.UndefOr[String]]
  inline def SetDefaultLanguage(lang: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SetDefaultLanguage")(lang.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @JSImport("strong-globalize", "SetDefaultLanguage")
  @js.native
  def SetDefaultLanguage_Fmod: js.Function1[/* lang */ js.UndefOr[String], js.UndefOr[String]] = js.native
  
  inline def SetDefaultLanguage_Fmod_=(x: js.Function1[/* lang */ js.UndefOr[String], js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultLanguage")(x.asInstanceOf[js.Any])
  
  @JSImport("strong-globalize", "SetPersistentLogging")
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
  
  @JSImport("strong-globalize", "globalize")
  @js.native
  val globalize: Typeofglobalize = js.native
  
  @JSImport("strong-globalize", "helper")
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
  @JSImport("strong-globalize", "sgCache")
  @js.native
  val sgCache: Map[String, StrongGlobalize] = js.native
}
