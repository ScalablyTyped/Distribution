package typings.vueTestUtils.anon

import typings.std.Parameters
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(): Unit = js.native
  def apply(
    transformer: js.Function2[
      /* args */ Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof _createVNode */ js.Any
      ], 
      /* instance */ ComponentInternalInstance | Null, 
      Parameters[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof _createVNode */ js.Any
      ]
    ]
  ): Unit = js.native
}
