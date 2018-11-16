package typings
package webdriverDashManagerLib.builtLibCliOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/cli/options", "Option")
@js.native
class Option protected () extends js.Object {
  def this(opt: java.lang.String, description: java.lang.String, `type`: java.lang.String) = this()
  def this(opt: java.lang.String, description: java.lang.String, `type`: java.lang.String, defaultValue: java.lang.String) = this()
  def this(opt: java.lang.String, description: java.lang.String, `type`: java.lang.String, defaultValue: scala.Boolean) = this()
  def this(opt: java.lang.String, description: java.lang.String, `type`: java.lang.String, defaultValue: scala.Double) = this()
  var defaultValue: scala.Double | java.lang.String | scala.Boolean = js.native
  var description: java.lang.String = js.native
  var opt: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var value: scala.Double | java.lang.String | scala.Boolean = js.native
  def getBoolean(): scala.Boolean = js.native
  def getNumber(): scala.Double = js.native
  def getString(): java.lang.String = js.native
  def `getValue_`(): scala.Double | java.lang.String | scala.Boolean = js.native
}

