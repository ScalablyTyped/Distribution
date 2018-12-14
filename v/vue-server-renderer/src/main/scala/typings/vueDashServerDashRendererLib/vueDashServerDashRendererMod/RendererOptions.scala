package typings
package vueDashServerDashRendererLib.vueDashServerDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RendererOptions extends js.Object {
  var cache: js.UndefOr[RenderCache] = js.undefined
  var directives: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* vnode */ vueLib.typesVnodeMod.VNode, 
        /* dir */ vueLib.typesVnodeMod.VNodeDirective, 
        scala.Unit
      ]
    ]
  ] = js.undefined
  var inject: js.UndefOr[scala.Boolean] = js.undefined
  var shouldPrefetch: js.UndefOr[
    js.Function2[/* file */ java.lang.String, /* type */ java.lang.String, scala.Boolean]
  ] = js.undefined
  var shouldPreload: js.UndefOr[
    js.Function2[/* file */ java.lang.String, /* type */ java.lang.String, scala.Boolean]
  ] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

