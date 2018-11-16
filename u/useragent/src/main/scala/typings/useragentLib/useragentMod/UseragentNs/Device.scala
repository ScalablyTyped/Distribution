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
  def toJSON(): useragentLib.Anon_Minor
  /**
           * Generates the version of the Device.
           */
  def toVersion(): java.lang.String
}

