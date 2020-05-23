package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsTypesMod.IntersectionType
import typings.typedoc.modelsTypesMod.UnionType
import typings.typedoc.typesAbstractMod.Type
import typings.typescript.mod.UnionOrIntersectionType
import typings.typescript.mod.UnionOrIntersectionTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/union-or-intersection", JSImport.Namespace)
@js.native
object unionOrIntersectionMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.componentMod.ComponentHost because Already inherited
  - typings.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.componentMod.AbstractComponent because Already inherited
  - typings.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class UnionOrIntersectionConverter () extends TypeTypeConverter[UnionOrIntersectionType] {
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode): UnionType | IntersectionType = js.native
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): js.UndefOr[Type] = js.native
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): Boolean = js.native
  }
  
}

