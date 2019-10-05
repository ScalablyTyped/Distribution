package typings.vuex.typesMod

import org.scalablytyped.runtime.TopLevel
import typings.vuex.typesHelpersMod.FunctionMapper
import typings.vuex.typesHelpersMod.FunctionMapperWithNamespace
import typings.vuex.typesHelpersMod.Mapper
import typings.vuex.typesHelpersMod.MapperWithNamespace
import typings.vuex.typesHelpersMod.MutationMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types", "mapMutations")
@js.native
object mapMutations extends TopLevel[
      Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with (FunctionMapper[Commit, MutationMethod]) with (FunctionMapperWithNamespace[Commit, MutationMethod])
    ]

