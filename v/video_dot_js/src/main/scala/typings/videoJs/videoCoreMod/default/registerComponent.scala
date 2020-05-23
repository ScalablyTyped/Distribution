package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Register a component so it can referred to by name. Used when adding to other
  * components, either through addChild `component.addChild('myComponent')` or through
  * @default children options  `{ children: ['myComponent'] }`.
  *
  * > NOTE: You could also just initialize the component before adding.
  * `component.addChild(new MyComponent());`
  *
  * @param name
  *        The class name of the component
  *
  * @param comp
  *        The component class
  *
  * @return    The newly registered component
  */
@JSImport("video.js/dist/alt/video.core", "registerComponent")
@js.native
object registerComponent
  extends TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugin */ js.Any
    ]

