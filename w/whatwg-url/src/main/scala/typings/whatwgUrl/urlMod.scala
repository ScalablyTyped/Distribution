package typings.whatwgUrl

import org.scalablytyped.runtime.Instantiable2
import typings.whatwgUrl.anon.Context
import typings.whatwgUrl.mod.URL
import typings.whatwgUrl.urlImplMod.implementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("whatwg-url/lib/URL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(globalObject: js.Object, obj: Any): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[implementation]
  inline def convert(globalObject: js.Object, obj: Any, hasContext: Context): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(globalObject.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], hasContext.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def create(
    globalObject: js.Object,
    constructorArgs: js.Tuple2[/* url */ String, /* base */ js.UndefOr[String]]
  ): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[URL]
  
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
    newTarget: Instantiable2[/* url */ String, /* base */ js.UndefOr[String], URL]
  ): implementation = (^.asInstanceOf[js.Dynamic].applyDynamic("new")(globalObject.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[implementation]
  
  inline def setup[T /* <: URL */](
    obj: T,
    globalObject: js.Object,
    constructorArgs: js.Tuple2[/* url */ String, /* base */ js.UndefOr[String]]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(obj.asInstanceOf[js.Any], globalObject.asInstanceOf[js.Any], constructorArgs.asInstanceOf[js.Any])).asInstanceOf[T]
}
