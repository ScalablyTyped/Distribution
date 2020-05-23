package typings.wordpressComponents.withNoticesMod

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressComponents.wordpressComponentsStrings.noticeList
import typings.wordpressComponents.wordpressComponentsStrings.noticeOperations
import typings.wordpressComponents.wordpressComponentsStrings.noticeUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/higher-order/with-notices", JSImport.Default)
@js.native
object default extends js.Object {
  // prettier-ignore
  def apply[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, noticeList | noticeOperations | noticeUI]] = js.native
}

