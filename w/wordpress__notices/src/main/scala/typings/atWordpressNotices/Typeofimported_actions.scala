package typings.atWordpressNotices

import typings.atWordpressNotices.atWordpressNoticesMod.Options
import typings.atWordpressNotices.atWordpressNoticesMod.Status
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofimported_actions extends js.Object {
  def createErrorNotice(content: String): Unit = js.native
  def createErrorNotice(content: String, options: Partial[Options]): Unit = js.native
  def createInfoNotice(content: String): Unit = js.native
  def createInfoNotice(content: String, options: Partial[Options]): Unit = js.native
  def createNotice(status: js.UndefOr[scala.Nothing], content: String): Unit = js.native
  def createNotice(status: js.UndefOr[scala.Nothing], content: String, options: Partial[Options]): Unit = js.native
  def createNotice(status: Status, content: String): Unit = js.native
  def createNotice(status: Status, content: String, options: Partial[Options]): Unit = js.native
  def createSuccessNotice(content: String): Unit = js.native
  def createSuccessNotice(content: String, options: Partial[Options]): Unit = js.native
  def createWarningNotice(content: String): Unit = js.native
  def createWarningNotice(content: String, options: Partial[Options]): Unit = js.native
  def removeNotice(id: String): Unit = js.native
  def removeNotice(id: String, context: String): Unit = js.native
}

