package typings.unistBuilder

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unistBuilder.anon.Children
import typings.unistBuilder.anon.Type
import typings.unistBuilder.anon.TypeT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unist-builder", "u")
  @js.native
  def u: BuildVoid & BuildVoidWithProps & BuildLiteral & BuildLiteralWithProps & BuildParent & BuildParentWithProps = js.native
  inline def u_=(
    x: BuildVoid & BuildVoidWithProps & BuildLiteral & BuildLiteralWithProps & BuildParent & BuildParentWithProps
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("u")(x.asInstanceOf[js.Any])
  
  type BuildLiteral = js.Function2[/* type */ String, /* value */ String, Type[String]]
  
  type BuildLiteralWithProps = js.Function3[
    /* type */ String, 
    /* props */ Record[String, Any], 
    /* value */ String, 
    Type[String] & (Record[String, Any])
  ]
  
  type BuildParent = js.Function2[
    /* type */ String, 
    /* children */ js.Array[typings.unist.mod.Node[Data]], 
    Children[String, js.Array[typings.unist.mod.Node[Data]]]
  ]
  
  type BuildParentWithProps = js.Function3[
    /* type */ String, 
    /* props */ Record[String, Any], 
    /* children */ js.Array[typings.unist.mod.Node[Data]], 
    (Children[String, js.Array[typings.unist.mod.Node[Data]]]) & (Record[String, Any])
  ]
  
  type BuildVoid = js.Function1[/* type */ String, TypeT[String]]
  
  type BuildVoidWithProps = js.Function2[
    /* type */ String, 
    /* props */ Record[String, Any], 
    TypeT[String] & (Record[String, Any])
  ]
  
  type ChildrenOrValue = js.Array[Node] | String
  
  type Literal = typings.unist.mod.Literal[Any, Data]
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Props = StringDictionary[Any]
}
