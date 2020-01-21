package typings.wordpressNotices

import typings.std.Partial
import typings.wordpressNotices.mod.Options
import typings.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedActions extends js.Object {
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

