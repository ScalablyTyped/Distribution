package typings.yjs

import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsIsParentOfMod {
  
  @JSImport("yjs/dist/src/utils/isParentOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isParentOf(parent: AbstractType[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isParentOf(parent: AbstractType[Any], child: Item): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParentOf")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
