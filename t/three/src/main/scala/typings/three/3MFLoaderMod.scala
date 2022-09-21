package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.threeMod.Group
import typings.three.threeMod.Loader
import typings.three.threeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `3MFLoaderMod` {
  
  @JSImport("three/examples/jsm/loaders/3MFLoader", "ThreeMFLoader")
  @js.native
  open class ThreeMFLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def addExtension(`extension`: js.Object): Unit = js.native
    
    var availableExtensions: js.Array[js.Object] = js.native
    
    def load(url: String, onLoad: js.Function1[/* object */ Group, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Group, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: js.typedarray.ArrayBuffer): Group = js.native
  }
}
