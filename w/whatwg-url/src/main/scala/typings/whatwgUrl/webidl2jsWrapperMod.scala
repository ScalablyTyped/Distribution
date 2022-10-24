package typings.whatwgUrl

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.whatwgUrl.anon.Context
import typings.whatwgUrl.anon.`1`
import typings.whatwgUrl.libUrlImplMod.implementation
import typings.whatwgUrl.whatwgUrlStrings.key
import typings.whatwgUrl.whatwgUrlStrings.keyPlussignvalue
import typings.whatwgUrl.whatwgUrlStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webidl2jsWrapperMod {
  
  object URL {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert(globalObject: js.Object, obj: Any): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[implementation]
    inline def convert(globalObject: js.Object, obj: Any, param2: Context): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[implementation]
    
    inline def create(
      globalObject: js.Object,
      constructorArgs: js.Tuple2[/* url */ String, /* base */ js.UndefOr[String]]
    ): typings.whatwgUrl.mod.URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.mod.URL]
    
    inline def createImpl(
      globalObject: js.Object,
      constructorArgs: js.Tuple2[/* url */ String, /* base */ js.UndefOr[String]]
    ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[implementation]
    
    inline def install(globalObject: js.Object, globalNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any], globalNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def is(obj: Any): /* is whatwg-url.whatwg-url.URL */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url.URL */ Boolean]
    
    inline def isImpl(obj: Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean]
    
    /**
      * Creates a new `URL` object without runing the constructor steps.
      *
      * Useful when implementing specifications that initialize objects
      * in different ways than their constructors do.
      */
    inline def `new`(globalObject: js.Object): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("new")(globalObject.asInstanceOf[js.Any]).asInstanceOf[implementation]
    inline def `new`(
      globalObject: js.Object,
      newTarget: Instantiable2[/* url */ String, /* base */ js.UndefOr[String], typings.whatwgUrl.mod.URL]
    ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("new")(globalObject.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[implementation]
    
    inline def setup[T /* <: typings.whatwgUrl.mod.URL */](
      obj: T,
      globalObject: js.Object,
      constructorArgs: js.Tuple2[/* url */ String, /* base */ js.UndefOr[String]]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  object URLSearchParams {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert(globalObject: js.Object, obj: Any): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    inline def convert(globalObject: js.Object, obj: Any, param2: Context): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    
    inline def create(globalObject: js.Object): typings.whatwgUrl.mod.URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any]).asInstanceOf[typings.whatwgUrl.mod.URLSearchParams]
    inline def create(
      globalObject: js.Object,
      constructorArgs: js.Array[
          /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
        ]
    ): typings.whatwgUrl.mod.URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.mod.URLSearchParams]
    inline def create(
      globalObject: js.Object,
      constructorArgs: js.Array[
          /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
        ],
      privateData: `1`
    ): typings.whatwgUrl.mod.URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.mod.URLSearchParams]
    inline def create(globalObject: js.Object, constructorArgs: Unit, privateData: `1`): typings.whatwgUrl.mod.URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.mod.URLSearchParams]
    
    inline def createDefaultIterator[TIteratorKind /* <: key | value | keyPlussignvalue */](
      globalObject: js.Object,
      target: typings.whatwgUrl.libUrlsearchparamsImplMod.implementation,
      kind: TIteratorKind
    ): IterableIterator[
        /* import warning: importer.ImportType#apply Failed type conversion: TIteratorKind extends 'key' | 'value' ? string : [name: string, value: string] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultIterator")(globalObject.asInstanceOf[js.Any], target.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[
        /* import warning: importer.ImportType#apply Failed type conversion: TIteratorKind extends 'key' | 'value' ? string : [name: string, value: string] */ js.Any
      ]]
    
    inline def createImpl(globalObject: js.Object): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any]).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    inline def createImpl(
      globalObject: js.Object,
      constructorArgs: js.Array[
          /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
        ]
    ): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    inline def createImpl(
      globalObject: js.Object,
      constructorArgs: js.Array[
          /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
        ],
      privateData: `1`
    ): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    inline def createImpl(globalObject: js.Object, constructorArgs: Unit, privateData: `1`): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    
    inline def install(globalObject: js.Object, globalNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any], globalNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def is(obj: Any): /* is whatwg-url.whatwg-url.URLSearchParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url.URLSearchParams */ Boolean]
    
    inline def isImpl(obj: Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean]
    
    /**
      * Creates a new `URLSearchParams` object without runing the constructor steps.
      *
      * Useful when implementing specifications that initialize objects
      * in different ways than their constructors do.
      */
    inline def `new`(globalObject: js.Object): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("new")(globalObject.asInstanceOf[js.Any]).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    inline def `new`(
      globalObject: js.Object,
      newTarget: Instantiable1[
          /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String, 
          typings.whatwgUrl.mod.URLSearchParams
        ]
    ): typings.whatwgUrl.libUrlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("new")(globalObject.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.libUrlsearchparamsImplMod.implementation]
    
    inline def setup[T /* <: typings.whatwgUrl.mod.URLSearchParams */](obj: T, globalObject: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def setup[T /* <: typings.whatwgUrl.mod.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      constructorArgs: js.Array[
          /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
        ]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def setup[T /* <: typings.whatwgUrl.mod.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      constructorArgs: js.Array[
          /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
        ],
      privateData: `1`
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def setup[T /* <: typings.whatwgUrl.mod.URLSearchParams */](obj: T, globalObject: js.Object, constructorArgs: Unit, privateData: `1`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
