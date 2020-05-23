package typings.wordpressNotices.anon

import typings.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedActions extends js.Object {
  def createErrorNotice(content: String): Unit = js.native
  def createErrorNotice(content: String, options: PartialOptions): Unit = js.native
  def createInfoNotice(content: String): Unit = js.native
  def createInfoNotice(content: String, options: PartialOptions): Unit = js.native
  def createNotice(status: js.UndefOr[Status], content: String): Unit = js.native
  def createNotice(status: js.UndefOr[Status], content: String, options: PartialOptions): Unit = js.native
  def createSuccessNotice(content: String): Unit = js.native
  def createSuccessNotice(content: String, options: PartialOptions): Unit = js.native
  def createWarningNotice(content: String): Unit = js.native
  def createWarningNotice(content: String, options: PartialOptions): Unit = js.native
  def removeNotice(id: String): Unit = js.native
  def removeNotice(id: String, context: String): Unit = js.native
}

