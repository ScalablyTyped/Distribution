package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides color frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource")
@js.native
abstract class PerceptionColorFrameSource ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSource
object PerceptionColorFrameSource {
  
  @JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new color frame source watcher.
    * @return A new color frame source watcher.
    */
  /* static member */
  inline def createWatcher(): typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSourceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSourceWatcher]
  
  /**
    * Finds all color frame sources.
    * @return When the method completes, it asynchronously returns a list of color frame sources.
    */
  /* static member */
  inline def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  
  /**
    * Finds an color frame source by looking up its unique ID.
    * @param id The unique ID of the color frame source.
    * @return When this method completes, it asynchronously returns a color frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
    */
  /* static member */
  inline def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(id.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSource]]
  
  /**
    * Requests access to use color frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  /* static member */
  inline def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus]]
}
