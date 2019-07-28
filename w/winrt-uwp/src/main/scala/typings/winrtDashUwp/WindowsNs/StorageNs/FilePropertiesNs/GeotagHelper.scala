package typings.winrtDashUwp.WindowsNs.StorageNs.FilePropertiesNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.Geolocator
import typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.Geopoint
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for setting and retrieving geographic metadata for a file. */
@JSGlobal("Windows.Storage.FileProperties.GeotagHelper")
@js.native
abstract class GeotagHelper () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.FileProperties.GeotagHelper")
@js.native
object GeotagHelper extends js.Object {
  /**
    * Asynchronously retrieves a Geopoint representing the geographic metadata of a file, if present.
    * @param file The file from which the geographic metadata is retrieved.
    * @return An asynchronous operation that returns a Geopoint on successful completion.
    */
  def getGeotagAsync(file: IStorageFile): IPromiseWithIAsyncOperation[Geopoint] = js.native
  /**
    * Asynchronously sets the geographic metadata of a file from the provided Geopoint .
    * @param file The file into which the geographic metadata is set.
    * @param geopoint The Geopoint representing the geographic metadata to be set.
    * @return An asynchronous action.
    */
  def setGeotagAsync(file: IStorageFile, geopoint: Geopoint): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the geographic metadata of a file to the device's current location using the provided Geolocator object.
    * @param file The file into which the geographic metadata is set.
    * @param geolocator The Geolocator object that will be used to determine the device's current location.
    * @return An asychronous action.
    */
  def setGeotagFromGeolocatorAsync(file: IStorageFile, geolocator: Geolocator): IPromiseWithIAsyncAction = js.native
}

