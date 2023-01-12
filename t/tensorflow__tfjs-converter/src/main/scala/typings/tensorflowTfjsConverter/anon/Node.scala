package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: js.Array[
    InputName | NameOp | AttrInputName | InputNameOp | AttrInputNameOp | AttrUsenodenamesharing | AttrValuedtype | AttrAcdfunctioncontroloutputContainer
  ]
  
  var versions: Producer
}
object Node {
  
  inline def apply(
    node: js.Array[
      InputName | NameOp | AttrInputName | InputNameOp | AttrInputNameOp | AttrUsenodenamesharing | AttrValuedtype | AttrAcdfunctioncontroloutputContainer
    ],
    versions: Producer
  ): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setNode(
      value: js.Array[
          InputName | NameOp | AttrInputName | InputNameOp | AttrInputNameOp | AttrUsenodenamesharing | AttrValuedtype | AttrAcdfunctioncontroloutputContainer
        ]
    ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(
      value: (InputName | NameOp | AttrInputName | InputNameOp | AttrInputNameOp | AttrUsenodenamesharing | AttrValuedtype | AttrAcdfunctioncontroloutputContainer)*
    ): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setVersions(value: Producer): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
