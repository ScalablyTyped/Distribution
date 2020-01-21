package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "ProgressPlugin")
@js.native
class ProgressPlugin () extends Plugin {
  def this(options: js.Function5[
        /* percentage */ Double, 
        /* msg */ String, 
        /* moduleProgress */ js.UndefOr[String], 
        /* activeModules */ js.UndefOr[String], 
        /* moduleName */ js.UndefOr[String], 
        Unit
      ]) = this()
}

