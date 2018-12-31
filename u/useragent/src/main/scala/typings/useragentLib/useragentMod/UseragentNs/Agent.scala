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
  def toJSON(): useragentLib.Anon_OsPatch
  /**
    * Outputs a compiled veersion number of the user agent.
    */
  def toVersion(): java.lang.String
}

