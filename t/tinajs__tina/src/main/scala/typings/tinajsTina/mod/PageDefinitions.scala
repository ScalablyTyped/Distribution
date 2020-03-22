package typings.tinajsTina.mod

import typings.tinajsTina.PartialPageDefinitionsBeforeLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageDefinitions
  extends ComponentDefinitions
     with PageEvents
     with PageHooks {
  @JSName("mixins")
  var mixins_PageDefinitions: js.Array[PartialPageDefinitionsBeforeLoad] = js.native
}

