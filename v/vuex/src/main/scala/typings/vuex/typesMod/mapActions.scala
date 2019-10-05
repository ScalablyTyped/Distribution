package typings.vuex.typesMod

import org.scalablytyped.runtime.TopLevel
import typings.vuex.typesHelpersMod.ActionMethod
import typings.vuex.typesHelpersMod.FunctionMapper
import typings.vuex.typesHelpersMod.FunctionMapperWithNamespace
import typings.vuex.typesHelpersMod.Mapper
import typings.vuex.typesHelpersMod.MapperWithNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types", "mapActions")
@js.native
object mapActions extends TopLevel[
      Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with (FunctionMapper[Dispatch, ActionMethod]) with (FunctionMapperWithNamespace[Dispatch, ActionMethod])
    ]

