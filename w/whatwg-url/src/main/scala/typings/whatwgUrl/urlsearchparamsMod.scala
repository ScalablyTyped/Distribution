package typings.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typings.std.URLSearchParams
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.anon.DoNotStripQMark
import typings.whatwgUrl.urlsearchparamsImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlsearchparamsMod {
  
  @JSImport("whatwg-url/lib/URLSearchParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convert(obj: js.Any): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any]).asInstanceOf[implementation]
  @scala.inline
  def convert(obj: js.Any, options: Options): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  @scala.inline
  def create(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
  ): URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any])).asInstanceOf[URLSearchParams]
  @scala.inline
  def create(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
    privateData: DoNotStripQMark
  ): URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[URLSearchParams]
  
  @scala.inline
  def createImpl(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any])).asInstanceOf[implementation]
  @scala.inline
  def createImpl(
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
    privateData: DoNotStripQMark
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  @scala.inline
  def install(globalObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def is(obj: js.Any): /* is std.URLSearchParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.URLSearchParams */ Boolean]
  
  @scala.inline
  def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url/lib/URLSearchParams-impl.implementation */ Boolean]
  
  @scala.inline
  def setup[T /* <: URLSearchParams */](
    obj: T,
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def setup[T /* <: URLSearchParams */](
    obj: T,
    globalObject: js.Object,
    hasInit: js.Array[(js.Array[js.Tuple2[String, String]]) | StringDictionary[String] | String],
    privateData: DoNotStripQMark
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasInit.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
}
