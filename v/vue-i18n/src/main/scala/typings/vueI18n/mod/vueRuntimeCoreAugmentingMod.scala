package typings.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typings.intlifyCoreBase.mod.DateTimeFormats
import typings.intlifyCoreBase.mod.DateTimeOptions
import typings.intlifyCoreBase.mod.Locale
import typings.intlifyCoreBase.mod.LocaleMessageValue
import typings.intlifyCoreBase.mod.LocaleMessages
import typings.intlifyCoreBase.mod.MessageFunction
import typings.intlifyCoreBase.mod.NamedValue
import typings.intlifyCoreBase.mod.NumberFormats
import typings.intlifyCoreBase.mod.NumberOptions
import typings.intlifyCoreBase.mod.Path
import typings.intlifyCoreBase.mod.PickupKeys
import typings.intlifyCoreBase.mod.PickupLocales
import typings.intlifyCoreBase.mod.TranslateOptions
import typings.std.Record
import typings.vueI18n.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object vueRuntimeCoreAugmentingMod {
  
  trait ComponentCustomOptions extends StObject {
    
    /**
      * For devtools
      * @internal
      */
    var __INTLIFY_META__ : js.UndefOr[String] = js.undefined
    
    /**
      * For custom blocks options
      * @internal
      */
    var __i18n: js.UndefOr[CustomBlocks[VueMessageType]] = js.undefined
    
    /**
      * VueI18n options
      *
      * @remarks
      * See the {@link VueI18nOptions}
      */
    var i18n: js.UndefOr[
        VueI18nOptions[
          Message, 
          Locale, 
          ComposerOptions[
            Message, 
            Locale, 
            /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}> */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}> */ js.Any, 
            LocaleMessages[
              /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
              VueMessageType
            ], 
            DateTimeFormats[
              /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}> */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
            ], 
            NumberFormats[
              /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
    {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
    {}> */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
            ]
          ]
        ]
      ] = js.undefined
  }
  object ComponentCustomOptions {
    
    inline def apply(): ComponentCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentCustomOptions]
    }
    
    extension [Self <: ComponentCustomOptions](x: Self) {
      
      inline def setI18n(
        value: VueI18nOptions[
              Message, 
              Locale, 
              ComposerOptions[
                Message, 
                Locale, 
                /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}> */ js.Any, 
                /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}> */ js.Any, 
                LocaleMessages[
                  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
                  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
                  VueMessageType
                ], 
                DateTimeFormats[
                  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}> */ js.Any, 
                  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
                ], 
                NumberFormats[
                  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
      {}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
      {}> */ js.Any, 
                  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
                ]
              ]
            ]
      ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def set__INTLIFY_META__(value: String): Self = StObject.set(x, "__INTLIFY_META__", value.asInstanceOf[js.Any])
      
      inline def set__INTLIFY_META__Undefined: Self = StObject.set(x, "__INTLIFY_META__", js.undefined)
      
      inline def set__i18n(value: CustomBlocks[VueMessageType]): Self = StObject.set(x, "__i18n", value.asInstanceOf[js.Any])
      
      inline def set__i18nUndefined: Self = StObject.set(x, "__i18n", js.undefined)
      
      inline def set__i18nVarargs(value: CustomBlock[VueMessageType]*): Self = StObject.set(x, "__i18n", js.Array(value*))
    }
  }
  
  @js.native
  trait ComponentCustomProperties extends StObject {
    
    @JSName("$d")
    def $d(value: js.Date): String = js.native
    @JSName("$d")
    def $d(value: js.Date, args: StringDictionary[String]): DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: js.Date, options: DateTimeOptions[String, Locale]): String = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * Overloaded `$d`. About details, see the {@link $d} remarks.
      *
      * @param value - A value, timestamp number or `Date` instance
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d(value: Double): String = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * Overloaded `$d`. About details, see the {@link $d} remarks.
      *
      * @param value - A value, timestamp number or `Date` instance
      * @param args - An argument values
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d(value: Double, args: StringDictionary[String]): DateTimeFormatResult = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * Overloaded `$d`. About details, see the {@link $d} remarks.
      *
      * @param value - A value, timestamp number or `Date` instance
      * @param options - An options, see the {@link DateTimeOptions}
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d(value: Double, options: DateTimeOptions[String, Locale]): String = js.native
    @JSName("$d")
    def $d[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: js.Date, key: Key | ResourceKeys): String = js.native
    @JSName("$d")
    def $d[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: js.Date, key: Key | ResourceKeys, locale: Locale): String = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * Overloaded `$d`. About details, see the {@link $d} remarks.
      *
      * @param value - A value, timestamp number or `Date` instance
      * @param key - A key of datetime formats
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys): String = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * Overloaded `$d`. About details, see the {@link $d} remarks.
      *
      * @param value - A value, timestamp number or `Date` instance
      * @param key - A key of datetime formats
      * @param locale - A locale, optional, override locale that global scope or local scope
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys, locale: Locale): String = js.native
    @JSName("$d")
    def $d_DateTimeFormatResult(value: js.Date): DateTimeFormatResult = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * If this is used in a reactive context, it will re-evaluate once the locale changes.
      *
      * In {@link I18nMode | Legacy API mode}, the input / output is the same as for VueI18n instance. About that details, see {@link VueI18n#d | `VueI18n#d` }.
      *
      * In {@link I18nMode | Composition API mode}, the `$d` is injected by `app.config.globalProperties`.
      * the input / output is the same as for Composer instance, and it work on **global scope**. About that details, see {@link Composer#d | `Composer#d` }.
      *
      * @param value - A value, timestamp number or `Date` instance
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d_DateTimeFormatResult(value: Double): DateTimeFormatResult = js.native
    @JSName("$d")
    def $d_KeyDefinedDateTimeFormatKeysResourceKeys_DateTimeFormatResult[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: js.Date, key: Key | ResourceKeys): DateTimeFormatResult = js.native
    @JSName("$d")
    def $d_KeyDefinedDateTimeFormatKeysResourceKeys_DateTimeFormatResult[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: js.Date, key: Key | ResourceKeys, locale: Locale): DateTimeFormatResult = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * Overloaded `$d`. About details, see the {@link $d} remarks.
      *
      * @param value - A value, timestamp number or `Date` instance
      * @param key - A key of datetime formats
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d_KeyDefinedDateTimeFormatKeysResourceKeys_DateTimeFormatResult[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys): DateTimeFormatResult = js.native
    /**
      * Datetime formatting
      *
      * @remarks
      * Overloaded `$d`. About details, see the {@link $d} remarks.
      *
      * @param value - A value, timestamp number or `Date` instance
      * @param key - A key of datetime formats
      * @param locale - A locale, optional, override locale that global scope or local scope
      *
      * @returns formatted value
      */
    @JSName("$d")
    def $d_KeyDefinedDateTimeFormatKeysResourceKeys_DateTimeFormatResult[Key /* <: String */, DefinedDateTimeFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys, locale: Locale): DateTimeFormatResult = js.native
    
    /**
      * Exported Global Composer instance, or global VueI18n instance.
      *
      * @remarks
      * You can get the {@link ExportedGlobalComposer | exported composer instance} which are exported from global {@link Composer | composer instance} created with {@link createI18n}, or global {@link VueI18n | VueI18n instance}.
      * You can get the exported composer instance in {@link I18nMode | Composition API mode}, or the Vuei18n instance in {@link I18nMode | Legacy API mode}, which is the instance you can refer to with this property.
      * The locales, locale messages, and other resources managed by the instance referenced by this property are valid as global scope.
      * If the `i18n` component custom option is not specified, it's the same as the VueI18n instance that can be referenced by the i18n instance {@link I18n.global | global} property.
      */
    @JSName("$i18n")
    var $i18n: (VueI18n[
        js.Object, 
        js.Object, 
        js.Object, 
        Locale, 
        PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
    {} */ String], 
        /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends string ? [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> */ js.Any, 
        Composer[
          js.Object, 
          js.Object, 
          js.Object, 
          Locale, 
          PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
    {} */ String], 
          /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
    {}, keyof / * Inlined std.NonNullable<{}> * /
    {}> */ js.Any
        ]
      ]) | ExportedGlobalComposer = js.native
    
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n(value: Double): String = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param args - An argument values
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n(value: Double, args: StringDictionary[String | Boolean | Double]): NumberFormatResult = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param key - A key of number formats
      * @param args - An argument values
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n(value: Double, key: String, args: StringDictionary[String | Boolean | Double]): NumberFormatResult = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param key - A key of number formats
      * @param locale - A locale, optional, override locale that global scope or local scope
      * @param args - An argument values
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n(value: Double, key: String, locale: Locale, args: StringDictionary[String | Boolean | Double]): NumberFormatResult = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param options - An options, see the {@link NumberOptions}
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n(value: Double, options: NumberOptions[String, Locale]): String = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param key - A key of number formats
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n[Key /* <: String */, DefinedNumberFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys): NumberFormatResult = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param key - A key of number formats
      * @param locale - A locale, optional, override locale that global scope or local scope
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n[Key /* <: String */, DefinedNumberFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys, locale: Locale): NumberFormatResult = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param key - A key of number formats
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n_KeyDefinedNumberFormatKeysResourceKeys_String[Key /* <: String */, DefinedNumberFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys): String = js.native
    /**
      * Number formatting
      *
      * @remarks
      * Overloaded `$n`. About details, see the {@link $n} remarks.
      *
      * @param value - A number value
      * @param key - A key of number formats
      * @param locale - A locale, optional, override locale that global scope or local scope
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n_KeyDefinedNumberFormatKeysResourceKeys_String[Key /* <: String */, DefinedNumberFormat /* <: js.Object */, Keys, ResourceKeys /* <: Keys */](value: Double, key: Key | ResourceKeys, locale: Locale): String = js.native
    /**
      * Number formatting
      *
      * @remarks
      * If this is used in a reactive context, it will re-evaluate once the locale changes.
      *
      * In {@link I18nMode | Legacy API mode}, the input / output is the same as for VueI18n instance. About that details, see {@link VueI18n#n | `VueI18n.n` }.
      *
      * In {@link I18nMode | Composition API mode}, the `$n` is injected by `app.config.globalProperties`.
      * the input / output is the same as for Composer instance,  and it work on **global scope**. About that details, see {@link Composer#n | `Composer.n` }.
      *
      * @param value - A number value
      *
      * @returns formatted value
      */
    @JSName("$n")
    def $n_NumberFormatResult(value: Double): NumberFormatResult = js.native
    
    /**
      * Resolve locale message translation
      *
      * @remarks
      * If this is used in a reactive context, it will re-evaluate once the locale changes.
      *
      * In {@link I18nMode | Legacy API mode}, the input / output is the same as for VueI18n instance. About that details, see {@link VueI18n#rt | `VueI18n#rt`}.
      *
      * In {@link I18nMode | Composition API mode}, the `$rt` is injected by `app.config.globalProperties`.
      * the input / output is the same as for Composer, and it work on **global scope**. About that details, see {@link Composer#rt | `Composer#rt` }.
      *
      * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `$tm`.
      *
      * @returns translated message
      */
    @JSName("$rt")
    def $rt(message: MessageFunction[VueMessageType]): String = js.native
    /**
      * Resolve locale message translation for list interpolations
      *
      * @remarks
      * Overloaded `$rt`. About details, see the {@link $rt} remarks.
      *
      * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `$tm`.
      * @param list - A values of list interpolation.
      * @param options - Additional {@link TranslateOptions | options} for translation
      *
      * @returns Translated message
      */
    @JSName("$rt")
    def $rt(message: MessageFunction[VueMessageType], list: js.Array[Any]): String = js.native
    @JSName("$rt")
    def $rt(message: MessageFunction[VueMessageType], list: js.Array[Any], options: TranslateOptions[Locale]): String = js.native
    /**
      * Resolve locale message translation for named interpolations
      *
      * @remarks
      * Overloaded `$rt`. About details, see the {@link $rt} remarks.
      *
      * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `$tm`.
      * @param named - A values of named interpolation.
      * @param options - Additional {@link TranslateOptions | options} for translation
      *
      * @returns Translated message
      */
    @JSName("$rt")
    def $rt(message: MessageFunction[VueMessageType], named: NamedValue[js.Object]): String = js.native
    @JSName("$rt")
    def $rt(
      message: MessageFunction[VueMessageType],
      named: NamedValue[js.Object],
      options: TranslateOptions[Locale]
    ): String = js.native
    /**
      * Resolve locale message translation for plurals
      *
      * @remarks
      * Overloaded `$rt`. About details, see the {@link $rt} remarks.
      *
      * @param message - A target locale message to be resolved. You will need to specify the locale message returned by `$tm`.
      * @param plural - Which plural string to get. 1 returns the first one.
      * @param options - Additional {@link TranslateOptions | options} for translation
      *
      * @returns Translated message
      */
    @JSName("$rt")
    def $rt(message: MessageFunction[VueMessageType], plural: Double): String = js.native
    @JSName("$rt")
    def $rt(message: MessageFunction[VueMessageType], plural: Double, options: TranslateOptions[Locale]): String = js.native
    @JSName("$rt")
    def $rt(message: VueMessageType): String = js.native
    @JSName("$rt")
    def $rt(message: VueMessageType, list: js.Array[Any]): String = js.native
    @JSName("$rt")
    def $rt(message: VueMessageType, list: js.Array[Any], options: TranslateOptions[Locale]): String = js.native
    @JSName("$rt")
    def $rt(message: VueMessageType, named: NamedValue[js.Object]): String = js.native
    @JSName("$rt")
    def $rt(message: VueMessageType, named: NamedValue[js.Object], options: TranslateOptions[Locale]): String = js.native
    @JSName("$rt")
    def $rt(message: VueMessageType, plural: Double): String = js.native
    @JSName("$rt")
    def $rt(message: VueMessageType, plural: Double, options: TranslateOptions[Locale]): String = js.native
    
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param defaultMsg - A default message to return if no translation was found
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, defaultMsg: String): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param defaultMsg - A default message to return if no translation was found
      * @param options - An options, see the {@link TranslateOptions}
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, defaultMsg: String, options: TranslateOptions[Locale]): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param list - A values of list interpolation
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, list: js.Array[Any]): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param list - A values of list interpolation
      * @param defaultMsg - A default message to return if no translation was found
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, list: js.Array[Any], defaultMsg: String): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param list - A values of list interpolation
      * @param options - An options, see the {@link TranslateOptions}
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, list: js.Array[Any], options: TranslateOptions[Locale]): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param list - A values of list interpolation
      * @param plural - A choice number of plural
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, list: js.Array[Any], plural: Double): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param locale - A locale, override locale that global scope or local scope
      * @param list - A values of list interpolation
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, locale: Locale, list: js.Array[Any]): TranslateResult = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param locale - A locale, override locale that global scope or local scope
      * @param named - A values of named interpolation
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, locale: Locale, named: js.Object): TranslateResult = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param named - A values of named interpolation
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, named: NamedValue[js.Object]): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param named - A values of named interpolation
      * @param defaultMsg - A default message to return if no translation was found
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, named: NamedValue[js.Object], defaultMsg: String): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param named - A values of named interpolation
      * @param options - An options, see the {@link TranslateOptions}
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, named: NamedValue[js.Object], options: TranslateOptions[Locale]): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param named - A values of named interpolation
      * @param plural - A choice number of plural
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, named: NamedValue[js.Object], plural: Double): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param named - A values of named interpolation
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, named: Record[String, Any]): TranslateResult = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param plural - A choice number of plural
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, plural: Double): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param plural - Which plural string to get. 1 returns the first one.
      * @param options - An options, see the {@link TranslateOptions}
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, plural: Double, options: TranslateOptions[Locale]): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, defaultMsg: String): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, defaultMsg: String, options: TranslateOptions[Locale]): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, list: js.Array[Any]): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, list: js.Array[Any], defaultMsg: String): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, list: js.Array[Any], options: TranslateOptions[Locale]): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, list: js.Array[Any], plural: Double): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, locale: Locale, list: js.Array[Any]): TranslateResult = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, locale: Locale, named: js.Object): TranslateResult = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, named: NamedValue[js.Object]): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, named: NamedValue[js.Object], defaultMsg: String): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, named: NamedValue[js.Object], options: TranslateOptions[Locale]): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, named: NamedValue[js.Object], plural: Double): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, named: Record[String, Any]): TranslateResult = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, plural: Double): String = js.native
    @JSName("$t")
    def $t[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, plural: Double, options: TranslateOptions[Locale]): String = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * If this is used in a reactive context, it will re-evaluate once the locale changes.
      *
      * In {@link I18nMode | Legacy API mode}, the input / output is the same as for VueI18n instance. About that details, see {@link VueI18n#t | `VueI18n#t`}.
      *
      * In {@link I18nMode | Composition API mode}, the `$t` is injected by `app.config.globalProperties`.
      * the input / output is the same as for Composer, and it work on **global scope**. About that details, see {@link Composer#t | `Composer#t` }.
      *
      * @param key - A target locale message key
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t_KeyDefinedLocaleMessageKeysResourceKeys_TranslateResult[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys): TranslateResult = js.native
    /**
      * Locale message translation
      *
      * @remarks
      * Overloaded `$t`. About details, see the {@link $t} remarks.
      *
      * @param key - A target locale message key
      * @param list - A values of list interpolation
      *
      * @returns translation message
      */
    @JSName("$t")
    def $t_KeyDefinedLocaleMessageKeysResourceKeys_TranslateResult[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, list: js.Array[Any]): TranslateResult = js.native
    @JSName("$t")
    def $t_KeyDefinedLocaleMessageKeysResourceKeys_TranslateResult[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path): TranslateResult = js.native
    @JSName("$t")
    def $t_KeyDefinedLocaleMessageKeysResourceKeys_TranslateResult[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, list: js.Array[Any]): TranslateResult = js.native
    
    /**
      * Locale message pluralization
      *
      * @remarks
      * If this is used in a reactive context, it will re-evaluate once the locale changes.
      *
      * The input / output is the same as for VueI18n instance. About that details, see {@link VueI18n#tc | `VueI18n#tc` }.
      * The value of plural is handled with default `1`.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys): TranslateResult = js.native
    /**
      * Locale message pluralization
      * Supported for Legacy API mode only.
      *
      * @remarks
      * Overloaded `$tc`. About details, see the {@link $tc} remarks.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param choice - Which plural string to get. 1 returns the first one.
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, choice: Double): TranslateResult = js.native
    /**
      * Locale message pluralization
      * Supported for Legacy API mode only.
      *
      * @remarks
      * Overloaded `$tc`. About details, see the {@link $tc} remarks.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param choice - Which plural string to get. 1 returns the first one.
      * @param list - A values of list interpolation
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, choice: Double, list: js.Array[Any]): TranslateResult = js.native
    /**
      * Locale message pluralization
      * Supported for Legacy API mode only.
      *
      * @remarks
      * Overloaded `$tc`. About details, see the {@link $tc} remarks.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param choice - Which plural string to get. 1 returns the first one.
      * @param locale - A locale, override locale that global scope or local scope
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, choice: Double, locale: Locale): TranslateResult = js.native
    /**
      * Locale message pluralization
      * Supported for Legacy API mode only.
      *
      * @remarks
      * Overloaded `$tc`. About details, see the {@link $tc} remarks.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param choice - Which plural string to get. 1 returns the first one.
      * @param named - A values of named interpolation
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, choice: Double, named: Record[String, Any]): TranslateResult = js.native
    /**
      * Locale message pluralization
      *
      * @remarks
      * Overloaded `$tc`. About details, see the {@link $tc} remarks.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param list - A values of list interpolation
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, list: js.Array[Any]): TranslateResult = js.native
    /**
      * Locale message pluralization
      *
      * @remarks
      * Overloaded `$tc`. About details, see the {@link $tc} remarks.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param locale - A locale, override locale that global scope or local scope
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, locale: Locale): TranslateResult = js.native
    /**
      * Locale message pluralization
      * Supported for Legacy API mode only.
      *
      * @remarks
      * Overloaded `$tc`. About details, see the {@link $tc} remarks.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param named - A values of named interpolation
      *
      * @returns translation message that is pluraled
      */
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, named: Record[String, Any]): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, choice: Double): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, choice: Double, list: js.Array[Any]): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, choice: Double, locale: Locale): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, choice: Double, named: Record[String, Any]): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, list: js.Array[Any]): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, locale: Locale): TranslateResult = js.native
    @JSName("$tc")
    def $tc[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, named: Record[String, Any]): TranslateResult = js.native
    
    /**
      * Translation message exist
      *
      * @remarks
      * The input / output is the same as for VueI18n instance. About that details, see {@link VueI18n#te | `VueI18n.#te` }.
      * Supported for Legacy API mode only.
      *
      * @param key - A target locale message key
      * @param locale - A locale, optional, override locale that global scope or local scope
      *
      * @returns if found locale message, `true`, else `false`
      */
    @JSName("$te")
    def $te[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys): Boolean = js.native
    @JSName("$te")
    def $te[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Key | ResourceKeys, locale: Locale): Boolean = js.native
    @JSName("$te")
    def $te[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path): Boolean = js.native
    @JSName("$te")
    def $te[Key /* <: String */, DefinedLocaleMessage /* <: RemovedIndexResources[DefineLocaleMessage] */, Keys, ResourceKeys /* <: Keys */](key: Path, locale: Locale): Boolean = js.native
    
    /**
      * Locale messages getter
      *
      * In {@link I18nMode | Legacy API mode}, the input / output is the same as for VueI18n instance. About that details, see {@link VueI18n#tm | `VueI18n#tm` }.
      *
      * @remarks
      * In {@link I18nMode | Composition API mode}, the `$tm` is injected by `app.config.globalProperties`.
      * the input / output is the same as for Composer instance, and it work on **global scope**. About that details, see {@link Composer#tm | `Composer.tm` }.
      * Based on the current `locale`, locale messages will be returned from Composer instance messages.
      * If you change the `locale`, the locale messages returned will also correspond to the locale.
      * If there are no locale messages for the given `key` in the composer instance messages, they will be returned with fallbacking.
      *
      * @param key - A target locale message key
      *
      * @returns locale messages
      */
    @JSName("$tm")
    def $tm[Key /* <: String */, Messages /* <: js.Object */, ResourceKeys /* <: PickupKeys[Messages, /* keyof Messages */ String] */](key: Key | ResourceKeys): LocaleMessageValue[VueMessageType] | js.Object = js.native
  }
}
