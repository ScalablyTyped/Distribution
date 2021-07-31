package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.anon.DoNotStripQMark
import typings.whatwgUrl.urlImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webidl2jsWrapperMod {
  
  object URL {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def convert(obj: js.Any): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any]).asInstanceOf[implementation]
    @scala.inline
    def convert(obj: js.Any, options: Options): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[implementation]
    
    @scala.inline
    def create(globalObject: js.Object): typings.std.URL = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any]).asInstanceOf[typings.std.URL]
    @scala.inline
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): typings.std.URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any])).asInstanceOf[typings.std.URL]
    @scala.inline
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): typings.std.URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.std.URL]
    @scala.inline
    def create(globalObject: js.Object, hasUrlBase: Unit, privateData: js.Object): typings.std.URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.std.URL]
    
    @scala.inline
    def createImpl(globalObject: js.Object): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any]).asInstanceOf[implementation]
    @scala.inline
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any])).asInstanceOf[implementation]
    @scala.inline
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
    @scala.inline
    def createImpl(globalObject: js.Object, hasUrlBase: Unit, privateData: js.Object): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
    
    @scala.inline
    def install(globalObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def is(obj: js.Any): /* is std.URL */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.URL */ Boolean]
    
    @scala.inline
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean]
    
    @scala.inline
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def setup[T /* <: typings.std.URL */](
      obj: T,
      globalObject: js.Object,
      hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
      privateData: js.Object
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object, hasUrlBase: Unit, privateData: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  object URLSearchParams {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def convert(obj: js.Any): typings.whatwgUrl.urlsearchparamsImplMod.implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.whatwgUrl.urlsearchparamsImplMod.implementation]
    @scala.inline
    def convert(obj: js.Any, options: Options): typings.whatwgUrl.urlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.urlsearchparamsImplMod.implementation]
    
    @scala.inline
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typings.std.URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any])).asInstanceOf[typings.std.URLSearchParams]
    @scala.inline
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typings.std.URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.std.URLSearchParams]
    
    @scala.inline
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typings.whatwgUrl.urlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.urlsearchparamsImplMod.implementation]
    @scala.inline
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typings.whatwgUrl.urlsearchparamsImplMod.implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[typings.whatwgUrl.urlsearchparamsImplMod.implementation]
    
    @scala.inline
    def install(globalObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def is(obj: js.Any): /* is std.URLSearchParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.URLSearchParams */ Boolean]
    
    @scala.inline
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean]
    
    @scala.inline
    def setup[T /* <: typings.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def setup[T /* <: typings.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
