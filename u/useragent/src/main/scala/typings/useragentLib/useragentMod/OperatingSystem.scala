package typings
package useragentLib.useragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "OperatingSystem")
@js.native
/**
  * The representation of a parsed Operating System.
  * @param family The name of the os
  * @param major Major version of the os
  * @param minor Minor version of the os
  * @param patch Patch version of the os
  */
class OperatingSystem ()
  extends useragentLib.useragentMod.UseragentNs.OperatingSystem {
  def this(family: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String) = this()
  def this(family: java.lang.String, major: java.lang.String, minor: java.lang.String) = this()
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
    * Outputs a JSON string of the OS, values are defaulted to undefined so they are not outputed in the stringify.
    */
  /* CompleteClass */
  override def toJSON(): useragentLib.Anon_Minor = js.native
  /**
    * Generates the version of the Operating System.
    */
  /* CompleteClass */
  override def toVersion(): java.lang.String = js.native
}

