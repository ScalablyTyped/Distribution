package typings.whatwgUrl

import typings.std.URL
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.urlImplMod.implementation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whatwg-url/lib/URL", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  
  def convert(obj: js.Any): implementation = js.native
  def convert(obj: js.Any, options: Options): implementation = js.native
  
  def create(globalObject: js.Object): URL = js.native
  def create(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): URL = js.native
  def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): URL = js.native
  def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): URL = js.native
  
  def createImpl(globalObject: js.Object): implementation = js.native
  def createImpl(globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): implementation = js.native
  def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = js.native
  def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = js.native
  
  def install(globalObject: js.Object): Unit = js.native
  
  def is(obj: js.Any): /* is std.URL */ Boolean = js.native
  
  def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = js.native
  
  def setup[T /* <: URL */](obj: T, globalObject: js.Object): T = js.native
  def setup[T /* <: URL */](obj: T, globalObject: js.Object, hasUrlBase: js.UndefOr[scala.Nothing], privateData: js.Object): T = js.native
  def setup[T /* <: URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = js.native
  def setup[T /* <: URL */](
    obj: T,
    globalObject: js.Object,
    hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
    privateData: js.Object
  ): T = js.native
}
