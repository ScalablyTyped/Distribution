package typings
package useragentLib.useragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "Agent")
@js.native
/**
  * The representation of a parsed user agent.
  * @param family The name of the browser
  * @param major Major version of the browser
  * @param minor Minor version of the browser
  * @param patch Patch version of the browser
  * @param source The actual user agent string
  */
class Agent () extends js.Object {
  def this(family: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String, patch: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String, patch: java.lang.String, source: java.lang.String) = this()
  var device: Device = js.native
  var family: java.lang.String = js.native
  var major: java.lang.String = js.native
  var minor: java.lang.String = js.native
  var os: OperatingSystem = js.native
  var patch: java.lang.String = js.native
  var source: java.lang.String = js.native
  /**
    * Generates a string output of the parsed user agent.
    */
  def toAgent(): java.lang.String = js.native
  /**
    * The representation of a parsed Operating System.
    */
  def toJSON(): useragentLib.Anon_Device = js.native
  /**
    * Outputs a compiled veersion number of the user agent.
    */
  def toVersion(): java.lang.String = js.native
}

