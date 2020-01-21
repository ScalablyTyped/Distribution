package typings.vuex.mod

import org.scalablytyped.runtime.TopLevel
import typings.vuex.helpersMod.Mapper
import typings.vuex.helpersMod.MapperForMutation
import typings.vuex.helpersMod.MapperForMutationWithNamespace
import typings.vuex.helpersMod.MapperWithNamespace
import typings.vuex.helpersMod.MutationMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex", "mapMutations")
@js.native
object mapMutations extends TopLevel[
      Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace
    ]

