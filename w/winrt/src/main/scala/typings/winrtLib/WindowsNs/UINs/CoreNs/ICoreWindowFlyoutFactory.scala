package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowFlyoutFactory extends js.Object {
  def create(position: winrtLib.WindowsNs.FoundationNs.Point): CoreWindowFlyout
  def createWithTitle(position: winrtLib.WindowsNs.FoundationNs.Point, title: java.lang.String): CoreWindowFlyout
}

object ICoreWindowFlyoutFactory {
  @scala.inline
  def apply(
    create: winrtLib.WindowsNs.FoundationNs.Point => CoreWindowFlyout,
    createWithTitle: (winrtLib.WindowsNs.FoundationNs.Point, java.lang.String) => CoreWindowFlyout
  ): ICoreWindowFlyoutFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
  
    __obj.asInstanceOf[ICoreWindowFlyoutFactory]
  }
}

