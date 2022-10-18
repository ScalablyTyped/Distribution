package typings.wordpressNotices

import typings.wordpressNotices.anon.PartialOptions
import typings.wordpressNotices.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeActionsMod {
  
  @JSImport("@wordpress/notices/store/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createErrorNotice(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createErrorNotice")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createErrorNotice(content: String, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createErrorNotice")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createInfoNotice(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createInfoNotice")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createInfoNotice(content: String, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInfoNotice")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createNotice(status: Unit, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotice")(status.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createNotice(status: Unit, content: String, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotice")(status.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createNotice(status: Status, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotice")(status.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createNotice(status: Status, content: String, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotice")(status.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createSuccessNotice(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createSuccessNotice")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createSuccessNotice(content: String, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSuccessNotice")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createWarningNotice(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createWarningNotice")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createWarningNotice(content: String, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createWarningNotice")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeNotice(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNotice")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeNotice(id: String, context: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNotice")(id.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
