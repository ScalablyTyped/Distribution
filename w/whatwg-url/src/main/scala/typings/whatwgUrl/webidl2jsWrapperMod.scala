package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.anon.DoNotStripQMark
import typings.whatwgUrl.urlImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webidl2jsWrapperMod {
  
  object URL {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.convert")
    @js.native
    def convert(obj: js.Any): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.convert")
    @js.native
    def convert(obj: js.Any, options: Options): implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object): typings.std.URL = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): typings.std.URL = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): typings.std.URL = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.create")
    @js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): typings.std.URL = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.createImpl")
    @js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.install")
    @js.native
    def install(globalObject: js.Object): Unit = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.is")
    @js.native
    def is(obj: js.Any): /* is std.URL */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.isImpl")
    @js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URL.setup")
    @js.native
    def setup[T /* <: typings.std.URL */](
      obj: T,
      globalObject: js.Object,
      hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
      privateData: js.Object
    ): T = js.native
  }
  
  object URLSearchParams {
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.convert")
    @js.native
    def convert(obj: js.Any): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.convert")
    @js.native
    def convert(obj: js.Any, options: Options): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.create")
    @js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typings.std.URLSearchParams = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.create")
    @js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typings.std.URLSearchParams = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.createImpl")
    @js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.createImpl")
    @js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.install")
    @js.native
    def install(globalObject: js.Object): Unit = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.is")
    @js.native
    def is(obj: js.Any): /* is std.URLSearchParams */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.isImpl")
    @js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = js.native
    
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.setup")
    @js.native
    def setup[T /* <: typings.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): T = js.native
    @JSImport("whatwg-url/webidl2js-wrapper", "URLSearchParams.setup")
    @js.native
    def setup[T /* <: typings.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): T = js.native
  }
}
