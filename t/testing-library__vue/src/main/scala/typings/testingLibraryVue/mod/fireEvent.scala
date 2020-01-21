package typings.testingLibraryVue.mod

import org.scalablytyped.runtime.TopLevel
import typings.testingLibraryDom.eventsMod.FireFunction
import typings.testingLibraryDom.eventsMod.FireObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "fireEvent")
@js.native
object fireEvent extends TopLevel[FireFunction with FireObject with VueFireObject]

