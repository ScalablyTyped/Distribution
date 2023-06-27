package typings.yaml.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.yaml.distDocCreateNodeMod.CreateNodeContext
import typings.yaml.distSchemaSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From
  extends StObject
     with Instantiable0[typings.yaml.distNodesNodeMod.Node[Any]]
     with Instantiable1[/* schema */ Schema, typings.yaml.distNodesNodeMod.Node[Any]] {
  
  var from: js.UndefOr[
    js.Function3[
      /* schema */ Schema, 
      /* obj */ Any, 
      /* ctx */ CreateNodeContext, 
      typings.yaml.distNodesNodeMod.Node[Any]
    ]
  ] = js.native
}
