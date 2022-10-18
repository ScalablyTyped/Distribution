package typings.tern.libTernMod

import typings.tern.libTernMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def defineQueryType[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](name: T, desc: Desc[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineQueryType")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerPlugin(
  name: String,
  init: js.Function2[/* server */ Server, /* options */ js.UndefOr[ConstructorOptions], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type ConstructorOptions = (SyncConstructorOptions & CtorOptions) | (ASyncConstructorOptions & CtorOptions)

type QueryResult[Q /* <: Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
