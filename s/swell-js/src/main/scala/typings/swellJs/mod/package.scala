package typings.swellJs.mod

import typings.swellJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def get(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def init(storeId: String, publicKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def init(storeId: String, publicKey: String, options: InitOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def post(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def put(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
