package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides depth frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource")
@js.native
abstract class PerceptionDepthFrameSource ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource
object PerceptionDepthFrameSource {
  
  /**
    * Creates a new depth frame source watcher.
    * @return A new depth frame source watcher.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource.createWatcher")
  @js.native
  def createWatcher(): typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher = js.native
  
  /**
    * Finds all depth frame sources.
    * @return When the method completes, it asynchronously returns a list of depth frame sources.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource.findAllAsync")
  @js.native
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Finds an depth frame source by looking up its unique ID.
    * @param id The unique ID of the depth frame source.
    * @return When this method completes, it asynchronously returns a depth frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource.fromIdAsync")
  @js.native
  def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource] = js.native
  
  /**
    * Requests access to use depth frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource.requestAccessAsync")
  @js.native
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus] = js.native
}
