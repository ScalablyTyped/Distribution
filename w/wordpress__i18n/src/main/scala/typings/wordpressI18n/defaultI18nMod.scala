package typings.wordpressI18n

import org.scalablytyped.runtime.Shortcut
import typings.wordpressI18n.createI18nMod.GetLocaleData
import typings.wordpressI18n.createI18nMod.HasTranslation
import typings.wordpressI18n.createI18nMod.I18n
import typings.wordpressI18n.createI18nMod.IsRtl
import typings.wordpressI18n.createI18nMod.ResetLocaleData
import typings.wordpressI18n.createI18nMod.SetLocaleData
import typings.wordpressI18n.createI18nMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultI18nMod extends Shortcut {
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", JSImport.Default)
  @js.native
  val default: I18n = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "__")
  @js.native
  val __ : typings.wordpressI18n.createI18nMod.__ = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "getLocaleData")
  @js.native
  val getLocaleData: GetLocaleData = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "hasTranslation")
  @js.native
  val hasTranslation: HasTranslation = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "isRTL")
  @js.native
  val isRTL: IsRtl = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "_n")
  @js.native
  val n: typings.wordpressI18n.createI18nMod.n = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "_nx")
  @js.native
  val nx: typings.wordpressI18n.createI18nMod.nx = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "resetLocaleData")
  @js.native
  val resetLocaleData: ResetLocaleData = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "setLocaleData")
  @js.native
  val setLocaleData: SetLocaleData = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "subscribe")
  @js.native
  val subscribe: Subscribe = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "_x")
  @js.native
  val x: typings.wordpressI18n.createI18nMod.x = js.native
  
  type LocaleData = typings.wordpressI18n.createI18nMod.LocaleData
  
  type SubscribeCallback = typings.wordpressI18n.createI18nMod.SubscribeCallback
  
  type UnsubscribeCallback = typings.wordpressI18n.createI18nMod.UnsubscribeCallback
  
  type _To = I18n
  
  /* This means you don't have to write `default`, but can instead just say `defaultI18nMod.foo` */
  override def _to: I18n = default
}
