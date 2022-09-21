package typings.whatwgUrl

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.whatwgUrl.anon.Context
import typings.whatwgUrl.anon.`0`
import typings.whatwgUrl.mod.URLSearchParams
import typings.whatwgUrl.urlsearchparamsImplMod.implementation
import typings.whatwgUrl.whatwgUrlStrings.key
import typings.whatwgUrl.whatwgUrlStrings.keyPlussignvalue
import typings.whatwgUrl.whatwgUrlStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlsearchparamsMod {
  
  @JSImport("whatwg-url/lib/URLSearchParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(globalObject: js.Object, obj: Any): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def convert(globalObject: js.Object, obj: Any, hasContext: Context): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], hasContext.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def create(globalObject: js.Object): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
  inline def create(
    globalObject: js.Object,
    constructorArgs: js.Array[
      /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
    ]
  ): URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[URLSearchParams]
  inline def create(
    globalObject: js.Object,
    constructorArgs: js.Array[
      /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
    ],
    privateData: `0`
  ): URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[URLSearchParams]
  inline def create(globalObject: js.Object, constructorArgs: Unit, privateData: `0`): URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[URLSearchParams]
  
  inline def createDefaultIterator[TIteratorKind /* <: key | value | keyPlussignvalue */](globalObject: js.Object, target: implementation, kind: TIteratorKind): IterableIterator[(js.Tuple2[/* name */ String, /* value */ String]) | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultIterator")(globalObject.asInstanceOf[js.Any], target.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[(js.Tuple2[/* name */ String, /* value */ String]) | String]]
  
  inline def createImpl(globalObject: js.Object): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def createImpl(
    globalObject: js.Object,
    constructorArgs: js.Array[
      /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
    ]
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(
    globalObject: js.Object,
    constructorArgs: js.Array[
      /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
    ],
    privateData: `0`
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, constructorArgs: Unit, privateData: `0`): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def install(globalObject: js.Object, globalNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any], globalNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def is(obj: Any): /* is whatwg-url.whatwg-url.URLSearchParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url.URLSearchParams */ Boolean]
  
  inline def isImpl(obj: Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean]
  
  /**
    * Creates a new `URLSearchParams` object without runing the constructor steps.
    *
    * Useful when implementing specifications that initialize objects
    * in different ways than their constructors do.
    */
  inline def `new`(globalObject: js.Object): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("new")(globalObject.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def `new`(
    globalObject: js.Object,
    newTarget: Instantiable1[
      /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String, 
      URLSearchParams
    ]
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("new")(globalObject.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def setup[T /* <: URLSearchParams */](obj: T, globalObject: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: URLSearchParams */](
    obj: T,
    globalObject: js.Object,
    constructorArgs: js.Array[
      /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: URLSearchParams */](
    obj: T,
    globalObject: js.Object,
    constructorArgs: js.Array[
      /* init */ (js.Array[js.Tuple2[/* name */ String, /* value */ String]]) | StringDictionary[String] | String
    ],
    privateData: `0`
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: URLSearchParams */](obj: T, globalObject: js.Object, constructorArgs: Unit, privateData: `0`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
}
