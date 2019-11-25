package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameterContainer extends js.Object {
  var typeParameters: js.Array[TypeContainer]
}

object TypeParameterContainer {
  @scala.inline
  def apply(typeParameters: js.Array[TypeContainer]): TypeParameterContainer = {
    val __obj = js.Dynamic.literal(typeParameters = typeParameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeParameterContainer]
  }
}

