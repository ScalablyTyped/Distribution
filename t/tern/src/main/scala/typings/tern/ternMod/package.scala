package typings.tern

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ternMod {
  
  type ConstructorOptions = typings.tern.ternMod.CtorOptions with (typings.tern.ternMod.SyncConstructorOptions | typings.tern.ternMod.ASyncConstructorOptions)
  
  type QueryResult[Q /* <: typings.tern.ternMod.Query */] = /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
  
  @scala.inline
  def Server: typings.tern.ternMod.TernConstructor = typings.tern.ternMod.^.asInstanceOf[js.Dynamic].selectDynamic("Server").asInstanceOf[typings.tern.ternMod.TernConstructor]
  
  @scala.inline
  def defineQueryType[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](name: T, desc: typings.tern.ternMod.Desc[T]): scala.Unit = (typings.tern.ternMod.^.asInstanceOf[js.Dynamic].applyDynamic("defineQueryType")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registerPlugin(
    name: java.lang.String,
    init: js.Function2[
      /* server */ typings.tern.ternMod.Server, 
      /* options */ js.UndefOr[typings.tern.ternMod.ConstructorOptions], 
      scala.Unit
    ]
  ): scala.Unit = (typings.tern.ternMod.^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def version: java.lang.String = typings.tern.ternMod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
