package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides color frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource")
@js.native
abstract class PerceptionColorFrameSource ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSource
/* static members */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource")
@js.native
object PerceptionColorFrameSource extends js.Object {
  
  /**
    * Creates a new color frame source watcher.
    * @return A new color frame source watcher.
    */
  def createWatcher(): typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSourceWatcher = js.native
  
  /**
    * Finds all color frame sources.
    * @return When the method completes, it asynchronously returns a list of color frame sources.
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Finds an color frame source by looking up its unique ID.
    * @param id The unique ID of the color frame source.
    * @return When this method completes, it asynchronously returns a color frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
    */
  def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameSource] = js.native
  
  /**
    * Requests access to use color frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus] = js.native
}
