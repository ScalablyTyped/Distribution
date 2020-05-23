package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.anon.DoNotStripQMark
import typings.whatwgUrl.urlImplMod.implementation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url/webidl2js-wrapper", JSImport.Namespace)
@js.native
object webidl2jsWrapperMod extends js.Object {
  @js.native
  object URL extends js.Object {
    def convert(obj: js.Any): implementation = js.native
    def convert(obj: js.Any, options: Options): implementation = js.native
    def create(globalObject: js.Object): typings.std.URL = js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): typings.std.URL = js.native
    def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): typings.std.URL = js.native
    def createImpl(globalObject: js.Object): implementation = js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = js.native
    def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = js.native
    def install(globalObject: js.Object): Unit = js.native
    def is(obj: js.Any): /* is std.URL */ Boolean = js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = js.native
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object): T = js.native
    def setup[T /* <: typings.std.URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = js.native
    def setup[T /* <: typings.std.URL */](
      obj: T,
      globalObject: js.Object,
      hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
      privateData: js.Object
    ): T = js.native
  }
  
  @js.native
  object URLSearchParams extends js.Object {
    def convert(obj: js.Any): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def convert(obj: js.Any, options: Options): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typings.std.URLSearchParams = js.native
    def create(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typings.std.URLSearchParams = js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def createImpl(
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): typings.whatwgUrl.urlsearchparamsImplMod.implementation = js.native
    def install(globalObject: js.Object): Unit = js.native
    def is(obj: js.Any): /* is std.URLSearchParams */ Boolean = js.native
    def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = js.native
    def setup[T /* <: typings.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
    ): T = js.native
    def setup[T /* <: typings.std.URLSearchParams */](
      obj: T,
      globalObject: js.Object,
      hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
      privateData: DoNotStripQMark
    ): T = js.native
  }
  
}

