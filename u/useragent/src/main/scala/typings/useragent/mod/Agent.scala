package typings.useragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("useragent", "Agent")
@js.native
/**
  * The representation of a parsed user agent.
  * @param [family=`Other`] The name of the browser
  * @param [major='0'] Major version of the browser
  * @param [minor='0'] Minor version of the browser
  * @param [patch='0'] Patch version of the browser
  * @param [source] The actual user agent string
  */
class Agent () extends js.Object {
  def this(family: String) = this()
  def this(family: js.UndefOr[scala.Nothing], major: String) = this()
  def this(family: String, major: String) = this()
  def this(family: js.UndefOr[scala.Nothing], major: js.UndefOr[scala.Nothing], minor: String) = this()
  def this(family: js.UndefOr[scala.Nothing], major: String, minor: String) = this()
  def this(family: String, major: js.UndefOr[scala.Nothing], minor: String) = this()
  def this(family: String, major: String, minor: String) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: js.UndefOr[scala.Nothing],
    minor: js.UndefOr[scala.Nothing],
    patch: String
  ) = this()
  def this(family: js.UndefOr[scala.Nothing], major: js.UndefOr[scala.Nothing], minor: String, patch: String) = this()
  def this(family: js.UndefOr[scala.Nothing], major: String, minor: js.UndefOr[scala.Nothing], patch: String) = this()
  def this(family: js.UndefOr[scala.Nothing], major: String, minor: String, patch: String) = this()
  def this(family: String, major: js.UndefOr[scala.Nothing], minor: js.UndefOr[scala.Nothing], patch: String) = this()
  def this(family: String, major: js.UndefOr[scala.Nothing], minor: String, patch: String) = this()
  def this(family: String, major: String, minor: js.UndefOr[scala.Nothing], patch: String) = this()
  def this(family: String, major: String, minor: String, patch: String) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: js.UndefOr[scala.Nothing],
    minor: js.UndefOr[scala.Nothing],
    patch: js.UndefOr[scala.Nothing],
    source: String
  ) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: js.UndefOr[scala.Nothing],
    minor: js.UndefOr[scala.Nothing],
    patch: String,
    source: String
  ) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: js.UndefOr[scala.Nothing],
    minor: String,
    patch: js.UndefOr[scala.Nothing],
    source: String
  ) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: js.UndefOr[scala.Nothing],
    minor: String,
    patch: String,
    source: String
  ) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: String,
    minor: js.UndefOr[scala.Nothing],
    patch: js.UndefOr[scala.Nothing],
    source: String
  ) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: String,
    minor: js.UndefOr[scala.Nothing],
    patch: String,
    source: String
  ) = this()
  def this(
    family: js.UndefOr[scala.Nothing],
    major: String,
    minor: String,
    patch: js.UndefOr[scala.Nothing],
    source: String
  ) = this()
  def this(family: js.UndefOr[scala.Nothing], major: String, minor: String, patch: String, source: String) = this()
  def this(
    family: String,
    major: js.UndefOr[scala.Nothing],
    minor: js.UndefOr[scala.Nothing],
    patch: js.UndefOr[scala.Nothing],
    source: String
  ) = this()
  def this(
    family: String,
    major: js.UndefOr[scala.Nothing],
    minor: js.UndefOr[scala.Nothing],
    patch: String,
    source: String
  ) = this()
  def this(
    family: String,
    major: js.UndefOr[scala.Nothing],
    minor: String,
    patch: js.UndefOr[scala.Nothing],
    source: String
  ) = this()
  def this(family: String, major: js.UndefOr[scala.Nothing], minor: String, patch: String, source: String) = this()
  def this(
    family: String,
    major: String,
    minor: js.UndefOr[scala.Nothing],
    patch: js.UndefOr[scala.Nothing],
    source: String
  ) = this()
  def this(family: String, major: String, minor: js.UndefOr[scala.Nothing], patch: String, source: String) = this()
  def this(family: String, major: String, minor: String, patch: js.UndefOr[scala.Nothing], source: String) = this()
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
  def toJSON(): typings.useragent.anon.Device = js.native
  
  /**
    * Outputs a compiled veersion number of the user agent.
    */
  def toVersion(): String = js.native
}
