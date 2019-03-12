package typings
package useragentLib.useragentMod.UseragentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var family: java.lang.String
  var major: java.lang.String
  var minor: java.lang.String
  var patch: java.lang.String
  /**
    * Outputs a JSON string of the Device, values are defaulted to undefined so they are not outputed in the stringify.
    */
  def toJSON(): useragentLib.Anon_Family
  /**
    * Generates the version of the Device.
    */
  def toVersion(): java.lang.String
}

object Device {
  @scala.inline
  def apply(
    family: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    patch: java.lang.String,
    toJSON: () => useragentLib.Anon_Family,
    toString: () => java.lang.String,
    toVersion: () => java.lang.String
  ): Device = {
    val __obj = js.Dynamic.literal(family = family, major = major, minor = minor, patch = patch, toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString), toVersion = js.Any.fromFunction0(toVersion))
  
    __obj.asInstanceOf[Device]
  }
}

