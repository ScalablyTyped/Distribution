package typings.yaml

import typings.yaml.distComposeComposeNodeMod.ComposeContext
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distNodesPairMod.Pair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeUtilMapIncludesMod {
  
  @JSImport("yaml/dist/compose/util-map-includes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapIncludes(ctx: ComposeContext, items: js.Array[Pair[ParsedNode, Any]], search: ParsedNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mapIncludes")(ctx.asInstanceOf[js.Any], items.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
