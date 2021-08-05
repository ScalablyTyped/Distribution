package typings.typescriptServices.mod.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def copyDataObject(dst: js.Any, src: js.Any): js.Any = (typings.typescriptServices.mod.Services.^.asInstanceOf[js.Dynamic].applyDynamic("copyDataObject")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def forwardJSONCall(
  logger: typings.typescriptServices.TypeScript.ILogger,
  actionDescription: java.lang.String,
  action: js.Function0[js.Any]
): java.lang.String = (typings.typescriptServices.mod.Services.^.asInstanceOf[js.Dynamic].applyDynamic("forwardJSONCall")(logger.asInstanceOf[js.Any], actionDescription.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def logInternalError(logger: typings.typescriptServices.TypeScript.ILogger, err: typings.std.Error): scala.Unit = (typings.typescriptServices.mod.Services.^.asInstanceOf[js.Dynamic].applyDynamic("logInternalError")(logger.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def simpleForwardCall(
  logger: typings.typescriptServices.TypeScript.ILogger,
  actionDescription: java.lang.String,
  action: js.Function0[js.Any]
): js.Any = (typings.typescriptServices.mod.Services.^.asInstanceOf[js.Dynamic].applyDynamic("simpleForwardCall")(logger.asInstanceOf[js.Any], actionDescription.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Any]
