package typings
package useragentLib.useragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "Agent")
@js.native
class Agent ()
  extends useragentLib.useragentMod.UseragentNs.Agent {
  /**
           * The representation of a parsed user agent.
           * @param family The name of the browser
           * @param major Major version of the browser
           * @param minor Minor version of the browser
           * @param patch Patch version of the browser
           * @param source The actual user agent string
           */
  def this(family: java.lang.String) = this()
  /**
           * The representation of a parsed user agent.
           * @param family The name of the browser
           * @param major Major version of the browser
           * @param minor Minor version of the browser
           * @param patch Patch version of the browser
           * @param source The actual user agent string
           */
  def this(family: java.lang.String, major: java.lang.String) = this()
  /**
           * The representation of a parsed user agent.
           * @param family The name of the browser
           * @param major Major version of the browser
           * @param minor Minor version of the browser
           * @param patch Patch version of the browser
           * @param source The actual user agent string
           */
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String) = this()
  /**
           * The representation of a parsed user agent.
           * @param family The name of the browser
           * @param major Major version of the browser
           * @param minor Minor version of the browser
           * @param patch Patch version of the browser
           * @param source The actual user agent string
           */
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String, patch: java.lang.String) = this()
  /**
           * The representation of a parsed user agent.
           * @param family The name of the browser
           * @param major Major version of the browser
           * @param minor Minor version of the browser
           * @param patch Patch version of the browser
           * @param source The actual user agent string
           */
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String, patch: java.lang.String, source: java.lang.String) = this()
  /* CompleteClass */
  override var device: useragentLib.useragentMod.UseragentNs.Device = js.native
  /* CompleteClass */
  override var family: java.lang.String = js.native
  /* CompleteClass */
  override var major: java.lang.String = js.native
  /* CompleteClass */
  override var minor: java.lang.String = js.native
  /* CompleteClass */
  override var os: useragentLib.useragentMod.UseragentNs.OperatingSystem = js.native
  /* CompleteClass */
  override var patch: java.lang.String = js.native
  /* CompleteClass */
  override var source: java.lang.String = js.native
  /**
           * Generates a string output of the parsed user agent.
           */
  /* CompleteClass */
  override def toAgent(): java.lang.String = js.native
  /**
           * The representation of a parsed Operating System.
           */
  /* CompleteClass */
  override def toJSON(): useragentLib.Anon_OsPatch = js.native
  /**
           * Outputs a compiled veersion number of the user agent.
           */
  /* CompleteClass */
  override def toVersion(): java.lang.String = js.native
}

