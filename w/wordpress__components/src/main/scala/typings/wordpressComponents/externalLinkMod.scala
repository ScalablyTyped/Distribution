package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLAnchorElement
import typings.wordpressComponents.externalLinkMod.ExternalLink.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/external-link", JSImport.Namespace)
@js.native
object externalLinkMod extends js.Object {
  @js.native
  object ExternalLink extends js.Object {
    type Props = HTMLProps[HTMLAnchorElement]
  }
  
  @js.native
  object default extends TopLevel[ComponentType[Props]]
  
}

