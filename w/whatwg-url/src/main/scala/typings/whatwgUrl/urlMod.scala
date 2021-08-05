package typings.whatwgUrl

import typings.std.URL
import typings.webidlConversions.mod.Options
import typings.whatwgUrl.urlImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("whatwg-url/lib/URL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(obj: js.Any): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def convert(obj: js.Any, options: Options): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def create(globalObject: js.Object): URL = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any]).asInstanceOf[URL]
  inline def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def create(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def create(globalObject: js.Object, hasUrlBase: Unit, privateData: js.Object): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[URL]
  
  inline def createImpl(globalObject: js.Object): implementation = ^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any]).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def createImpl(globalObject: js.Object, hasUrlBase: Unit, privateData: js.Object): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("createImpl")(globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def install(globalObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(globalObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def is(obj: js.Any): /* is std.URL */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.URL */ Boolean]
  
  inline def isImpl(obj: js.Any): /* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImpl")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is whatwg-url.whatwg-url/lib/URL-impl.implementation */ Boolean]
  
  inline def setup[T /* <: URL */](obj: T, globalObject: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: URL */](obj: T, globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: URL */](
    obj: T,
    globalObject: js.Object,
    hasUrlBase: js.Tuple2[String, js.UndefOr[String]],
    privateData: js.Object
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def setup[T /* <: URL */](obj: T, globalObject: js.Object, hasUrlBase: Unit, privateData: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], hasUrlBase.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[T]
}
