package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowFlyoutFactory extends js.Object {
  def create(position: Point): CoreWindowFlyout
  def createWithTitle(position: Point, title: String): CoreWindowFlyout
}

object ICoreWindowFlyoutFactory {
  @scala.inline
  def apply(create: Point => CoreWindowFlyout, createWithTitle: (Point, String) => CoreWindowFlyout): ICoreWindowFlyoutFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
    __obj.asInstanceOf[ICoreWindowFlyoutFactory]
  }
}

