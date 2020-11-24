package typings.tweenjsTweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EasingFunction = js.Function1[/* amount */ scala.Double, scala.Double]
  
  /**
    *
    */
  type InterpolationFunction = js.Function2[/* v */ js.Array[scala.Double], /* k */ scala.Double, scala.Double]
  
  type UnknownProps = typings.std.Record[java.lang.String, js.Any]
}
