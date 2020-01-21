package typings.typedoc.abstractMod

import typings.typedoc.reflectionsTypeParameterMod.TypeParameterReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterContainer extends Reflection {
  var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
}

