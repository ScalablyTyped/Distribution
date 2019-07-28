package typings.typesafeDashActions

import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeTType[TType /* <: TypeConstant */] extends js.Object {
  var `type`: TType
}

object Anon_TypeTType {
  @scala.inline
  def apply[TType /* <: TypeConstant */](`type`: TType): Anon_TypeTType[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeTType[TType]]
  }
}

