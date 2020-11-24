package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides infrared frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSource")
@js.native
abstract class PerceptionInfraredFrameSource ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSource
/* static members */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSource")
@js.native
object PerceptionInfraredFrameSource extends js.Object {
  
  /**
    * Creates a new infrared frame source watcher.
    * @return A new infrared frame source watcher.
    */
  def createWatcher(): typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSourceWatcher = js.native
  
  /**
    * Finds all infrared frame sources.
    * @return When the method completes, it asynchronously returns a list of infrared frame sources.
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Finds an infrared frame source by looking up its unique ID.
    * @param id The unique ID of the infrared frame source.
    * @return When the method completes, it asynchronously returns an infrared frame source if one exists with the specified ID. Otherwise, this method asynchronously returns nullptr.
    */
  def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSource] = js.native
  
  /**
    * Requests access to use infrared frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus] = js.native
}
