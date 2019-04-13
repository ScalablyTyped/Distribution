package typings
package useragentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Device extends js.Object {
  var device: java.lang.String
  var family: java.lang.String
  var major: java.lang.String
  var minor: java.lang.String
  var os: java.lang.String
  var patch: java.lang.String
}

object Anon_Device {
  @scala.inline
  def apply(
    device: java.lang.String,
    family: java.lang.String,
    major: java.lang.String,
    minor: java.lang.String,
    os: java.lang.String,
    patch: java.lang.String
  ): Anon_Device = {
    val __obj = js.Dynamic.literal(device = device, family = family, major = major, minor = minor, os = os, patch = patch)
  
    __obj.asInstanceOf[Anon_Device]
  }
}

