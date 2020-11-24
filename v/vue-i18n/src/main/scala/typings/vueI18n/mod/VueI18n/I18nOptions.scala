package typings.vueI18n.mod.VueI18n

import typings.std.RegExp
import typings.vue.vueMod.Vue
import typings.vueI18n.mod.IVueI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18nOptions extends js.Object {
  
  var componentInstanceCreatedListener: js.UndefOr[ComponentInstanceCreatedListener] = js.native
  
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.native
  
  var escapeParameterHtml: js.UndefOr[Boolean] = js.native
  
  var fallbackLocale: js.UndefOr[FallbackLocale] = js.native
  
  var fallbackRoot: js.UndefOr[Boolean] = js.native
  
  var formatFallbackMessages: js.UndefOr[Boolean] = js.native
  
  var formatter: js.UndefOr[Formatter] = js.native
  
  var locale: js.UndefOr[Locale] = js.native
  
  var messages: js.UndefOr[LocaleMessages] = js.native
  
  var missing: js.UndefOr[MissingHandler] = js.native
  
  var modifiers: js.UndefOr[Modifiers] = js.native
  
  var numberFormats: js.UndefOr[NumberFormats] = js.native
  
  var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.native
  
  var postTranslation: js.UndefOr[PostTranslationHandler] = js.native
  
  var preserveDirectiveContent: js.UndefOr[Boolean] = js.native
  
  var sharedMessages: js.UndefOr[LocaleMessages] = js.native
  
  var silentFallbackWarn: js.UndefOr[Boolean | RegExp] = js.native
  
  var silentTranslationWarn: js.UndefOr[Boolean | RegExp] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
  
  var warnHtmlInMessage: js.UndefOr[WarnHtmlInMessageLevel] = js.native
}
object I18nOptions {
  
  @scala.inline
  def apply(): I18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nOptions]
  }
  
  @scala.inline
  implicit class I18nOptionsOps[Self <: I18nOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentInstanceCreatedListener(
      value: (/* newVm */ typings.vueI18n.mod.VueI18n with IVueI18n, /* rootVm */ typings.vueI18n.mod.VueI18n with IVueI18n) => Unit
    ): Self = this.set("componentInstanceCreatedListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComponentInstanceCreatedListener: Self = this.set("componentInstanceCreatedListener", js.undefined)
    
    @scala.inline
    def setDateTimeFormats(value: DateTimeFormats): Self = this.set("dateTimeFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeFormats: Self = this.set("dateTimeFormats", js.undefined)
    
    @scala.inline
    def setEscapeParameterHtml(value: Boolean): Self = this.set("escapeParameterHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeParameterHtml: Self = this.set("escapeParameterHtml", js.undefined)
    
    @scala.inline
    def setFallbackLocaleVarargs(value: String*): Self = this.set("fallbackLocale", js.Array(value :_*))
    
    @scala.inline
    def setFallbackLocale(value: FallbackLocale): Self = this.set("fallbackLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackLocale: Self = this.set("fallbackLocale", js.undefined)
    
    @scala.inline
    def setFallbackRoot(value: Boolean): Self = this.set("fallbackRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackRoot: Self = this.set("fallbackRoot", js.undefined)
    
    @scala.inline
    def setFormatFallbackMessages(value: Boolean): Self = this.set("formatFallbackMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatFallbackMessages: Self = this.set("formatFallbackMessages", js.undefined)
    
    @scala.inline
    def setFormatter(value: Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMessages(value: LocaleMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMissing(
      value: (/* locale */ Locale, /* key */ Path, /* vm */ Vue | Null, /* values */ js.Any) => String | Unit
    ): Self = this.set("missing", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setNumberFormats(value: NumberFormats): Self = this.set("numberFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormats: Self = this.set("numberFormats", js.undefined)
    
    @scala.inline
    def setPluralizationRules(value: PluralizationRulesMap): Self = this.set("pluralizationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluralizationRules: Self = this.set("pluralizationRules", js.undefined)
    
    @scala.inline
    def setPostTranslation(value: (/* str */ String, /* key */ js.UndefOr[String]) => String): Self = this.set("postTranslation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostTranslation: Self = this.set("postTranslation", js.undefined)
    
    @scala.inline
    def setPreserveDirectiveContent(value: Boolean): Self = this.set("preserveDirectiveContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDirectiveContent: Self = this.set("preserveDirectiveContent", js.undefined)
    
    @scala.inline
    def setSharedMessages(value: LocaleMessages): Self = this.set("sharedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedMessages: Self = this.set("sharedMessages", js.undefined)
    
    @scala.inline
    def setSilentFallbackWarn(value: Boolean | RegExp): Self = this.set("silentFallbackWarn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentFallbackWarn: Self = this.set("silentFallbackWarn", js.undefined)
    
    @scala.inline
    def setSilentTranslationWarn(value: Boolean | RegExp): Self = this.set("silentTranslationWarn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentTranslationWarn: Self = this.set("silentTranslationWarn", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    
    @scala.inline
    def setWarnHtmlInMessage(value: WarnHtmlInMessageLevel): Self = this.set("warnHtmlInMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnHtmlInMessage: Self = this.set("warnHtmlInMessage", js.undefined)
  }
}
