package typings.three

import typings.three.loaderMod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingManagerMod {
  
  @JSImport("three/src/loaders/LoadingManager", "DefaultLoadingManager")
  @js.native
  val DefaultLoadingManager: LoadingManager = js.native
  
  @JSImport("three/src/loaders/LoadingManager", "LoadingManager")
  @js.native
  open class LoadingManager () extends StObject {
    def this(onLoad: js.Function0[Unit]) = this()
    def this(
      onLoad: js.Function0[Unit],
      onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
    ) = this()
    def this(
      onLoad: Unit,
      onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
    ) = this()
    def this(
      onLoad: js.Function0[Unit],
      onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
      onError: js.Function1[/* url */ String, Unit]
    ) = this()
    def this(onLoad: js.Function0[Unit], onProgress: Unit, onError: js.Function1[/* url */ String, Unit]) = this()
    def this(
      onLoad: Unit,
      onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
      onError: js.Function1[/* url */ String, Unit]
    ) = this()
    def this(onLoad: Unit, onProgress: Unit, onError: js.Function1[/* url */ String, Unit]) = this()
    
    // handlers
    def addHandler(regex: js.RegExp, loader: Loader): this.type = js.native
    
    def getHandler(file: String): Loader | Null = js.native
    
    def itemEnd(url: String): Unit = js.native
    
    def itemError(url: String): Unit = js.native
    
    def itemStart(url: String): Unit = js.native
    
    /**
      * Will be called when item loading fails.
      * The default is a function with empty body.
      * @param url The url of the item that errored.
      */
    def onError(url: String): Unit = js.native
    
    /**
      * Will be called when all items finish loading.
      * The default is a function with empty body.
      */
    def onLoad(): Unit = js.native
    
    /**
      * Will be called for each loaded item.
      * The default is a function with empty body.
      * @param url The url of the item just loaded.
      * @param loaded The number of items already loaded so far.
      * @param total The total amount of items to be loaded.
      */
    def onProgress(url: String, loaded: Double, total: Double): Unit = js.native
    
    /**
      * Will be called when loading of an item starts.
      * @param url The url of the item that started loading.
      * @param loaded The number of items already loaded so far.
      * @param total The total amount of items to be loaded.
      */
    var onStart: js.UndefOr[js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]] = js.native
    
    def removeHandler(regex: js.RegExp): this.type = js.native
    
    /**
      * Given a URL, uses the URL modifier callback (if any) and returns a resolved URL.
      * If no URL modifier is set, returns the original URL.
      * @param url the url to load
      */
    def resolveURL(url: String): String = js.native
    
    /**
      * If provided, the callback will be passed each resource URL before a request is sent.
      * The callback may return the original URL, or a new URL to override loading behavior.
      * This behavior can be used to load assets from .ZIP files, drag-and-drop APIs, and Data URIs.
      * @param callback URL modifier callback. Called with url argument, and must return resolvedURL.
      */
    def setURLModifier(): this.type = js.native
    def setURLModifier(callback: js.Function1[/* url */ String, String]): this.type = js.native
  }
}
