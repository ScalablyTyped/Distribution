package typings.winjs.global.WinJS

import typings.std.XMLHttpRequest
import typings.winjs.WinJS.IXHROptions
import typings.winjs.global.WinJS.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//#endregion Objects
//#region Functions
/**
  * You can provide an implementation of this method yourself, or use WinJS.Utilities.startLog to create one that logs to the JavaScript console.
  * @param message The message to log.
  * @param tags The tag or tags to categorize the message (winjs, winjs controls, etc.).
  * @param type The type of message (error, warning, info, etc.).
  **/
inline def log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def log(message: String, tags: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def log(message: String, tags: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def log(message: String, tags: Unit, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def log(message: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def log(message: js.Function0[String], tags: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def log(message: js.Function0[String], tags: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def log(message: js.Function0[String], tags: Unit, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

//#region Properties
/**
  * Can be set to show the results of a validation process.
  **/
inline def validation: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("validation").asInstanceOf[Boolean]
inline def validation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validation")(x.asInstanceOf[js.Any])

/**
  * Wraps calls to XMLHttpRequest in a promise.
  * @param options The options that are applied to the XMLHttpRequest object, as follows: type, url, user, password, responseType, headers, data, customRequestInitializer.
  * @returns A promise that returns the XMLHttpRequest object when it completes.
  **/
inline def xhr(options: IXHROptions): typings.winjs.WinJS.Promise[XMLHttpRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("xhr")(options.asInstanceOf[js.Any]).asInstanceOf[typings.winjs.WinJS.Promise[XMLHttpRequest]]
