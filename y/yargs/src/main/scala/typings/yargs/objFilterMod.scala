package typings.yargs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objFilterMod {
  
  @JSImport("yargs/build/lib/obj-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def objFilter[T /* <: js.Object */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("objFilter")().asInstanceOf[T]
  inline def objFilter[T /* <: js.Object */](original: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("objFilter")(original.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def objFilter[T /* <: js.Object */](
    original: T,
    filter: js.Function2[
      /* keyof T */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* v */ js.Any, 
      Boolean
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("objFilter")(original.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def objFilter[T /* <: js.Object */](
    original: Unit,
    filter: js.Function2[
      /* keyof T */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* v */ js.Any, 
      Boolean
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("objFilter")(original.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[T]
}
