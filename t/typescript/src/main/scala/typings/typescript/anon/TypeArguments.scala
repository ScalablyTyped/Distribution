package typings.typescript.anon

import typings.typescript.mod.NodeArray
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeArguments extends StObject {
  
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
object TypeArguments {
  
  @scala.inline
  def apply(): TypeArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeArguments]
  }
  
  @scala.inline
  implicit class TypeArgumentsMutableBuilder[Self <: TypeArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeArguments(value: NodeArray[TypeNode]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
