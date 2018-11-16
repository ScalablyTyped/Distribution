package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFrameworkView extends js.Object {
  def initialize(applicationView: CoreApplicationView): scala.Unit
  def load(entryPoint: java.lang.String): scala.Unit
  def run(): scala.Unit
  def setWindow(window: winrtLib.WindowsNs.UINs.CoreNs.CoreWindow): scala.Unit
  def uninitialize(): scala.Unit
}

