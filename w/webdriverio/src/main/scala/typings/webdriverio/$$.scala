package typings.webdriverio

import org.scalablytyped.runtime.TopLevel
import typings.webdriverio.WebdriverIO.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * find multiple elements on the page.
  */
@JSGlobal("$$")
@js.native
object $$
  extends TopLevel[
      (js.Function1[/* selector */ String | js.Function, js.Promise[js.Array[Element]]]) with $$
    ]

