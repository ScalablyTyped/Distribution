package typings.useragent.mod

import typings.useragent.AnonDevice
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
  def this(family: String) = this()
  def this(family: String, major: String) = this()
  def this(family: String, major: String, minor: String) = this()
  def this(family: String, major: String, minor: String, patch: String) = this()
  def this(family: String, major: String, minor: String, patch: String, source: String) = this()
  var device: Device = js.native
  var family: String = js.native
  var major: String = js.native
  var minor: String = js.native
  var os: OperatingSystem = js.native
  var patch: String = js.native
  var source: String = js.native
  /**
    * Generates a string output of the parsed user agent.
    */
  def toAgent(): String = js.native
  /**
    * The representation of a parsed Operating System.
    */
  def toJSON(): AnonDevice = js.native
  /**
    * Outputs a compiled veersion number of the user agent.
    */
  def toVersion(): String = js.native
}

