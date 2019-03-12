package typings
package useragentLib.useragentMod.UseragentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agent extends js.Object {
  var device: Device
  var family: java.lang.String
  var major: java.lang.String
  var minor: java.lang.String
  var os: OperatingSystem
  var patch: java.lang.String
  var source: java.lang.String
  /**
    * Generates a string output of the parsed user agent.
    */
  def toAgent(): java.lang.String
  /**
    * The representation of a parsed Operating System.
    */
  def toJSON(): useragentLib.Anon_DeviceFamily
  /**
    * Outputs a compiled veersion number of the user agent.
    */
  def toVersion(): java.lang.String
}

object Agent {
  @scala.inline
  def apply(
    device: Device,
    family: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    os: OperatingSystem,
    patch: java.lang.String,
    source: java.lang.String,
    toAgent: () => java.lang.String,
    toJSON: () => useragentLib.Anon_DeviceFamily,
    toString: () => java.lang.String,
    toVersion: () => java.lang.String
  ): Agent = {
    val __obj = js.Dynamic.literal(device = device, family = family, major = major, minor = minor, os = os, patch = patch, source = source, toAgent = js.Any.fromFunction0(toAgent), toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString), toVersion = js.Any.fromFunction0(toVersion))
  
    __obj.asInstanceOf[Agent]
  }
}

