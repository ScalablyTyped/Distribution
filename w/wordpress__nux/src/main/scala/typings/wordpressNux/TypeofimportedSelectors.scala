package typings.wordpressNux

import typings.wordpressNux.selectorsMod.GuideInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedSelectors extends js.Object {
  def areTipsEnabled(): Boolean
  def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo]
  def isTipVisible(tipId: String): Boolean
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(
    areTipsEnabled: () => Boolean,
    getAssociatedGuide: String => js.UndefOr[GuideInfo],
    isTipVisible: String => Boolean
  ): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal(areTipsEnabled = js.Any.fromFunction0(areTipsEnabled), getAssociatedGuide = js.Any.fromFunction1(getAssociatedGuide), isTipVisible = js.Any.fromFunction1(isTipVisible))
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
}

