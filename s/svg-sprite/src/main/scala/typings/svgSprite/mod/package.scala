package typings.svgSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompileCallback = js.Function3[/* error */ typings.std.Error, /* result */ js.Any, /* data */ js.Any, js.Any]
  /**
    * Custom callback transformation
    */
  type CustomCallbackTransform = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* shape */ js.Any, 
      /* sprite */ typings.svgSprite.mod.SVGSpriter, 
      /* callback */ js.Function, 
      js.Any
    ]
  ]
  /**
    * Pre-defined shape transformation with custom configuration
    */
  type CustomConfigurationTransform = org.scalablytyped.runtime.StringDictionary[typings.svgSprite.anon.Plugins]
  type GetShapesCallback = js.Function2[/* error */ typings.std.Error, /* result */ js.Array[typings.vinyl.mod.File], js.Any]
  type SvgTransformer = js.Function1[/* svg */ java.lang.String, java.lang.String]
}
