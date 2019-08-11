package typings.atWordpressNux

import typings.atWordpressNux.storeSelectorsMod.GuideInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofimported_selectors extends js.Object {
  def areTipsEnabled(): Boolean
  def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo]
  def isTipVisible(tipId: String): Boolean
}

object Typeofimported_selectors {
  @scala.inline
  def apply(
    areTipsEnabled: () => Boolean,
    getAssociatedGuide: String => js.UndefOr[GuideInfo],
    isTipVisible: String => Boolean
  ): Typeofimported_selectors = {
    val __obj = js.Dynamic.literal(areTipsEnabled = js.Any.fromFunction0(areTipsEnabled), getAssociatedGuide = js.Any.fromFunction1(getAssociatedGuide), isTipVisible = js.Any.fromFunction1(isTipVisible))
  
    __obj.asInstanceOf[Typeofimported_selectors]
  }
}

