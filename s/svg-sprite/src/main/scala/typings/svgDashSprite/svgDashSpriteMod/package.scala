package typings.svgDashSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDashSpriteMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.svgDashSprite.Anon_Plugins
  import typings.vinyl.vinylMod.File

  type CompileCallback = js.Function3[/* error */ Error, /* result */ js.Any, /* data */ js.Any, js.Any]
  /**
    * Custom callback transformation
    */
  type CustomCallbackTransform = StringDictionary[
    js.Function3[/* shape */ js.Any, /* sprite */ SVGSpriter, /* callback */ js.Function, js.Any]
  ]
  /**
    * Pre-defined shape transformation with custom configuration
    */
  type CustomConfigurationTransform = StringDictionary[Anon_Plugins]
  type GetShapesCallback = js.Function2[/* error */ Error, /* result */ js.Array[File], js.Any]
  type SvgTransformer = js.Function1[/* svg */ String, String]
}
