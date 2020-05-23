package typings.wordpressComponents.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.std.HTMLDivElement
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "withFallbackStyles")
@js.native
object withFallbackStyles extends js.Object {
  def apply[FSP](
    mapNodeToProps: js.Function2[/* parentNode */ HTMLDivElement, /* ownProps */ StringDictionary[js.Any], FSP]
  ): js.Function1[
    /* wrappedComponent */ ComponentType[_], 
    ComponentType[Omit[_, /* keyof FSP */ String]]
  ] = js.native
}

