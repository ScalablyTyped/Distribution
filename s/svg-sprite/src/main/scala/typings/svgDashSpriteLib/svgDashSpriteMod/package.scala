package typings
package svgDashSpriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDashSpriteMod {
  type CompileCallback = js.Function3[/* error */ stdLib.Error, /* result */ js.Any, /* data */ js.Any, js.Any]
  /**
    * Custom callback transformation
    */
  type CustomCallbackTransform = org.scalablytyped.runtime.StringDictionary[svgDashSpriteLib.Anon_Callback]
  /**
    * Pre-defined shape transformation with custom configuration
    */
  type CustomConfigurationTransform = org.scalablytyped.runtime.StringDictionary[svgDashSpriteLib.Anon_Plugins]
  type GetShapesCallback = js.Function2[/* error */ stdLib.Error, /* result */ js.Array[vinylLib.vinylMod.File], js.Any]
  type SvgTransformer = js.Function1[/* svg */ java.lang.String, java.lang.String]
}
