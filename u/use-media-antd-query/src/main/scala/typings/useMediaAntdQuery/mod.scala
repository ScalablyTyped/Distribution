package typings.useMediaAntdQuery

import typings.useMediaAntdQuery.anon.MatchMedia
import typings.useMediaAntdQuery.anon.MaxWidth
import typings.useMediaAntdQuery.anon.MinWidth
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.lg
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.md
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.sm
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xl
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xs
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-media-antd-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): xs | sm | md | lg | xl | xxl = js.native
  
  def getScreenClassName(): xs | sm | md | lg | xl | xxl = js.native
  
  @js.native
  object MediaQueryEnum extends js.Object {
    
    var lg: MaxWidth = js.native
    
    var md: MaxWidth = js.native
    
    var sm: MaxWidth = js.native
    
    var xl: MaxWidth = js.native
    
    var xs: MatchMedia = js.native
    
    var xxl: MinWidth = js.native
  }
  
  /* keyof use-media-antd-query.anon.Lg */ /* Rewritten from type alias, can be one of: 
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.xs
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.sm
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.md
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.lg
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.xl
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
  */
  trait MediaQueryKey extends js.Object
}
