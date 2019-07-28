package typings.useragent.useragentMod

import typings.useragent.Anon_Family
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "Device")
@js.native
/**
  * The representation of a parsed Device.
  * @param family The name of the device
  * @param major Major version of the device
  * @param minor Minor version of the device
  * @param patch Patch version of the device
  */
class Device () extends js.Object {
  def this(family: String) = this()
  def this(family: String, major: String) = this()
  def this(family: String, major: String, minor: String) = this()
  def this(family: String, major: String, minor: String, patch: String) = this()
  var family: String = js.native
  var major: String = js.native
  var minor: String = js.native
  var patch: String = js.native
  /**
    * Outputs a JSON string of the Device, values are defaulted to undefined so they are not outputed in the stringify.
    */
  def toJSON(): Anon_Family = js.native
  /**
    * Generates the version of the Device.
    */
  def toVersion(): String = js.native
}

