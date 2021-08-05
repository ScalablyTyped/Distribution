package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.treeTypesMod.TreeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("typeorm/browser/decorator/tree/Tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tree(`type`: TreeType): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Tree")(`type`.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
