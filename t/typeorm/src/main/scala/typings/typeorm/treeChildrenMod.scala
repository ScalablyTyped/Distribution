package typings.typeorm

import typings.std.PropertyDecorator
import typings.typeorm.anon.Cascade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeChildrenMod {
  
  @JSImport("typeorm/browser/decorator/tree/TreeChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeChildren(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeChildren")().asInstanceOf[PropertyDecorator]
  inline def TreeChildren(options: Cascade): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeChildren")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
