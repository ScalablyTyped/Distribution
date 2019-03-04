package typings
package useragentLib.useragentMod.UseragentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystem extends js.Object {
  var family: java.lang.String
  var major: java.lang.String
  var minor: java.lang.String
  var patch: java.lang.String
  /**
    * Outputs a JSON string of the OS, values are defaulted to undefined so they are not outputed in the stringify.
    */
  def toJSON(): useragentLib.Anon_Family
  /**
    * Generates the version of the Operating System.
    */
  def toVersion(): java.lang.String
}

object OperatingSystem {
  @scala.inline
  def apply(
    family: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    patch: java.lang.String,
    toJSON: js.Function0[useragentLib.Anon_Family],
    toString: js.Function0[java.lang.String],
    toVersion: js.Function0[java.lang.String]
  ): OperatingSystem = {
    val __obj = js.Dynamic.literal(family = family, major = major, minor = minor, patch = patch, toJSON = toJSON, toString = toString, toVersion = toVersion)
  
    __obj.asInstanceOf[OperatingSystem]
  }
}

