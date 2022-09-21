package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.MimeType
import typings.std.ProgressEvent
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileLoaderMod {
  
  @JSImport("three/src/loaders/FileLoader", "FileLoader")
  @js.native
  open class FileLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String): Any = js.native
    def load(url: String, onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit]): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* response */ String | js.typedarray.ArrayBuffer, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ ErrorEvent, Unit]): Any = js.native
    
    var mimeType: js.UndefOr[MimeType] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    def setMimeType(mimeType: MimeType): FileLoader = js.native
    
    def setResponseType(responseType: String): FileLoader = js.native
  }
}
