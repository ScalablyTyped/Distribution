package typings.wordpressI18n

import typings.wordpressHooks.createHooksMod._Hooks
import typings.wordpressI18n.createI18nMod.GetLocaleData
import typings.wordpressI18n.createI18nMod.HasTranslation
import typings.wordpressI18n.createI18nMod.I18n
import typings.wordpressI18n.createI18nMod.IsRtl
import typings.wordpressI18n.createI18nMod.LocaleData
import typings.wordpressI18n.createI18nMod.ResetLocaleData
import typings.wordpressI18n.createI18nMod.SetLocaleData
import typings.wordpressI18n.createI18nMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/i18n", "__")
  @js.native
  val __ : typings.wordpressI18n.createI18nMod.__ = js.native
  
  inline def createI18n(): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")().asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: Unit, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any]).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: String, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: Unit, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  
  @JSImport("@wordpress/i18n", "defaultI18n")
  @js.native
  val defaultI18n: I18n = js.native
  
  @JSImport("@wordpress/i18n", "getLocaleData")
  @js.native
  val getLocaleData: GetLocaleData = js.native
  
  @JSImport("@wordpress/i18n", "hasTranslation")
  @js.native
  val hasTranslation: HasTranslation = js.native
  
  @JSImport("@wordpress/i18n", "isRTL")
  @js.native
  val isRTL: IsRtl = js.native
  
  @JSImport("@wordpress/i18n", "_n")
  @js.native
  val n: typings.wordpressI18n.createI18nMod.n = js.native
  
  @JSImport("@wordpress/i18n", "_nx")
  @js.native
  val nx: typings.wordpressI18n.createI18nMod.nx = js.native
  
  @JSImport("@wordpress/i18n", "resetLocaleData")
  @js.native
  val resetLocaleData: ResetLocaleData = js.native
  
  @JSImport("@wordpress/i18n", "setLocaleData")
  @js.native
  val setLocaleData: SetLocaleData = js.native
  
  inline def sprintf(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("@wordpress/i18n", "subscribe")
  @js.native
  val subscribe: Subscribe = js.native
  
  @JSImport("@wordpress/i18n", "_x")
  @js.native
  val x: typings.wordpressI18n.createI18nMod.x = js.native
}
