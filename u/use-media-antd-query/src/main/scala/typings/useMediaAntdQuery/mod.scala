package typings.useMediaAntdQuery

import typings.useMediaAntdQuery.useMediaAntdQueryStrings.lg
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.md
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.sm
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xl
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xs
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-media-antd-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(): xs | sm | md | lg | xl | xxl = js.native
  def getScreenClassName(): xs | sm | md | lg | xl | xxl = js.native
  @js.native
  object MediaQueryEnum extends js.Object {
    var lg: AnonMatchMediaMaxWidth = js.native
    var md: AnonMatchMediaMaxWidth = js.native
    var sm: AnonMatchMediaMaxWidth = js.native
    var xl: AnonMatchMediaMaxWidth = js.native
    var xs: AnonMatchMedia = js.native
    var xxl: AnonMatchMediaMinWidth = js.native
  }
  
  type MediaQueryKey = String
}

