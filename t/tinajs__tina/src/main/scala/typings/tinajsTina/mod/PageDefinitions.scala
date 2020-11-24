package typings.tinajsTina.mod

import typings.tinajsTina.anon.PartialPageDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageDefinitions
  extends ComponentDefinitions
     with PageEvents
     with PageHooks {
  
  @JSName("mixins")
  var mixins_PageDefinitions: js.Array[PartialPageDefinitions] = js.native
}
