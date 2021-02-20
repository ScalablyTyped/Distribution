package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.std.URLSearchParams
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.anon.DoNotStripQMark
import typings.whatwgUrl.urlsearchparamsImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlsearchparamsMod {
  
  @JSImport("whatwg-url/lib/URLSearchParams", "convert")
  @js.native
  def convert(obj: js.Any): implementation = js.native
  @JSImport("whatwg-url/lib/URLSearchParams", "convert")
  @js.native
  def convert(obj: js.Any, options: Options): implementation = js.native
  
  @JSImport("whatwg-url/lib/URLSearchParams", "create")
  @js.native
  def create(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
  ): URLSearchParams = js.native
  @JSImport("whatwg-url/lib/URLSearchParams", "create")
  @js.native
  def create(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
    privateData: DoNotStripQMark
  ): URLSearchParams = js.native
  
  @JSImport("whatwg-url/lib/URLSearchParams", "createImpl")
  @js.native
  def createImpl(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
  ): implementation = js.native
  @JSImport("whatwg-url/lib/URLSearchParams", "createImpl")
  @js.native
  def createImpl(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
    privateData: DoNotStripQMark
  ): implementation = js.native
  
  @JSImport("whatwg-url/lib/URLSearchParams", "install")
  @js.native
  def install(globalObject: js.Object): Unit = js.native
  
  @JSImport("whatwg-url/lib/URLSearchParams", "is")
  @js.native
  def is(obj: js.Any): /* is std.URLSearchParams */ Boolean = js.native
  
  @JSImport("whatwg-url/lib/URLSearchParams", "isImpl")
  @js.native
  def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = js.native
  
  @JSImport("whatwg-url/lib/URLSearchParams", "setup")
  @js.native
  def setup[T /* <: URLSearchParams */](
    obj: T,
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
  ): T = js.native
  @JSImport("whatwg-url/lib/URLSearchParams", "setup")
  @js.native
  def setup[T /* <: URLSearchParams */](
    obj: T,
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
    privateData: DoNotStripQMark
  ): T = js.native
}
