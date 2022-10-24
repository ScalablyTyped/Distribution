package typings.yaml

import typings.yaml.distNodesPairMod.Pair
import typings.yaml.distNodesToJSMod.ToJSContext
import typings.yaml.distNodesYamlmapMod.MapLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesAddPairToJSMapMod {
  
  @JSImport("yaml/dist/nodes/addPairToJSMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPairToJSMap(ctx: Unit, map: MapLike, param2: Pair[Any, Any]): MapLike = (^.asInstanceOf[js.Dynamic].applyDynamic("addPairToJSMap")(ctx.asInstanceOf[js.Any], map.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[MapLike]
  inline def addPairToJSMap(ctx: ToJSContext, map: MapLike, param2: Pair[Any, Any]): MapLike = (^.asInstanceOf[js.Dynamic].applyDynamic("addPairToJSMap")(ctx.asInstanceOf[js.Any], map.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[MapLike]
}
