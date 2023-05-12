package typings.three.examplesJsmLoadersIfcloaderMod

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/loaders/IFCLoader", "IFCLoader")
@js.native
open class IFCLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  
  var ifcManager: IFCManager = js.native
  
  def load(url: Any, onLoad: js.Function1[/* ifc */ IFCModel_, Unit]): Unit = js.native
  def load(
    url: Any,
    onLoad: js.Function1[/* ifc */ IFCModel_, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): Unit = js.native
  def load(
    url: Any,
    onLoad: js.Function1[/* ifc */ IFCModel_, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
  def load(
    url: Any,
    onLoad: js.Function1[/* ifc */ IFCModel_, Unit],
    onProgress: Unit,
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
  
  def loadAsync(url: String): js.Promise[IFCModel_] = js.native
  def loadAsync(url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): js.Promise[IFCModel_] = js.native
  
  def parse(buffer: js.typedarray.ArrayBuffer): js.Promise[IFCModel_] = js.native
}
