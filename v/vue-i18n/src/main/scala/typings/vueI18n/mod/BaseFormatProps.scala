package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.Locale
import typings.intlifyCoreBase.mod.PickupLocales
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFormatProps extends StObject {
  
  /**
    * @remarks
    * A composer instance with an existing scope.
    *
    * This option takes precedence over the `scope` option.
    */
  var i18n: js.UndefOr[
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
  ] = js.undefined
  
  /**
    * @remarks
    * Specifies the locale to be used for the component.
    *
    * If specified, the global scope or the locale of the parent scope of the target component will not be overridden and the specified locale will be used.
    */
  var locale: js.UndefOr[Locale] = js.undefined
  
  /**
    * @remarks
    * Specifies the scope to be used in the target component.
    *
    * You can specify either `global` or `parent`.
    *
    * If `global` is specified, global scope is used, else then `parent` is specified, the scope of the parent of the target component is used.
    *
    * If the parent is a global scope, the global scope is used, if it's a local scope, the local scope is used.
    */
  var scope: js.UndefOr[ComponetI18nScope] = js.undefined
  
  /**
    * @remarks
    * Used to wrap the content that is distribute in the slot. If omitted, the slot content is treated as Fragments.
    *
    * You can specify a string-based tag name, such as `p`, or the object for which the component is defined.
    */
  var tag: js.UndefOr[String | js.Object] = js.undefined
}
object BaseFormatProps {
  
  inline def apply(): BaseFormatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFormatProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFormatProps] (val x: Self) extends AnyVal {
    
    inline def setI18n(
      value: Composer[
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
    ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setScope(value: ComponetI18nScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTag(value: String | js.Object): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
