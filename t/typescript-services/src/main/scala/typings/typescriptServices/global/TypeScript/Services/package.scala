package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.global.TypeScript.Services.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def copyDataObject(dst: Any, src: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDataObject")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def forwardJSONCall(logger: ILogger, actionDescription: String, action: js.Function0[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardJSONCall")(logger.asInstanceOf[js.Any], actionDescription.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[String]

inline def logInternalError(logger: ILogger, err: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logInternalError")(logger.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def simpleForwardCall(logger: ILogger, actionDescription: String, action: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleForwardCall")(logger.asInstanceOf[js.Any], actionDescription.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Any]
