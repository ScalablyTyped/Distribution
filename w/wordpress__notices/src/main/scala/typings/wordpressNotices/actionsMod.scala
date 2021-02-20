package typings.wordpressNotices

import typings.wordpressNotices.anon.PartialOptions
import typings.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/notices/store/actions", "createErrorNotice")
  @js.native
  def createErrorNotice(content: String): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "createErrorNotice")
  @js.native
  def createErrorNotice(content: String, options: PartialOptions): Unit = js.native
  
  @JSImport("@wordpress/notices/store/actions", "createInfoNotice")
  @js.native
  def createInfoNotice(content: String): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "createInfoNotice")
  @js.native
  def createInfoNotice(content: String, options: PartialOptions): Unit = js.native
  
  @JSImport("@wordpress/notices/store/actions", "createNotice")
  @js.native
  def createNotice(status: js.UndefOr[scala.Nothing], content: String): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "createNotice")
  @js.native
  def createNotice(status: js.UndefOr[scala.Nothing], content: String, options: PartialOptions): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "createNotice")
  @js.native
  def createNotice(status: Status, content: String): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "createNotice")
  @js.native
  def createNotice(status: Status, content: String, options: PartialOptions): Unit = js.native
  
  @JSImport("@wordpress/notices/store/actions", "createSuccessNotice")
  @js.native
  def createSuccessNotice(content: String): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "createSuccessNotice")
  @js.native
  def createSuccessNotice(content: String, options: PartialOptions): Unit = js.native
  
  @JSImport("@wordpress/notices/store/actions", "createWarningNotice")
  @js.native
  def createWarningNotice(content: String): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "createWarningNotice")
  @js.native
  def createWarningNotice(content: String, options: PartialOptions): Unit = js.native
  
  @JSImport("@wordpress/notices/store/actions", "removeNotice")
  @js.native
  def removeNotice(id: String): Unit = js.native
  @JSImport("@wordpress/notices/store/actions", "removeNotice")
  @js.native
  def removeNotice(id: String, context: String): Unit = js.native
}
