package typings
package atWordpressNoticesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/notices/store/actions", JSImport.Namespace)
@js.native
object storeActionsMod extends js.Object {
  def createErrorNotice(content: java.lang.String): scala.Unit = js.native
  def createErrorNotice(
    content: java.lang.String,
    options: stdLib.Partial[atWordpressNoticesLib.atWordpressNoticesMod.Options]
  ): scala.Unit = js.native
  def createInfoNotice(content: java.lang.String): scala.Unit = js.native
  def createInfoNotice(
    content: java.lang.String,
    options: stdLib.Partial[atWordpressNoticesLib.atWordpressNoticesMod.Options]
  ): scala.Unit = js.native
  def createNotice(status: js.UndefOr[scala.Nothing], content: java.lang.String): scala.Unit = js.native
  def createNotice(
    status: js.UndefOr[scala.Nothing],
    content: java.lang.String,
    options: stdLib.Partial[atWordpressNoticesLib.atWordpressNoticesMod.Options]
  ): scala.Unit = js.native
  def createNotice(status: atWordpressNoticesLib.atWordpressNoticesMod.Status, content: java.lang.String): scala.Unit = js.native
  def createNotice(
    status: atWordpressNoticesLib.atWordpressNoticesMod.Status,
    content: java.lang.String,
    options: stdLib.Partial[atWordpressNoticesLib.atWordpressNoticesMod.Options]
  ): scala.Unit = js.native
  def createSuccessNotice(content: java.lang.String): scala.Unit = js.native
  def createSuccessNotice(
    content: java.lang.String,
    options: stdLib.Partial[atWordpressNoticesLib.atWordpressNoticesMod.Options]
  ): scala.Unit = js.native
  def createWarningNotice(content: java.lang.String): scala.Unit = js.native
  def createWarningNotice(
    content: java.lang.String,
    options: stdLib.Partial[atWordpressNoticesLib.atWordpressNoticesMod.Options]
  ): scala.Unit = js.native
  def removeNotice(id: java.lang.String): scala.Unit = js.native
  def removeNotice(id: java.lang.String, context: java.lang.String): scala.Unit = js.native
}

