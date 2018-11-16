package typings
package useragentLib.useragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "Device")
@js.native
class Device ()
  extends useragentLib.useragentMod.UseragentNs.Device {
  /**
           * The representation of a parsed Device.
           * @param family The name of the device
           * @param major Major version of the device
           * @param minor Minor version of the device
           * @param patch Patch version of the device
           */
  def this(family: java.lang.String) = this()
  /**
           * The representation of a parsed Device.
           * @param family The name of the device
           * @param major Major version of the device
           * @param minor Minor version of the device
           * @param patch Patch version of the device
           */
  def this(family: java.lang.String, major: java.lang.String) = this()
  /**
           * The representation of a parsed Device.
           * @param family The name of the device
           * @param major Major version of the device
           * @param minor Minor version of the device
           * @param patch Patch version of the device
           */
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String) = this()
  /**
           * The representation of a parsed Device.
           * @param family The name of the device
           * @param major Major version of the device
           * @param minor Minor version of the device
           * @param patch Patch version of the device
           */
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String, patch: java.lang.String) = this()
  /* CompleteClass */
  override var family: java.lang.String = js.native
  /* CompleteClass */
  override var major: java.lang.String = js.native
  /* CompleteClass */
  override var minor: java.lang.String = js.native
  /* CompleteClass */
  override var patch: java.lang.String = js.native
  /**
           * Outputs a JSON string of the Device, values are defaulted to undefined so they are not outputed in the stringify.
           */
  /* CompleteClass */
  override def toJSON(): useragentLib.Anon_Minor = js.native
  /**
           * Generates the version of the Device.
           */
  /* CompleteClass */
  override def toVersion(): java.lang.String = js.native
}

