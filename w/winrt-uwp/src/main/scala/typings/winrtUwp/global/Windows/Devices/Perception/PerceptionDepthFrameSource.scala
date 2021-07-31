package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides depth frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource")
@js.native
abstract class PerceptionDepthFrameSource ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource
object PerceptionDepthFrameSource {
  
  @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new depth frame source watcher.
    * @return A new depth frame source watcher.
    */
  /* static member */
  @scala.inline
  def createWatcher(): typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher]
  
  /**
    * Finds all depth frame sources.
    * @return When the method completes, it asynchronously returns a list of depth frame sources.
    */
  /* static member */
  @scala.inline
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
  
  /**
    * Finds an depth frame source by looking up its unique ID.
    * @param id The unique ID of the depth frame source.
    * @return When this method completes, it asynchronously returns a depth frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
    */
  /* static member */
  @scala.inline
  def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(id.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource]]
  
  /**
    * Requests access to use depth frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  /* static member */
  @scala.inline
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus]]
}
