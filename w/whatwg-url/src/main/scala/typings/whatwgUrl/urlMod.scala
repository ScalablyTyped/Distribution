package typings.whatwgUrl

import typings.std.URL
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.urlImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("whatwg-url/lib/URL", "convert")
  @js.native
  def convert(obj: js.Any): implementation = js.native
  @JSImport("whatwg-url/lib/URL", "convert")
  @js.native
  def convert(obj: js.Any, options: Options): implementation = js.native
  
  @JSImport("whatwg-url/lib/URL", "create")
  @js.native
  def create(globalObject: js.Object): URL = js.native
  @JSImport("whatwg-url/lib/URL", "create")
  @js.native
  def create(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): URL = js.native
  @JSImport("whatwg-url/lib/URL", "create")
  @js.native
  def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): URL = js.native
  @JSImport("whatwg-url/lib/URL", "create")
  @js.native
  def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): URL = js.native
  
  @JSImport("whatwg-url/lib/URL", "createImpl")
  @js.native
  def createImpl(globalObject: js.Object): implementation = js.native
  @JSImport("whatwg-url/lib/URL", "createImpl")
  @js.native
  def createImpl(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): implementation = js.native
  @JSImport("whatwg-url/lib/URL", "createImpl")
  @js.native
  def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = js.native
  @JSImport("whatwg-url/lib/URL", "createImpl")
  @js.native
  def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = js.native
  
  @JSImport("whatwg-url/lib/URL", "install")
  @js.native
  def install(globalObject: js.Object): Unit = js.native
  
  @JSImport("whatwg-url/lib/URL", "is")
  @js.native
  def is(obj: js.Any): /* is std.URL */ Boolean = js.native
  
  @JSImport("whatwg-url/lib/URL", "isImpl")
  @js.native
  def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = js.native
  
  @JSImport("whatwg-url/lib/URL", "setup")
  @js.native
  def setup[T /* <: URL */](obj: T, globalObject: js.Object): T = js.native
  @JSImport("whatwg-url/lib/URL", "setup")
  @js.native
  def setup[T /* <: URL */](obj: T, globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): T = js.native
  @JSImport("whatwg-url/lib/URL", "setup")
  @js.native
  def setup[T /* <: URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = js.native
  @JSImport("whatwg-url/lib/URL", "setup")
  @js.native
  def setup[T /* <: URL */](
    obj: T,
    globalObject: js.Object,
    hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
    privateData: js.Object
  ): T = js.native
}
