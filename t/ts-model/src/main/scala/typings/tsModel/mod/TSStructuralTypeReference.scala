package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tsModel.mod.IModelElement because Already inherited
- typings.tsModel.mod.TSModelElement because Already inherited
- typings.tsModel.mod.TSTypeReference because var conflicts: _annotations, _children, _comment, _config, _parent, locked, meta. Inlined array, union */ @JSImport("ts-model", "TSStructuralTypeReference")
@js.native
open class TSStructuralTypeReference () extends TSTypeDeclaration {
  def this(parent: TSModelElement[Any]) = this()
  
  def array(): Boolean = js.native
  
  def union(q: TSTypeReference[Any]): TSTypeReference[Any] = js.native
  
  def visitReturnType(v: TSModelVisitor): Unit = js.native
}
